package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class FixedSampleSizeRechunker {

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i2;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j2;
        }
    }

    public static Results n(int i2, long[] jArr, int[] iArr, long j2) {
        int i3 = 8192 / i2;
        int iCeilDivide = 0;
        for (int i5 : iArr) {
            iCeilDivide += Util.ceilDivide(i5, i3);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr2 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        int i7 = 0;
        int i8 = 0;
        int iMax = 0;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            long j3 = jArr[i9];
            while (i10 > 0) {
                int iMin = Math.min(i3, i10);
                jArr2[i8] = j3;
                int i11 = i2 * iMin;
                iArr2[i8] = i11;
                iMax = Math.max(iMax, i11);
                jArr3[i8] = ((long) i7) * j2;
                iArr3[i8] = 1;
                j3 += (long) iArr2[i8];
                i7 += iMin;
                i10 -= iMin;
                i8++;
            }
        }
        return new Results(jArr2, iArr2, iMax, jArr3, iArr3, j2 * ((long) i7));
    }
}
