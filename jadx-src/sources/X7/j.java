package X7;

import X7.Ml;
import X7.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class j extends Ml {
    private final long J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f11751O;
    private final long Uo;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6.j f11752t;

    static final class n extends Ml.j {
        private Long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Long f11753O;
        private String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f11754n;
        private String nr;
        private w6.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f11755t;

        n() {
        }

        @Override // X7.Ml.j
        public Ml.j J2(String str) {
            this.nr = str;
            return this;
        }

        @Override // X7.Ml.j
        public Ml.j O(String str) {
            this.Uo = str;
            return this;
        }

        @Override // X7.Ml.j
        public Ml.j Uo(w6.j jVar) {
            if (jVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.rl = jVar;
            return this;
        }

        @Override // X7.Ml.j
        public Ml n() {
            String str = "";
            if (this.rl == null) {
                str = " registrationStatus";
            }
            if (this.f11753O == null) {
                str = str + " expiresInSecs";
            }
            if (this.J2 == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new j(this.f11754n, this.rl, this.f11755t, this.nr, this.f11753O.longValue(), this.J2.longValue(), this.Uo);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X7.Ml.j
        public Ml.j nr(String str) {
            this.f11754n = str;
            return this;
        }

        @Override // X7.Ml.j
        public Ml.j rl(String str) {
            this.f11755t = str;
            return this;
        }

        private n(Ml ml) {
            this.f11754n = ml.nr();
            this.rl = ml.Uo();
            this.f11755t = ml.rl();
            this.nr = ml.J2();
            this.f11753O = Long.valueOf(ml.t());
            this.J2 = Long.valueOf(ml.KN());
            this.Uo = ml.O();
        }

        @Override // X7.Ml.j
        public Ml.j KN(long j2) {
            this.J2 = Long.valueOf(j2);
            return this;
        }

        @Override // X7.Ml.j
        public Ml.j t(long j2) {
            this.f11753O = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ml) {
            Ml ml = (Ml) obj;
            String str4 = this.rl;
            if (str4 != null ? str4.equals(ml.nr()) : ml.nr() == null) {
                if (this.f11752t.equals(ml.Uo()) && ((str = this.nr) != null ? str.equals(ml.rl()) : ml.rl() == null) && ((str2 = this.f11751O) != null ? str2.equals(ml.J2()) : ml.J2() == null) && this.J2 == ml.t() && this.Uo == ml.KN() && ((str3 = this.KN) != null ? str3.equals(ml.O()) : ml.O() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private j(String str, w6.j jVar, String str2, String str3, long j2, long j3, String str4) {
        this.rl = str;
        this.f11752t = jVar;
        this.nr = str2;
        this.f11751O = str3;
        this.J2 = j2;
        this.Uo = j3;
        this.KN = str4;
    }

    @Override // X7.Ml
    public String J2() {
        return this.f11751O;
    }

    @Override // X7.Ml
    public long KN() {
        return this.Uo;
    }

    @Override // X7.Ml
    public String O() {
        return this.KN;
    }

    @Override // X7.Ml
    public w6.j Uo() {
        return this.f11752t;
    }

    public int hashCode() {
        String str = this.rl;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11752t.hashCode()) * 1000003;
        String str2 = this.nr;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11751O;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.J2;
        int i2 = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.Uo;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.KN;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X7.Ml
    public String nr() {
        return this.rl;
    }

    @Override // X7.Ml
    public String rl() {
        return this.nr;
    }

    @Override // X7.Ml
    public long t() {
        return this.J2;
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.rl + ", registrationStatus=" + this.f11752t + ", authToken=" + this.nr + ", refreshToken=" + this.f11751O + ", expiresInSecs=" + this.J2 + ", tokenCreationEpochInSecs=" + this.Uo + ", fisError=" + this.KN + "}";
    }

    @Override // X7.Ml
    public Ml.j ty() {
        return new n(this);
    }
}
