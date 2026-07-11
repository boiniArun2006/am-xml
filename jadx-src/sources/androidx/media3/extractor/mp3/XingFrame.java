package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    public long computeDurationUs() {
        long j2 = this.frameCount;
        if (j2 == -1 || j2 == 0) {
            return -9223372036854775807L;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j2 * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }

    private XingFrame(MpegAudioUtil.Header header, long j2, long j3, @Nullable long[] jArr, int i2, int i3) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.encoderDelay = i2;
        this.encoderPadding = i3;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        long unsignedInt;
        long[] jArr;
        int i2;
        int i3;
        int i5 = parsableByteArray.readInt();
        if ((i5 & 1) != 0) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = -1;
        }
        if ((i5 & 2) != 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = -1;
        }
        long j2 = unsignedInt;
        if ((i5 & 4) == 4) {
            jArr = new long[100];
            for (int i7 = 0; i7 < 100; i7++) {
                jArr[i7] = parsableByteArray.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((i5 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i3 = unsignedInt24 & 4095;
            i2 = (16773120 & unsignedInt24) >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, j2, jArr2, i2, i3);
    }
}
