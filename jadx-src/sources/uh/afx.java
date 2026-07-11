package uh;

import java.util.ArrayList;
import java.util.List;
import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class afx extends eO {
    private final List nr;

    /* JADX WARN: Illegal instructions before constructor call */
    afx(pUk.z zVar, uB.s4 s4Var) {
        eO.n nVar = eO.n.NOT_IN;
        super(zVar, nVar, s4Var);
        ArrayList arrayList = new ArrayList();
        this.nr = arrayList;
        arrayList.addAll(g9s.gh(nVar, s4Var));
    }

    @Override // uh.eO, uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        return !this.nr.contains(fux.getKey());
    }
}
