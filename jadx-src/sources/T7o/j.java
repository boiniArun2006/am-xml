package T7o;

import T7o.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class j extends Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml.n f10206O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10207n;
    private final Wre nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f10208t;

    static final class n extends Ml.j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Ml.n f10209O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f10210n;
        private Wre nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f10211t;

        @Override // T7o.Ml.j
        public Ml.j J2(String str) {
            this.f10210n = str;
            return this;
        }

        @Override // T7o.Ml.j
        public Ml.j O(Ml.n nVar) {
            this.f10209O = nVar;
            return this;
        }

        @Override // T7o.Ml.j
        public Ml n() {
            return new j(this.f10210n, this.rl, this.f10211t, this.nr, this.f10209O);
        }

        @Override // T7o.Ml.j
        public Ml.j nr(String str) {
            this.f10211t = str;
            return this;
        }

        @Override // T7o.Ml.j
        public Ml.j rl(Wre wre) {
            this.nr = wre;
            return this;
        }

        @Override // T7o.Ml.j
        public Ml.j t(String str) {
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
        if (obj instanceof Ml) {
            Ml ml = (Ml) obj;
            String str = this.f10207n;
            if (str != null ? str.equals(ml.J2()) : ml.J2() == null) {
                String str2 = this.rl;
                if (str2 != null ? str2.equals(ml.t()) : ml.t() == null) {
                    String str3 = this.f10208t;
                    if (str3 != null ? str3.equals(ml.nr()) : ml.nr() == null) {
                        Wre wre = this.nr;
                        if (wre != null ? wre.equals(ml.rl()) : ml.rl() == null) {
                            Ml.n nVar = this.f10206O;
                            if (nVar != null ? nVar.equals(ml.O()) : ml.O() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private j(String str, String str2, String str3, Wre wre, Ml.n nVar) {
        this.f10207n = str;
        this.rl = str2;
        this.f10208t = str3;
        this.nr = wre;
        this.f10206O = nVar;
    }

    @Override // T7o.Ml
    public String J2() {
        return this.f10207n;
    }

    @Override // T7o.Ml
    public Ml.n O() {
        return this.f10206O;
    }

    public int hashCode() {
        String str = this.f10207n;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.rl;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10208t;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Wre wre = this.nr;
        int iHashCode4 = (iHashCode3 ^ (wre == null ? 0 : wre.hashCode())) * 1000003;
        Ml.n nVar = this.f10206O;
        return iHashCode4 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // T7o.Ml
    public String nr() {
        return this.f10208t;
    }

    @Override // T7o.Ml
    public Wre rl() {
        return this.nr;
    }

    @Override // T7o.Ml
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f10207n + ", fid=" + this.rl + ", refreshToken=" + this.f10208t + ", authToken=" + this.nr + ", responseCode=" + this.f10206O + "}";
    }
}
