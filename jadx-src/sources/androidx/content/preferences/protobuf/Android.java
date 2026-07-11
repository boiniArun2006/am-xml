package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Android {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f37713n;
    private static final Class rl = n("libcore.io.Memory");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f37714t;

    static {
        f37714t = (f37713n || n("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class rl() {
        return rl;
    }

    static boolean t() {
        if (f37713n) {
            return true;
        }
        return (rl == null || f37714t) ? false : true;
    }

    private static Class n(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
