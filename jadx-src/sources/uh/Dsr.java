package uh;

import java.util.List;
import uh.qf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f74439n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Dsr.class == obj.getClass()) {
            Dsr dsr = (Dsr) obj;
            if (this.f74439n == dsr.f74439n && this.rl.equals(dsr.rl)) {
                return true;
            }
        }
        return false;
    }

    private int n(List list, pUk.fuX fux) {
        int iXMQ;
        wqP.n.t(this.rl.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i2 = 0;
        for (int i3 = 0; i3 < this.rl.size(); i3++) {
            qf qfVar = (qf) list.get(i3);
            uB.s4 s4Var = (uB.s4) this.rl.get(i3);
            if (qfVar.rl.equals(pUk.z.f72033t)) {
                wqP.n.t(pUk.SPz.iF(s4Var), "Bound has a non-key value where the key path is being used %s", s4Var);
                iXMQ = pUk.C.J2(s4Var.te()).compareTo(fux.getKey());
            } else {
                uB.s4 s4VarNr = fux.nr(qfVar.t());
                wqP.n.t(s4VarNr != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iXMQ = pUk.SPz.xMQ(s4Var, s4VarNr);
            }
            if (qfVar.rl().equals(qf.j.DESCENDING)) {
                iXMQ *= -1;
            }
            i2 = iXMQ;
            if (i2 != 0) {
                return i2;
            }
        }
        return i2;
    }

    public int hashCode() {
        return ((this.f74439n ? 1 : 0) * 31) + this.rl.hashCode();
    }

    public String nr() {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (uB.s4 s4Var : this.rl) {
            if (!z2) {
                sb.append(",");
            }
            sb.append(pUk.SPz.rl(s4Var));
            z2 = false;
        }
        return sb.toString();
    }

    public List rl() {
        return this.rl;
    }

    public boolean t() {
        return this.f74439n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f74439n);
        sb.append(", position=");
        for (int i2 = 0; i2 < this.rl.size(); i2++) {
            if (i2 > 0) {
                sb.append(" and ");
            }
            sb.append(pUk.SPz.rl((uB.s4) this.rl.get(i2)));
        }
        sb.append(")");
        return sb.toString();
    }

    public Dsr(List list, boolean z2) {
        this.rl = list;
        this.f74439n = z2;
    }

    public boolean J2(List list, pUk.fuX fux) {
        int iN = n(list, fux);
        if (this.f74439n) {
            if (iN > 0) {
                return false;
            }
            return true;
        }
        if (iN >= 0) {
            return false;
        }
        return true;
    }

    public boolean O(List list, pUk.fuX fux) {
        int iN = n(list, fux);
        if (this.f74439n) {
            if (iN < 0) {
                return false;
            }
            return true;
        }
        if (iN <= 0) {
            return false;
        }
        return true;
    }
}
