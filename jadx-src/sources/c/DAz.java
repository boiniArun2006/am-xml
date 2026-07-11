package c;

import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43405n = w6.j.n("nm", "r", "hd");

    static QJ.Pl n(Rc.w6 w6Var, FQq.Dsr dsr) {
        boolean zU = false;
        String strM = null;
        GO.n nVarJ2 = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43405n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr, true);
            } else if (iMx != 2) {
                w6Var.n1();
            } else {
                zU = w6Var.U();
            }
        }
        if (zU) {
            return null;
        }
        return new QJ.Pl(strM, nVarJ2);
    }
}
