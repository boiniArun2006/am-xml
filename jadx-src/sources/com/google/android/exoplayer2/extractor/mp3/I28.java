package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class I28 implements Seeker {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f57795O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f57796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long[] f57797o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f57798r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f57799t;

    private I28(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    private I28(long j2, int i2, long j3, long j4, long[] jArr) {
        this.f57796n = j2;
        this.f57799t = i2;
        this.f57795O = j3;
        this.f57797o = jArr;
        this.J2 = j4;
        this.f57798r = j4 != -1 ? j2 + j4 : -1L;
    }

    public static I28 rl(long j2, long j3, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        int i2 = header.samplesPerFrame;
        int i3 = header.sampleRate;
        int i5 = parsableByteArray.readInt();
        if ((i5 & 1) != 1 || (unsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedIntToInt, ((long) i2) * 1000000, i3);
        if ((i5 & 6) != 6) {
            return new I28(j3, header.frameSize, jScaleLargeTimestamp);
        }
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i7 = 0; i7 < 100; i7++) {
            jArr[i7] = parsableByteArray.readUnsignedByte();
        }
        if (j2 != -1) {
            long j4 = j3 + unsignedInt;
            if (j2 != j4) {
                Log.w("XingSeeker", "XING data size mismatch: " + j2 + ", " + j4);
            }
        }
        return new I28(j3, header.frameSize, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    private long t(int i2) {
        return (this.f57795O * ((long) i2)) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.f57798r;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f57795O;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        long j3 = j2 - this.f57796n;
        if (!isSeekable() || j3 <= this.f57799t) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.f57797o);
        double d2 = (j3 * 256.0d) / this.J2;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d2, true, true);
        long jT2 = t(iBinarySearchFloor);
        long j4 = jArr[iBinarySearchFloor];
        int i2 = iBinarySearchFloor + 1;
        long jT3 = t(i2);
        return jT2 + Math.round((j4 == (iBinarySearchFloor == 99 ? 256L : jArr[i2]) ? 0.0d : (d2 - j4) / (r0 - j4)) * (jT3 - jT2));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.f57797o != null;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        double d2;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.f57796n + ((long) this.f57799t)));
        }
        long jConstrainValue = Util.constrainValue(j2, 0L, this.f57795O);
        double d4 = (jConstrainValue * 100.0d) / this.f57795O;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i2 = (int) d4;
                long[] jArr = (long[]) Assertions.checkStateNotNull(this.f57797o);
                double d6 = jArr[i2];
                if (i2 == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = jArr[i2 + 1];
                }
                d5 = d6 + ((d4 - ((double) i2)) * (d2 - d6));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.f57796n + Util.constrainValue(Math.round((d5 / 256.0d) * this.J2), this.f57799t, this.J2 - 1)));
    }
}
