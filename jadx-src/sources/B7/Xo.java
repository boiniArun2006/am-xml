package B7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f255n;
    private final long nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f256t;

    public /* synthetic */ Xo(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return d2n.Ml.KN(this.f255n, xo.f255n) && d2n.Ml.KN(this.rl, xo.rl) && d2n.Ml.KN(this.f256t, xo.f256t) && d2n.Ml.KN(this.nr, xo.nr);
    }

    private Xo(long j2, long j3, long j4, long j5) {
        this.f255n = j2;
        this.rl = j3;
        this.f256t = j4;
        this.nr = j5;
        if (d2n.Ml.nr(j4, j5) <= 0) {
            return;
        }
        throw new IllegalArgumentException(("Invalid composition range: min(" + ((Object) d2n.Ml.ck(j4)) + ") is greater than max(" + ((Object) d2n.Ml.ck(j5)) + ')').toString());
    }

    public static /* synthetic */ Xo rl(Xo xo, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = xo.f255n;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = xo.rl;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = xo.f256t;
        }
        return xo.n(j6, j7, j4, (i2 & 8) != 0 ? xo.nr : j5);
    }

    public final long J2() {
        return this.f255n;
    }

    public final long O() {
        return this.f256t;
    }

    public int hashCode() {
        return (((((d2n.Ml.qie(this.f255n) * 31) + d2n.Ml.qie(this.rl)) * 31) + d2n.Ml.qie(this.f256t)) * 31) + d2n.Ml.qie(this.nr);
    }

    public final Xo n(long j2, long j3, long j4, long j5) {
        return new Xo(j2, j3, j4, j5, null);
    }

    public final long nr() {
        return this.nr;
    }

    public final long t() {
        return this.rl;
    }

    public String toString() {
        return "CompositionTimestamp(systemTime=" + ((Object) d2n.Ml.ck(this.f255n)) + ", compositionTime=" + ((Object) d2n.Ml.ck(this.rl)) + ", minCompositionTime=" + ((Object) d2n.Ml.ck(this.f256t)) + ", maxCompositionTime=" + ((Object) d2n.Ml.ck(this.nr)) + ')';
    }
}
