package Dy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final I28 f2065t = new j().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f2066n;
    private final long rl;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f2067n = 0;
        private long rl = 0;

        public I28 n() {
            return new I28(this.f2067n, this.rl);
        }

        public j rl(long j2) {
            this.f2067n = j2;
            return this;
        }

        public j t(long j2) {
            this.rl = j2;
            return this;
        }

        j() {
        }
    }

    public static j t() {
        return new j();
    }

    public long n() {
        return this.f2066n;
    }

    public long rl() {
        return this.rl;
    }

    I28(long j2, long j3) {
        this.f2066n = j2;
        this.rl = j3;
    }
}
