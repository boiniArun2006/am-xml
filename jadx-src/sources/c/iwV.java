package c;

import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class iwV {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static w6.j f43431n = w6.j.n("nm", "ind", "ks", "hd");

    static QJ.QJ n(Rc.w6 w6Var, FQq.Dsr dsr) {
        String strM = null;
        int iP5 = 0;
        boolean zU = false;
        GO.fuX fuxGh = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43431n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                iP5 = w6Var.p5();
            } else if (iMx == 2) {
                fuxGh = AbstractC1669Ml.gh(w6Var, dsr);
            } else if (iMx != 3) {
                w6Var.n1();
            } else {
                zU = w6Var.U();
            }
        }
        return new QJ.QJ(strM, iP5, fuxGh, zU);
    }
}
