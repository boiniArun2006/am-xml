package wqP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static AssertionError n(String str, Object... objArr) {
        throw new AssertionError(rl(str, objArr));
    }

    public static Object nr(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw n(str, objArr);
    }

    private static String rl(String str, Object... objArr) {
        return "INTERNAL ASSERTION FAILED: " + String.format(str, objArr);
    }

    public static void t(boolean z2, String str, Object... objArr) {
        if (!z2) {
            throw n(str, objArr);
        }
    }
}
