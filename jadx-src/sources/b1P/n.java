package b1P;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f43145n;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f43146t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f43145n == nVar.f43145n && Float.compare(this.rl, nVar.rl) == 0 && Intrinsics.areEqual(this.f43146t, nVar.f43146t);
    }

    public n(w6 axis, float f3, List guides) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(guides, "guides");
        this.f43145n = axis;
        this.rl = f3;
        this.f43146t = guides;
    }

    public int hashCode() {
        return (((this.f43145n.hashCode() * 31) + Float.hashCode(this.rl)) * 31) + this.f43146t.hashCode();
    }

    public final w6 n() {
        return this.f43145n;
    }

    public final float rl() {
        return this.rl;
    }

    public final List t() {
        return this.f43146t;
    }

    public String toString() {
        return "Snap(axis=" + this.f43145n + ", distance=" + this.rl + ", guides=" + this.f43146t + ")";
    }
}
