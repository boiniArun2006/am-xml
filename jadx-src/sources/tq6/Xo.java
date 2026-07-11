package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Xo extends DAz.I28.Ml.j.n.AbstractC1204j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f73721n;
    private final String nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73722t;

    static final class n extends DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private byte f73723O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f73724n;
        private String nr;
        private long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73725t;

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j
        public DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j O(String str) {
            this.nr = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j
        public DAz.I28.Ml.j.n.AbstractC1204j n() {
            String str;
            if (this.f73723O == 3 && (str = this.f73725t) != null) {
                return new Xo(this.f73724n, this.rl, str, this.nr);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f73723O & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f73723O & 2) == 0) {
                sb.append(" size");
            }
            if (this.f73725t == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j
        public DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j nr(long j2) {
            this.rl = j2;
            this.f73723O = (byte) (this.f73723O | 2);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j
        public DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j rl(long j2) {
            this.f73724n = j2;
            this.f73723O = (byte) (this.f73723O | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j
        public DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f73725t = str;
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
        if (obj instanceof DAz.I28.Ml.j.n.AbstractC1204j) {
            DAz.I28.Ml.j.n.AbstractC1204j abstractC1204j = (DAz.I28.Ml.j.n.AbstractC1204j) obj;
            if (this.f73721n == abstractC1204j.rl() && this.rl == abstractC1204j.nr() && this.f73722t.equals(abstractC1204j.t()) && ((str = this.nr) != null ? str.equals(abstractC1204j.O()) : abstractC1204j.O() == null)) {
                return true;
            }
        }
        return false;
    }

    private Xo(long j2, long j3, String str, String str2) {
        this.f73721n = j2;
        this.rl = j3;
        this.f73722t = str;
        this.nr = str2;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j
    public String O() {
        return this.nr;
    }

    public int hashCode() {
        long j2 = this.f73721n;
        long j3 = this.rl;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f73722t.hashCode()) * 1000003;
        String str = this.nr;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j
    public long nr() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j
    public long rl() {
        return this.f73721n;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1204j
    public String t() {
        return this.f73722t;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f73721n + ", size=" + this.rl + ", name=" + this.f73722t + ", uuid=" + this.nr + "}";
    }
}
