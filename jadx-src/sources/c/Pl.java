package c;

import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43411n = w6.j.n("fFamily", "fName", "fStyle", "ascent");

    static ES.w6 n(Rc.w6 w6Var) {
        w6Var.Uo();
        String strM = null;
        String strM2 = null;
        float fM7 = 0.0f;
        String strM3 = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43411n);
            if (iMx != 0) {
                if (iMx != 1) {
                    if (iMx != 2) {
                        if (iMx != 3) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            fM7 = (float) w6Var.M7();
                        }
                    } else {
                        strM2 = w6Var.M();
                    }
                } else {
                    strM3 = w6Var.M();
                }
            } else {
                strM = w6Var.M();
            }
        }
        w6Var.T();
        return new ES.w6(strM, strM3, strM2, fM7);
    }
}
