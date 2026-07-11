package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class qz extends DAz.I28.Ml.j {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DAz.I28.Ml.j.w6 f73838O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DAz.I28.Ml.j.n f73839n;
    private final Boolean nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f73840t;

    static final class n extends DAz.I28.Ml.j.AbstractC1197j {
        private List J2;
        private byte KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private DAz.I28.Ml.j.w6 f73841O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private DAz.I28.Ml.j.n f73842n;
        private Boolean nr;
        private List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f73843t;

        n() {
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j J2(DAz.I28.Ml.j.n nVar) {
            if (nVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f73842n = nVar;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j KN(int i2) {
            this.Uo = i2;
            this.KN = (byte) (this.KN | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j O(List list) {
            this.rl = list;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j Uo(List list) {
            this.f73843t = list;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j n() {
            DAz.I28.Ml.j.n nVar;
            if (this.KN == 1 && (nVar = this.f73842n) != null) {
                return new qz(nVar, this.rl, this.f73843t, this.nr, this.f73841O, this.J2, this.Uo);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73842n == null) {
                sb.append(" execution");
            }
            if ((1 & this.KN) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j nr(DAz.I28.Ml.j.w6 w6Var) {
            this.f73841O = w6Var;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j rl(List list) {
            this.J2 = list;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.AbstractC1197j
        public DAz.I28.Ml.j.AbstractC1197j t(Boolean bool) {
            this.nr = bool;
            return this;
        }

        private n(DAz.I28.Ml.j jVar) {
            this.f73842n = jVar.J2();
            this.rl = jVar.O();
            this.f73843t = jVar.Uo();
            this.nr = jVar.t();
            this.f73841O = jVar.nr();
            this.J2 = jVar.rl();
            this.Uo = jVar.KN();
            this.KN = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        DAz.I28.Ml.j.w6 w6Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.j) {
            DAz.I28.Ml.j jVar = (DAz.I28.Ml.j) obj;
            if (this.f73839n.equals(jVar.J2()) && ((list = this.rl) != null ? list.equals(jVar.O()) : jVar.O() == null) && ((list2 = this.f73840t) != null ? list2.equals(jVar.Uo()) : jVar.Uo() == null) && ((bool = this.nr) != null ? bool.equals(jVar.t()) : jVar.t() == null) && ((w6Var = this.f73838O) != null ? w6Var.equals(jVar.nr()) : jVar.nr() == null) && ((list3 = this.J2) != null ? list3.equals(jVar.rl()) : jVar.rl() == null) && this.Uo == jVar.KN()) {
                return true;
            }
        }
        return false;
    }

    private qz(DAz.I28.Ml.j.n nVar, List list, List list2, Boolean bool, DAz.I28.Ml.j.w6 w6Var, List list3, int i2) {
        this.f73839n = nVar;
        this.rl = list;
        this.f73840t = list2;
        this.nr = bool;
        this.f73838O = w6Var;
        this.J2 = list3;
        this.Uo = i2;
    }

    @Override // tq6.DAz.I28.Ml.j
    public DAz.I28.Ml.j.n J2() {
        return this.f73839n;
    }

    @Override // tq6.DAz.I28.Ml.j
    public int KN() {
        return this.Uo;
    }

    @Override // tq6.DAz.I28.Ml.j
    public List O() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.Ml.j
    public List Uo() {
        return this.f73840t;
    }

    public int hashCode() {
        int iHashCode = (this.f73839n.hashCode() ^ 1000003) * 1000003;
        List list = this.rl;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f73840t;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.nr;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        DAz.I28.Ml.j.w6 w6Var = this.f73838O;
        int iHashCode5 = (iHashCode4 ^ (w6Var == null ? 0 : w6Var.hashCode())) * 1000003;
        List list3 = this.J2;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.Uo;
    }

    @Override // tq6.DAz.I28.Ml.j
    public DAz.I28.Ml.j.w6 nr() {
        return this.f73838O;
    }

    @Override // tq6.DAz.I28.Ml.j
    public List rl() {
        return this.J2;
    }

    @Override // tq6.DAz.I28.Ml.j
    public Boolean t() {
        return this.nr;
    }

    public String toString() {
        return "Application{execution=" + this.f73839n + ", customAttributes=" + this.rl + ", internalKeys=" + this.f73840t + ", background=" + this.nr + ", currentProcessDetails=" + this.f73838O + ", appProcessDetails=" + this.J2 + ", uiOrientation=" + this.Uo + "}";
    }

    @Override // tq6.DAz.I28.Ml.j
    public DAz.I28.Ml.j.AbstractC1197j xMQ() {
        return new n(this);
    }
}
