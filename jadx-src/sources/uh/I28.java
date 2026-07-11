package uh;

import java.util.Iterator;
import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class I28 extends eO {
    I28(pUk.z zVar, uB.s4 s4Var) {
        super(zVar, eO.n.ARRAY_CONTAINS_ANY, s4Var);
        wqP.n.t(pUk.SPz.XQ(s4Var), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // uh.eO, uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        uB.s4 s4VarNr = fux.nr(J2());
        if (!pUk.SPz.XQ(s4VarNr)) {
            return false;
        }
        Iterator it = s4VarNr.Z().KN().iterator();
        while (it.hasNext()) {
            if (pUk.SPz.Ik(KN().Z(), (uB.s4) it.next())) {
                return true;
            }
        }
        return false;
    }
}
