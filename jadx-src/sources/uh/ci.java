package uh;

import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class ci extends eO {
    private final pUk.C nr;

    ci(pUk.z zVar, eO.n nVar, uB.s4 s4Var) {
        super(zVar, nVar, s4Var);
        wqP.n.t(pUk.SPz.iF(s4Var), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.nr = pUk.C.J2(KN().te());
    }

    @Override // uh.eO, uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        return mUb(fux.getKey().compareTo(this.nr));
    }
}
