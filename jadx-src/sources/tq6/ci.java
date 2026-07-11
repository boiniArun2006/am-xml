package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class ci extends DAz.I28.AbstractC1194I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73736n;
    private final boolean nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73737t;

    static final class n extends DAz.I28.AbstractC1194I28.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private byte f73738O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f73739n;
        private boolean nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73740t;

        @Override // tq6.DAz.I28.AbstractC1194I28.j
        public DAz.I28.AbstractC1194I28.j O(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.AbstractC1194I28.j
        public DAz.I28.AbstractC1194I28 n() {
            String str;
            String str2;
            if (this.f73738O == 3 && (str = this.rl) != null && (str2 = this.f73740t) != null) {
                return new ci(this.f73739n, str, str2, this.nr);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f73738O & 1) == 0) {
                sb.append(" platform");
            }
            if (this.rl == null) {
                sb.append(" version");
            }
            if (this.f73740t == null) {
                sb.append(" buildVersion");
            }
            if ((this.f73738O & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.AbstractC1194I28.j
        public DAz.I28.AbstractC1194I28.j nr(int i2) {
            this.f73739n = i2;
            this.f73738O = (byte) (this.f73738O | 1);
            return this;
        }

        @Override // tq6.DAz.I28.AbstractC1194I28.j
        public DAz.I28.AbstractC1194I28.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f73740t = str;
            return this;
        }

        @Override // tq6.DAz.I28.AbstractC1194I28.j
        public DAz.I28.AbstractC1194I28.j t(boolean z2) {
            this.nr = z2;
            this.f73738O = (byte) (this.f73738O | 2);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.AbstractC1194I28) {
            DAz.I28.AbstractC1194I28 abstractC1194I28 = (DAz.I28.AbstractC1194I28) obj;
            if (this.f73736n == abstractC1194I28.t() && this.rl.equals(abstractC1194I28.nr()) && this.f73737t.equals(abstractC1194I28.rl()) && this.nr == abstractC1194I28.O()) {
                return true;
            }
        }
        return false;
    }

    private ci(int i2, String str, String str2, boolean z2) {
        this.f73736n = i2;
        this.rl = str;
        this.f73737t = str2;
        this.nr = z2;
    }

    @Override // tq6.DAz.I28.AbstractC1194I28
    public boolean O() {
        return this.nr;
    }

    public int hashCode() {
        return ((((((this.f73736n ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73737t.hashCode()) * 1000003) ^ (this.nr ? 1231 : 1237);
    }

    @Override // tq6.DAz.I28.AbstractC1194I28
    public String nr() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.AbstractC1194I28
    public String rl() {
        return this.f73737t;
    }

    @Override // tq6.DAz.I28.AbstractC1194I28
    public int t() {
        return this.f73736n;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f73736n + ", version=" + this.rl + ", buildVersion=" + this.f73737t + ", jailbroken=" + this.nr + "}";
    }
}
