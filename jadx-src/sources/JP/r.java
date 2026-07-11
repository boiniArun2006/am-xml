package JP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class r {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Z f4554O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4555n;
    public final Z nr;
    public final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f4556t;

    public static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Z f4557O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f4558n;
        private Z nr;
        private n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Long f4559t;

        public r n() {
            t1.Xo.ck(this.f4558n, "description");
            t1.Xo.ck(this.rl, "severity");
            t1.Xo.ck(this.f4559t, "timestampNanos");
            t1.Xo.S(this.nr == null || this.f4557O == null, "at least one of channelRef and subchannelRef must be null");
            return new r(this.f4558n, this.rl, this.f4559t.longValue(), this.nr, this.f4557O);
        }

        public j nr(Z z2) {
            this.f4557O = z2;
            return this;
        }

        public j rl(String str) {
            this.f4558n = str;
            return this;
        }

        public j t(n nVar) {
            this.rl = nVar;
            return this;
        }

        public j O(long j2) {
            this.f4559t = Long.valueOf(j2);
            return this;
        }
    }

    public enum n {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    private r(String str, n nVar, long j2, Z z2, Z z3) {
        this.f4555n = str;
        this.rl = (n) t1.Xo.ck(nVar, "severity");
        this.f4556t = j2;
        this.nr = z2;
        this.f4554O = z3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (t1.C.n(this.f4555n, rVar.f4555n) && t1.C.n(this.rl, rVar.rl) && this.f4556t == rVar.f4556t && t1.C.n(this.nr, rVar.nr) && t1.C.n(this.f4554O, rVar.f4554O)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return t1.C.rl(this.f4555n, this.rl, Long.valueOf(this.f4556t), this.nr, this.f4554O);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("description", this.f4555n).nr("severity", this.rl).t("timestampNanos", this.f4556t).nr("channelRef", this.nr).nr("subchannelRef", this.f4554O).toString();
    }
}
