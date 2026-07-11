package Z8;

import Z8.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Wre extends eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l3D f12330n;
    private final eO.n rl;

    static final class n extends eO.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private l3D f12331n;
        private eO.n rl;

        @Override // Z8.eO.j
        public eO n() {
            return new Wre(this.f12331n, this.rl);
        }

        @Override // Z8.eO.j
        public eO.j rl(l3D l3d) {
            this.f12331n = l3d;
            return this;
        }

        @Override // Z8.eO.j
        public eO.j t(eO.n nVar) {
            this.rl = nVar;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eO) {
            eO eOVar = (eO) obj;
            l3D l3d = this.f12330n;
            if (l3d != null ? l3d.equals(eOVar.rl()) : eOVar.rl() == null) {
                eO.n nVar = this.rl;
                if (nVar != null ? nVar.equals(eOVar.t()) : eOVar.t() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private Wre(l3D l3d, eO.n nVar) {
        this.f12330n = l3d;
        this.rl = nVar;
    }

    public int hashCode() {
        l3D l3d = this.f12330n;
        int iHashCode = ((l3d == null ? 0 : l3d.hashCode()) ^ 1000003) * 1000003;
        eO.n nVar = this.rl;
        return iHashCode ^ (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // Z8.eO
    public l3D rl() {
        return this.f12330n;
    }

    @Override // Z8.eO
    public eO.n t() {
        return this.rl;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f12330n + ", productIdOrigin=" + this.rl + "}";
    }
}
