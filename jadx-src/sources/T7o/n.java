package T7o;

import T7o.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class n extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10212n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Wre.n f10213t;

    /* JADX INFO: renamed from: T7o.n$n, reason: collision with other inner class name */
    static final class C0358n extends Wre.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f10214n;
        private Long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Wre.n f10215t;

        @Override // T7o.Wre.j
        public Wre n() {
            String str = "";
            if (this.rl == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new n(this.f10214n, this.rl.longValue(), this.f10215t);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // T7o.Wre.j
        public Wre.j rl(Wre.n nVar) {
            this.f10215t = nVar;
            return this;
        }

        @Override // T7o.Wre.j
        public Wre.j t(String str) {
            this.f10214n = str;
            return this;
        }

        C0358n() {
        }

        @Override // T7o.Wre.j
        public Wre.j nr(long j2) {
            this.rl = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Wre.n nVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre) {
            Wre wre = (Wre) obj;
            String str = this.f10212n;
            if (str != null ? str.equals(wre.t()) : wre.t() == null) {
                if (this.rl == wre.nr() && ((nVar = this.f10213t) != null ? nVar.equals(wre.rl()) : wre.rl() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private n(String str, long j2, Wre.n nVar) {
        this.f10212n = str;
        this.rl = j2;
        this.f10213t = nVar;
    }

    public int hashCode() {
        String str = this.f10212n;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.rl;
        int i2 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Wre.n nVar = this.f10213t;
        return i2 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // T7o.Wre
    public long nr() {
        return this.rl;
    }

    @Override // T7o.Wre
    public Wre.n rl() {
        return this.f10213t;
    }

    @Override // T7o.Wre
    public String t() {
        return this.f10212n;
    }

    public String toString() {
        return "TokenResult{token=" + this.f10212n + ", tokenExpirationTimestamp=" + this.rl + ", responseCode=" + this.f10213t + "}";
    }
}
