package c;

import Rc.w6;
import android.graphics.Path;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43428n = w6.j.n("nm", "g", "o", "t", CmcdData.STREAMING_FORMAT_SS, "e", "r", "hd");
    private static final w6.j rl = w6.j.n(TtmlNode.TAG_P, "k");

    static QJ.I28 n(Rc.w6 w6Var, FQq.Dsr dsr) {
        GO.Ml ml = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strM = null;
        QJ.CN3 cn3 = null;
        GO.w6 w6VarUo = null;
        GO.Wre wreXMQ = null;
        GO.Wre wreXMQ2 = null;
        boolean zU = false;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43428n)) {
                case 0:
                    strM = w6Var.M();
                    break;
                case 1:
                    w6Var.Uo();
                    int iP5 = -1;
                    while (w6Var.jB()) {
                        int iMx = w6Var.Mx(rl);
                        if (iMx == 0) {
                            iP5 = w6Var.p5();
                        } else if (iMx != 1) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            w6VarUo = AbstractC1669Ml.Uo(w6Var, dsr, iP5);
                        }
                    }
                    w6Var.T();
                    break;
                case 2:
                    ml = AbstractC1669Ml.KN(w6Var, dsr);
                    break;
                case 3:
                    cn3 = w6Var.p5() == 1 ? QJ.CN3.LINEAR : QJ.CN3.RADIAL;
                    break;
                case 4:
                    wreXMQ = AbstractC1669Ml.xMQ(w6Var, dsr);
                    break;
                case 5:
                    wreXMQ2 = AbstractC1669Ml.xMQ(w6Var, dsr);
                    break;
                case 6:
                    fillType = w6Var.p5() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zU = w6Var.U();
                    break;
                default:
                    w6Var.fcU();
                    w6Var.n1();
                    break;
            }
        }
        if (ml == null) {
            ml = new GO.Ml(Collections.singletonList(new Ect.j(100)));
        }
        return new QJ.I28(strM, cn3, fillType, w6VarUo, ml, wreXMQ, wreXMQ2, null, null, zU);
    }
}
