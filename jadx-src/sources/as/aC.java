package as;

import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {
    public static final int n(long j2, CN3 audioStreamProperties) {
        Intrinsics.checkNotNullParameter(audioStreamProperties, "audioStreamProperties");
        LRC.j.t(j2, "duration");
        return I28.rl(t(j2, audioStreamProperties.t()), audioStreamProperties.rl(), audioStreamProperties.n());
    }

    public static final Xo nr(long j2, int i2) {
        long jRoundToLong = MathKt.roundToLong(d2n.Ml.gh(j2) * ((double) i2));
        if (-2147483648L <= jRoundToLong && jRoundToLong <= 2147483647L) {
            return new Xo((int) jRoundToLong, i2, null);
        }
        throw new IllegalArgumentException(("Time (" + ((Object) d2n.Ml.ck(j2)) + ") too large to safely multiply with sample rate (" + ((Object) eO.xMQ(i2)) + ").").toString());
    }

    public static final long rl(int i2, int i3) {
        return fuX.rl(i2, i3);
    }

    public static final int t(long j2, int i2) {
        return fuX.Uo(j2, i2);
    }
}
