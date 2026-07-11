package Z8;

import Z8.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class qz extends Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q.w6 f12369n;
    private final Q.n rl;

    static final class n extends Q.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Q.w6 f12370n;
        private Q.n rl;

        @Override // Z8.Q.j
        public Q n() {
            return new qz(this.f12370n, this.rl);
        }

        @Override // Z8.Q.j
        public Q.j rl(Q.n nVar) {
            this.rl = nVar;
            return this;
        }

        @Override // Z8.Q.j
        public Q.j t(Q.w6 w6Var) {
            this.f12370n = w6Var;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q) {
            Q q2 = (Q) obj;
            Q.w6 w6Var = this.f12369n;
            if (w6Var != null ? w6Var.equals(q2.t()) : q2.t() == null) {
                Q.n nVar = this.rl;
                if (nVar != null ? nVar.equals(q2.rl()) : q2.rl() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private qz(Q.w6 w6Var, Q.n nVar) {
        this.f12369n = w6Var;
        this.rl = nVar;
    }

    public int hashCode() {
        Q.w6 w6Var = this.f12369n;
        int iHashCode = ((w6Var == null ? 0 : w6Var.hashCode()) ^ 1000003) * 1000003;
        Q.n nVar = this.rl;
        return iHashCode ^ (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // Z8.Q
    public Q.n rl() {
        return this.rl;
    }

    @Override // Z8.Q
    public Q.w6 t() {
        return this.f12369n;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f12369n + ", mobileSubtype=" + this.rl + "}";
    }
}
