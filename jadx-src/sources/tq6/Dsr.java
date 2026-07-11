package tq6;

import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Dsr extends DAz.I28.j {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f73685O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73686n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73687t;

    static final class n extends DAz.I28.j.AbstractC1209j {
        private String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f73688O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f73689n;
        private String nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f73690t;

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j.AbstractC1209j J2(String str) {
            this.nr = str;
            return this;
        }

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j.AbstractC1209j O(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f73689n = str;
            return this;
        }

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j.AbstractC1209j Uo(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.rl = str;
            return this;
        }

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j n() {
            String str;
            String str2 = this.f73689n;
            if (str2 != null && (str = this.rl) != null) {
                return new Dsr(str2, str, this.f73690t, null, this.nr, this.f73688O, this.J2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f73689n == null) {
                sb.append(" identifier");
            }
            if (this.rl == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j.AbstractC1209j nr(String str) {
            this.f73690t = str;
            return this;
        }

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j.AbstractC1209j rl(String str) {
            this.f73688O = str;
            return this;
        }

        @Override // tq6.DAz.I28.j.AbstractC1209j
        public DAz.I28.j.AbstractC1209j t(String str) {
            this.J2 = str;
            return this;
        }

        n() {
        }
    }

    @Override // tq6.DAz.I28.j
    public DAz.I28.j.n Uo() {
        return null;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.j) {
            DAz.I28.j jVar = (DAz.I28.j) obj;
            if (this.f73686n.equals(jVar.O()) && this.rl.equals(jVar.KN()) && ((str = this.f73687t) != null ? str.equals(jVar.nr()) : jVar.nr() == null)) {
                jVar.Uo();
                String str2 = this.nr;
                if (str2 != null ? str2.equals(jVar.J2()) : jVar.J2() == null) {
                    String str3 = this.f73685O;
                    if (str3 != null ? str3.equals(jVar.rl()) : jVar.rl() == null) {
                        String str4 = this.J2;
                        if (str4 != null ? str4.equals(jVar.t()) : jVar.t() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private Dsr(String str, String str2, String str3, DAz.I28.j.n nVar, String str4, String str5, String str6) {
        this.f73686n = str;
        this.rl = str2;
        this.f73687t = str3;
        this.nr = str4;
        this.f73685O = str5;
        this.J2 = str6;
    }

    @Override // tq6.DAz.I28.j
    public String J2() {
        return this.nr;
    }

    @Override // tq6.DAz.I28.j
    public String KN() {
        return this.rl;
    }

    @Override // tq6.DAz.I28.j
    public String O() {
        return this.f73686n;
    }

    public int hashCode() {
        int iHashCode = (((this.f73686n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003;
        String str = this.f73687t;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.nr;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f73685O;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.J2;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // tq6.DAz.I28.j
    public String nr() {
        return this.f73687t;
    }

    @Override // tq6.DAz.I28.j
    public String rl() {
        return this.f73685O;
    }

    @Override // tq6.DAz.I28.j
    public String t() {
        return this.J2;
    }

    public String toString() {
        return "Application{identifier=" + this.f73686n + ", version=" + this.rl + ", displayVersion=" + this.f73687t + ", organization=" + ((Object) null) + ", installationUuid=" + this.nr + ", developmentPlatform=" + this.f73685O + ", developmentPlatformVersion=" + this.J2 + "}";
    }
}
