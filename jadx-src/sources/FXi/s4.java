package FXi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2697n;
    private final j rl;

    public interface j {

        /* JADX INFO: renamed from: FXi.s4$j$j, reason: collision with other inner class name */
        public static final class C0090j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0090j f2698n = new C0090j();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0090j);
            }

            public String toString() {
                return "Close";
            }

            private C0090j() {
            }

            public int hashCode() {
                return 2132612984;
            }
        }

        public static final class n implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f2699n = new n();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public String toString() {
                return "PrivacySettings";
            }

            private n() {
            }

            public int hashCode() {
                return 1141085515;
            }
        }

        public static final class w6 implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f2700n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w6) && Intrinsics.areEqual(this.f2700n, ((w6) obj).f2700n);
            }

            public w6(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f2700n = value;
            }

            public int hashCode() {
                return this.f2700n.hashCode();
            }

            public final String n() {
                return this.f2700n;
            }

            public String toString() {
                return "Url(value=" + this.f2700n + ")";
            }
        }
    }

    public s4(boolean z2, j jVar) {
        this.f2697n = z2;
        this.rl = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return this.f2697n == s4Var.f2697n && Intrinsics.areEqual(this.rl, s4Var.rl);
    }

    public static /* synthetic */ s4 rl(s4 s4Var, boolean z2, j jVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = s4Var.f2697n;
        }
        if ((i2 & 2) != 0) {
            jVar = s4Var.rl;
        }
        return s4Var.n(z2, jVar);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2697n) * 31;
        j jVar = this.rl;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final s4 n(boolean z2, j jVar) {
        return new s4(z2, jVar);
    }

    public final boolean nr() {
        return this.f2697n;
    }

    public final j t() {
        return this.rl;
    }

    public String toString() {
        return "PrivacyBannerViewState(isLoading=" + this.f2697n + ", nextNavDestination=" + this.rl + ")";
    }

    public /* synthetic */ s4(boolean z2, j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? null : jVar);
    }
}
