package tq6;

import c8G.Fsz.qwlyMfUJj;
import tq6.DAz;

/* JADX INFO: renamed from: tq6.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class C2382z extends DAz.I28.Ml.j.n.AbstractC1202Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73858n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f73859t;

    /* JADX INFO: renamed from: tq6.z$n */
    static final class n extends DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73860n;
        private byte nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f73861t;

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j
        public DAz.I28.Ml.j.n.AbstractC1202Ml n() {
            String str;
            String str2;
            if (this.nr == 1 && (str = this.f73860n) != null && (str2 = this.rl) != null) {
                return new C2382z(str, str2, this.f73861t);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73860n == null) {
                sb.append(" name");
            }
            if (this.rl == null) {
                sb.append(" code");
            }
            if ((1 & this.nr) == 0) {
                sb.append(qwlyMfUJj.KFGGcUBPuOpXIg);
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j
        public DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j nr(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f73860n = str;
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j
        public DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j rl(long j2) {
            this.f73861t = j2;
            this.nr = (byte) (this.nr | 1);
            return this;
        }

        @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j
        public DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
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
        if (obj instanceof DAz.I28.Ml.j.n.AbstractC1202Ml) {
            DAz.I28.Ml.j.n.AbstractC1202Ml abstractC1202Ml = (DAz.I28.Ml.j.n.AbstractC1202Ml) obj;
            if (this.f73858n.equals(abstractC1202Ml.nr()) && this.rl.equals(abstractC1202Ml.t()) && this.f73859t == abstractC1202Ml.rl()) {
                return true;
            }
        }
        return false;
    }

    private C2382z(String str, String str2, long j2) {
        this.f73858n = str;
        this.rl = str2;
        this.f73859t = j2;
    }

    public int hashCode() {
        int iHashCode = (((this.f73858n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003;
        long j2 = this.f73859t;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml
    public String nr() {
        return this.f73858n;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml
    public long rl() {
        return this.f73859t;
    }

    @Override // tq6.DAz.I28.Ml.j.n.AbstractC1202Ml
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "Signal{name=" + this.f73858n + ", code=" + this.rl + ", address=" + this.f73859t + "}";
    }
}
