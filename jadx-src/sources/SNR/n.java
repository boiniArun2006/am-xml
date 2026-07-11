package SNR;

import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Thread f9734n;

    public static boolean rl() {
        if (f9734n == null) {
            f9734n = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f9734n;
    }

    public static void n() {
        if (rl()) {
        } else {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
