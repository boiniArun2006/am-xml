package Dy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6 f2081t = new j().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f2082n;
    private final n rl;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f2083n = 0;
        private n rl = n.REASON_UNKNOWN;

        public w6 n() {
            return new w6(this.f2083n, this.rl);
        }

        public j rl(long j2) {
            this.f2083n = j2;
            return this;
        }

        public j t(n nVar) {
            this.rl = nVar;
            return this;
        }

        j() {
        }
    }

    public enum n implements OGa.w6 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f2091n;

        @Override // OGa.w6
        public int getNumber() {
            return this.f2091n;
        }

        n(int i2) {
            this.f2091n = i2;
        }
    }

    public static j t() {
        return new j();
    }

    public long n() {
        return this.f2082n;
    }

    public n rl() {
        return this.rl;
    }

    w6(long j2, n nVar) {
        this.f2082n = j2;
        this.rl = nVar;
    }
}
