package Z4;

import MoG.CN3;
import d2n.Wre;
import gB.C;
import gB.Dsr;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f12279n;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Dsr f12280t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f12279n, jVar.f12279n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(CN3 composition, Wre range) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f12279n = composition;
        this.rl = range;
        this.f12280t = C.n(composition, range);
        if (d2n.CN3.rl(composition.Uo(), range)) {
            return;
        }
        throw new IllegalArgumentException(("The composition slice range (" + range + ") must be in the composition time range (" + composition.Uo() + ')').toString());
    }

    public int hashCode() {
        return (this.f12279n.hashCode() * 31) + this.rl.hashCode();
    }

    @Override // gB.Dsr
    public Set n() {
        return this.f12280t.n();
    }

    public String toString() {
        return "FMGraphicCompositionRangeSlice(composition=" + this.f12279n + ", range=" + this.rl + ')';
    }
}
