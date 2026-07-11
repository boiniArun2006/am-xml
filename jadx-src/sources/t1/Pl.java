package t1;

import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final qz f73402n = t();

    private static final class n implements qz {
        private n() {
        }
    }

    static boolean O(String str) {
        return str == null || str.isEmpty();
    }

    static String nr(String str) {
        return str == null ? "" : str;
    }

    static String rl(double d2) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d2));
    }

    private static qz t() {
        return new n();
    }

    static String n(String str) {
        if (O(str)) {
            return null;
        }
        return str;
    }
}
