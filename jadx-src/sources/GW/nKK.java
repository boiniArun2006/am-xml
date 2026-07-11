package GW;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f3652n;
    private final boolean nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f3653t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nKK)) {
            return false;
        }
        nKK nkk = (nKK) obj;
        return Intrinsics.areEqual(this.f3652n, nkk.f3652n) && this.rl == nkk.rl && this.f3653t == nkk.f3653t && this.nr == nkk.nr;
    }

    public int hashCode() {
        List list = this.f3652n;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f3653t)) * 31) + Boolean.hashCode(this.nr);
    }

    public final boolean n() {
        return this.nr;
    }

    public final boolean nr() {
        return this.rl;
    }

    public final List rl() {
        return this.f3652n;
    }

    public final boolean t() {
        return this.f3653t;
    }

    public String toString() {
        return "ReelsViewState(templates=" + this.f3652n + ", isSaved=" + this.rl + ", isAddedToFavoritesBannerVisible=" + this.f3653t + ", shouldShowSwipeHint=" + this.nr + ")";
    }

    public nKK(List list, boolean z2, boolean z3, boolean z4) {
        this.f3652n = list;
        this.rl = z2;
        this.f3653t = z3;
        this.nr = z4;
    }
}
