package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class o extends DAz.I28.Ml {
    private final DAz.I28.Ml.Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DAz.I28.Ml.AbstractC1196Ml f73832O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f73833n;
    private final DAz.I28.Ml.w6 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DAz.I28.Ml.j f73834t;

    static final class n extends DAz.I28.Ml.n {
        private DAz.I28.Ml.Wre J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private DAz.I28.Ml.AbstractC1196Ml f73835O;
        private byte Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f73836n;
        private DAz.I28.Ml.w6 nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private DAz.I28.Ml.j f73837t;

        n() {
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml.n J2(long j2) {
            this.f73836n = j2;
            this.Uo = (byte) (this.Uo | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml.n O(DAz.I28.Ml.Wre wre) {
            this.J2 = wre;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml.n Uo(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml n() {
            String str;
            DAz.I28.Ml.j jVar;
            DAz.I28.Ml.w6 w6Var;
            if (this.Uo == 1 && (str = this.rl) != null && (jVar = this.f73837t) != null && (w6Var = this.nr) != null) {
                return new o(this.f73836n, str, jVar, w6Var, this.f73835O, this.J2);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.Uo) == 0) {
                sb.append(" timestamp");
            }
            if (this.rl == null) {
                sb.append(" type");
            }
            if (this.f73837t == null) {
                sb.append(" app");
            }
            if (this.nr == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml.n nr(DAz.I28.Ml.AbstractC1196Ml abstractC1196Ml) {
            this.f73835O = abstractC1196Ml;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml.n rl(DAz.I28.Ml.j jVar) {
            if (jVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f73837t = jVar;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.n
        public DAz.I28.Ml.n t(DAz.I28.Ml.w6 w6Var) {
            if (w6Var == null) {
                throw new NullPointerException("Null device");
            }
            this.nr = w6Var;
            return this;
        }

        private n(DAz.I28.Ml ml) {
            this.f73836n = ml.J2();
            this.rl = ml.Uo();
            this.f73837t = ml.rl();
            this.nr = ml.t();
            this.f73835O = ml.nr();
            this.J2 = ml.O();
            this.Uo = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        DAz.I28.Ml.AbstractC1196Ml abstractC1196Ml;
        DAz.I28.Ml.Wre wre;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml) {
            DAz.I28.Ml ml = (DAz.I28.Ml) obj;
            if (this.f73833n == ml.J2() && this.rl.equals(ml.Uo()) && this.f73834t.equals(ml.rl()) && this.nr.equals(ml.t()) && ((abstractC1196Ml = this.f73832O) != null ? abstractC1196Ml.equals(ml.nr()) : ml.nr() == null) && ((wre = this.J2) != null ? wre.equals(ml.O()) : ml.O() == null)) {
                return true;
            }
        }
        return false;
    }

    private o(long j2, String str, DAz.I28.Ml.j jVar, DAz.I28.Ml.w6 w6Var, DAz.I28.Ml.AbstractC1196Ml abstractC1196Ml, DAz.I28.Ml.Wre wre) {
        this.f73833n = j2;
        this.rl = str;
        this.f73834t = jVar;
        this.nr = w6Var;
        this.f73832O = abstractC1196Ml;
        this.J2 = wre;
    }

    @Override // tq6.DAz.I28.Ml
    public long J2() {
        return this.f73833n;
    }

    @Override // tq6.DAz.I28.Ml
    public DAz.I28.Ml.n KN() {
        return new n(this);
    }

    @Override // tq6.DAz.I28.Ml
    public DAz.I28.Ml.Wre O() {
        return this.J2;
    }

    @Override // tq6.DAz.I28.Ml
    public String Uo() {
        return this.rl;
    }

    public int hashCode() {
        long j2 = this.f73833n;
        int iHashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73834t.hashCode()) * 1000003) ^ this.nr.hashCode()) * 1000003;
        DAz.I28.Ml.AbstractC1196Ml abstractC1196Ml = this.f73832O;
        int iHashCode2 = (iHashCode ^ (abstractC1196Ml == null ? 0 : abstractC1196Ml.hashCode())) * 1000003;
        DAz.I28.Ml.Wre wre = this.J2;
        return iHashCode2 ^ (wre != null ? wre.hashCode() : 0);
    }

    @Override // tq6.DAz.I28.Ml
    public DAz.I28.Ml.AbstractC1196Ml nr() {
        return this.f73832O;
    }

    @Override // tq6.DAz.I28.Ml
    public DAz.I28.Ml.j rl() {
        return this.f73834t;
    }

    @Override // tq6.DAz.I28.Ml
    public DAz.I28.Ml.w6 t() {
        return this.nr;
    }

    public String toString() {
        return "Event{timestamp=" + this.f73833n + ", type=" + this.rl + ", app=" + this.f73834t + ", device=" + this.nr + ", log=" + this.f73832O + ", rollouts=" + this.J2 + "}";
    }
}
