package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C extends DAz.I28.w6 {
    private final boolean J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f73676O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73677n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f73678t;
    private final String xMQ;

    static final class n extends DAz.I28.w6.j {
        private boolean J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f73679O;
        private int Uo;
        private byte mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f73680n;
        private long nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f73681t;
        private String xMQ;

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j J2(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j KN(long j2) {
            this.nr = j2;
            this.mUb = (byte) (this.mUb | 4);
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j O(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.KN = str;
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j Uo(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.xMQ = str;
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j mUb(int i2) {
            this.Uo = i2;
            this.mUb = (byte) (this.mUb | 32);
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6 n() {
            String str;
            String str2;
            String str3;
            if (this.mUb == 63 && (str = this.rl) != null && (str2 = this.KN) != null && (str3 = this.xMQ) != null) {
                return new C(this.f73680n, str, this.f73681t, this.nr, this.f73679O, this.J2, this.Uo, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.mUb & 1) == 0) {
                sb.append(" arch");
            }
            if (this.rl == null) {
                sb.append(" model");
            }
            if ((this.mUb & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.mUb & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.mUb & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.mUb & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.mUb & 32) == 0) {
                sb.append(" state");
            }
            if (this.KN == null) {
                sb.append(" manufacturer");
            }
            if (this.xMQ == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j nr(long j2) {
            this.f73679O = j2;
            this.mUb = (byte) (this.mUb | 8);
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j rl(int i2) {
            this.f73680n = i2;
            this.mUb = (byte) (this.mUb | 1);
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j t(int i2) {
            this.f73681t = i2;
            this.mUb = (byte) (this.mUb | 2);
            return this;
        }

        @Override // tq6.DAz.I28.w6.j
        public DAz.I28.w6.j xMQ(boolean z2) {
            this.J2 = z2;
            this.mUb = (byte) (this.mUb | 16);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.w6) {
            DAz.I28.w6 w6Var = (DAz.I28.w6) obj;
            if (this.f73677n == w6Var.rl() && this.rl.equals(w6Var.J2()) && this.f73678t == w6Var.t() && this.nr == w6Var.KN() && this.f73676O == w6Var.nr() && this.J2 == w6Var.mUb() && this.Uo == w6Var.xMQ() && this.KN.equals(w6Var.O()) && this.xMQ.equals(w6Var.Uo())) {
                return true;
            }
        }
        return false;
    }

    private C(int i2, String str, int i3, long j2, long j3, boolean z2, int i5, String str2, String str3) {
        this.f73677n = i2;
        this.rl = str;
        this.f73678t = i3;
        this.nr = j2;
        this.f73676O = j3;
        this.J2 = z2;
        this.Uo = i5;
        this.KN = str2;
        this.xMQ = str3;
    }

    @Override // tq6.DAz.I28.w6
    public String J2() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.w6
    public long KN() {
        return this.nr;
    }

    @Override // tq6.DAz.I28.w6
    public String O() {
        return this.KN;
    }

    @Override // tq6.DAz.I28.w6
    public String Uo() {
        return this.xMQ;
    }

    public int hashCode() {
        int iHashCode = (((((this.f73677n ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73678t) * 1000003;
        long j2 = this.nr;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f73676O;
        return ((((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.J2 ? 1231 : 1237)) * 1000003) ^ this.Uo) * 1000003) ^ this.KN.hashCode()) * 1000003) ^ this.xMQ.hashCode();
    }

    @Override // tq6.DAz.I28.w6
    public boolean mUb() {
        return this.J2;
    }

    @Override // tq6.DAz.I28.w6
    public long nr() {
        return this.f73676O;
    }

    @Override // tq6.DAz.I28.w6
    public int rl() {
        return this.f73677n;
    }

    @Override // tq6.DAz.I28.w6
    public int t() {
        return this.f73678t;
    }

    public String toString() {
        return "Device{arch=" + this.f73677n + ", model=" + this.rl + ", cores=" + this.f73678t + ", ram=" + this.nr + ", diskSpace=" + this.f73676O + ", simulator=" + this.J2 + ", state=" + this.Uo + ", manufacturer=" + this.KN + ", modelClass=" + this.xMQ + "}";
    }

    @Override // tq6.DAz.I28.w6
    public int xMQ() {
        return this.Uo;
    }
}
