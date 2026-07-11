package f52;

import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class r {

    public static final class j extends r {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f66560O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f66561n;
        private final TemplateFiltersItem.Content nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f66562t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f66561n, jVar.f66561n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f66562t, jVar.f66562t) && Intrinsics.areEqual(this.nr, jVar.nr) && this.f66560O == jVar.f66560O && this.J2 == jVar.J2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List templates, List templatesTagCarouselItems, List filters, TemplateFiltersItem.Content selectedFilter, boolean z2, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(templates, "templates");
            Intrinsics.checkNotNullParameter(templatesTagCarouselItems, "templatesTagCarouselItems");
            Intrinsics.checkNotNullParameter(filters, "filters");
            Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
            this.f66561n = templates;
            this.rl = templatesTagCarouselItems;
            this.f66562t = filters;
            this.nr = selectedFilter;
            this.f66560O = z2;
            this.J2 = z3;
        }

        public final boolean J2() {
            return this.f66560O;
        }

        public final List O() {
            return this.rl;
        }

        public int hashCode() {
            return (((((((((this.f66561n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f66562t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f66560O)) * 31) + Boolean.hashCode(this.J2);
        }

        @Override // f52.r
        public boolean n() {
            return this.J2;
        }

        public final List nr() {
            return this.f66561n;
        }

        public final List rl() {
            return this.f66562t;
        }

        public final TemplateFiltersItem.Content t() {
            return this.nr;
        }

        public String toString() {
            return "Content(templates=" + this.f66561n + ", templatesTagCarouselItems=" + this.rl + ", filters=" + this.f66562t + ", selectedFilter=" + this.nr + ", isLoadingMoreTemplates=" + this.f66560O + ", isRefreshing=" + this.J2 + ")";
        }
    }

    public static final class n extends r {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f66563n;

        public n(boolean z2) {
            super(null);
            this.f66563n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f66563n == ((n) obj).f66563n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f66563n);
        }

        @Override // f52.r
        public boolean n() {
            return this.f66563n;
        }

        public String toString() {
            return "Error(isRefreshing=" + this.f66563n + ")";
        }
    }

    public static final class w6 extends r {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f66564n;

        public w6(boolean z2) {
            super(null);
            this.f66564n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && this.f66564n == ((w6) obj).f66564n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f66564n);
        }

        @Override // f52.r
        public boolean n() {
            return this.f66564n;
        }

        public String toString() {
            return "Loading(isRefreshing=" + this.f66564n + ")";
        }
    }

    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean n();

    private r() {
    }
}
