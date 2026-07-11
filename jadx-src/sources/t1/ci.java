package t1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ci f73416n = new j();

    public abstract long n();

    class j extends ci {
        j() {
        }

        @Override // t1.ci
        public long n() {
            return System.nanoTime();
        }
    }

    public static ci rl() {
        return f73416n;
    }

    protected ci() {
    }
}
