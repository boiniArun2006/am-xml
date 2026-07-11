package androidx.media3.exoplayer.video;

import androidx.annotation.Nullable;
import androidx.media3.container.ObuParser;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Av1SampleDependencyParser {
    private static final int MAX_OBU_COUNT_FOR_PARTIAL_SKIP = 8;

    @Nullable
    private ObuParser.SequenceHeader sequenceHeader;

    private void updateSequenceHeaders(List<ObuParser.Obu> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).type == 1) {
                this.sequenceHeader = ObuParser.SequenceHeader.parse(list.get(i2));
            }
        }
    }

    public void reset() {
        this.sequenceHeader = null;
    }

    private boolean canSkipObu(ObuParser.Obu obu, boolean z2) {
        ObuParser.SequenceHeader sequenceHeader;
        ObuParser.FrameHeader frameHeader;
        int i2 = obu.type;
        if (i2 == 2 || i2 == 15) {
            return true;
        }
        if (i2 != 3 || z2) {
            return ((i2 != 6 && i2 != 3) || (sequenceHeader = this.sequenceHeader) == null || (frameHeader = ObuParser.FrameHeader.parse(sequenceHeader, obu)) == null || frameHeader.isDependedOn()) ? false : true;
        }
        return false;
    }

    Av1SampleDependencyParser() {
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        updateSequenceHeaders(ObuParser.split(byteBuffer));
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z2) {
        List<ObuParser.Obu> listSplit = ObuParser.split(byteBuffer);
        updateSequenceHeaders(listSplit);
        int size = listSplit.size() - 1;
        int i2 = 0;
        while (size >= 0 && canSkipObu(listSplit.get(size), z2)) {
            if (listSplit.get(size).type == 6 || listSplit.get(size).type == 3) {
                i2++;
            }
            size--;
        }
        if (i2 <= 1 && size + 1 < 8) {
            if (size >= 0) {
                return listSplit.get(size).payload.limit();
            }
            return byteBuffer.position();
        }
        return byteBuffer.limit();
    }
}
