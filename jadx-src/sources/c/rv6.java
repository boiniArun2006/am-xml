package c;

import QJ.C1428c;
import Rc.w6;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class rv6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43442n = w6.j.n(CmcdData.STREAMING_FORMAT_SS, "e", "o", "nm", "m", "hd");

    static C1428c n(Rc.w6 w6Var, FQq.Dsr dsr) {
        String strM = null;
        C1428c.j jVarRl = null;
        GO.n nVarJ2 = null;
        GO.n nVarJ22 = null;
        GO.n nVarJ23 = null;
        boolean zU = false;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43442n);
            if (iMx == 0) {
                nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr, false);
            } else if (iMx == 1) {
                nVarJ22 = AbstractC1669Ml.J2(w6Var, dsr, false);
            } else if (iMx == 2) {
                nVarJ23 = AbstractC1669Ml.J2(w6Var, dsr, false);
            } else if (iMx == 3) {
                strM = w6Var.M();
            } else if (iMx == 4) {
                jVarRl = C1428c.j.rl(w6Var.p5());
            } else if (iMx != 5) {
                w6Var.n1();
            } else {
                zU = w6Var.U();
            }
        }
        return new C1428c(strM, jVarRl, nVarJ2, nVarJ22, nVarJ23, zU);
    }
}
