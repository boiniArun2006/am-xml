package GJW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Y5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Y5 f3467n = new Y5();
    private static final ThreadLocal rl = dzu.Lu.n(new dzu.nKK("ThreadLocalEventLoop"));

    public final KH n() {
        return (KH) rl.get();
    }

    public final void nr(KH kh) {
        rl.set(kh);
    }

    public final KH rl() {
        ThreadLocal threadLocal = rl;
        KH kh = (KH) threadLocal.get();
        if (kh != null) {
            return kh;
        }
        KH khN = xZD.n();
        threadLocal.set(khN);
        return khN;
    }

    public final void t() {
        rl.set(null);
    }

    private Y5() {
    }
}
