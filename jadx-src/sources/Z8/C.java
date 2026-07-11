package Z8;

import Z8.s4;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class C extends s4 {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f12287O;
    private final r Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f12288n;
    private final Integer nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Xo f12289t;

    static final class n extends s4.j {
        private List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f12290O;
        private r Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Long f12291n;
        private Integer nr;
        private Long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Xo f12292t;

        @Override // Z8.s4.j
        public s4.j J2(r rVar) {
            this.Uo = rVar;
            return this;
        }

        @Override // Z8.s4.j
        s4.j O(String str) {
            this.f12290O = str;
            return this;
        }

        @Override // Z8.s4.j
        public s4 n() {
            String str = "";
            if (this.f12291n == null) {
                str = " requestTimeMs";
            }
            if (this.rl == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C(this.f12291n.longValue(), this.rl.longValue(), this.f12292t, this.nr, this.f12290O, this.J2, this.Uo);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z8.s4.j
        s4.j nr(Integer num) {
            this.nr = num;
            return this;
        }

        @Override // Z8.s4.j
        public s4.j rl(Xo xo) {
            this.f12292t = xo;
            return this;
        }

        @Override // Z8.s4.j
        public s4.j t(List list) {
            this.J2 = list;
            return this;
        }

        n() {
        }

        @Override // Z8.s4.j
        public s4.j KN(long j2) {
            this.rl = Long.valueOf(j2);
            return this;
        }

        @Override // Z8.s4.j
        public s4.j Uo(long j2) {
            this.f12291n = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Xo xo;
        Integer num;
        String str;
        List list;
        r rVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s4) {
            s4 s4Var = (s4) obj;
            if (this.f12288n == s4Var.Uo() && this.rl == s4Var.KN() && ((xo = this.f12289t) != null ? xo.equals(s4Var.rl()) : s4Var.rl() == null) && ((num = this.nr) != null ? num.equals(s4Var.nr()) : s4Var.nr() == null) && ((str = this.f12287O) != null ? str.equals(s4Var.O()) : s4Var.O() == null) && ((list = this.J2) != null ? list.equals(s4Var.t()) : s4Var.t() == null) && ((rVar = this.Uo) != null ? rVar.equals(s4Var.J2()) : s4Var.J2() == null)) {
                return true;
            }
        }
        return false;
    }

    private C(long j2, long j3, Xo xo, Integer num, String str, List list, r rVar) {
        this.f12288n = j2;
        this.rl = j3;
        this.f12289t = xo;
        this.nr = num;
        this.f12287O = str;
        this.J2 = list;
        this.Uo = rVar;
    }

    @Override // Z8.s4
    public r J2() {
        return this.Uo;
    }

    @Override // Z8.s4
    public long KN() {
        return this.rl;
    }

    @Override // Z8.s4
    public String O() {
        return this.f12287O;
    }

    @Override // Z8.s4
    public long Uo() {
        return this.f12288n;
    }

    public int hashCode() {
        long j2 = this.f12288n;
        long j3 = this.rl;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        Xo xo = this.f12289t;
        int iHashCode = (i2 ^ (xo == null ? 0 : xo.hashCode())) * 1000003;
        Integer num = this.nr;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f12287O;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.J2;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        r rVar = this.Uo;
        return iHashCode4 ^ (rVar != null ? rVar.hashCode() : 0);
    }

    @Override // Z8.s4
    public Integer nr() {
        return this.nr;
    }

    @Override // Z8.s4
    public Xo rl() {
        return this.f12289t;
    }

    @Override // Z8.s4
    public List t() {
        return this.J2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f12288n + ", requestUptimeMs=" + this.rl + ", clientInfo=" + this.f12289t + ", logSource=" + this.nr + ", logSourceName=" + this.f12287O + ", logEvents=" + this.J2 + ", qosTier=" + this.Uo + "}";
    }
}
