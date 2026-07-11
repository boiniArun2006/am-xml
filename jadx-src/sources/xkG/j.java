package xkG;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f75475O;
    private static final j nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1275j f75476t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f75477n;
    private final float rl;

    /* JADX INFO: renamed from: xkG.j$j, reason: collision with other inner class name */
    public static final class C1275j {
        public /* synthetic */ C1275j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1275j() {
        }

        public final j n() {
            return j.f75475O;
        }
    }

    public j(float f3, float f4) {
        this.f75477n = f3;
        this.rl = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f75477n, jVar.f75477n) == 0 && Float.compare(this.rl, jVar.rl) == 0;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f75476t = new C1275j(defaultConstructorMarker);
        float f3 = 0.0f;
        int i2 = 2;
        nr = new j(f3, f3, i2, defaultConstructorMarker);
        f75475O = new j(1.0f, f3, i2, defaultConstructorMarker);
    }

    public int hashCode() {
        return (Float.hashCode(this.f75477n) * 31) + Float.hashCode(this.rl);
    }

    public final float rl() {
        return this.rl;
    }

    public final float t() {
        return this.f75477n;
    }

    public String toString() {
        return "AmplificationRamp(startFactor=" + this.f75477n + ", endFactor=" + this.rl + ')';
    }

    public /* synthetic */ j(float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, (i2 & 2) != 0 ? f3 : f4);
    }
}
