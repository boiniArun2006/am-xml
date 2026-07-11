package SFf;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8981n;
    private final j nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f8982t;

    public interface j {

        /* JADX INFO: renamed from: SFf.Z$j$j, reason: collision with other inner class name */
        public static final class C0307j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f8983n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0307j) && this.f8983n == ((C0307j) obj).f8983n;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f8983n);
            }

            public final boolean n() {
                return this.f8983n;
            }

            public String toString() {
                return "Close(shouldDismissBanner=" + this.f8983n + ")";
            }

            public C0307j(boolean z2) {
                this.f8983n = z2;
            }
        }

        public static final class n implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f8984n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && Intrinsics.areEqual(this.f8984n, ((n) obj).f8984n);
            }

            public n(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f8984n = value;
            }

            public int hashCode() {
                return this.f8984n.hashCode();
            }

            public final String n() {
                return this.f8984n;
            }

            public String toString() {
                return "Url(value=" + this.f8984n + ")";
            }
        }
    }

    public Z(boolean z2, Map categoryPreferences, Map trackerPreferences, j jVar) {
        Intrinsics.checkNotNullParameter(categoryPreferences, "categoryPreferences");
        Intrinsics.checkNotNullParameter(trackerPreferences, "trackerPreferences");
        this.f8981n = z2;
        this.rl = categoryPreferences;
        this.f8982t = trackerPreferences;
        this.nr = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return this.f8981n == z2.f8981n && Intrinsics.areEqual(this.rl, z2.rl) && Intrinsics.areEqual(this.f8982t, z2.f8982t) && Intrinsics.areEqual(this.nr, z2.nr);
    }

    public static /* synthetic */ Z rl(Z z2, boolean z3, Map map, Map map2, j jVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z3 = z2.f8981n;
        }
        if ((i2 & 2) != 0) {
            map = z2.rl;
        }
        if ((i2 & 4) != 0) {
            map2 = z2.f8982t;
        }
        if ((i2 & 8) != 0) {
            jVar = z2.nr;
        }
        return z2.n(z3, map, map2, jVar);
    }

    public final boolean J2() {
        return this.f8981n;
    }

    public final Map O() {
        return this.f8982t;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f8981n) * 31) + this.rl.hashCode()) * 31) + this.f8982t.hashCode()) * 31;
        j jVar = this.nr;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final Z n(boolean z2, Map categoryPreferences, Map trackerPreferences, j jVar) {
        Intrinsics.checkNotNullParameter(categoryPreferences, "categoryPreferences");
        Intrinsics.checkNotNullParameter(trackerPreferences, "trackerPreferences");
        return new Z(z2, categoryPreferences, trackerPreferences, jVar);
    }

    public final j nr() {
        return this.nr;
    }

    public final Map t() {
        return this.rl;
    }

    public String toString() {
        return "PrivacySettingsViewState(isLoading=" + this.f8981n + ", categoryPreferences=" + this.rl + ", trackerPreferences=" + this.f8982t + ", nextNavDestination=" + this.nr + ")";
    }

    public /* synthetic */ Z(boolean z2, Map map, Map map2, j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? MapsKt.emptyMap() : map, (i2 & 4) != 0 ? MapsKt.emptyMap() : map2, (i2 & 8) != 0 ? null : jVar);
    }
}
