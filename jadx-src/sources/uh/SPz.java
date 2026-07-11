package uh;

import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class SPz extends eO {
    SPz(pUk.z zVar, uB.s4 s4Var) {
        super(zVar, eO.n.IN, s4Var);
        wqP.n.t(pUk.SPz.XQ(s4Var), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // uh.eO, uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        uB.s4 s4VarNr = fux.nr(J2());
        if (s4VarNr != null && pUk.SPz.Ik(KN().Z(), s4VarNr)) {
            return true;
        }
        return false;
    }
}
