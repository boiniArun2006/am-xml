package c;

import Rc.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C {
    private static final w6.j J2 = w6.j.n("ef");
    private static final w6.j Uo = w6.j.n("nm", "v");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private GO.n f43401O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private GO.j f43402n;
    private GO.n nr;
    private GO.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private GO.n f43403t;

    private void n(Rc.w6 w6Var, FQq.Dsr dsr) {
        w6Var.Uo();
        String strM = "";
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(Uo);
            if (iMx == 0) {
                strM = w6Var.M();
            } else if (iMx == 1) {
                strM.getClass();
                switch (strM) {
                    case "Distance":
                        this.nr = AbstractC1669Ml.O(w6Var, dsr);
                        break;
                    case "Opacity":
                        this.rl = AbstractC1669Ml.J2(w6Var, dsr, false);
                        break;
                    case "Direction":
                        this.f43403t = AbstractC1669Ml.J2(w6Var, dsr, false);
                        break;
                    case "Shadow Color":
                        this.f43402n = AbstractC1669Ml.t(w6Var, dsr);
                        break;
                    case "Softness":
                        this.f43401O = AbstractC1669Ml.O(w6Var, dsr);
                        break;
                    default:
                        w6Var.n1();
                        break;
                }
            } else {
                w6Var.fcU();
                w6Var.n1();
            }
        }
        w6Var.T();
    }

    aC rl(Rc.w6 w6Var, FQq.Dsr dsr) {
        GO.n nVar;
        GO.n nVar2;
        GO.n nVar3;
        GO.n nVar4;
        while (w6Var.jB()) {
            if (w6Var.Mx(J2) != 0) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                w6Var.rl();
                while (w6Var.jB()) {
                    n(w6Var, dsr);
                }
                w6Var.Z();
            }
        }
        GO.j jVar = this.f43402n;
        if (jVar != null && (nVar = this.rl) != null && (nVar2 = this.f43403t) != null && (nVar3 = this.nr) != null && (nVar4 = this.f43401O) != null) {
            return new aC(jVar, nVar, nVar2, nVar3, nVar4);
        }
        return null;
    }
}
