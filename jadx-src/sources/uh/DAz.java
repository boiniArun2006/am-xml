package uh;

import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DAz extends eO {
    DAz(pUk.z zVar, uB.s4 s4Var) {
        super(zVar, eO.n.NOT_IN, s4Var);
        wqP.n.t(pUk.SPz.XQ(s4Var), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // uh.eO, uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        uB.s4 s4VarNr;
        if (pUk.SPz.Ik(KN().Z(), pUk.SPz.rl) || (s4VarNr = fux.nr(J2())) == null || s4VarNr.e() || pUk.SPz.Ik(KN().Z(), s4VarNr)) {
            return false;
        }
        return true;
    }
}
