package y5Y;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static n f75548n;

    public static boolean nr(String str) {
        return O(str, 0);
    }

    public static boolean O(String str, int i2) {
        n nVar;
        synchronized (j.class) {
            nVar = f75548n;
            if (nVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nVar.n(str, i2);
    }

    public static void n(n nVar) {
        synchronized (j.class) {
            try {
                if (f75548n != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f75548n = nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean t() {
        boolean z2;
        synchronized (j.class) {
            z2 = f75548n != null;
        }
        return z2;
    }

    public static void rl(n nVar) {
        if (!t()) {
            n(nVar);
        }
    }
}
