package ka;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f70023n;
    private final FX.n nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f70024t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f70023n == oVar.f70023n && this.rl == oVar.rl && Intrinsics.areEqual(this.f70024t, oVar.f70024t) && Intrinsics.areEqual(this.nr, oVar.nr);
    }

    public o(boolean z2, boolean z3, List creatorProfiles, FX.n nVar) {
        Intrinsics.checkNotNullParameter(creatorProfiles, "creatorProfiles");
        this.f70023n = z2;
        this.rl = z3;
        this.f70024t = creatorProfiles;
        this.nr = nVar;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f70023n) * 31) + Boolean.hashCode(this.rl)) * 31) + this.f70024t.hashCode()) * 31;
        FX.n nVar = this.nr;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }

    public final List n() {
        return this.f70024t;
    }

    public final boolean nr() {
        return this.f70023n;
    }

    public final FX.n rl() {
        return this.nr;
    }

    public final boolean t() {
        return this.rl;
    }

    public String toString() {
        return "CreatorRankingViewModelState(standby=" + this.f70023n + ", signedIn=" + this.rl + ", creatorProfiles=" + this.f70024t + ", currentCreatorRankingData=" + this.nr + ")";
    }
}
