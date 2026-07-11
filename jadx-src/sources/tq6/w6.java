package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class w6 extends DAz.j {
    private final long J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f73852O;
    private final long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73853n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f73854t;
    private final List xMQ;

    static final class n extends DAz.j.n {
        private long J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f73855O;
        private long Uo;
        private byte mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f73856n;
        private int nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f73857t;
        private List xMQ;

        @Override // tq6.DAz.j.n
        public DAz.j.n J2(long j2) {
            this.f73855O = j2;
            this.mUb = (byte) (this.mUb | 8);
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n KN(long j2) {
            this.J2 = j2;
            this.mUb = (byte) (this.mUb | 16);
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n O(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n Uo(int i2) {
            this.f73857t = i2;
            this.mUb = (byte) (this.mUb | 2);
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n mUb(String str) {
            this.KN = str;
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j n() {
            String str;
            if (this.mUb == 63 && (str = this.rl) != null) {
                return new w6(this.f73856n, str, this.f73857t, this.nr, this.f73855O, this.J2, this.Uo, this.KN, this.xMQ);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.mUb & 1) == 0) {
                sb.append(" pid");
            }
            if (this.rl == null) {
                sb.append(" processName");
            }
            if ((this.mUb & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.mUb & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.mUb & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.mUb & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.mUb & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n nr(int i2) {
            this.f73856n = i2;
            this.mUb = (byte) (this.mUb | 1);
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n rl(List list) {
            this.xMQ = list;
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n t(int i2) {
            this.nr = i2;
            this.mUb = (byte) (this.mUb | 4);
            return this;
        }

        @Override // tq6.DAz.j.n
        public DAz.j.n xMQ(long j2) {
            this.Uo = j2;
            this.mUb = (byte) (this.mUb | 32);
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.j) {
            DAz.j jVar = (DAz.j) obj;
            if (this.f73853n == jVar.nr() && this.rl.equals(jVar.O()) && this.f73854t == jVar.Uo() && this.nr == jVar.t() && this.f73852O == jVar.J2() && this.J2 == jVar.KN() && this.Uo == jVar.xMQ() && ((str = this.KN) != null ? str.equals(jVar.mUb()) : jVar.mUb() == null) && ((list = this.xMQ) != null ? list.equals(jVar.rl()) : jVar.rl() == null)) {
                return true;
            }
        }
        return false;
    }

    private w6(int i2, String str, int i3, int i5, long j2, long j3, long j4, String str2, List list) {
        this.f73853n = i2;
        this.rl = str;
        this.f73854t = i3;
        this.nr = i5;
        this.f73852O = j2;
        this.J2 = j3;
        this.Uo = j4;
        this.KN = str2;
        this.xMQ = list;
    }

    @Override // tq6.DAz.j
    public long J2() {
        return this.f73852O;
    }

    @Override // tq6.DAz.j
    public long KN() {
        return this.J2;
    }

    @Override // tq6.DAz.j
    public String O() {
        return this.rl;
    }

    @Override // tq6.DAz.j
    public int Uo() {
        return this.f73854t;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f73853n ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73854t) * 1000003) ^ this.nr) * 1000003;
        long j2 = this.f73852O;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.J2;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.Uo;
        int i5 = (i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str = this.KN;
        int iHashCode2 = (i5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.xMQ;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // tq6.DAz.j
    public String mUb() {
        return this.KN;
    }

    @Override // tq6.DAz.j
    public int nr() {
        return this.f73853n;
    }

    @Override // tq6.DAz.j
    public List rl() {
        return this.xMQ;
    }

    @Override // tq6.DAz.j
    public int t() {
        return this.nr;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f73853n + ", processName=" + this.rl + ", reasonCode=" + this.f73854t + ", importance=" + this.nr + ", pss=" + this.f73852O + ", rss=" + this.J2 + ", timestamp=" + this.Uo + ", traceFile=" + this.KN + ", buildIdMappingForArch=" + this.xMQ + "}";
    }

    @Override // tq6.DAz.j
    public long xMQ() {
        return this.Uo;
    }
}
