package Z4;

import MoG.CN3;
import d2n.Wre;
import gB.C;
import gB.Dsr;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f12281n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Dsr f12282t;

    public /* synthetic */ n(CN3 cn3, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cn3, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f12281n, nVar.f12281n) && d2n.Ml.KN(this.rl, nVar.rl);
    }

    private n(CN3 cn3, long j2) {
        this.f12281n = cn3;
        this.rl = j2;
        this.f12282t = C.n(cn3, new Wre(j2, d2n.I28.rl(j2), null));
        if (d2n.CN3.nr(cn3.Uo(), j2)) {
            return;
        }
        throw new IllegalArgumentException(("The composition slice time (" + ((Object) d2n.Ml.ck(j2)) + ") must be in the composition time range (" + cn3.Uo() + ')').toString());
    }

    public static /* synthetic */ n t(n nVar, CN3 cn3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cn3 = nVar.f12281n;
        }
        if ((i2 & 2) != 0) {
            j2 = nVar.rl;
        }
        return nVar.rl(cn3, j2);
    }

    public final long O() {
        return this.rl;
    }

    public int hashCode() {
        return (this.f12281n.hashCode() * 31) + d2n.Ml.qie(this.rl);
    }

    @Override // gB.Dsr
    public Set n() {
        return this.f12282t.n();
    }

    public final CN3 nr() {
        return this.f12281n;
    }

    public final n rl(CN3 composition, long j2) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        return new n(composition, j2, null);
    }

    public String toString() {
        return "FMGraphicCompositionSlice(composition=" + this.f12281n + ", time=" + ((Object) d2n.Ml.ck(this.rl)) + ')';
    }
}
