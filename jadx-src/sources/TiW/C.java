package TiW;

import GJW.lej;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C extends lej {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f10541t = new C();

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        w6.f10581S.p0N(runnable, true, false);
    }

    @Override // GJW.lej
    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        w6.f10581S.p0N(runnable, true, true);
    }

    @Override // GJW.lej
    public String toString() {
        return "Dispatchers.IO";
    }

    private C() {
    }

    @Override // GJW.lej
    public lej K(int i2, String str) {
        dzu.o.n(i2);
        if (i2 >= aC.nr) {
            return dzu.o.rl(this, str);
        }
        return super.K(i2, str);
    }
}
