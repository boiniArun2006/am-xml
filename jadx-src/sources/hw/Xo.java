package hw;

import java.security.GeneralSecurityException;
import uBO.lej;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f68024n = new C2150C().nr();
    public static final lej nr;
    public static final lej rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final lej f68025t;

    static {
        lej lejVarXw = lej.Xw();
        rl = lejVarXw;
        f68025t = lejVarXw;
        nr = lejVarXw;
        try {
            n();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void n() {
        rl();
    }

    public static void rl() {
        QJ.J2();
        C2157fuX.nr();
        C2150C.ck(true);
        if (mi.j.n()) {
            return;
        }
        C2162w6.HI(true);
    }
}
