package N03;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6934n;
    private final String rl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre) {
            Wre wre = (Wre) obj;
            if (this.f6934n.equals(wre.rl()) && this.rl.equals(wre.t())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6934n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    @Override // N03.Wre
    public String rl() {
        return this.f6934n;
    }

    @Override // N03.Wre
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f6934n + ", version=" + this.rl + "}";
    }

    j(String str, String str2) {
        if (str != null) {
            this.f6934n = str;
            if (str2 != null) {
                this.rl = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }
}
