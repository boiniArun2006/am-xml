package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;
        public final long totalSize;

        private Results(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2, long j3) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i2;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j2;
            this.totalSize = j3;
        }
    }

    public static Results rechunk(int i2, long[] jArr, int[] iArr, long j2) {
        int[] iArr2 = iArr;
        int i3 = 8192 / i2;
        int i5 = 0;
        int iCeilDivide = 0;
        for (int i7 : iArr2) {
            iCeilDivide += Util.ceilDivide(i7, i3);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr4 = new int[iCeilDivide];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iMax = 0;
        while (i5 < iArr2.length) {
            int i11 = iArr2[i5];
            long j3 = jArr[i5];
            while (i11 > 0) {
                int iMin = Math.min(i3, i11);
                jArr2[i10] = j3;
                int i12 = i2 * iMin;
                iArr3[i10] = i12;
                i9 += i12;
                iMax = Math.max(iMax, i12);
                jArr3[i10] = ((long) i8) * j2;
                iArr4[i10] = 1;
                j3 += (long) iArr3[i10];
                i8 += iMin;
                i11 -= iMin;
                i10++;
                i3 = i3;
            }
            i5++;
            iArr2 = iArr;
        }
        return new Results(jArr2, iArr3, iMax, jArr3, iArr4, j2 * ((long) i8), i9);
    }

    private FixedSampleSizeRechunker() {
    }
}
