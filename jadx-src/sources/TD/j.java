package TD;

import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static j f10226n;

    /* JADX INFO: renamed from: TD.j$j, reason: collision with other inner class name */
    public interface InterfaceC0359j {
        void release();
    }

    public abstract void n(InterfaceC0359j interfaceC0359j);

    public abstract void nr(InterfaceC0359j interfaceC0359j);

    public static synchronized j rl() {
        try {
            if (f10226n == null) {
                f10226n = new n();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10226n;
    }

    static boolean t() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
