package c;

import QJ.aC;
import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43415n = w6.j.n("nm", "mm", "hd");

    static QJ.aC n(Rc.w6 w6Var) {
        String strM = null;
        boolean zU = false;
        aC.j jVarRl = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43415n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                jVarRl = aC.j.rl(w6Var.p5());
            } else if (iMx != 2) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                zU = w6Var.U();
            }
        }
        return new QJ.aC(strM, jVarRl, zU);
    }
}
