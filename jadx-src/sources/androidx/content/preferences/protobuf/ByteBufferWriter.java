package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class ByteBufferWriter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f37737n = new ThreadLocal();
    private static final Class rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f37738t;

    static {
        Class clsRl = rl("java.io.FileOutputStream");
        rl = clsRl;
        f37738t = n(clsRl);
    }

    private static long n(Class cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (UnsafeUtil.nHg()) {
                return UnsafeUtil.v(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static Class rl(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
