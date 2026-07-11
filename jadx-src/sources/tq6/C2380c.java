package tq6;

import tq6.DAz;

/* JADX INFO: renamed from: tq6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class C2380c extends DAz.I28.Ml.j.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73731n;
    private final boolean nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f73732t;

    /* JADX INFO: renamed from: tq6.c$n */
    static final class n extends DAz.I28.Ml.j.w6.AbstractC1208j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private byte f73733O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73734n;
        private boolean nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f73735t;

        @Override // tq6.DAz.I28.Ml.j.w6.AbstractC1208j
        public DAz.I28.Ml.j.w6.AbstractC1208j O(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f73734n = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.w6.AbstractC1208j
        public DAz.I28.Ml.j.w6 n() {
            String str;
            if (this.f73733O == 7 && (str = this.f73734n) != null) {
                return new C2380c(str, this.rl, this.f73735t, this.nr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73734n == null) {
                sb.append(" processName");
            }
            if ((this.f73733O & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f73733O & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f73733O & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.w6.AbstractC1208j
        public DAz.I28.Ml.j.w6.AbstractC1208j nr(int i2) {
            this.rl = i2;
            this.f73733O = (byte) (this.f73733O | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.w6.AbstractC1208j
        public DAz.I28.Ml.j.w6.AbstractC1208j rl(boolean z2) {
            this.nr = z2;
            this.f73733O = (byte) (this.f73733O | 4);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.w6.AbstractC1208j
        public DAz.I28.Ml.j.w6.AbstractC1208j t(int i2) {
            this.f73735t = i2;
            this.f73733O = (byte) (this.f73733O | 2);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.j.w6) {
            DAz.I28.Ml.j.w6 w6Var = (DAz.I28.Ml.j.w6) obj;
            if (this.f73731n.equals(w6Var.nr()) && this.rl == w6Var.t() && this.f73732t == w6Var.rl() && this.nr == w6Var.O()) {
                return true;
            }
        }
        return false;
    }

    private C2380c(String str, int i2, int i3, boolean z2) {
        this.f73731n = str;
        this.rl = i2;
        this.f73732t = i3;
        this.nr = z2;
    }

    @Override // tq6.DAz.I28.Ml.j.w6
    public boolean O() {
        return this.nr;
    }

    public int hashCode() {
        return ((((((this.f73731n.hashCode() ^ 1000003) * 1000003) ^ this.rl) * 1000003) ^ this.f73732t) * 1000003) ^ (this.nr ? 1231 : 1237);
    }

    @Override // tq6.DAz.I28.Ml.j.w6
    public String nr() {
        return this.f73731n;
    }

    @Override // tq6.DAz.I28.Ml.j.w6
    public int rl() {
        return this.f73732t;
    }

    @Override // tq6.DAz.I28.Ml.j.w6
    public int t() {
        return this.rl;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f73731n + ", pid=" + this.rl + ", importance=" + this.f73732t + ", defaultProcess=" + this.nr + "}";
    }
}
