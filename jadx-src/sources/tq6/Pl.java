package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Pl extends DAz.I28.Ml.j.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f73700O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f73701n;
    private final DAz.I28.Ml.j.n.AbstractC1202Ml nr;
    private final DAz.I28.Ml.j.n.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DAz.j f73702t;

    static final class n extends DAz.I28.Ml.j.n.AbstractC1206n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private List f73703O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f73704n;
        private DAz.I28.Ml.j.n.AbstractC1202Ml nr;
        private DAz.I28.Ml.j.n.w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private DAz.j f73705t;

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1206n
        public DAz.I28.Ml.j.n.AbstractC1206n J2(List list) {
            this.f73704n = list;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1206n
        public DAz.I28.Ml.j.n.AbstractC1206n O(DAz.I28.Ml.j.n.AbstractC1202Ml abstractC1202Ml) {
            if (abstractC1202Ml == null) {
                throw new NullPointerException("Null signal");
            }
            this.nr = abstractC1202Ml;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1206n
        public DAz.I28.Ml.j.n n() {
            List list;
            DAz.I28.Ml.j.n.AbstractC1202Ml abstractC1202Ml = this.nr;
            if (abstractC1202Ml != null && (list = this.f73703O) != null) {
                return new Pl(this.f73704n, this.rl, this.f73705t, abstractC1202Ml, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.nr == null) {
                sb.append(" signal");
            }
            if (this.f73703O == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1206n
        public DAz.I28.Ml.j.n.AbstractC1206n nr(DAz.I28.Ml.j.n.w6 w6Var) {
            this.rl = w6Var;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1206n
        public DAz.I28.Ml.j.n.AbstractC1206n rl(DAz.j jVar) {
            this.f73705t = jVar;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1206n
        public DAz.I28.Ml.j.n.AbstractC1206n t(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f73703O = list;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.j.n) {
            DAz.I28.Ml.j.n nVar = (DAz.I28.Ml.j.n) obj;
            List list = this.f73701n;
            if (list != null ? list.equals(nVar.J2()) : nVar.J2() == null) {
                DAz.I28.Ml.j.n.w6 w6Var = this.rl;
                if (w6Var != null ? w6Var.equals(nVar.nr()) : nVar.nr() == null) {
                    DAz.j jVar = this.f73702t;
                    if (jVar != null ? jVar.equals(nVar.rl()) : nVar.rl() == null) {
                        if (this.nr.equals(nVar.O()) && this.f73700O.equals(nVar.t())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private Pl(List list, DAz.I28.Ml.j.n.w6 w6Var, DAz.j jVar, DAz.I28.Ml.j.n.AbstractC1202Ml abstractC1202Ml, List list2) {
        this.f73701n = list;
        this.rl = w6Var;
        this.f73702t = jVar;
        this.nr = abstractC1202Ml;
        this.f73700O = list2;
    }

    @Override // tq6.DAz.I28.Ml.j.n
    public List J2() {
        return this.f73701n;
    }

    @Override // tq6.DAz.I28.Ml.j.n
    public DAz.I28.Ml.j.n.AbstractC1202Ml O() {
        return this.nr;
    }

    public int hashCode() {
        List list = this.f73701n;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        DAz.I28.Ml.j.n.w6 w6Var = this.rl;
        int iHashCode2 = (iHashCode ^ (w6Var == null ? 0 : w6Var.hashCode())) * 1000003;
        DAz.j jVar = this.f73702t;
        return ((((iHashCode2 ^ (jVar != null ? jVar.hashCode() : 0)) * 1000003) ^ this.nr.hashCode()) * 1000003) ^ this.f73700O.hashCode();
    }

    @Override // tq6.DAz.I28.Ml.j.n
    public DAz.I28.Ml.j.n.w6 nr() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.Ml.j.n
    public DAz.j rl() {
        return this.f73702t;
    }

    @Override // tq6.DAz.I28.Ml.j.n
    public List t() {
        return this.f73700O;
    }

    public String toString() {
        return "Execution{threads=" + this.f73701n + ", exception=" + this.rl + ", appExitInfo=" + this.f73702t + ", signal=" + this.nr + ", binaries=" + this.f73700O + "}";
    }
}
