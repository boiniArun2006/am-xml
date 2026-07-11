package YHx;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final byte O(byte b2, int i2) {
        return (byte) (b2 << i2);
    }

    public static final byte n(byte b2, byte b4) {
        return (byte) (b2 + b4);
    }

    public static final int nr(char c2, char c4, char c5, char c6, char c7, char c8) {
        return n(n(n(n(n((byte) c2, O((byte) c4, 4)), O((byte) c5, 8)), O((byte) c6, 12)), O((byte) c7, 16)), O((byte) c8, 20));
    }

    public static final boolean t(double d2) {
        return d2 < 0.00390625d || d2 > 256.0d;
    }

    public static final double rl(double d2) {
        double dRoundToInt = d2 - ((double) MathKt.roundToInt(d2));
        if (dRoundToInt < 0.0d) {
            return dRoundToInt + 1.0d;
        }
        return dRoundToInt;
    }
}
