package Z8;

import Z8.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class w6 extends Z8.j {
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f12379O;
    private final String Uo;
    private final String gh;
    private final String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f12380n;
    private final String nr;
    private final String qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f12381t;
    private final String xMQ;

    static final class n extends j.AbstractC0445j {
        private String J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f12382O;
        private String Uo;
        private String gh;
        private String mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f12383n;
        private String nr;
        private String qie;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f12384t;
        private String xMQ;

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j J2(String str) {
            this.f12384t = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j KN(String str) {
            this.Uo = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j O(String str) {
            this.KN = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j Uo(String str) {
            this.xMQ = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j az(Integer num) {
            this.f12383n = num;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j gh(String str) {
            this.J2 = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j mUb(String str) {
            this.rl = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public Z8.j n() {
            return new w6(this.f12383n, this.rl, this.f12384t, this.nr, this.f12382O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie);
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j nr(String str) {
            this.nr = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j qie(String str) {
            this.f12382O = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j rl(String str) {
            this.qie = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j t(String str) {
            this.mUb = str;
            return this;
        }

        @Override // Z8.j.AbstractC0445j
        public j.AbstractC0445j xMQ(String str) {
            this.gh = str;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z8.j) {
            Z8.j jVar = (Z8.j) obj;
            Integer num = this.f12380n;
            if (num != null ? num.equals(jVar.az()) : jVar.az() == null) {
                String str = this.rl;
                if (str != null ? str.equals(jVar.mUb()) : jVar.mUb() == null) {
                    String str2 = this.f12381t;
                    if (str2 != null ? str2.equals(jVar.J2()) : jVar.J2() == null) {
                        String str3 = this.nr;
                        if (str3 != null ? str3.equals(jVar.nr()) : jVar.nr() == null) {
                            String str4 = this.f12379O;
                            if (str4 != null ? str4.equals(jVar.qie()) : jVar.qie() == null) {
                                String str5 = this.J2;
                                if (str5 != null ? str5.equals(jVar.gh()) : jVar.gh() == null) {
                                    String str6 = this.Uo;
                                    if (str6 != null ? str6.equals(jVar.KN()) : jVar.KN() == null) {
                                        String str7 = this.KN;
                                        if (str7 != null ? str7.equals(jVar.O()) : jVar.O() == null) {
                                            String str8 = this.xMQ;
                                            if (str8 != null ? str8.equals(jVar.Uo()) : jVar.Uo() == null) {
                                                String str9 = this.mUb;
                                                if (str9 != null ? str9.equals(jVar.t()) : jVar.t() == null) {
                                                    String str10 = this.gh;
                                                    if (str10 != null ? str10.equals(jVar.xMQ()) : jVar.xMQ() == null) {
                                                        String str11 = this.qie;
                                                        if (str11 != null ? str11.equals(jVar.rl()) : jVar.rl() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private w6(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f12380n = num;
        this.rl = str;
        this.f12381t = str2;
        this.nr = str3;
        this.f12379O = str4;
        this.J2 = str5;
        this.Uo = str6;
        this.KN = str7;
        this.xMQ = str8;
        this.mUb = str9;
        this.gh = str10;
        this.qie = str11;
    }

    @Override // Z8.j
    public String J2() {
        return this.f12381t;
    }

    @Override // Z8.j
    public String KN() {
        return this.Uo;
    }

    @Override // Z8.j
    public String O() {
        return this.KN;
    }

    @Override // Z8.j
    public String Uo() {
        return this.xMQ;
    }

    @Override // Z8.j
    public Integer az() {
        return this.f12380n;
    }

    @Override // Z8.j
    public String gh() {
        return this.J2;
    }

    public int hashCode() {
        Integer num = this.f12380n;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.rl;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12381t;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.nr;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12379O;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.J2;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.Uo;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.KN;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.xMQ;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.mUb;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.gh;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.qie;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // Z8.j
    public String mUb() {
        return this.rl;
    }

    @Override // Z8.j
    public String nr() {
        return this.nr;
    }

    @Override // Z8.j
    public String qie() {
        return this.f12379O;
    }

    @Override // Z8.j
    public String rl() {
        return this.qie;
    }

    @Override // Z8.j
    public String t() {
        return this.mUb;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f12380n + ", model=" + this.rl + ", hardware=" + this.f12381t + ", device=" + this.nr + ", product=" + this.f12379O + ", osBuild=" + this.J2 + ", manufacturer=" + this.Uo + ", fingerprint=" + this.KN + ", locale=" + this.xMQ + ", country=" + this.mUb + ", mccMnc=" + this.gh + ", applicationBuild=" + this.qie + "}";
    }

    @Override // Z8.j
    public String xMQ() {
        return this.gh;
    }
}
