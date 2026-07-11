package Dy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Wre f2071t = new j().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f2072n;
    private final long rl;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f2073n = 0;
        private long rl = 0;

        public Wre n() {
            return new Wre(this.f2073n, this.rl);
        }

        public j rl(long j2) {
            this.rl = j2;
            return this;
        }

        public j t(long j2) {
            this.f2073n = j2;
            return this;
        }

        j() {
        }
    }

    public static j t() {
        return new j();
    }

    public long n() {
        return this.rl;
    }

    public long rl() {
        return this.f2072n;
    }

    Wre(long j2, long j3) {
        this.f2072n = j2;
        this.rl = j3;
    }
}
