package uh;

import java.util.ArrayList;
import java.util.List;
import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class g9s extends eO {
    private final List nr;

    /* JADX WARN: Illegal instructions before constructor call */
    g9s(pUk.z zVar, uB.s4 s4Var) {
        eO.n nVar = eO.n.IN;
        super(zVar, nVar, s4Var);
        ArrayList arrayList = new ArrayList();
        this.nr = arrayList;
        arrayList.addAll(gh(nVar, s4Var));
    }

    static List gh(eO.n nVar, uB.s4 s4Var) {
        wqP.n.t(nVar == eO.n.IN || nVar == eO.n.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        wqP.n.t(pUk.SPz.XQ(s4Var), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (uB.s4 s4Var2 : s4Var.Z().KN()) {
            wqP.n.t(pUk.SPz.iF(s4Var2), "Comparing on key with " + nVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(pUk.C.J2(s4Var2.te()));
        }
        return arrayList;
    }

    @Override // uh.eO, uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        return this.nr.contains(fux.getKey());
    }
}
