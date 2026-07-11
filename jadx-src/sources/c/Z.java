package c;

import QJ.C;
import Rc.w6;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43421n = w6.j.n("nm", "sy", "pt", TtmlNode.TAG_P, "r", "or", "os", "ir", V8ValueObject.METHOD_PREFIX_IS, "hd", "d");

    static QJ.C n(Rc.w6 w6Var, FQq.Dsr dsr, int i2) {
        boolean zU = false;
        boolean z2 = i2 == 3;
        String strM = null;
        C.j jVarRl = null;
        GO.n nVarJ2 = null;
        GO.Xo xoRl = null;
        GO.n nVarJ22 = null;
        GO.n nVarO = null;
        GO.n nVarO2 = null;
        GO.n nVarJ23 = null;
        GO.n nVarJ24 = null;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43421n)) {
                case 0:
                    strM = w6Var.M();
                    break;
                case 1:
                    jVarRl = C.j.rl(w6Var.p5());
                    break;
                case 2:
                    nVarJ2 = AbstractC1669Ml.J2(w6Var, dsr, false);
                    break;
                case 3:
                    xoRl = AbstractC1672j.rl(w6Var, dsr);
                    break;
                case 4:
                    nVarJ22 = AbstractC1669Ml.J2(w6Var, dsr, false);
                    break;
                case 5:
                    nVarO2 = AbstractC1669Ml.O(w6Var, dsr);
                    break;
                case 6:
                    nVarJ24 = AbstractC1669Ml.J2(w6Var, dsr, false);
                    break;
                case 7:
                    nVarO = AbstractC1669Ml.O(w6Var, dsr);
                    break;
                case 8:
                    nVarJ23 = AbstractC1669Ml.J2(w6Var, dsr, false);
                    break;
                case 9:
                    zU = w6Var.U();
                    break;
                case 10:
                    z2 = w6Var.p5() == 3;
                    break;
                default:
                    w6Var.fcU();
                    w6Var.n1();
                    break;
            }
        }
        return new QJ.C(strM, jVarRl, nVarJ2, xoRl, nVarJ22, nVarO, nVarO2, nVarJ23, nVarJ24, zU, z2);
    }
}
