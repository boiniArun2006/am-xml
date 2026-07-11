package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Q extends DAz.I28.Ml.AbstractC1195I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DAz.I28.Ml.AbstractC1195I28.n f73706n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73707t;

    static final class n extends DAz.I28.Ml.AbstractC1195I28.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private byte f73708O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private DAz.I28.Ml.AbstractC1195I28.n f73709n;
        private long nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73710t;

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.j
        public DAz.I28.Ml.AbstractC1195I28.j O(long j2) {
            this.nr = j2;
            this.f73708O = (byte) (this.f73708O | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.j
        public DAz.I28.Ml.AbstractC1195I28 n() {
            DAz.I28.Ml.AbstractC1195I28.n nVar;
            String str;
            String str2;
            if (this.f73708O == 1 && (nVar = this.f73709n) != null && (str = this.rl) != null && (str2 = this.f73710t) != null) {
                return new Q(nVar, str, str2, this.nr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73709n == null) {
                sb.append(" rolloutVariant");
            }
            if (this.rl == null) {
                sb.append(" parameterKey");
            }
            if (this.f73710t == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f73708O) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.j
        public DAz.I28.Ml.AbstractC1195I28.j nr(DAz.I28.Ml.AbstractC1195I28.n nVar) {
            if (nVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f73709n = nVar;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.j
        public DAz.I28.Ml.AbstractC1195I28.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.j
        public DAz.I28.Ml.AbstractC1195I28.j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f73710t = str;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.AbstractC1195I28) {
            DAz.I28.Ml.AbstractC1195I28 abstractC1195I28 = (DAz.I28.Ml.AbstractC1195I28) obj;
            if (this.f73706n.equals(abstractC1195I28.nr()) && this.rl.equals(abstractC1195I28.rl()) && this.f73707t.equals(abstractC1195I28.t()) && this.nr == abstractC1195I28.O()) {
                return true;
            }
        }
        return false;
    }

    private Q(DAz.I28.Ml.AbstractC1195I28.n nVar, String str, String str2, long j2) {
        this.f73706n = nVar;
        this.rl = str;
        this.f73707t = str2;
        this.nr = j2;
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1195I28
    public long O() {
        return this.nr;
    }

    public int hashCode() {
        int iHashCode = (((((this.f73706n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73707t.hashCode()) * 1000003;
        long j2 = this.nr;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1195I28
    public DAz.I28.Ml.AbstractC1195I28.n nr() {
        return this.f73706n;
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1195I28
    public String rl() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1195I28
    public String t() {
        return this.f73707t;
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f73706n + ", parameterKey=" + this.rl + ", parameterValue=" + this.f73707t + ", templateVersion=" + this.nr + "}";
    }
}
