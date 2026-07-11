package c;

import Rc.w6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static w6.j f43443n = w6.j.n("k");

    static List n(Rc.w6 w6Var, FQq.Dsr dsr, float f3, vd vdVar, boolean z2) {
        Rc.w6 w6Var2;
        FQq.Dsr dsr2;
        float f4;
        vd vdVar2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (w6Var.a() == w6.n.STRING) {
            dsr.n("Lottie doesn't support expressions.");
            return arrayList;
        }
        w6Var.Uo();
        while (w6Var.jB()) {
            if (w6Var.Mx(f43443n) != 0) {
                w6Var.n1();
            } else if (w6Var.a() == w6.n.BEGIN_ARRAY) {
                w6Var.rl();
                if (w6Var.a() == w6.n.NUMBER) {
                    Rc.w6 w6Var3 = w6Var;
                    FQq.Dsr dsr3 = dsr;
                    float f5 = f3;
                    vd vdVar3 = vdVar;
                    boolean z4 = z2;
                    Ect.j jVarT = AbstractC1671c.t(w6Var3, dsr3, f5, vdVar3, false, z4);
                    w6Var2 = w6Var3;
                    dsr2 = dsr3;
                    f4 = f5;
                    vdVar2 = vdVar3;
                    z3 = z4;
                    arrayList.add(jVarT);
                } else {
                    w6Var2 = w6Var;
                    dsr2 = dsr;
                    f4 = f3;
                    vdVar2 = vdVar;
                    z3 = z2;
                    while (w6Var2.jB()) {
                        arrayList.add(AbstractC1671c.t(w6Var2, dsr2, f4, vdVar2, true, z3));
                    }
                }
                w6Var2.Z();
                w6Var = w6Var2;
                dsr = dsr2;
                f3 = f4;
                vdVar = vdVar2;
                z2 = z3;
            } else {
                Rc.w6 w6Var4 = w6Var;
                arrayList.add(AbstractC1671c.t(w6Var4, dsr, f3, vdVar, false, z2));
                w6Var = w6Var4;
            }
        }
        w6Var.T();
        rl(arrayList);
        return arrayList;
    }

    public static void rl(List list) {
        int i2;
        Object obj;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            Ect.j jVar = (Ect.j) list.get(i3);
            i3++;
            Ect.j jVar2 = (Ect.j) list.get(i3);
            jVar.KN = Float.valueOf(jVar2.Uo);
            if (jVar.f2329t == null && (obj = jVar2.rl) != null) {
                jVar.f2329t = obj;
                if (jVar instanceof B.Dsr) {
                    ((B.Dsr) jVar).mUb();
                }
            }
        }
        Ect.j jVar3 = (Ect.j) list.get(i2);
        if ((jVar3.rl == null || jVar3.f2329t == null) && list.size() > 1) {
            list.remove(jVar3);
        }
    }
}
