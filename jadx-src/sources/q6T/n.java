package q6T;

import q6T.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class n extends Ml {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f72119O;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f72120t;

    /* JADX INFO: renamed from: q6T.n$n, reason: collision with other inner class name */
    static final class C1108n extends Ml.j {
        private byte J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f72121O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f72122n;
        private String nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f72123t;

        @Override // q6T.Ml.j
        public Ml.j J2(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.rl = str;
            return this;
        }

        @Override // q6T.Ml.j
        public Ml.j O(long j2) {
            this.f72121O = j2;
            this.J2 = (byte) (this.J2 | 1);
            return this;
        }

        @Override // q6T.Ml.j
        public Ml n() {
            if (this.J2 == 1 && this.f72122n != null && this.rl != null && this.f72123t != null && this.nr != null) {
                return new n(this.f72122n, this.rl, this.f72123t, this.nr, this.f72121O);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f72122n == null) {
                sb.append(" rolloutId");
            }
            if (this.rl == null) {
                sb.append(" variantId");
            }
            if (this.f72123t == null) {
                sb.append(" parameterKey");
            }
            if (this.nr == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.J2) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // q6T.Ml.j
        public Ml.j nr(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f72122n = str;
            return this;
        }

        @Override // q6T.Ml.j
        public Ml.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f72123t = str;
            return this;
        }

        @Override // q6T.Ml.j
        public Ml.j t(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.nr = str;
            return this;
        }

        C1108n() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ml) {
            Ml ml = (Ml) obj;
            if (this.rl.equals(ml.nr()) && this.f72120t.equals(ml.J2()) && this.nr.equals(ml.rl()) && this.f72119O.equals(ml.t()) && this.J2 == ml.O()) {
                return true;
            }
        }
        return false;
    }

    private n(String str, String str2, String str3, String str4, long j2) {
        this.rl = str;
        this.f72120t = str2;
        this.nr = str3;
        this.f72119O = str4;
        this.J2 = j2;
    }

    @Override // q6T.Ml
    public String J2() {
        return this.f72120t;
    }

    @Override // q6T.Ml
    public long O() {
        return this.J2;
    }

    public int hashCode() {
        int iHashCode = (((((((this.rl.hashCode() ^ 1000003) * 1000003) ^ this.f72120t.hashCode()) * 1000003) ^ this.nr.hashCode()) * 1000003) ^ this.f72119O.hashCode()) * 1000003;
        long j2 = this.J2;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // q6T.Ml
    public String nr() {
        return this.rl;
    }

    @Override // q6T.Ml
    public String rl() {
        return this.nr;
    }

    @Override // q6T.Ml
    public String t() {
        return this.f72119O;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.rl + ", variantId=" + this.f72120t + ", parameterKey=" + this.nr + ", parameterValue=" + this.f72119O + ", templateVersion=" + this.J2 + "}";
    }
}
