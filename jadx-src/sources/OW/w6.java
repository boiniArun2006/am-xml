package OW;

import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class w6 {
    static long n(double d2) {
        Xo.O(rl(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits << 1;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    static double nr(double d2) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & 4503599627370495L) | 4607182418800017408L);
    }

    static boolean rl(double d2) {
        if (Math.getExponent(d2) <= 1023) {
            return true;
        }
        return false;
    }

    static boolean t(double d2) {
        if (Math.getExponent(d2) >= -1022) {
            return true;
        }
        return false;
    }
}
