package c;

import Rc.w6;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cS.Zv.SzFNXybiSxdx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class Ew {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43407n = w6.j.n("nm", TtmlNode.TAG_P, SzFNXybiSxdx.bwliGAyf, "r", "hd");

    static QJ.o n(Rc.w6 w6Var, FQq.Dsr dsr) {
        String strM = null;
        GO.Xo xoRl = null;
        GO.Wre wreXMQ = null;
        GO.n nVarO = null;
        boolean zU = false;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43407n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                xoRl = AbstractC1672j.rl(w6Var, dsr);
            } else if (iMx == 2) {
                wreXMQ = AbstractC1669Ml.xMQ(w6Var, dsr);
            } else if (iMx == 3) {
                nVarO = AbstractC1669Ml.O(w6Var, dsr);
            } else if (iMx != 4) {
                w6Var.n1();
            } else {
                zU = w6Var.U();
            }
        }
        return new QJ.o(strM, xoRl, wreXMQ, nVarO, zU);
    }
}
