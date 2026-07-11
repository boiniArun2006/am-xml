package bK;

import d2n.Ml;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {
    public static final long n(long j2, long j3) {
        return Ml.f63370t.t(Ml.az(j2, j3));
    }

    public static final long nr(long j2, long j3, H7v.j speed) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        return H7v.n.O(speed, Ml.f63370t.t(Ml.az(j2, j3)));
    }

    public static final long rl(long j2, long j3, long j4, H7v.j speed) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        return t(n(j2, j3), j4, speed);
    }

    public static final long t(long j2, long j3, H7v.j speed) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        return Ml.f63370t.t(j3 + H7v.n.Uo(speed, j2));
    }
}
