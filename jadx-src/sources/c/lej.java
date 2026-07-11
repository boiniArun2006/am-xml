package c;

import Rc.w6;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43435n = w6.j.n("nm", "hd", "it");

    static QJ.z n(Rc.w6 w6Var, FQq.Dsr dsr) {
        ArrayList arrayList = new ArrayList();
        String strM = null;
        boolean zU = false;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43435n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                zU = w6Var.U();
            } else if (iMx != 2) {
                w6Var.n1();
            } else {
                w6Var.rl();
                while (w6Var.jB()) {
                    QJ.w6 w6VarN = fuX.n(w6Var, dsr);
                    if (w6VarN != null) {
                        arrayList.add(w6VarN);
                    }
                }
                w6Var.Z();
            }
        }
        return new QJ.z(strM, arrayList, zU);
    }
}
