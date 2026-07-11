package E14;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2246n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f2246n, nVar.f2246n) && this.rl == nVar.rl;
    }

    public n(String title, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f2246n = title;
        this.rl = z2;
    }

    public int hashCode() {
        return (this.f2246n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final boolean n() {
        return this.rl;
    }

    public final String rl() {
        return this.f2246n;
    }

    public String toString() {
        return "SecretMenuHeaderUIState(title=" + this.f2246n + ", shouldShowBackButton=" + this.rl + ")";
    }
}
