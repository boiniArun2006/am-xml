package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class fuX extends DAz.I28 {
    private final boolean J2;
    private final DAz.I28.Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Long f73747O;
    private final DAz.I28.j Uo;
    private final List gh;
    private final DAz.I28.w6 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73748n;
    private final long nr;
    private final int qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73749t;
    private final DAz.I28.AbstractC1194I28 xMQ;

    static final class n extends DAz.I28.n {
        private boolean J2;
        private DAz.I28.Wre KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Long f73750O;
        private DAz.I28.j Uo;
        private byte az;
        private List gh;
        private DAz.I28.w6 mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73751n;
        private long nr;
        private int qie;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73752t;
        private DAz.I28.AbstractC1194I28 xMQ;

        n() {
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n J2(Long l2) {
            this.f73750O = l2;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n KN(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f73751n = str;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n O(DAz.I28.w6 w6Var) {
            this.mUb = w6Var;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n Uo(List list) {
            this.gh = list;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n az(long j2) {
            this.nr = j2;
            this.az = (byte) (this.az | 1);
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n mUb(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28 n() {
            String str;
            String str2;
            DAz.I28.j jVar;
            if (this.az == 7 && (str = this.f73751n) != null && (str2 = this.rl) != null && (jVar = this.Uo) != null) {
                return new fuX(str, str2, this.f73752t, this.nr, this.f73750O, this.J2, jVar, this.KN, this.xMQ, this.mUb, this.gh, this.qie);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73751n == null) {
                sb.append(" generator");
            }
            if (this.rl == null) {
                sb.append(" identifier");
            }
            if ((this.az & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.az & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.Uo == null) {
                sb.append(" app");
            }
            if ((this.az & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n nr(boolean z2) {
            this.J2 = z2;
            this.az = (byte) (this.az | 2);
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n qie(DAz.I28.AbstractC1194I28 abstractC1194I28) {
            this.xMQ = abstractC1194I28;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n rl(DAz.I28.j jVar) {
            if (jVar == null) {
                throw new NullPointerException("Null app");
            }
            this.Uo = jVar;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n t(String str) {
            this.f73752t = str;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n ty(DAz.I28.Wre wre) {
            this.KN = wre;
            return this;
        }

        @Override // tq6.DAz.I28.n
        public DAz.I28.n xMQ(int i2) {
            this.qie = i2;
            this.az = (byte) (this.az | 4);
            return this;
        }

        private n(DAz.I28 i28) {
            this.f73751n = i28.Uo();
            this.rl = i28.xMQ();
            this.f73752t = i28.t();
            this.nr = i28.qie();
            this.f73750O = i28.O();
            this.J2 = i28.ty();
            this.Uo = i28.rl();
            this.KN = i28.az();
            this.xMQ = i28.gh();
            this.mUb = i28.nr();
            this.gh = i28.J2();
            this.qie = i28.KN();
            this.az = (byte) 7;
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l2;
        DAz.I28.Wre wre;
        DAz.I28.AbstractC1194I28 abstractC1194I28;
        DAz.I28.w6 w6Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28) {
            DAz.I28 i28 = (DAz.I28) obj;
            if (this.f73748n.equals(i28.Uo()) && this.rl.equals(i28.xMQ()) && ((str = this.f73749t) != null ? str.equals(i28.t()) : i28.t() == null) && this.nr == i28.qie() && ((l2 = this.f73747O) != null ? l2.equals(i28.O()) : i28.O() == null) && this.J2 == i28.ty() && this.Uo.equals(i28.rl()) && ((wre = this.KN) != null ? wre.equals(i28.az()) : i28.az() == null) && ((abstractC1194I28 = this.xMQ) != null ? abstractC1194I28.equals(i28.gh()) : i28.gh() == null) && ((w6Var = this.mUb) != null ? w6Var.equals(i28.nr()) : i28.nr() == null) && ((list = this.gh) != null ? list.equals(i28.J2()) : i28.J2() == null) && this.qie == i28.KN()) {
                return true;
            }
        }
        return false;
    }

    private fuX(String str, String str2, String str3, long j2, Long l2, boolean z2, DAz.I28.j jVar, DAz.I28.Wre wre, DAz.I28.AbstractC1194I28 abstractC1194I28, DAz.I28.w6 w6Var, List list, int i2) {
        this.f73748n = str;
        this.rl = str2;
        this.f73749t = str3;
        this.nr = j2;
        this.f73747O = l2;
        this.J2 = z2;
        this.Uo = jVar;
        this.KN = wre;
        this.xMQ = abstractC1194I28;
        this.mUb = w6Var;
        this.gh = list;
        this.qie = i2;
    }

    @Override // tq6.DAz.I28
    public DAz.I28.n HI() {
        return new n(this);
    }

    @Override // tq6.DAz.I28
    public List J2() {
        return this.gh;
    }

    @Override // tq6.DAz.I28
    public int KN() {
        return this.qie;
    }

    @Override // tq6.DAz.I28
    public Long O() {
        return this.f73747O;
    }

    @Override // tq6.DAz.I28
    public String Uo() {
        return this.f73748n;
    }

    @Override // tq6.DAz.I28
    public DAz.I28.Wre az() {
        return this.KN;
    }

    @Override // tq6.DAz.I28
    public DAz.I28.AbstractC1194I28 gh() {
        return this.xMQ;
    }

    public int hashCode() {
        int iHashCode = (((this.f73748n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003;
        String str = this.f73749t;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.nr;
        int i2 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f73747O;
        int iHashCode3 = (((((i2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.J2 ? 1231 : 1237)) * 1000003) ^ this.Uo.hashCode()) * 1000003;
        DAz.I28.Wre wre = this.KN;
        int iHashCode4 = (iHashCode3 ^ (wre == null ? 0 : wre.hashCode())) * 1000003;
        DAz.I28.AbstractC1194I28 abstractC1194I28 = this.xMQ;
        int iHashCode5 = (iHashCode4 ^ (abstractC1194I28 == null ? 0 : abstractC1194I28.hashCode())) * 1000003;
        DAz.I28.w6 w6Var = this.mUb;
        int iHashCode6 = (iHashCode5 ^ (w6Var == null ? 0 : w6Var.hashCode())) * 1000003;
        List list = this.gh;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.qie;
    }

    @Override // tq6.DAz.I28
    public DAz.I28.w6 nr() {
        return this.mUb;
    }

    @Override // tq6.DAz.I28
    public long qie() {
        return this.nr;
    }

    @Override // tq6.DAz.I28
    public DAz.I28.j rl() {
        return this.Uo;
    }

    @Override // tq6.DAz.I28
    public String t() {
        return this.f73749t;
    }

    public String toString() {
        return "Session{generator=" + this.f73748n + ", identifier=" + this.rl + ", appQualitySessionId=" + this.f73749t + ", startedAt=" + this.nr + ", endedAt=" + this.f73747O + ", crashed=" + this.J2 + ", app=" + this.Uo + ", user=" + this.KN + ", os=" + this.xMQ + ", device=" + this.mUb + ", events=" + this.gh + ", generatorType=" + this.qie + "}";
    }

    @Override // tq6.DAz.I28
    public boolean ty() {
        return this.J2;
    }

    @Override // tq6.DAz.I28
    public String xMQ() {
        return this.rl;
    }
}
