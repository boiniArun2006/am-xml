package cBL;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f43573n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0589j f43572t = new C0589j(null);
    private static final j nr = new j(true, false);

    /* JADX INFO: renamed from: cBL.j$j, reason: collision with other inner class name */
    public static final class C0589j {
        public /* synthetic */ C0589j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0589j() {
        }

        public final j n() {
            return j.nr;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f43573n == jVar.f43573n && this.rl == jVar.rl;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f43573n) * 31) + Boolean.hashCode(this.rl);
    }

    public final boolean rl() {
        return this.rl;
    }

    public final boolean t() {
        return this.f43573n;
    }

    public String toString() {
        return "WatermarkOptions(shouldHide=" + this.f43573n + ", newDesign=" + this.rl + ")";
    }

    public j(boolean z2, boolean z3) {
        this.f43573n = z2;
        this.rl = z3;
    }
}
