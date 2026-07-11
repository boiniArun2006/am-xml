package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class s4 extends DAz.I28.Ml.w6 {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f73846O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Double f73847n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f73848t;

    static final class n extends DAz.I28.Ml.w6.j {
        private long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f73849O;
        private byte Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Double f73850n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f73851t;

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6.j J2(boolean z2) {
            this.f73851t = z2;
            this.Uo = (byte) (this.Uo | 2);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6.j O(int i2) {
            this.nr = i2;
            this.Uo = (byte) (this.Uo | 4);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6.j Uo(long j2) {
            this.f73849O = j2;
            this.Uo = (byte) (this.Uo | 8);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6 n() {
            if (this.Uo == 31) {
                return new s4(this.f73850n, this.rl, this.f73851t, this.nr, this.f73849O, this.J2);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.Uo & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.Uo & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.Uo & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.Uo & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.Uo & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6.j nr(long j2) {
            this.J2 = j2;
            this.Uo = (byte) (this.Uo | 16);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6.j rl(Double d2) {
            this.f73850n = d2;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.w6.j
        public DAz.I28.Ml.w6.j t(int i2) {
            this.rl = i2;
            this.Uo = (byte) (this.Uo | 1);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.w6) {
            DAz.I28.Ml.w6 w6Var = (DAz.I28.Ml.w6) obj;
            Double d2 = this.f73847n;
            if (d2 != null ? d2.equals(w6Var.rl()) : w6Var.rl() == null) {
                if (this.rl == w6Var.t() && this.f73848t == w6Var.Uo() && this.nr == w6Var.O() && this.f73846O == w6Var.J2() && this.J2 == w6Var.nr()) {
                    return true;
                }
            }
        }
        return false;
    }

    private s4(Double d2, int i2, boolean z2, int i3, long j2, long j3) {
        this.f73847n = d2;
        this.rl = i2;
        this.f73848t = z2;
        this.nr = i3;
        this.f73846O = j2;
        this.J2 = j3;
    }

    @Override // tq6.DAz.I28.Ml.w6
    public long J2() {
        return this.f73846O;
    }

    @Override // tq6.DAz.I28.Ml.w6
    public int O() {
        return this.nr;
    }

    @Override // tq6.DAz.I28.Ml.w6
    public boolean Uo() {
        return this.f73848t;
    }

    public int hashCode() {
        Double d2 = this.f73847n;
        int iHashCode = ((((((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.rl) * 1000003) ^ (this.f73848t ? 1231 : 1237)) * 1000003) ^ this.nr) * 1000003;
        long j2 = this.f73846O;
        long j3 = this.J2;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // tq6.DAz.I28.Ml.w6
    public long nr() {
        return this.J2;
    }

    @Override // tq6.DAz.I28.Ml.w6
    public Double rl() {
        return this.f73847n;
    }

    @Override // tq6.DAz.I28.Ml.w6
    public int t() {
        return this.rl;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f73847n + ", batteryVelocity=" + this.rl + ", proximityOn=" + this.f73848t + ", orientation=" + this.nr + ", ramUsed=" + this.f73846O + ", diskUsed=" + this.J2 + "}";
    }
}
