package AR;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f77t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f76n == nVar.f76n && Intrinsics.areEqual(this.rl, nVar.rl) && this.f77t == nVar.f77t;
    }

    public n(int i2, String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f76n = i2;
        this.rl = name;
        this.f77t = z2;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f76n) * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f77t);
    }

    public final boolean n() {
        return this.f77t;
    }

    public final String rl() {
        return this.rl;
    }

    public final int t() {
        return this.f76n;
    }

    public String toString() {
        return "TimezoneInfo(seconds=" + this.f76n + ", name=" + this.rl + ", daylightSaving=" + this.f77t + ")";
    }
}
