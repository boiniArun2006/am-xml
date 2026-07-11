package nCS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71005n = new j();
    public static final int nr = 8;
    private static int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static long f71006t;

    public final long n() {
        long j2;
        synchronized (this) {
            try {
                long j3 = f71006t;
                long j4 = 1 + j3;
                f71006t = j4;
                if (j4 == 640982598) {
                    f71006t = j3 + 2;
                }
                j2 = f71006t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public final int rl() {
        return rl;
    }

    public final void t(int i2) {
        rl = i2;
    }

    private j() {
    }
}
