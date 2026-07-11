package pUk;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qz implements Iterable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eZ.w6 f72027n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eZ.I28 f72028t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz.class != obj.getClass()) {
            return false;
        }
        qz qzVar = (qz) obj;
        if (size() != qzVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = qzVar.iterator();
        while (it.hasNext()) {
            if (!((fuX) it.next()).equals((fuX) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static qz nr(final Comparator comparator) {
        return new qz(Dsr.n(), new eZ.I28(Collections.EMPTY_LIST, new Comparator() { // from class: pUk.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qz.rl(comparator, (fuX) obj, (fuX) obj2);
            }
        }));
    }

    public fuX J2() {
        return (fuX) this.f72028t.t();
    }

    public qz KN(C c2) {
        fuX fux = (fuX) this.f72027n.t(c2);
        return fux == null ? this : new qz(this.f72027n.xMQ(c2), this.f72028t.J2(fux));
    }

    public fuX O(C c2) {
        return (fuX) this.f72027n.t(c2);
    }

    public fuX Uo() {
        return (fuX) this.f72028t.rl();
    }

    public boolean isEmpty() {
        return this.f72027n.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f72028t.iterator();
    }

    public int size() {
        return this.f72027n.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            fuX fux = (fuX) it.next();
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(fux);
        }
        sb.append("]");
        return sb.toString();
    }

    private qz(eZ.w6 w6Var, eZ.I28 i28) {
        this.f72027n = w6Var;
        this.f72028t = i28;
    }

    public static /* synthetic */ int rl(Comparator comparator, fuX fux, fuX fux2) {
        int iCompare = comparator.compare(fux, fux2);
        if (iCompare == 0) {
            return fuX.f72019n.compare(fux, fux2);
        }
        return iCompare;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            fuX fux = (fuX) it.next();
            iHashCode = (((iHashCode * 31) + fux.getKey().hashCode()) * 31) + fux.getData().hashCode();
        }
        return iHashCode;
    }

    public qz t(fuX fux) {
        qz qzVarKN = KN(fux.getKey());
        return new qz(qzVarKN.f72027n.Uo(fux.getKey(), fux), qzVarKN.f72028t.nr(fux));
    }
}
