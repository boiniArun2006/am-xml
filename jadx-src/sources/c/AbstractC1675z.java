package c;

import QJ.l3D;
import Rc.w6;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: c.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class AbstractC1675z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43446n = w6.j.n("nm", "g", "o", "t", CmcdData.STREAMING_FORMAT_SS, "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final w6.j rl = w6.j.n(TtmlNode.TAG_P, "k");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6.j f43447t = w6.j.n(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "v");

    static QJ.Wre n(Rc.w6 w6Var, FQq.Dsr dsr) {
        QJ.CN3 cn3;
        GO.Ml ml;
        ArrayList arrayList = new ArrayList();
        QJ.CN3 cn32 = null;
        String strM = null;
        GO.w6 w6VarUo = null;
        GO.Wre wreXMQ = null;
        GO.Wre wreXMQ2 = null;
        GO.n nVarO = null;
        l3D.j jVar = null;
        l3D.n nVar = null;
        GO.n nVar2 = null;
        float fM7 = 0.0f;
        boolean zU = false;
        GO.Ml mlKN = null;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43446n)) {
                case 0:
                    strM = w6Var.M();
                    break;
                case 1:
                    cn3 = cn32;
                    ml = mlKN;
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
                    mlKN = ml;
                    cn32 = cn3;
                    break;
                case 2:
                    mlKN = AbstractC1669Ml.KN(w6Var, dsr);
                    break;
                case 3:
                    GO.Ml ml2 = mlKN;
                    cn32 = w6Var.p5() == 1 ? QJ.CN3.LINEAR : QJ.CN3.RADIAL;
                    mlKN = ml2;
                    break;
                case 4:
                    wreXMQ = AbstractC1669Ml.xMQ(w6Var, dsr);
                    break;
                case 5:
                    wreXMQ2 = AbstractC1669Ml.xMQ(w6Var, dsr);
                    break;
                case 6:
                    nVarO = AbstractC1669Ml.O(w6Var, dsr);
                    break;
                case 7:
                    cn3 = cn32;
                    ml = mlKN;
                    jVar = l3D.j.values()[w6Var.p5() - 1];
                    mlKN = ml;
                    cn32 = cn3;
                    break;
                case 8:
                    cn3 = cn32;
                    ml = mlKN;
                    nVar = l3D.n.values()[w6Var.p5() - 1];
                    mlKN = ml;
                    cn32 = cn3;
                    break;
                case 9:
                    cn3 = cn32;
                    ml = mlKN;
                    fM7 = (float) w6Var.M7();
                    mlKN = ml;
                    cn32 = cn3;
                    break;
                case 10:
                    cn3 = cn32;
                    zU = w6Var.U();
                    cn32 = cn3;
                    break;
                case 11:
                    w6Var.rl();
                    while (w6Var.jB()) {
                        w6Var.Uo();
                        String strM2 = null;
                        GO.n nVarO2 = null;
                        while (w6Var.jB()) {
                            int iMx2 = w6Var.Mx(f43447t);
                            if (iMx2 != 0) {
                                QJ.CN3 cn33 = cn32;
                                if (iMx2 != 1) {
                                    w6Var.fcU();
                                    w6Var.n1();
                                } else {
                                    nVarO2 = AbstractC1669Ml.O(w6Var, dsr);
                                }
                                cn32 = cn33;
                            } else {
                                strM2 = w6Var.M();
                            }
                        }
                        QJ.CN3 cn34 = cn32;
                        w6Var.T();
                        if (strM2.equals("o")) {
                            nVar2 = nVarO2;
                        } else {
                            if (strM2.equals("d") || strM2.equals("g")) {
                                dsr.S(true);
                                arrayList.add(nVarO2);
                            }
                            cn32 = cn34;
                        }
                        cn32 = cn34;
                    }
                    cn3 = cn32;
                    w6Var.Z();
                    if (arrayList.size() == 1) {
                        arrayList.add((GO.n) arrayList.get(0));
                    }
                    cn32 = cn3;
                    break;
                default:
                    w6Var.fcU();
                    w6Var.n1();
                    break;
            }
        }
        QJ.CN3 cn35 = cn32;
        GO.Ml ml3 = mlKN;
        if (ml3 == null) {
            ml3 = new GO.Ml(Collections.singletonList(new Ect.j(100)));
        }
        return new QJ.Wre(strM, cn35, w6VarUo, ml3, wreXMQ, wreXMQ2, nVarO, jVar, nVar, fM7, arrayList, nVar2, zU);
    }
}
