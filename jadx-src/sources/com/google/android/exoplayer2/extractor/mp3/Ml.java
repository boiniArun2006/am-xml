package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ml implements Seeker {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f57800O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f57801n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long[] f57802t;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static Ml rl(long j2, long j3, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        parsableByteArray.skipBytes(10);
        int i2 = parsableByteArray.readInt();
        Ml ml = null;
        if (i2 <= 0) {
            return null;
        }
        int i3 = header.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i2, ((long) (i3 >= 32000 ? 1152 : 576)) * 1000000, i3);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        int i5 = 2;
        parsableByteArray.skipBytes(2);
        long j4 = j3 + ((long) header.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i7 = 0;
        long j5 = j3;
        while (i7 < unsignedShort) {
            Ml ml2 = ml;
            int i8 = unsignedShort2;
            long[] jArr3 = jArr;
            jArr3[i7] = (((long) i7) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i7] = Math.max(j5, j4);
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == i5) {
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return ml2;
                }
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j5 += ((long) unsignedByte) * ((long) i8);
            i7++;
            ml = ml2;
            unsignedShort2 = i8;
            jArr = jArr3;
            j4 = j4;
            i5 = 2;
        }
        long[] jArr4 = jArr;
        if (j2 != -1 && j2 != j5) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j2 + ", " + j5);
        }
        return new Ml(jArr4, jArr2, jScaleLargeTimestamp, j5);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.J2;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f57800O;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.f57801n, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f57801n[iBinarySearchFloor], this.f57802t[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j2 || iBinarySearchFloor == this.f57801n.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.f57801n[i2], this.f57802t[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return this.f57801n[Util.binarySearchFloor(this.f57802t, j2, true, true)];
    }

    private Ml(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f57801n = jArr;
        this.f57802t = jArr2;
        this.f57800O = j2;
        this.J2 = j3;
    }
}
