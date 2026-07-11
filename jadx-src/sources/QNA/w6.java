package QNA;

import QNA.M;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class w6 extends M.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8153n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8154t;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof M.j) {
            M.j jVar = (M.j) obj;
            if (this.f8153n.equals(jVar.t()) && ((str = this.rl) != null ? str.equals(jVar.O()) : jVar.O() == null) && ((str2 = this.f8154t) != null ? str2.equals(jVar.nr()) : jVar.nr() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // QNA.M.j
    public String O() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = (this.f8153n.hashCode() ^ 1000003) * 1000003;
        String str = this.rl;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8154t;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // QNA.M.j
    public String nr() {
        return this.f8154t;
    }

    @Override // QNA.M.j
    public String t() {
        return this.f8153n;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f8153n + ", firebaseInstallationId=" + this.rl + ", firebaseAuthenticationToken=" + this.f8154t + "}";
    }

    w6(String str, String str2, String str3) {
        if (str != null) {
            this.f8153n = str;
            this.rl = str2;
            this.f8154t = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }
}
