package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class I28 extends DAz.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73694n;
    private final String rl;

    static final class n extends DAz.w6.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73695n;
        private String rl;

        @Override // tq6.DAz.w6.j
        public DAz.w6 n() {
            String str;
            String str2 = this.f73695n;
            if (str2 != null && (str = this.rl) != null) {
                return new I28(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73695n == null) {
                sb.append(" key");
            }
            if (this.rl == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.w6.j
        public DAz.w6.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f73695n = str;
            return this;
        }

        @Override // tq6.DAz.w6.j
        public DAz.w6.j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
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
        if (obj instanceof DAz.w6) {
            DAz.w6 w6Var = (DAz.w6) obj;
            if (this.f73694n.equals(w6Var.rl()) && this.rl.equals(w6Var.t())) {
                return true;
            }
        }
        return false;
    }

    private I28(String str, String str2) {
        this.f73694n = str;
        this.rl = str2;
    }

    public int hashCode() {
        return ((this.f73694n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    @Override // tq6.DAz.w6
    public String rl() {
        return this.f73694n;
    }

    @Override // tq6.DAz.w6
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f73694n + ", value=" + this.rl + "}";
    }
}
