package c;

import Hr.CQ.USEaHtCMH;
import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43429n = w6.j.n("ty", "d");

    static QJ.w6 n(Rc.w6 w6Var, FQq.Dsr dsr) {
        QJ.w6 w6VarN;
        String strM;
        byte b2 = 1;
        w6Var.Uo();
        int iP5 = 2;
        while (true) {
            w6VarN = null;
            if (!w6Var.jB()) {
                strM = null;
                break;
            }
            int iMx = w6Var.Mx(f43429n);
            if (iMx == 0) {
                strM = w6Var.M();
                break;
            }
            if (iMx != 1) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                iP5 = w6Var.p5();
            }
        }
        if (strM == null) {
            return null;
        }
        switch (strM.hashCode()) {
            case 3239:
                b2 = !strM.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                if (!strM.equals("fl")) {
                    b2 = -1;
                }
                break;
            case 3295:
                b2 = !strM.equals("gf") ? (byte) -1 : (byte) 2;
                break;
            case 3307:
                b2 = !strM.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b2 = !strM.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b2 = !strM.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b2 = !strM.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b2 = !strM.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b2 = !strM.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b2 = !strM.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b2 = !strM.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b2 = !strM.equals(USEaHtCMH.NTrjcEIYfivevPX) ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b2 = !strM.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b2 = !strM.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                w6VarN = AbstractC1670Wre.n(w6Var, dsr, iP5);
                break;
            case 1:
                w6VarN = Ln.n(w6Var, dsr);
                break;
            case 2:
                w6VarN = eO.n(w6Var, dsr);
                break;
            case 3:
                w6VarN = lej.n(w6Var, dsr);
                break;
            case 4:
                w6VarN = AbstractC1675z.n(w6Var, dsr);
                break;
            case 5:
                w6VarN = SPz.n(w6Var);
                dsr.n("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                w6VarN = Ew.n(w6Var, dsr);
                break;
            case 7:
                w6VarN = DAz.n(w6Var, dsr);
                break;
            case 8:
                w6VarN = nKK.n(w6Var, dsr);
                break;
            case 9:
                w6VarN = iwV.n(w6Var, dsr);
                break;
            case 10:
                w6VarN = Z.n(w6Var, dsr, iP5);
                break;
            case 11:
                w6VarN = M.n(w6Var, dsr);
                break;
            case 12:
                w6VarN = rv6.n(w6Var, dsr);
                break;
            case 13:
                w6VarN = AbstractC1674w6.Uo(w6Var, dsr);
                break;
            default:
                x0.CN3.t("Unknown shape type " + strM);
                break;
        }
        while (w6Var.jB()) {
            w6Var.n1();
        }
        w6Var.T();
        return w6VarN;
    }
}
