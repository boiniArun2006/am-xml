package Mgn;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {
    public static final byte J2(byte b2, int i2) {
        return (byte) (b2 << i2);
    }

    public static final int n(char c2, char c4, char c5, char c6, char c7, char c8) {
        return rl(rl(rl(rl(rl((byte) c2, J2((byte) c4, 4)), J2((byte) c5, 8)), J2((byte) c6, 12)), J2((byte) c7, 16)), J2((byte) c8, 20));
    }

    public static final byte rl(byte b2, byte b4) {
        return (byte) (b2 + b4);
    }

    public static final boolean nr(double d2) {
        return d2 < 0.00390625d || d2 > 256.0d;
    }

    public static final int O(double d2) {
        return MathKt.roundToInt(d2);
    }

    public static final double t(double d2) {
        double dO = d2 - ((double) O(d2));
        if (dO < 0.0d) {
            return dO + 1.0d;
        }
        return dO;
    }
}
