package c;

import Rc.w6;
import java.util.ArrayList;

/* JADX INFO: renamed from: c.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1672j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43432n = w6.j.n("k", "x", "y");

    public static GO.I28 n(Rc.w6 w6Var, FQq.Dsr dsr) {
        ArrayList arrayList = new ArrayList();
        if (w6Var.a() == w6.n.BEGIN_ARRAY) {
            w6Var.rl();
            while (w6Var.jB()) {
                arrayList.add(ci.n(w6Var, dsr));
            }
            w6Var.Z();
            s4.rl(arrayList);
        } else {
            arrayList.add(new Ect.j(l3D.O(w6Var, x0.eO.O())));
        }
        return new GO.I28(arrayList);
    }

    static GO.Xo rl(Rc.w6 w6Var, FQq.Dsr dsr) {
        w6Var.Uo();
        GO.I28 i28N = null;
        GO.n nVarO = null;
        boolean z2 = false;
        GO.n nVarO2 = null;
        while (w6Var.a() != w6.n.END_OBJECT) {
            int iMx = w6Var.Mx(f43432n);
            if (iMx != 0) {
                if (iMx != 1) {
                    if (iMx != 2) {
                        w6Var.fcU();
                        w6Var.n1();
                    } else if (w6Var.a() == w6.n.STRING) {
                        w6Var.n1();
                        z2 = true;
                    } else {
                        nVarO = AbstractC1669Ml.O(w6Var, dsr);
                    }
                } else if (w6Var.a() == w6.n.STRING) {
                    w6Var.n1();
                    z2 = true;
                } else {
                    nVarO2 = AbstractC1669Ml.O(w6Var, dsr);
                }
            } else {
                i28N = n(w6Var, dsr);
            }
        }
        w6Var.T();
        if (z2) {
            dsr.n("Lottie doesn't support expressions.");
        }
        if (i28N != null) {
            return i28N;
        }
        return new GO.Dsr(nVarO2, nVarO);
    }
}
