package c;

import Rc.w6;
import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Ln {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43409n = w6.j.n("nm", "c", "o", "fillEnabled", "r", "hd");

    static QJ.eO n(Rc.w6 w6Var, FQq.Dsr dsr) {
        GO.Ml ml = null;
        String strM = null;
        GO.j jVarT = null;
        boolean zU = false;
        boolean zU2 = false;
        int iP5 = 1;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43409n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                jVarT = AbstractC1669Ml.t(w6Var, dsr);
            } else if (iMx == 2) {
                ml = AbstractC1669Ml.KN(w6Var, dsr);
            } else if (iMx == 3) {
                zU = w6Var.U();
            } else if (iMx == 4) {
                iP5 = w6Var.p5();
            } else if (iMx != 5) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                zU2 = w6Var.U();
            }
        }
        if (ml == null) {
            ml = new GO.Ml(Collections.singletonList(new Ect.j(100)));
        }
        return new QJ.eO(strM, zU, iP5 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, jVarT, ml, zU2);
    }
}
