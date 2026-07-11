package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class eO extends DAz.I28.Ml.j.n.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f73741O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73742n;
    private final DAz.I28.Ml.j.n.w6 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f73743t;

    static final class n extends DAz.I28.Ml.j.n.w6.AbstractC1207j {
        private byte J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f73744O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73745n;
        private DAz.I28.Ml.j.n.w6 nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f73746t;

        @Override // tq6.DAz.I28.Ml.j.n.w6.AbstractC1207j
        public DAz.I28.Ml.j.n.w6.AbstractC1207j J2(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f73745n = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.w6.AbstractC1207j
        public DAz.I28.Ml.j.n.w6.AbstractC1207j O(String str) {
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.w6.AbstractC1207j
        public DAz.I28.Ml.j.n.w6 n() {
            String str;
            List list;
            if (this.J2 == 1 && (str = this.f73745n) != null && (list = this.f73746t) != null) {
                return new eO(str, this.rl, list, this.nr, this.f73744O);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73745n == null) {
                sb.append(" type");
            }
            if (this.f73746t == null) {
                sb.append(" frames");
            }
            if ((1 & this.J2) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.n.w6.AbstractC1207j
        public DAz.I28.Ml.j.n.w6.AbstractC1207j nr(int i2) {
            this.f73744O = i2;
            this.J2 = (byte) (this.J2 | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.w6.AbstractC1207j
        public DAz.I28.Ml.j.n.w6.AbstractC1207j rl(DAz.I28.Ml.j.n.w6 w6Var) {
            this.nr = w6Var;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.w6.AbstractC1207j
        public DAz.I28.Ml.j.n.w6.AbstractC1207j t(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f73746t = list;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        DAz.I28.Ml.j.n.w6 w6Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.j.n.w6) {
            DAz.I28.Ml.j.n.w6 w6Var2 = (DAz.I28.Ml.j.n.w6) obj;
            if (this.f73742n.equals(w6Var2.J2()) && ((str = this.rl) != null ? str.equals(w6Var2.O()) : w6Var2.O() == null) && this.f73743t.equals(w6Var2.t()) && ((w6Var = this.nr) != null ? w6Var.equals(w6Var2.rl()) : w6Var2.rl() == null) && this.f73741O == w6Var2.nr()) {
                return true;
            }
        }
        return false;
    }

    private eO(String str, String str2, List list, DAz.I28.Ml.j.n.w6 w6Var, int i2) {
        this.f73742n = str;
        this.rl = str2;
        this.f73743t = list;
        this.nr = w6Var;
        this.f73741O = i2;
    }

    @Override // tq6.DAz.I28.Ml.j.n.w6
    public String J2() {
        return this.f73742n;
    }

    @Override // tq6.DAz.I28.Ml.j.n.w6
    public String O() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = (this.f73742n.hashCode() ^ 1000003) * 1000003;
        String str = this.rl;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f73743t.hashCode()) * 1000003;
        DAz.I28.Ml.j.n.w6 w6Var = this.nr;
        return ((iHashCode2 ^ (w6Var != null ? w6Var.hashCode() : 0)) * 1000003) ^ this.f73741O;
    }

    @Override // tq6.DAz.I28.Ml.j.n.w6
    public int nr() {
        return this.f73741O;
    }

    @Override // tq6.DAz.I28.Ml.j.n.w6
    public DAz.I28.Ml.j.n.w6 rl() {
        return this.nr;
    }

    @Override // tq6.DAz.I28.Ml.j.n.w6
    public List t() {
        return this.f73743t;
    }

    public String toString() {
        return "Exception{type=" + this.f73742n + ", reason=" + this.rl + ", frames=" + this.f73743t + ", causedBy=" + this.nr + ", overflowCount=" + this.f73741O + "}";
    }
}
