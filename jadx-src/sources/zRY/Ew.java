package zRY;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface Ew {

    public static final class j implements Ew {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f76468n;
        private final List nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f76469t;

        public j(List items, List categories, String selectedCategoryId, List typeFilters) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(selectedCategoryId, "selectedCategoryId");
            Intrinsics.checkNotNullParameter(typeFilters, "typeFilters");
            this.f76468n = items;
            this.rl = categories;
            this.f76469t = selectedCategoryId;
            this.nr = typeFilters;
        }

        public final List n() {
            return this.rl;
        }

        public final List nr() {
            return this.nr;
        }

        public final List rl() {
            return this.f76468n;
        }

        public final String t() {
            return this.f76469t;
        }
    }

    public static final class n implements Ew {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f76470n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "Empty";
        }

        private n() {
        }

        public int hashCode() {
            return -1911972012;
        }
    }
}
