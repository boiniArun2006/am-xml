package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class l3D extends DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f73819O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f73820n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73821t;

    static final class n extends DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j {
        private byte J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f73822O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f73823n;
        private long nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73824t;

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j J2(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j O(long j2) {
            this.f73823n = j2;
            this.J2 = (byte) (this.J2 | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n n() {
            String str;
            if (this.J2 == 7 && (str = this.rl) != null) {
                return new l3D(this.f73823n, str, this.f73824t, this.nr, this.f73822O);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.J2 & 1) == 0) {
                sb.append(" pc");
            }
            if (this.rl == null) {
                sb.append(" symbol");
            }
            if ((this.J2 & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.J2 & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j nr(long j2) {
            this.nr = j2;
            this.J2 = (byte) (this.J2 | 2);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j rl(String str) {
            this.f73824t = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j
        public DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j t(int i2) {
            this.f73822O = i2;
            this.J2 = (byte) (this.J2 | 4);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n) {
            DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n abstractC1200n = (DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n) obj;
            if (this.f73820n == abstractC1200n.O() && this.rl.equals(abstractC1200n.J2()) && ((str = this.f73821t) != null ? str.equals(abstractC1200n.rl()) : abstractC1200n.rl() == null) && this.nr == abstractC1200n.nr() && this.f73819O == abstractC1200n.t()) {
                return true;
            }
        }
        return false;
    }

    private l3D(long j2, String str, String str2, long j3, int i2) {
        this.f73820n = j2;
        this.rl = str;
        this.f73821t = str2;
        this.nr = j3;
        this.f73819O = i2;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n
    public String J2() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n
    public long O() {
        return this.f73820n;
    }

    public int hashCode() {
        long j2 = this.f73820n;
        int iHashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003;
        String str = this.f73821t;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.nr;
        return ((iHashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f73819O;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n
    public long nr() {
        return this.nr;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n
    public String rl() {
        return this.f73821t;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n
    public int t() {
        return this.f73819O;
    }

    public String toString() {
        return "Frame{pc=" + this.f73820n + ", symbol=" + this.rl + ", file=" + this.f73821t + ", offset=" + this.nr + ", importance=" + this.f73819O + "}";
    }
}
