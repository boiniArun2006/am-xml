package N67;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f6957n;
    private final long rl;

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f6958n = 60;
        private long rl = com.google.firebase.remoteconfig.internal.qz.mUb;

        public n O(long j2) {
            if (j2 >= 0) {
                this.rl = j2;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
        }

        public n nr(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
            }
            this.f6958n = j2;
            return this;
        }

        public C t() {
            return new C(this);
        }
    }

    private C(n nVar) {
        this.f6957n = nVar.f6958n;
        this.rl = nVar.rl;
    }
}
