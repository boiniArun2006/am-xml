package pUk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import pUk.eO;
import uh.AbstractC2405z;
import uh.eO;
import uh.qf;
import uh.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f72029n;
    private final List nr;
    private final SortedSet rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f72030t;

    private boolean O(uh.eO eOVar, eO.w6 w6Var) {
        if (eOVar != null && eOVar.J2().equals(w6Var.t())) {
            if (w6Var.nr().equals(eO.w6.j.CONTAINS) == (eOVar.Uo().equals(eO.n.ARRAY_CONTAINS) || eOVar.Uo().equals(eO.n.ARRAY_CONTAINS_ANY))) {
                return true;
            }
        }
        return false;
    }

    private boolean t(eO.w6 w6Var) {
        Iterator it = this.f72030t.iterator();
        while (it.hasNext()) {
            if (O((uh.eO) it.next(), w6Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean nr() {
        return this.rl.size() > 1;
    }

    public r(vd vdVar) {
        String strXMQ;
        if (vdVar.nr() != null) {
            strXMQ = vdVar.nr();
        } else {
            strXMQ = vdVar.ty().xMQ();
        }
        this.f72029n = strXMQ;
        this.nr = vdVar.az();
        this.rl = new TreeSet(new Comparator() { // from class: pUk.Q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((uh.eO) obj).J2().compareTo(((uh.eO) obj2).J2());
            }
        });
        this.f72030t = new ArrayList();
        Iterator it = vdVar.KN().iterator();
        while (it.hasNext()) {
            uh.eO eOVar = (uh.eO) ((AbstractC2405z) it.next());
            if (eOVar.xMQ()) {
                this.rl.add(eOVar);
            } else {
                this.f72030t.add(eOVar);
            }
        }
    }

    private boolean J2(qf qfVar, eO.w6 w6Var) {
        if (!qfVar.t().equals(w6Var.t())) {
            return false;
        }
        if (!w6Var.nr().equals(eO.w6.j.ASCENDING) || !qfVar.rl().equals(qf.j.ASCENDING)) {
            if (!w6Var.nr().equals(eO.w6.j.DESCENDING) || !qfVar.rl().equals(qf.j.DESCENDING)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean Uo(eO eOVar) {
        wqP.n.t(eOVar.nr().equals(this.f72029n), "Collection IDs do not match", new Object[0]);
        if (nr()) {
            return false;
        }
        eO.w6 w6VarT = eOVar.t();
        if (w6VarT != null && !t(w6VarT)) {
            return false;
        }
        Iterator it = this.nr.iterator();
        List listO = eOVar.O();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < listO.size() && t((eO.w6) listO.get(i2))) {
            hashSet.add(((eO.w6) listO.get(i2)).t().t());
            i2++;
        }
        if (i2 == listO.size()) {
            return true;
        }
        if (this.rl.size() > 0) {
            uh.eO eOVar2 = (uh.eO) this.rl.first();
            if (!hashSet.contains(eOVar2.J2().t())) {
                eO.w6 w6Var = (eO.w6) listO.get(i2);
                if (!O(eOVar2, w6Var) || !J2((qf) it.next(), w6Var)) {
                    return false;
                }
            }
            i2++;
        }
        while (i2 < listO.size()) {
            eO.w6 w6Var2 = (eO.w6) listO.get(i2);
            if (!it.hasNext() || !J2((qf) it.next(), w6Var2)) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public eO rl() {
        eO.w6.j jVar;
        if (nr()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (uh.eO eOVar : this.f72030t) {
            if (!eOVar.J2().XQ()) {
                if (!eOVar.Uo().equals(eO.n.ARRAY_CONTAINS) && !eOVar.Uo().equals(eO.n.ARRAY_CONTAINS_ANY)) {
                    if (!hashSet.contains(eOVar.J2())) {
                        hashSet.add(eOVar.J2());
                        arrayList.add(eO.w6.rl(eOVar.J2(), eO.w6.j.ASCENDING));
                    }
                } else {
                    arrayList.add(eO.w6.rl(eOVar.J2(), eO.w6.j.CONTAINS));
                }
            }
        }
        for (qf qfVar : this.nr) {
            if (!qfVar.t().XQ() && !hashSet.contains(qfVar.t())) {
                hashSet.add(qfVar.t());
                z zVarT = qfVar.t();
                if (qfVar.rl() == qf.j.ASCENDING) {
                    jVar = eO.w6.j.ASCENDING;
                } else {
                    jVar = eO.w6.j.DESCENDING;
                }
                arrayList.add(eO.w6.rl(zVarT, jVar));
            }
        }
        return eO.rl(-1, this.f72029n, arrayList, eO.f72013n);
    }
}
