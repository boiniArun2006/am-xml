package c;

import QJ.l3D;
import Rc.w6;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43410n = w6.j.n("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final w6.j rl = w6.j.n(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static QJ.l3D n(Rc.w6 w6Var, FQq.Dsr dsr) {
        GO.n nVarO;
        ArrayList arrayList = new ArrayList();
        float fM7 = 0.0f;
        boolean zU = false;
        GO.Ml ml = null;
        l3D.j jVar = null;
        l3D.n nVar = null;
        String strM = null;
        GO.n nVar2 = null;
        GO.j jVarT = null;
        GO.n nVarO2 = null;
        while (w6Var.jB()) {
            switch (w6Var.Mx(f43410n)) {
                case 0:
                    strM = w6Var.M();
                    break;
                case 1:
                    jVarT = AbstractC1669Ml.t(w6Var, dsr);
                    break;
                case 2:
                    nVarO2 = AbstractC1669Ml.O(w6Var, dsr);
                    break;
                case 3:
                    ml = AbstractC1669Ml.KN(w6Var, dsr);
                    break;
                case 4:
                    jVar = l3D.j.values()[w6Var.p5() - 1];
                    break;
                case 5:
                    nVar = l3D.n.values()[w6Var.p5() - 1];
                    break;
                case 6:
                    fM7 = (float) w6Var.M7();
                    break;
                case 7:
                    zU = w6Var.U();
                    break;
                case 8:
                    w6Var.rl();
                    while (w6Var.jB()) {
                        w6Var.Uo();
                        String strM2 = null;
                        nVarO = null;
                        while (w6Var.jB()) {
                            int iMx = w6Var.Mx(rl);
                            if (iMx == 0) {
                                strM2 = w6Var.M();
                            } else if (iMx != 1) {
                                w6Var.fcU();
                                w6Var.n1();
                            } else {
                                nVarO = AbstractC1669Ml.O(w6Var, dsr);
                            }
                        }
                        w6Var.T();
                        strM2.getClass();
                        switch (strM2) {
                            case "d":
                            case "g":
                                dsr.S(true);
                                arrayList.add(nVarO);
                                break;
                            case "o":
                                nVar2 = nVarO;
                                break;
                        }
                    }
                    w6Var.Z();
                    if (arrayList.size() == 1) {
                        arrayList.add((GO.n) arrayList.get(0));
                    }
                    break;
                default:
                    w6Var.n1();
                    break;
            }
        }
        if (ml == null) {
            ml = new GO.Ml(Collections.singletonList(new Ect.j(100)));
        }
        if (jVar == null) {
            jVar = l3D.j.BUTT;
        }
        if (nVar == null) {
            nVar = l3D.n.MITER;
        }
        GO.n nVar3 = nVar2;
        l3D.j jVar2 = jVar;
        return new QJ.l3D(strM, nVar3, arrayList, jVarT, ml, nVarO2, jVar2, nVar, fM7, zU);
    }
}
