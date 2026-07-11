package D3C;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Q {

    public static final class j extends Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f1235n;
        private final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f1235n, jVar.f1235n) && this.rl == jVar.rl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List templatesTagCarouselItems, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(templatesTagCarouselItems, "templatesTagCarouselItems");
            this.f1235n = templatesTagCarouselItems;
            this.rl = z2;
        }

        public int hashCode() {
            return (this.f1235n.hashCode() * 31) + Boolean.hashCode(this.rl);
        }

        @Override // D3C.Q
        public boolean n() {
            return this.rl;
        }

        public final List rl() {
            return this.f1235n;
        }

        public String toString() {
            return "Content(templatesTagCarouselItems=" + this.f1235n + ", isRefreshing=" + this.rl + ")";
        }
    }

    public static final class n extends Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f1236n;

        public n(boolean z2) {
            super(null);
            this.f1236n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f1236n == ((n) obj).f1236n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f1236n);
        }

        @Override // D3C.Q
        public boolean n() {
            return this.f1236n;
        }

        public String toString() {
            return "TemplatesError(isRefreshing=" + this.f1236n + ")";
        }
    }

    public static final class w6 extends Q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f1237n;

        public w6(boolean z2) {
            super(null);
            this.f1237n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && this.f1237n == ((w6) obj).f1237n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f1237n);
        }

        @Override // D3C.Q
        public boolean n() {
            return this.f1237n;
        }

        public String toString() {
            return "TemplatesLoading(isRefreshing=" + this.f1237n + ")";
        }
    }

    public /* synthetic */ Q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean n();

    private Q() {
    }
}
