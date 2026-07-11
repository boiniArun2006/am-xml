package uh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import uh.Ln;
import uh.Md;
import uh.Z;
import uh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class K {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private eZ.I28 f74441O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ln f74442n;
    private pUk.qz nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f74443t;
    private Md.j rl = Md.j.NONE;
    private eZ.I28 J2 = pUk.C.nr();
    private eZ.I28 Uo = pUk.C.nr();

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final pUk.qz f74445n;
        final eZ.I28 nr;
        final Pl rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f74446t;

        /* synthetic */ n(pUk.qz qzVar, Pl pl, eZ.I28 i28, boolean z2, j jVar) {
            this(qzVar, pl, i28, z2);
        }

        private n(pUk.qz qzVar, Pl pl, eZ.I28 i28, boolean z2) {
            this.f74445n = qzVar;
            this.rl = pl;
            this.nr = i28;
            this.f74446t = z2;
        }

        public boolean rl() {
            return this.f74446t;
        }
    }

    public n KN(eZ.w6 w6Var) {
        return xMQ(w6Var, null);
    }

    public psW rl(n nVar) {
        return t(nVar, null);
    }

    public psW t(n nVar, Pe.z zVar) {
        return nr(nVar, zVar, false);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74444n;

        static {
            int[] iArr = new int[qz.j.values().length];
            f74444n = iArr;
            try {
                iArr[qz.j.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74444n[qz.j.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74444n[qz.j.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74444n[qz.j.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void J2(Pe.z zVar) {
        if (zVar != null) {
            Iterator it = zVar.rl().iterator();
            while (it.hasNext()) {
                this.f74441O = this.f74441O.nr((pUk.C) it.next());
            }
            for (pUk.C c2 : zVar.t()) {
                wqP.n.t(this.f74441O.contains(c2), "Modified document %s not found in view.", c2);
            }
            Iterator it2 = zVar.nr().iterator();
            while (it2.hasNext()) {
                this.f74441O = this.f74441O.J2((pUk.C) it2.next());
            }
            this.f74443t = zVar.J2();
        }
    }

    private static int Uo(qz qzVar) {
        int i2 = j.f74444n[qzVar.t().ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + qzVar.t());
            }
        }
        return i3;
    }

    private boolean qie(pUk.C c2) {
        pUk.fuX fuxO;
        return (this.f74441O.contains(c2) || (fuxO = this.nr.O(c2)) == null || fuxO.t()) ? false : true;
    }

    private List ty() {
        if (!this.f74443t) {
            return Collections.EMPTY_LIST;
        }
        eZ.I28<pUk.C> i28 = this.J2;
        this.J2 = pUk.C.nr();
        for (pUk.fuX fux : this.nr) {
            if (qie(fux.getKey())) {
                this.J2 = this.J2.nr(fux.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(i28.size() + this.J2.size());
        for (pUk.C c2 : i28) {
            if (!this.J2.contains(c2)) {
                arrayList.add(new Z(Z.j.REMOVED, c2));
            }
        }
        for (pUk.C c4 : this.J2) {
            if (!i28.contains(c4)) {
                arrayList.add(new Z(Z.j.ADDED, c4));
            }
        }
        return arrayList;
    }

    public psW O(u uVar) {
        if (!this.f74443t || uVar != u.OFFLINE) {
            return new psW(null, Collections.EMPTY_LIST);
        }
        this.f74443t = false;
        return rl(new n(this.nr, new Pl(), this.Uo, false, null));
    }

    eZ.I28 gh() {
        return this.f74441O;
    }

    public Md.j mUb() {
        return this.rl;
    }

    public psW nr(n nVar, Pe.z zVar, boolean z2) {
        Md md;
        wqP.n.t(!nVar.f74446t, "Cannot apply changes that need a refill", new Object[0]);
        pUk.qz qzVar = this.nr;
        this.nr = nVar.f74445n;
        this.Uo = nVar.nr;
        List listRl = nVar.rl.rl();
        Collections.sort(listRl, new Comparator() { // from class: uh.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return K.n(this.f74513n, (qz) obj, (qz) obj2);
            }
        });
        J2(zVar);
        List listTy = z2 ? Collections.EMPTY_LIST : ty();
        Md.j jVar = (this.J2.size() == 0 && this.f74443t && !z2) ? Md.j.SYNCED : Md.j.LOCAL;
        boolean z3 = jVar != this.rl;
        this.rl = jVar;
        if (listRl.size() != 0 || z3) {
            md = new Md(this.f74442n, nVar.f74445n, qzVar, listRl, jVar == Md.j.LOCAL, nVar.nr, z3, false, (zVar == null || zVar.O().isEmpty()) ? false : true);
        } else {
            md = null;
        }
        return new psW(md, listTy);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n xMQ(eZ.w6 w6Var, n nVar) {
        boolean z2;
        eZ.I28 i28J2;
        Pl pl = nVar != null ? nVar.rl : new Pl();
        pUk.qz qzVar = nVar != null ? nVar.f74445n : this.nr;
        eZ.I28 i28J22 = nVar != null ? nVar.nr : this.Uo;
        pUk.fuX fuxUo = (this.f74442n.mUb().equals(Ln.j.LIMIT_TO_FIRST) && ((long) qzVar.size()) == this.f74442n.xMQ()) ? qzVar.Uo() : null;
        pUk.fuX fuxJ2 = (this.f74442n.mUb().equals(Ln.j.LIMIT_TO_LAST) && ((long) qzVar.size()) == this.f74442n.xMQ()) ? qzVar.J2() : null;
        Iterator it = w6Var.iterator();
        pUk.qz qzVarKN = qzVar;
        boolean z3 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pUk.C c2 = (pUk.C) entry.getKey();
            pUk.fuX fuxO = qzVar.O(c2);
            pUk.fuX fux = this.f74442n.r((pUk.fuX) entry.getValue()) ? (pUk.fuX) entry.getValue() : null;
            boolean z4 = fuxO != null && this.Uo.contains(fuxO.getKey());
            boolean z5 = fux != null && (fux.t() || (this.Uo.contains(fux.getKey()) && fux.rl()));
            if (fuxO == null || fux == null) {
                if (fuxO != null || fux == null) {
                    if (fuxO != null && fux == null) {
                        pl.n(qz.n(qz.j.REMOVED, fuxO));
                        if (fuxUo != null || fuxJ2 != null) {
                            z3 = true;
                        }
                    }
                    z2 = false;
                } else {
                    pl.n(qz.n(qz.j.ADDED, fux));
                }
                z2 = true;
            } else if (fuxO.getData().equals(fux.getData())) {
                if (z4 != z5) {
                    pl.n(qz.n(qz.j.METADATA, fux));
                    z2 = true;
                }
                z2 = false;
            } else {
                if (!az(fuxO, fux)) {
                    pl.n(qz.n(qz.j.MODIFIED, fux));
                    if ((fuxUo != null && this.f74442n.t().compare(fux, fuxUo) > 0) || (fuxJ2 != null && this.f74442n.t().compare(fux, fuxJ2) < 0)) {
                    }
                    z2 = true;
                }
                z2 = false;
            }
            if (z2) {
                if (fux != null) {
                    qzVarKN = qzVarKN.t(fux);
                    i28J2 = fux.t() ? i28J22.nr(fux.getKey()) : i28J22.J2(fux.getKey());
                } else {
                    qzVarKN = qzVarKN.KN(c2);
                    i28J2 = i28J22.J2(c2);
                }
                i28J22 = i28J2;
            }
        }
        if (this.f74442n.ty()) {
            long size = qzVarKN.size();
            long jXMQ = this.f74442n.xMQ();
            while (true) {
                size -= jXMQ;
                if (size <= 0) {
                    break;
                }
                pUk.fuX fuxUo2 = this.f74442n.mUb().equals(Ln.j.LIMIT_TO_FIRST) ? qzVarKN.Uo() : qzVarKN.J2();
                qzVarKN = qzVarKN.KN(fuxUo2.getKey());
                i28J22 = i28J22.J2(fuxUo2.getKey());
                pl.n(qz.n(qz.j.REMOVED, fuxUo2));
                jXMQ = 1;
            }
        }
        eZ.I28 i28 = i28J22;
        pUk.qz qzVar2 = qzVarKN;
        wqP.n.t(!z3 || nVar == null, "View was refilled using docs that themselves needed refilling.", new Object[0]);
        return new n(qzVar2, pl, i28, z3, null);
    }

    public K(Ln ln2, eZ.I28 i28) {
        this.f74442n = ln2;
        this.nr = pUk.qz.nr(ln2.t());
        this.f74441O = i28;
    }

    private boolean az(pUk.fuX fux, pUk.fuX fux2) {
        if (fux.t() && fux2.rl() && !fux2.t()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int n(K k2, qz qzVar, qz qzVar2) {
        k2.getClass();
        int iGh = wqP.Z.gh(Uo(qzVar), Uo(qzVar2));
        if (iGh != 0) {
            return iGh;
        }
        return k2.f74442n.t().compare(qzVar.rl(), qzVar2.rl());
    }
}
