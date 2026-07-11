package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class r extends DAz.I28.Ml.AbstractC1195I28.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73844n;
    private final String rl;

    static final class n extends DAz.I28.Ml.AbstractC1195I28.n.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73845n;
        private String rl;

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.n.j
        public DAz.I28.Ml.AbstractC1195I28.n n() {
            String str;
            String str2 = this.f73845n;
            if (str2 != null && (str = this.rl) != null) {
                return new r(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73845n == null) {
                sb.append(" rolloutId");
            }
            if (this.rl == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.n.j
        public DAz.I28.Ml.AbstractC1195I28.n.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f73845n = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.AbstractC1195I28.n.j
        public DAz.I28.Ml.AbstractC1195I28.n.j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.rl = str;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.AbstractC1195I28.n) {
            DAz.I28.Ml.AbstractC1195I28.n nVar = (DAz.I28.Ml.AbstractC1195I28.n) obj;
            if (this.f73844n.equals(nVar.rl()) && this.rl.equals(nVar.t())) {
                return true;
            }
        }
        return false;
    }

    private r(String str, String str2) {
        this.f73844n = str;
        this.rl = str2;
    }

    public int hashCode() {
        return ((this.f73844n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1195I28.n
    public String rl() {
        return this.f73844n;
    }

    @Override // tq6.DAz.I28.Ml.AbstractC1195I28.n
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f73844n + ", variantId=" + this.rl + "}";
    }
}
