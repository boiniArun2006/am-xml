package c;

import QJ.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class r {
    static QJ.Dsr n(Rc.w6 w6Var, FQq.Dsr dsr) {
        String strEF;
        w6Var.Uo();
        Dsr.j jVar = null;
        GO.fuX fuxGh = null;
        GO.Ml mlKN = null;
        boolean zU = false;
        while (w6Var.jB()) {
            strEF = w6Var.eF();
            strEF.getClass();
            switch (strEF) {
                case "o":
                    mlKN = AbstractC1669Ml.KN(w6Var, dsr);
                    break;
                case "pt":
                    fuxGh = AbstractC1669Ml.gh(w6Var, dsr);
                    break;
                case "inv":
                    zU = w6Var.U();
                    break;
                case "mode":
                    String strM = w6Var.M();
                    strM.getClass();
                    switch (strM) {
                        case "a":
                            jVar = Dsr.j.MASK_MODE_ADD;
                            break;
                        case "i":
                            dsr.n("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            jVar = Dsr.j.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            jVar = Dsr.j.MASK_MODE_NONE;
                            break;
                        case "s":
                            jVar = Dsr.j.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            x0.CN3.t("Unknown mask mode " + strEF + ". Defaulting to Add.");
                            jVar = Dsr.j.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    w6Var.n1();
                    break;
            }
        }
        w6Var.T();
        return new QJ.Dsr(jVar, fuxGh, mlKN, zU);
    }
}
