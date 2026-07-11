package DTN;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1489n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1489n == jVar.f1489n && this.rl == jVar.rl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f1489n) * 31) + Boolean.hashCode(this.rl);
    }

    public final boolean n() {
        return this.rl;
    }

    public String toString() {
        return "ProviderInstallError(code=" + this.f1489n + ", isUserResolvable=" + this.rl + ")";
    }

    public j(int i2, boolean z2) {
        this.f1489n = i2;
        this.rl = z2;
    }
}
