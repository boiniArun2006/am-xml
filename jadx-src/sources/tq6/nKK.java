package tq6;

import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class nKK extends u.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73830n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f73831t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u.w6) {
            u.w6 w6Var = (u.w6) obj;
            if (this.f73830n.equals(w6Var.nr()) && this.rl.equals(w6Var.t()) && this.f73831t == w6Var.rl()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f73830n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ (this.f73831t ? 1231 : 1237);
    }

    @Override // tq6.u.w6
    public String nr() {
        return this.f73830n;
    }

    @Override // tq6.u.w6
    public boolean rl() {
        return this.f73831t;
    }

    @Override // tq6.u.w6
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f73830n + ", osCodeName=" + this.rl + ", isRooted=" + this.f73831t + "}";
    }

    nKK(String str, String str2, boolean z2) {
        if (str != null) {
            this.f73830n = str;
            if (str2 != null) {
                this.rl = str2;
                this.f73831t = z2;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }
}
