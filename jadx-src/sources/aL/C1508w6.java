package aL;

/* JADX INFO: renamed from: aL.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C1508w6 implements InterfaceC1507n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C1508w6 f12835n;

    @Override // aL.InterfaceC1507n
    public void n(InterfaceC1506j interfaceC1506j) {
    }

    public static synchronized C1508w6 rl() {
        try {
            if (f12835n == null) {
                f12835n = new C1508w6();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12835n;
    }

    private C1508w6() {
    }
}
