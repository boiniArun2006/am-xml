package d3z;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f63441n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f63441n, jVar.f63441n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public int hashCode() {
        List list = this.f63441n;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.rl;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final List n() {
        return this.rl;
    }

    public final List rl() {
        return this.f63441n;
    }

    public String toString() {
        return "ActiveProductsUIState(subscriptions=" + this.f63441n + ", oneTimeProducts=" + this.rl + ")";
    }

    public j(List list, List list2) {
        this.f63441n = list;
        this.rl = list2;
    }
}
