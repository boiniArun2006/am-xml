package Z8;

import Z8.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class I28 extends Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo.n f12297n;
    private final Z8.j rl;

    static final class n extends Xo.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Xo.n f12298n;
        private Z8.j rl;

        @Override // Z8.Xo.j
        public Xo n() {
            return new I28(this.f12298n, this.rl);
        }

        @Override // Z8.Xo.j
        public Xo.j rl(Z8.j jVar) {
            this.rl = jVar;
            return this;
        }

        @Override // Z8.Xo.j
        public Xo.j t(Xo.n nVar) {
            this.f12298n = nVar;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Xo) {
            Xo xo = (Xo) obj;
            Xo.n nVar = this.f12297n;
            if (nVar != null ? nVar.equals(xo.t()) : xo.t() == null) {
                Z8.j jVar = this.rl;
                if (jVar != null ? jVar.equals(xo.rl()) : xo.rl() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private I28(Xo.n nVar, Z8.j jVar) {
        this.f12297n = nVar;
        this.rl = jVar;
    }

    public int hashCode() {
        Xo.n nVar = this.f12297n;
        int iHashCode = ((nVar == null ? 0 : nVar.hashCode()) ^ 1000003) * 1000003;
        Z8.j jVar = this.rl;
        return iHashCode ^ (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // Z8.Xo
    public Z8.j rl() {
        return this.rl;
    }

    @Override // Z8.Xo
    public Xo.n t() {
        return this.f12297n;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f12297n + ", androidClientInfo=" + this.rl + "}";
    }
}
