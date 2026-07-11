package c;

import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43438n = w6.j.n("nm", "c", "o", "tr", "hd");

    static QJ.qz n(Rc.w6 w6Var, FQq.Dsr dsr) {
        String strM = null;
        GO.n nVarJ2 = null;
        GO.n nVarJ22 = null;
        GO.Pl plUo = null;
        boolean zU = false;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43438n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr, false);
            } else if (iMx == 2) {
                nVarJ22 = AbstractC1669Ml.J2(w6Var, dsr, false);
            } else if (iMx == 3) {
                plUo = AbstractC1674w6.Uo(w6Var, dsr);
            } else if (iMx != 4) {
                w6Var.n1();
            } else {
                zU = w6Var.U();
            }
        }
        return new QJ.qz(strM, nVarJ2, nVarJ22, plUo, zU);
    }
}
