package zRY;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f76511n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f76512t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return Intrinsics.areEqual(this.f76511n, z2.f76511n) && Intrinsics.areEqual(this.rl, z2.rl) && Intrinsics.areEqual(this.f76512t, z2.f76512t);
    }

    public Z(List categories, String str, List typeFilters) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(typeFilters, "typeFilters");
        this.f76511n = categories;
        this.rl = str;
        this.f76512t = typeFilters;
    }

    public static /* synthetic */ Z rl(Z z2, List list, String str, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = z2.f76511n;
        }
        if ((i2 & 2) != 0) {
            str = z2.rl;
        }
        if ((i2 & 4) != 0) {
            list2 = z2.f76512t;
        }
        return z2.n(list, str, list2);
    }

    public final List O() {
        return this.f76512t;
    }

    public int hashCode() {
        int iHashCode = this.f76511n.hashCode() * 31;
        String str = this.rl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f76512t.hashCode();
    }

    public final Z n(List categories, String str, List typeFilters) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(typeFilters, "typeFilters");
        return new Z(categories, str, typeFilters);
    }

    public final String nr() {
        return this.rl;
    }

    public final List t() {
        return this.f76511n;
    }

    public String toString() {
        return "PremadeContentViewModelState(categories=" + this.f76511n + ", selectedCategoryId=" + this.rl + ", typeFilters=" + this.f76512t + ")";
    }
}
