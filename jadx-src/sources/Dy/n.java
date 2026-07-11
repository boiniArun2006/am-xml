package Dy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {
    private static final n rl = new j().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f2079n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private I28 f2080n = null;

        public n n() {
            return new n(this.f2080n);
        }

        public j rl(I28 i28) {
            this.f2080n = i28;
            return this;
        }

        j() {
        }
    }

    public static j rl() {
        return new j();
    }

    public I28 n() {
        return this.f2079n;
    }

    n(I28 i28) {
        this.f2079n = i28;
    }
}
