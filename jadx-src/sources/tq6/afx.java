package tq6;

import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class afx extends u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u.j f73729n;
    private final u.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final u.n f73730t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f73729n.equals(uVar.n()) && this.rl.equals(uVar.nr()) && this.f73730t.equals(uVar.t())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f73729n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73730t.hashCode();
    }

    @Override // tq6.u
    public u.j n() {
        return this.f73729n;
    }

    @Override // tq6.u
    public u.w6 nr() {
        return this.rl;
    }

    @Override // tq6.u
    public u.n t() {
        return this.f73730t;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f73729n + ", osData=" + this.rl + ", deviceData=" + this.f73730t + "}";
    }

    afx(u.j jVar, u.w6 w6Var, u.n nVar) {
        if (jVar != null) {
            this.f73729n = jVar;
            if (w6Var != null) {
                this.rl = w6Var;
                if (nVar != null) {
                    this.f73730t = nVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }
}
