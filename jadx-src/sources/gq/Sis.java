package gq;

import gq.qz;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pUk.eO;
import uh.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Sis {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Xo f67734n;
    private qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67735t;
    private boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f67733O = 100;
    private double J2 = 2.0d;

    private eZ.w6 n(Iterable iterable, uh.Ln ln2, eO.j jVar) {
        eZ.w6 w6VarKN = this.f67734n.KN(ln2, jVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            pUk.fuX fux = (pUk.fuX) it.next();
            w6VarKN = w6VarKN.Uo(fux.getKey(), fux);
        }
        return w6VarKN;
    }

    private eZ.I28 rl(uh.Ln ln2, eZ.w6 w6Var) {
        eZ.I28 i28 = new eZ.I28(Collections.EMPTY_LIST, ln2.t());
        Iterator it = w6Var.iterator();
        while (it.hasNext()) {
            pUk.fuX fux = (pUk.fuX) ((Map.Entry) it.next()).getValue();
            if (ln2.r(fux)) {
                i28 = i28.nr(fux);
            }
        }
        return i28;
    }

    public void J2(Xo xo, qz qzVar) {
        this.f67734n = xo;
        this.rl = qzVar;
        this.f67735t = true;
    }

    public eZ.w6 O(uh.Ln ln2, pUk.UGc uGc, eZ.I28 i28) {
        wqP.n.t(this.f67735t, "initialize() not called", new Object[0]);
        eZ.w6 w6VarKN = KN(ln2);
        if (w6VarKN != null) {
            return w6VarKN;
        }
        eZ.w6 w6VarXMQ = xMQ(ln2, i28, uGc);
        if (w6VarXMQ != null) {
            return w6VarXMQ;
        }
        pO pOVar = new pO();
        eZ.w6 w6VarNr = nr(ln2, pOVar);
        if (w6VarNr != null && this.nr) {
            t(ln2, pOVar, w6VarNr.size());
        }
        return w6VarNr;
    }

    private eZ.w6 KN(uh.Ln ln2) {
        boolean z2;
        if (ln2.o()) {
            return null;
        }
        uh.vd vdVarAYN = ln2.aYN();
        qz.j jVarO = this.rl.O(vdVarAYN);
        if (jVarO.equals(qz.j.NONE)) {
            return null;
        }
        if (ln2.ty() && jVarO.equals(qz.j.PARTIAL)) {
            return KN(ln2.Ik(-1L));
        }
        List listUo = this.rl.Uo(vdVarAYN);
        if (listUo != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "index manager must return results for partial and full indexes.", new Object[0]);
        eZ.w6 w6VarNr = this.f67734n.nr(listUo);
        eO.j jVarMUb = this.rl.mUb(vdVarAYN);
        eZ.I28 i28Rl = rl(ln2, w6VarNr);
        if (Uo(ln2, listUo.size(), i28Rl, jVarMUb.xMQ())) {
            return KN(ln2.Ik(-1L));
        }
        return n(i28Rl, ln2, jVarMUb);
    }

    private boolean Uo(uh.Ln ln2, int i2, eZ.I28 i28, pUk.UGc uGc) {
        pUk.fuX fux;
        if (!ln2.ty()) {
            return false;
        }
        if (i2 != i28.size()) {
            return true;
        }
        if (ln2.mUb() == Ln.j.LIMIT_TO_FIRST) {
            fux = (pUk.fuX) i28.rl();
        } else {
            fux = (pUk.fuX) i28.t();
        }
        if (fux == null) {
            return false;
        }
        if (!fux.O() && fux.getVersion().compareTo(uGc) <= 0) {
            return false;
        }
        return true;
    }

    private eZ.w6 nr(uh.Ln ln2, pO pOVar) {
        if (wqP.QJ.t()) {
            wqP.QJ.n("QueryEngine", "Using full collection scan to execute query: %s", ln2.toString());
        }
        return this.f67734n.xMQ(ln2, eO.j.f72014n, pOVar);
    }

    private void t(uh.Ln ln2, pO pOVar, int i2) {
        if (pOVar.n() < this.f67733O) {
            wqP.QJ.n("QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", ln2.toString(), Integer.valueOf(this.f67733O));
            return;
        }
        wqP.QJ.n("QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", ln2.toString(), Integer.valueOf(pOVar.n()), Integer.valueOf(i2));
        if (pOVar.n() > this.J2 * ((double) i2)) {
            this.rl.KN(ln2.aYN());
            wqP.QJ.n("QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", ln2.toString());
        }
    }

    private eZ.w6 xMQ(uh.Ln ln2, eZ.I28 i28, pUk.UGc uGc) {
        if (ln2.o() || uGc.equals(pUk.UGc.f72007t)) {
            return null;
        }
        eZ.I28 i28Rl = rl(ln2, this.f67734n.nr(i28));
        if (Uo(ln2, i28.size(), i28Rl, uGc)) {
            return null;
        }
        if (wqP.QJ.t()) {
            wqP.QJ.n("QueryEngine", "Re-using previous result from %s to execute query: %s", uGc.toString(), ln2.toString());
        }
        return n(i28Rl, ln2, eO.j.nr(uGc, -1));
    }
}
