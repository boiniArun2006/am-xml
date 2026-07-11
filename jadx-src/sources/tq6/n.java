package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n extends DAz {
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f73825O;
    private final String Uo;
    private final DAz.j az;
    private final DAz.I28 gh;
    private final String mUb;
    private final int nr;
    private final DAz.Ml qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73826t;
    private final String xMQ;

    /* JADX INFO: renamed from: tq6.n$n, reason: collision with other inner class name */
    static final class C1213n extends DAz.n {
        private String J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f73827O;
        private String Uo;
        private byte az;
        private DAz.Ml gh;
        private DAz.I28 mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73828n;
        private String nr;
        private DAz.j qie;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f73829t;
        private String xMQ;

        C1213n() {
        }

        @Override // tq6.DAz.n
        public DAz.n J2(String str) {
            this.J2 = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n KN(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n O(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.xMQ = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n Uo(String str) {
            this.f73827O = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n az(DAz.I28 i28) {
            this.mUb = i28;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n gh(int i2) {
            this.f73829t = i2;
            this.az = (byte) (this.az | 1);
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n mUb(DAz.Ml ml) {
            this.gh = ml;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz n() {
            if (this.az == 1 && this.f73828n != null && this.rl != null && this.nr != null && this.KN != null && this.xMQ != null) {
                return new n(this.f73828n, this.rl, this.f73829t, this.nr, this.f73827O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73828n == null) {
                sb.append(" sdkVersion");
            }
            if (this.rl == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.az) == 0) {
                sb.append(" platform");
            }
            if (this.nr == null) {
                sb.append(" installationUuid");
            }
            if (this.KN == null) {
                sb.append(" buildVersion");
            }
            if (this.xMQ == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.n
        public DAz.n nr(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.KN = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n qie(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f73828n = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n rl(DAz.j jVar) {
            this.qie = jVar;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n t(String str) {
            this.Uo = str;
            return this;
        }

        @Override // tq6.DAz.n
        public DAz.n xMQ(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.nr = str;
            return this;
        }

        private C1213n(DAz dAz) {
            this.f73828n = dAz.az();
            this.rl = dAz.xMQ();
            this.f73829t = dAz.qie();
            this.nr = dAz.mUb();
            this.f73827O = dAz.KN();
            this.J2 = dAz.Uo();
            this.Uo = dAz.nr();
            this.KN = dAz.O();
            this.xMQ = dAz.J2();
            this.mUb = dAz.ty();
            this.gh = dAz.gh();
            this.qie = dAz.t();
            this.az = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        DAz.I28 i28;
        DAz.Ml ml;
        DAz.j jVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz) {
            DAz dAz = (DAz) obj;
            if (this.rl.equals(dAz.az()) && this.f73826t.equals(dAz.xMQ()) && this.nr == dAz.qie() && this.f73825O.equals(dAz.mUb()) && ((str = this.J2) != null ? str.equals(dAz.KN()) : dAz.KN() == null) && ((str2 = this.Uo) != null ? str2.equals(dAz.Uo()) : dAz.Uo() == null) && ((str3 = this.KN) != null ? str3.equals(dAz.nr()) : dAz.nr() == null) && this.xMQ.equals(dAz.O()) && this.mUb.equals(dAz.J2()) && ((i28 = this.gh) != null ? i28.equals(dAz.ty()) : dAz.ty() == null) && ((ml = this.qie) != null ? ml.equals(dAz.gh()) : dAz.gh() == null) && ((jVar = this.az) != null ? jVar.equals(dAz.t()) : dAz.t() == null)) {
                return true;
            }
        }
        return false;
    }

    private n(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, DAz.I28 i28, DAz.Ml ml, DAz.j jVar) {
        this.rl = str;
        this.f73826t = str2;
        this.nr = i2;
        this.f73825O = str3;
        this.J2 = str4;
        this.Uo = str5;
        this.KN = str6;
        this.xMQ = str7;
        this.mUb = str8;
        this.gh = i28;
        this.qie = ml;
        this.az = jVar;
    }

    @Override // tq6.DAz
    protected DAz.n HI() {
        return new C1213n(this);
    }

    @Override // tq6.DAz
    public String J2() {
        return this.mUb;
    }

    @Override // tq6.DAz
    public String KN() {
        return this.J2;
    }

    @Override // tq6.DAz
    public String O() {
        return this.xMQ;
    }

    @Override // tq6.DAz
    public String Uo() {
        return this.Uo;
    }

    @Override // tq6.DAz
    public String az() {
        return this.rl;
    }

    @Override // tq6.DAz
    public DAz.Ml gh() {
        return this.qie;
    }

    public int hashCode() {
        int iHashCode = (((((((this.rl.hashCode() ^ 1000003) * 1000003) ^ this.f73826t.hashCode()) * 1000003) ^ this.nr) * 1000003) ^ this.f73825O.hashCode()) * 1000003;
        String str = this.J2;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.Uo;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.KN;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.xMQ.hashCode()) * 1000003) ^ this.mUb.hashCode()) * 1000003;
        DAz.I28 i28 = this.gh;
        int iHashCode5 = (iHashCode4 ^ (i28 == null ? 0 : i28.hashCode())) * 1000003;
        DAz.Ml ml = this.qie;
        int iHashCode6 = (iHashCode5 ^ (ml == null ? 0 : ml.hashCode())) * 1000003;
        DAz.j jVar = this.az;
        return iHashCode6 ^ (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // tq6.DAz
    public String mUb() {
        return this.f73825O;
    }

    @Override // tq6.DAz
    public String nr() {
        return this.KN;
    }

    @Override // tq6.DAz
    public int qie() {
        return this.nr;
    }

    @Override // tq6.DAz
    public DAz.j t() {
        return this.az;
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.rl + ", gmpAppId=" + this.f73826t + ", platform=" + this.nr + ", installationUuid=" + this.f73825O + ", firebaseInstallationId=" + this.J2 + ", firebaseAuthenticationToken=" + this.Uo + ", appQualitySessionId=" + this.KN + ", buildVersion=" + this.xMQ + ", displayVersion=" + this.mUb + ", session=" + this.gh + ", ndkPayload=" + this.qie + ", appExitInfo=" + this.az + "}";
    }

    @Override // tq6.DAz
    public DAz.I28 ty() {
        return this.gh;
    }

    @Override // tq6.DAz
    public String xMQ() {
        return this.f73826t;
    }
}
