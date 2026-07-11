package r;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C2348n {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f72695O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f72696n;
    private final float nr;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f72697t;
    public static final j Uo = new j(null);
    private static final C2348n KN = new C2348n(1.0f, 2.0f, 0.0f, 100.0f, "Test", false);

    /* JADX INFO: renamed from: r.n$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2348n)) {
            return false;
        }
        C2348n c2348n = (C2348n) obj;
        return Float.compare(this.f72696n, c2348n.f72696n) == 0 && Float.compare(this.rl, c2348n.rl) == 0 && Float.compare(this.f72697t, c2348n.f72697t) == 0 && Float.compare(this.nr, c2348n.nr) == 0 && Intrinsics.areEqual(this.f72695O, c2348n.f72695O) && this.J2 == c2348n.J2;
    }

    public C2348n(float f3, float f4, float f5, float f6, String label, boolean z2) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f72696n = f3;
        this.rl = f4;
        this.f72697t = f5;
        this.nr = f6;
        this.f72695O = label;
        this.J2 = z2;
    }

    public final float O() {
        return this.f72696n;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.f72696n) * 31) + Float.hashCode(this.rl)) * 31) + Float.hashCode(this.f72697t)) * 31) + Float.hashCode(this.nr)) * 31) + this.f72695O.hashCode()) * 31) + Boolean.hashCode(this.J2);
    }

    public final boolean n() {
        return this.J2;
    }

    public final float nr() {
        return this.f72697t;
    }

    public final String rl() {
        return this.f72695O;
    }

    public final float t() {
        return this.nr;
    }

    public String toString() {
        return "InputFieldInfo(originalValue=" + this.f72696n + ", defaultValue=" + this.rl + ", min=" + this.f72697t + ", max=" + this.nr + ", label=" + this.f72695O + ", initiallyFocused=" + this.J2 + ")";
    }
}
