package c;

import Rc.w6;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: renamed from: c.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class AbstractC1670Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43419n = w6.j.n("nm", TtmlNode.TAG_P, CmcdData.STREAMING_FORMAT_SS, "hd", "d");

    static QJ.n n(Rc.w6 w6Var, FQq.Dsr dsr, int i2) {
        boolean z2 = i2 == 3;
        boolean zU = false;
        String strM = null;
        GO.Xo xoRl = null;
        GO.Wre wreXMQ = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43419n);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                xoRl = AbstractC1672j.rl(w6Var, dsr);
            } else if (iMx == 2) {
                wreXMQ = AbstractC1669Ml.xMQ(w6Var, dsr);
            } else if (iMx == 3) {
                zU = w6Var.U();
            } else if (iMx != 4) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                z2 = w6Var.p5() == 3;
            }
        }
        return new QJ.n(strM, xoRl, wreXMQ, z2, zU);
    }
}
