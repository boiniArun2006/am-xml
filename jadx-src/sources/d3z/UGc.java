package d3z;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f63399n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f63400t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UGc)) {
            return false;
        }
        UGc uGc = (UGc) obj;
        return Intrinsics.areEqual(this.f63399n, uGc.f63399n) && Intrinsics.areEqual(this.rl, uGc.rl) && Intrinsics.areEqual(this.f63400t, uGc.f63400t);
    }

    public UGc(List list, List list2, Map revokingProducts) {
        Intrinsics.checkNotNullParameter(revokingProducts, "revokingProducts");
        this.f63399n = list;
        this.rl = list2;
        this.f63400t = revokingProducts;
    }

    public int hashCode() {
        List list = this.f63399n;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.rl;
        return ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.f63400t.hashCode();
    }

    public final List n() {
        return this.rl;
    }

    public final List rl() {
        return this.f63399n;
    }

    public final Map t() {
        return this.f63400t;
    }

    public String toString() {
        return "ProductsViewModelState(activeSubscriptions=" + this.f63399n + ", activeOneTimePurchases=" + this.rl + ", revokingProducts=" + this.f63400t + ")";
    }
}
