package dzu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f63580n = Runtime.getRuntime().availableProcessors();

    public static final int n() {
        return f63580n;
    }

    public static final String rl(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
