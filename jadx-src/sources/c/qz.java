package c;

import Rc.w6;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43441n = w6.j.n("ch", "size", "w", "style", "fFamily", "data");
    private static final w6.j rl = w6.j.n("shapes");

    static ES.Ml n(Rc.w6 w6Var, FQq.Dsr dsr) {
        ArrayList arrayList = new ArrayList();
        w6Var.Uo();
        double dM7 = 0.0d;
        String strM = null;
        String strM2 = null;
        char cCharAt = 0;
        double dM72 = 0.0d;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43441n);
            if (iMx == 0) {
                cCharAt = w6Var.M().charAt(0);
            } else if (iMx == 1) {
                dM72 = w6Var.M7();
            } else if (iMx == 2) {
                dM7 = w6Var.M7();
            } else if (iMx == 3) {
                strM = w6Var.M();
            } else if (iMx == 4) {
                strM2 = w6Var.M();
            } else if (iMx != 5) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                w6Var.Uo();
                while (w6Var.jB()) {
                    if (w6Var.Mx(rl) != 0) {
                        w6Var.fcU();
                        w6Var.n1();
                    } else {
                        w6Var.rl();
                        while (w6Var.jB()) {
                            arrayList.add((QJ.z) fuX.n(w6Var, dsr));
                        }
                        w6Var.Z();
                    }
                }
                w6Var.T();
            }
        }
        w6Var.T();
        return new ES.Ml(arrayList, cCharAt, dM72, dM7, strM, strM2);
    }
}
