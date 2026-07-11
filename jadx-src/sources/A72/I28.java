package A72;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static I28 f15n;

    @Override // A72.Ml
    public void n(w6 w6Var) {
    }

    public static synchronized I28 rl() {
        try {
            if (f15n == null) {
                f15n = new I28();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15n;
    }
}
