package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.BloomFilter;
import com.google.firebase.firestore.remote.Z;
import com.google.firebase.firestore.remote.afx;
import gq.l4Z;
import gq.oJ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uB.C2394Ml;
import uh.qz;
import uh.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ew {
    private final pUk.Wre J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f60380n;
    private final Map rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f60381t = new HashMap();
    private Map nr = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Map f60379O = new HashMap();

    enum n {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    public interface w6 {
        oJ n(int i2);

        eZ.I28 rl(int i2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60382n;

        static {
            int[] iArr = new int[Z.I28.values().length];
            f60382n = iArr;
            try {
                iArr[Z.I28.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60382n[Z.I28.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60382n[Z.I28.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60382n[Z.I28.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60382n[Z.I28.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private int J2(BloomFilter bloomFilter, int i2) {
        eZ.I28<pUk.C> i28Rl = this.f60380n.rl(i2);
        String str = "projects/" + this.J2.J2() + "/databases/" + this.J2.nr() + "/documents/";
        int i3 = 0;
        for (pUk.C c2 : i28Rl) {
            if (!bloomFilter.KN(str + c2.qie().t())) {
                ck(i2, c2, null);
                i3++;
            }
        }
        return i3;
    }

    private g9s O(int i2) {
        g9s g9sVar = (g9s) this.rl.get(Integer.valueOf(i2));
        if (g9sVar != null) {
            return g9sVar;
        }
        g9s g9sVar2 = new g9s();
        this.rl.put(Integer.valueOf(i2), g9sVar2);
        return g9sVar2;
    }

    private Set nr(pUk.C c2) {
        Set set = (Set) this.nr.get(c2);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.nr.put(c2, hashSet);
        return hashSet;
    }

    private boolean o(int i2, pUk.C c2) {
        return this.f60380n.rl(i2).contains(c2);
    }

    private void r(int i2) {
        wqP.n.t((this.rl.get(Integer.valueOf(i2)) == null || ((g9s) this.rl.get(Integer.valueOf(i2))).O()) ? false : true, "Should only reset active targets", new Object[0]);
        this.rl.put(Integer.valueOf(i2), new g9s());
        Iterator it = this.f60380n.rl(i2).iterator();
        while (it.hasNext()) {
            ck(i2, (pUk.C) it.next(), null);
        }
    }

    private oJ ty(int i2) {
        g9s g9sVar = (g9s) this.rl.get(Integer.valueOf(i2));
        if (g9sVar == null || !g9sVar.O()) {
            return this.f60380n.n(i2);
        }
        return null;
    }

    void Ik(int i2) {
        this.rl.remove(Integer.valueOf(i2));
    }

    public Pe.o t(pUk.UGc uGc) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.rl.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            g9s g9sVar = (g9s) entry.getValue();
            oJ oJVarTy = ty(iIntValue);
            if (oJVarTy != null) {
                if (g9sVar.nr() && oJVarTy.Uo().o()) {
                    pUk.C cUo = pUk.C.Uo(oJVarTy.Uo().ty());
                    if (this.f60381t.get(cUo) == null && !o(iIntValue, cUo)) {
                        ck(iIntValue, cUo, pUk.QJ.Ik(cUo, uGc));
                    }
                }
                if (g9sVar.t()) {
                    map.put(num, g9sVar.mUb());
                    g9sVar.rl();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : this.nr.entrySet()) {
            pUk.C c2 = (pUk.C) entry2.getKey();
            Iterator it = ((Set) entry2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(c2);
                    break;
                }
                oJ oJVarTy2 = ty(((Integer) it.next()).intValue());
                if (oJVarTy2 == null || oJVarTy2.t().equals(l4Z.LIMBO_RESOLUTION)) {
                }
            }
        }
        Iterator it2 = this.f60381t.values().iterator();
        while (it2.hasNext()) {
            ((pUk.QJ) it2.next()).XQ(uGc);
        }
        Pe.o oVar = new Pe.o(uGc, Collections.unmodifiableMap(map), Collections.unmodifiableMap(this.f60379O), Collections.unmodifiableMap(this.f60381t), Collections.unmodifiableSet(hashSet));
        this.f60381t = new HashMap();
        this.nr = new HashMap();
        this.f60379O = new HashMap();
        return oVar;
    }

    public Ew(pUk.Wre wre, w6 w6Var) {
        this.J2 = wre;
        this.f60380n = w6Var;
    }

    private Collection KN(Z.Ml ml) {
        List listNr = ml.nr();
        if (!listNr.isEmpty()) {
            return listNr;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.rl.keySet()) {
            if (qie(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private int Uo(int i2) {
        Pe.z zVarMUb = O(i2).mUb();
        return (this.f60380n.rl(i2).size() + zVarMUb.rl().size()) - zVarMUb.nr().size();
    }

    private BloomFilter az(Z.w6 w6Var) {
        C2394Ml c2394MlRl = w6Var.n().rl();
        if (c2394MlRl != null && c2394MlRl.qie()) {
            try {
                BloomFilter bloomFilterN = BloomFilter.n(c2394MlRl.xMQ().xMQ(), c2394MlRl.xMQ().gh(), c2394MlRl.gh());
                if (bloomFilterN.t() == 0) {
                    return null;
                }
                return bloomFilterN;
            } catch (BloomFilter.BloomFilterCreateException e2) {
                wqP.QJ.nr("WatchChangeAggregator", "Applying bloom filter failed: (" + e2.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    private void ck(int i2, pUk.C c2, pUk.QJ qj) {
        if (qie(i2)) {
            g9s g9sVarO = O(i2);
            if (o(i2, c2)) {
                g9sVarO.n(c2, qz.j.REMOVED);
            } else {
                g9sVarO.xMQ(c2);
            }
            nr(c2).add(Integer.valueOf(i2));
            if (qj != null) {
                this.f60381t.put(c2, qj);
            }
        }
    }

    private void n(int i2, pUk.QJ qj) {
        qz.j jVar;
        if (!qie(i2)) {
            return;
        }
        if (o(i2, qj.getKey())) {
            jVar = qz.j.MODIFIED;
        } else {
            jVar = qz.j.ADDED;
        }
        O(i2).n(qj.getKey(), jVar);
        this.f60381t.put(qj.getKey(), qj);
        nr(qj.getKey()).add(Integer.valueOf(i2));
    }

    private boolean qie(int i2) {
        if (ty(i2) != null) {
            return true;
        }
        return false;
    }

    private n rl(BloomFilter bloomFilter, Z.w6 w6Var, int i2) {
        if (w6Var.n().n() == i2 - J2(bloomFilter, w6Var.rl())) {
            return n.SUCCESS;
        }
        return n.FALSE_POSITIVE;
    }

    void HI(int i2) {
        O(i2).Uo();
    }

    public void gh(Z.Ml ml) {
        Iterator it = KN(ml).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            g9s g9sVarO = O(iIntValue);
            int i2 = j.f60382n[ml.rl().ordinal()];
            boolean z2 = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                if (qie(iIntValue)) {
                                    r(iIntValue);
                                    g9sVarO.gh(ml.t());
                                }
                            } else {
                                throw wqP.n.n("Unknown target watch change state: %s", ml.rl());
                            }
                        } else if (qie(iIntValue)) {
                            g9sVarO.J2();
                            g9sVarO.gh(ml.t());
                        }
                    } else {
                        g9sVarO.KN();
                        if (!g9sVarO.O()) {
                            Ik(iIntValue);
                        }
                        if (ml.n() != null) {
                            z2 = false;
                        }
                        wqP.n.t(z2, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                    }
                } else {
                    g9sVarO.KN();
                    if (!g9sVarO.O()) {
                        g9sVarO.rl();
                    }
                    g9sVarO.gh(ml.t());
                }
            } else if (qie(iIntValue)) {
                g9sVarO.gh(ml.t());
            }
        }
    }

    public void mUb(Z.w6 w6Var) {
        n nVarRl;
        l4Z l4z;
        int iRl = w6Var.rl();
        int iN = w6Var.n().n();
        oJ oJVarTy = ty(iRl);
        if (oJVarTy != null) {
            vd vdVarUo = oJVarTy.Uo();
            if (vdVarUo.o()) {
                if (iN == 0) {
                    pUk.C cUo = pUk.C.Uo(vdVarUo.ty());
                    ck(iRl, cUo, pUk.QJ.Ik(cUo, pUk.UGc.f72007t));
                    return;
                } else {
                    boolean z2 = true;
                    if (iN != 1) {
                        z2 = false;
                    }
                    wqP.n.t(z2, "Single document existence filter with count: %d", Integer.valueOf(iN));
                    return;
                }
            }
            int iUo = Uo(iRl);
            if (iUo != iN) {
                BloomFilter bloomFilterAz = az(w6Var);
                if (bloomFilterAz != null) {
                    nVarRl = rl(bloomFilterAz, w6Var, iUo);
                } else {
                    nVarRl = n.SKIPPED;
                }
                if (nVarRl != n.SUCCESS) {
                    r(iRl);
                    if (nVarRl == n.FALSE_POSITIVE) {
                        l4z = l4Z.EXISTENCE_FILTER_MISMATCH_BLOOM;
                    } else {
                        l4z = l4Z.EXISTENCE_FILTER_MISMATCH;
                    }
                    this.f60379O.put(Integer.valueOf(iRl), l4z);
                }
                afx.n().rl(afx.n.O(iUo, w6Var.n(), this.J2, bloomFilterAz, nVarRl));
            }
        }
    }

    public void xMQ(Z.n nVar) {
        pUk.QJ qjRl = nVar.rl();
        pUk.C cN = nVar.n();
        Iterator it = nVar.nr().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (qjRl != null && qjRl.KN()) {
                n(iIntValue, qjRl);
            } else {
                ck(iIntValue, cN, qjRl);
            }
        }
        Iterator it2 = nVar.t().iterator();
        while (it2.hasNext()) {
            ck(((Integer) it2.next()).intValue(), cN, nVar.rl());
        }
    }
}
