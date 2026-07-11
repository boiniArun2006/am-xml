package Mms;

/* JADX INFO: renamed from: Mms.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract /* synthetic */ class AbstractC1414c {
    public static /* synthetic */ String n(long j2, int i2) {
        if (j2 == 0) {
            return "0";
        }
        if (j2 > 0) {
            return Long.toString(j2, i2);
        }
        if (i2 < 2 || i2 > 36) {
            i2 = 10;
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i5 = i2 - 1;
        if ((i2 & i5) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j2) & i5, i2);
                j2 >>>= iNumberOfTrailingZeros;
            } while (j2 != 0);
        } else {
            long jN = (i2 & 1) == 0 ? (j2 >>> 1) / ((long) (i2 >>> 1)) : kotlin.Ml.n(j2, i2);
            long j3 = i2;
            cArr[63] = Character.forDigit((int) (j2 - (jN * j3)), i2);
            i3 = 63;
            while (jN > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (jN % j3), i2);
                jN /= j3;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
