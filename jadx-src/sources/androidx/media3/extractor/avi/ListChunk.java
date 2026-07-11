package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import com.google.common.collect.nKK;
import com.google.common.collect.xZD;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class ListChunk implements AviChunk {
    public final nKK children;
    private final int type;

    public static ListChunk parseFrom(int i2, ParsableByteArray parsableByteArray) {
        nKK.j jVar = new nKK.j();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) from).getTrackType();
                }
                jVar.n(from);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i2, jVar.gh());
    }

    @Nullable
    public <T extends AviChunk> T getChild(Class<T> cls) {
        xZD it = this.children.iterator();
        while (it.hasNext()) {
            T t3 = (T) it.next();
            if (t3.getClass() == cls) {
                return t3;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }

    private ListChunk(int i2, nKK nkk) {
        this.type = i2;
        this.children = nkk;
    }

    @Nullable
    private static AviChunk createBox(int i2, int i3, ParsableByteArray parsableByteArray) {
        switch (i2) {
            case 1718776947:
                return StreamFormatChunk.parseFrom(i3, parsableByteArray);
            case 1751742049:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case 1752331379:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case 1852994675:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }
}
