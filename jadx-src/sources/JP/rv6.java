package JP;

import JP.Xo;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class rv6 extends Xo.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f4564n = Logger.getLogger(rv6.class.getName());
    static final ThreadLocal rl = new ThreadLocal();

    @Override // JP.Xo.w6
    public Xo n() {
        Xo xo = (Xo) rl.get();
        return xo == null ? Xo.f4527t : xo;
    }

    rv6() {
    }

    @Override // JP.Xo.w6
    public void rl(Xo xo, Xo xo2) {
        if (n() != xo) {
            f4564n.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (xo2 != Xo.f4527t) {
            rl.set(xo2);
        } else {
            rl.set(null);
        }
    }

    @Override // JP.Xo.w6
    public Xo t(Xo xo) {
        Xo xoN = n();
        rl.set(xo);
        return xoN;
    }
}
