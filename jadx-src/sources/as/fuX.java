package as;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class fuX {
    public static final int J2(int i2, int i3) {
        return C.n(i2 * i3);
    }

    public static final int O(int i2, int i3) {
        return w9.w6.J2(i2 * i3);
    }

    public static final int nr(int i2, int i3) {
        return Wre.n(i2 * i3);
    }

    public static final int Uo(long j2, int i2) {
        LRC.j.t(j2, "duration");
        long jRoundToLong = MathKt.roundToLong(d2n.j.HI(j2) * ((double) i2));
        if (jRoundToLong <= 2147483647L) {
            return Ml.t((int) jRoundToLong);
        }
        throw new IllegalArgumentException(("Duration (" + ((Object) d2n.j.S(j2)) + ") too large to multiply with sample rate (" + ((Object) eO.xMQ(i2)) + ") without overflow.").toString());
    }

    public static final int n(int i2, int i3) {
        if (i2 % i3 == 0) {
            return Ml.t(i2 / i3);
        }
        throw new IllegalArgumentException(("Audio sample count (" + ((Object) Wre.rl(i2)) + ") not divisible by channel count (" + ((Object) qz.J2(i3)) + ") without remainder.").toString());
    }

    public static final long rl(int i2, int i3) {
        return d2n.j.f63374t.O(((double) i2) / ((double) i3));
    }

    public static final int t(int i2, int i3) {
        if (i2 % i3 == 0) {
            return Wre.n(i2 / i3);
        }
        throw new IllegalArgumentException(("Byte count (" + ((Object) w9.w6.ty(i2)) + ") not divisible by byte count per sample (" + ((Object) o.J2(i3)) + ") without remainder.").toString());
    }
}
