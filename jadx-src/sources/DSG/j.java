package DSG;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f1459n;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0055j f1458t = new C0055j(null);
    private static final j nr = new j(0.0f, 0.0f);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f1457O = new j(1.0f, 0.0f);
    private static final j J2 = new j(0.0f, 1.0f);
    private static final j Uo = new j(1.0f, 1.0f);

    /* JADX INFO: renamed from: DSG.j$j, reason: collision with other inner class name */
    public static final class C0055j {
        public /* synthetic */ C0055j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0055j() {
        }

        public final j n() {
            return j.f1457O;
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
        return Float.compare(this.f1459n, jVar.f1459n) == 0 && Float.compare(this.rl, jVar.rl) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f1459n) * 31) + Float.hashCode(this.rl);
    }

    public final float rl() {
        return this.f1459n;
    }

    public final float t() {
        return this.rl;
    }

    public String toString() {
        return "FloatingButtonPosition(x=" + this.f1459n + ", y=" + this.rl + ")";
    }

    public j(float f3, float f4) {
        this.f1459n = f3;
        this.rl = f4;
    }
}
