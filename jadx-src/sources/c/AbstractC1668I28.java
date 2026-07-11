package c;

import Rc.w6;

/* JADX INFO: renamed from: c.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class AbstractC1668I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43408n = w6.j.n("ef");
    private static final w6.j rl = w6.j.n("ty", "v");

    static QJ.j rl(Rc.w6 w6Var, FQq.Dsr dsr) {
        QJ.j jVar = null;
        while (w6Var.jB()) {
            if (w6Var.Mx(f43408n) != 0) {
                w6Var.fcU();
                w6Var.n1();
            } else {
                w6Var.rl();
                while (w6Var.jB()) {
                    QJ.j jVarN = n(w6Var, dsr);
                    if (jVarN != null) {
                        jVar = jVarN;
                    }
                }
                w6Var.Z();
            }
        }
        return jVar;
    }

    private static QJ.j n(Rc.w6 w6Var, FQq.Dsr dsr) {
        w6Var.Uo();
        QJ.j jVar = null;
        while (true) {
            boolean z2 = false;
            while (w6Var.jB()) {
                int iMx = w6Var.Mx(rl);
                if (iMx != 0) {
                    if (iMx != 1) {
                        w6Var.fcU();
                        w6Var.n1();
                    } else if (z2) {
                        jVar = new QJ.j(AbstractC1669Ml.O(w6Var, dsr));
                    } else {
                        w6Var.n1();
                    }
                } else if (w6Var.p5() == 0) {
                    z2 = true;
                }
            }
            w6Var.T();
            return jVar;
        }
    }
}
