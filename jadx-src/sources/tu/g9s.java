package tu;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f73967n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f73966t = new j(null);
    private static final g9s nr = new g9s(afx.f73914n, true);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final g9s f73965O = new g9s(afx.f73917t, true);
    private static final g9s J2 = new g9s(afx.f73911O, false);
    private static final g9s Uo = new g9s(afx.J2, false);
    private static final g9s KN = new g9s(afx.f73916r, false);
    private static final g9s xMQ = new g9s(afx.f73915o, false);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final g9s n() {
            return g9s.f73965O;
        }

        public final g9s rl() {
            return g9s.nr;
        }

        public final g9s t() {
            return g9s.J2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9s)) {
            return false;
        }
        g9s g9sVar = (g9s) obj;
        return this.f73967n == g9sVar.f73967n && this.rl == g9sVar.rl;
    }

    public g9s(afx sortOrder, boolean z2) {
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f73967n = sortOrder;
        this.rl = z2;
    }

    public final afx O() {
        return this.f73967n;
    }

    public int hashCode() {
        return (this.f73967n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final boolean nr() {
        return this.rl;
    }

    public String toString() {
        return "MediaQueryParams(sortOrder=" + this.f73967n + ", descending=" + this.rl + ")";
    }
}
