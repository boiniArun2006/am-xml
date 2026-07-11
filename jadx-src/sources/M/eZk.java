package M;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class eZk {

    public static final class j extends eZk {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Integer f6400O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final KA9.u f6401n;
        private final List nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f6402t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f6401n == jVar.f6401n && this.rl == jVar.rl && this.f6402t == jVar.f6402t && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f6400O, jVar.f6400O);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(KA9.u selectedSortOption, boolean z2, boolean z3, List premadeContentItems, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
            Intrinsics.checkNotNullParameter(premadeContentItems, "premadeContentItems");
            this.f6401n = selectedSortOption;
            this.rl = z2;
            this.f6402t = z3;
            this.nr = premadeContentItems;
            this.f6400O = num;
        }

        public final boolean O() {
            return this.rl;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f6401n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f6402t)) * 31) + this.nr.hashCode()) * 31;
            Integer num = this.f6400O;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final boolean n() {
            return this.f6402t;
        }

        public final KA9.u nr() {
            return this.f6401n;
        }

        public final List rl() {
            return this.nr;
        }

        public final Integer t() {
            return this.f6400O;
        }

        public String toString() {
            return "Content(selectedSortOption=" + this.f6401n + ", xmlImportEnabled=" + this.rl + ", premadeContentEnabled=" + this.f6402t + ", premadeContentItems=" + this.nr + ", progressDialogValue=" + this.f6400O + ")";
        }
    }

    public /* synthetic */ eZk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private eZk() {
    }
}
