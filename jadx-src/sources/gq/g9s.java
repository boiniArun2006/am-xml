package gq;

import android.util.SparseArray;
import gq.C2147u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class g9s {
    private static final long HI = TimeUnit.MINUTES.toSeconds(5);
    private final O J2;
    private final Sis KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private InterfaceC2143n f67776O;
    private Xo Uo;
    private final Map az;
    private final gq.j gh;
    private final tpM mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final yg f67777n;
    private P nr;
    private final SparseArray qie;
    private CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private qz f67778t;
    private final uh.Lu ty;
    private final C2145p xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        oJ f67779n;
        int rl;

        private n() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f67780n;
        private final Set rl;

        private w6(Map map, Set set) {
            this.f67780n = map;
            this.rl = set;
        }
    }

    private void T() {
        this.f67777n.qie("Start MutationQueue", new Runnable() { // from class: gq.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f67761n.nr.start();
            }
        });
    }

    public static /* synthetic */ void Uo(g9s g9sVar, n nVar, uh.vd vdVar) {
        int iT = g9sVar.ty.t();
        nVar.rl = iT;
        oJ oJVar = new oJ(vdVar, iT, g9sVar.f67777n.Uo().J2(), l4Z.LISTEN);
        nVar.f67779n = oJVar;
        g9sVar.mUb.nr(oJVar);
    }

    private void ViF(VtZ.aC aCVar) {
        qz qzVarNr = this.f67777n.nr(aCVar);
        this.f67778t = qzVarNr;
        this.nr = this.f67777n.O(aCVar, qzVarNr);
        InterfaceC2143n interfaceC2143nRl = this.f67777n.rl(aCVar);
        this.f67776O = interfaceC2143nRl;
        this.Uo = new Xo(this.J2, this.nr, interfaceC2143nRl, this.f67778t);
        this.J2.t(this.f67778t);
        this.KN.J2(this.Uo, this.f67778t);
    }

    private void X() {
        this.f67777n.qie("Start IndexManager", new Runnable() { // from class: gq.l3D
            @Override // java.lang.Runnable
            public final void run() {
                this.f67794n.f67778t.start();
            }
        });
    }

    private w6 g(Map map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map mapRl = this.J2.rl(map.keySet());
        for (Map.Entry entry : map.entrySet()) {
            pUk.C c2 = (pUk.C) entry.getKey();
            pUk.QJ qj = (pUk.QJ) entry.getValue();
            pUk.QJ qj2 = (pUk.QJ) mapRl.get(c2);
            if (qj.KN() != qj2.KN()) {
                hashSet.add(c2);
            }
            if (qj.J2() && qj.getVersion().equals(pUk.UGc.f72007t)) {
                arrayList.add(qj.getKey());
                map2.put(c2, qj);
            } else if (!qj2.ty() || qj.getVersion().compareTo(qj2.getVersion()) > 0 || (qj.getVersion().compareTo(qj2.getVersion()) == 0 && qj2.O())) {
                wqP.n.t(!pUk.UGc.f72007t.equals(qj.mUb()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.J2.n(qj, qj.mUb());
                map2.put(c2, qj);
            } else {
                wqP.QJ.n("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", c2, qj2.getVersion(), qj.getVersion());
            }
        }
        this.J2.removeAll(arrayList);
        return new w6(map2, hashSet);
    }

    public static /* synthetic */ eZ.w6 n(g9s g9sVar, int i2) {
        BC.CN3 cn3Nr = g9sVar.nr.nr(i2);
        wqP.n.t(cn3Nr != null, "Attempt to reject nonexistent batch!", new Object[0]);
        g9sVar.nr.J2(cn3Nr);
        g9sVar.nr.n();
        g9sVar.f67776O.n(i2);
        g9sVar.Uo.ty(cn3Nr.O());
        return g9sVar.Uo.nr(cn3Nr.O());
    }

    private Set r(BC.fuX fux) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < fux.O().size(); i2++) {
            if (!((BC.Dsr) fux.O().get(i2)).n().isEmpty()) {
                hashSet.add(((BC.Wre) fux.rl().Uo().get(i2)).J2());
            }
        }
        return hashSet;
    }

    public static /* synthetic */ void rl(g9s g9sVar, int i2) {
        oJ oJVar = (oJ) g9sVar.qie.get(i2);
        wqP.n.t(oJVar != null, "Tried to release nonexistent target: %s", Integer.valueOf(i2));
        Iterator it = g9sVar.xMQ.KN(i2).iterator();
        while (it.hasNext()) {
            g9sVar.f67777n.Uo().rl((pUk.C) it.next());
        }
        g9sVar.f67777n.Uo().xMQ(oJVar);
        g9sVar.qie.remove(i2);
        g9sVar.az.remove(oJVar.Uo());
    }

    public C2147u.w6 HI(final C2147u c2147u) {
        return (C2147u.w6) this.f67777n.gh("Collect garbage", new wqP.s4() { // from class: gq.s4
            @Override // wqP.s4
            public final Object get() {
                return c2147u.J2(this.f67849n.qie);
            }
        });
    }

    public qz Ik() {
        return this.f67778t;
    }

    public BC.CN3 S(int i2) {
        return this.nr.t(i2);
    }

    oJ WPU(uh.vd vdVar) {
        Integer num = (Integer) this.az.get(vdVar);
        return num != null ? (oJ) this.qie.get(num.intValue()) : this.mUb.t(vdVar);
    }

    public Xo XQ() {
        return this.Uo;
    }

    public com.google.protobuf.C Z() {
        return this.nr.O();
    }

    public eZ.w6 aYN(VtZ.aC aCVar) {
        List listXMQ = this.nr.xMQ();
        ViF(aCVar);
        X();
        T();
        List listXMQ2 = this.nr.xMQ();
        eZ.I28 i28Nr = pUk.C.nr();
        Iterator it = Arrays.asList(listXMQ, listXMQ2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((BC.CN3) it2.next()).Uo().iterator();
                while (it3.hasNext()) {
                    i28Nr = i28Nr.nr(((BC.Wre) it3.next()).J2());
                }
            }
        }
        return this.Uo.nr(i28Nr);
    }

    public void e() {
        this.f67777n.J2().run();
        X();
        T();
    }

    public void fD(final com.google.protobuf.C c2) {
        this.f67777n.qie("Set stream token", new Runnable() { // from class: gq.UGc
            @Override // java.lang.Runnable
            public final void run() {
                this.f67741n.nr.Uo(c2);
            }
        });
    }

    public eZ.w6 gh(final BC.fuX fux) {
        return (eZ.w6) this.f67777n.gh("Acknowledge batch", new wqP.s4() { // from class: gq.QJ
            @Override // wqP.s4
            public final Object get() {
                return g9s.J2(this.f67724n, fux);
            }
        });
    }

    public void iF(final int i2) {
        this.f67777n.qie("Release target", new Runnable() { // from class: gq.Q
            @Override // java.lang.Runnable
            public final void run() {
                g9s.rl(this.f67722n, i2);
            }
        });
    }

    public void nY(final List list) {
        this.f67777n.qie("notifyLocalViewChanges", new Runnable() { // from class: gq.ci
            @Override // java.lang.Runnable
            public final void run() {
                g9s.t(this.f67766n, list);
            }
        });
    }

    public pUk.UGc o() {
        return this.mUb.Uo();
    }

    public oJ qie(final uh.vd vdVar) {
        int iKN;
        oJ oJVarT = this.mUb.t(vdVar);
        if (oJVarT != null) {
            iKN = oJVarT.KN();
        } else {
            final n nVar = new n();
            this.f67777n.qie("Allocate target", new Runnable() { // from class: gq.r
                @Override // java.lang.Runnable
                public final void run() {
                    g9s.Uo(this.f67840n, nVar, vdVar);
                }
            });
            iKN = nVar.rl;
            oJVarT = nVar.f67779n;
        }
        if (this.qie.get(iKN) == null) {
            this.qie.put(iKN, oJVarT);
            this.az.put(vdVar, Integer.valueOf(iKN));
        }
        return oJVarT;
    }

    public eZ.w6 te(final int i2) {
        return (eZ.w6) this.f67777n.gh("Reject batch", new wqP.s4() { // from class: gq.SPz
            @Override // wqP.s4
            public final Object get() {
                return g9s.n(this.f67732n, i2);
            }
        });
    }

    public g9s(yg ygVar, Sis sis, VtZ.aC aCVar) {
        wqP.n.t(ygVar.mUb(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f67777n = ygVar;
        this.KN = sis;
        this.rl = ygVar.t();
        tpM tpmXMQ = ygVar.xMQ();
        this.mUb = tpmXMQ;
        this.gh = ygVar.n();
        this.ty = uh.Lu.rl(tpmXMQ.O());
        this.J2 = ygVar.KN();
        C2145p c2145p = new C2145p();
        this.xMQ = c2145p;
        this.qie = new SparseArray();
        this.az = new HashMap();
        ygVar.Uo().ty(c2145p);
        ViF(aCVar);
    }

    private static boolean E2(oJ oJVar, oJ oJVar2, Pe.z zVar) {
        if (oJVar.nr().isEmpty()) {
            return true;
        }
        long seconds = oJVar2.J2().rl().getSeconds() - oJVar.J2().rl().getSeconds();
        long j2 = HI;
        if (seconds >= j2 || oJVar2.rl().rl().getSeconds() - oJVar.rl().rl().getSeconds() >= j2) {
            return true;
        }
        if (zVar != null && zVar.rl().size() + zVar.t().size() + zVar.nr().size() > 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ eZ.w6 J2(g9s g9sVar, BC.fuX fux) {
        g9sVar.getClass();
        BC.CN3 cn3Rl = fux.rl();
        g9sVar.nr.KN(cn3Rl, fux.J2());
        g9sVar.ty(fux);
        g9sVar.nr.n();
        g9sVar.f67776O.n(fux.rl().nr());
        g9sVar.Uo.ty(g9sVar.r(fux));
        return g9sVar.Uo.nr(cn3Rl.O());
    }

    public static /* synthetic */ eZ.w6 O(g9s g9sVar, Pe.o oVar, pUk.UGc uGc) {
        boolean z2;
        g9sVar.getClass();
        Map mapNr = oVar.nr();
        long jJ2 = g9sVar.f67777n.Uo().J2();
        for (Map.Entry entry : mapNr.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            Pe.z zVar = (Pe.z) entry.getValue();
            oJ oJVar = (oJ) g9sVar.qie.get(iIntValue);
            if (oJVar != null) {
                g9sVar.mUb.KN(zVar.nr(), iIntValue);
                g9sVar.mUb.xMQ(zVar.rl(), iIntValue);
                oJ oJVarQie = oJVar.qie(jJ2);
                if (oVar.O().containsKey(num)) {
                    com.google.protobuf.C c2 = com.google.protobuf.C.EMPTY;
                    pUk.UGc uGc2 = pUk.UGc.f72007t;
                    oJVarQie = oJVarQie.gh(c2, uGc2).mUb(uGc2);
                } else if (!zVar.O().isEmpty()) {
                    oJVarQie = oJVarQie.gh(zVar.O(), oVar.t());
                }
                g9sVar.qie.put(iIntValue, oJVarQie);
                if (E2(oJVar, oJVarQie, zVar)) {
                    g9sVar.mUb.n(oJVarQie);
                }
            }
        }
        Map mapN = oVar.n();
        Set setRl = oVar.rl();
        for (pUk.C c4 : mapN.keySet()) {
            if (setRl.contains(c4)) {
                g9sVar.f67777n.Uo().KN(c4);
            }
        }
        w6 w6VarG = g9sVar.g(mapN);
        Map map = w6VarG.f67780n;
        pUk.UGc uGcUo = g9sVar.mUb.Uo();
        if (!uGc.equals(pUk.UGc.f72007t)) {
            if (uGc.compareTo(uGcUo) >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            wqP.n.t(z2, "Watch stream reverted to previous snapshot?? (%s < %s)", uGc, uGcUo);
            g9sVar.mUb.rl(uGc);
        }
        return g9sVar.Uo.mUb(map, w6VarG.rl);
    }

    public static /* synthetic */ void t(g9s g9sVar, List list) {
        boolean z2;
        g9sVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            afx afxVar = (afx) it.next();
            int iNr = afxVar.nr();
            g9sVar.xMQ.rl(afxVar.rl(), iNr);
            eZ.I28 i28T = afxVar.t();
            Iterator it2 = i28T.iterator();
            while (it2.hasNext()) {
                g9sVar.f67777n.Uo().rl((pUk.C) it2.next());
            }
            g9sVar.xMQ.Uo(i28T, iNr);
            if (!afxVar.O()) {
                oJ oJVar = (oJ) g9sVar.qie.get(iNr);
                if (oJVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wqP.n.t(z2, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(iNr));
                oJ oJVarMUb = oJVar.mUb(oJVar.J2());
                g9sVar.qie.put(iNr, oJVarMUb);
                if (E2(oJVar, oJVarMUb, null)) {
                    g9sVar.mUb.n(oJVarMUb);
                }
            }
        }
    }

    private void ty(BC.fuX fux) {
        boolean z2;
        BC.CN3 cn3Rl = fux.rl();
        for (pUk.C c2 : cn3Rl.O()) {
            pUk.QJ qjNr = this.J2.nr(c2);
            pUk.UGc uGc = (pUk.UGc) fux.nr().t(c2);
            if (uGc != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            wqP.n.t(z2, "docVersions should contain every doc in the write.", new Object[0]);
            if (qjNr.getVersion().compareTo(uGc) < 0) {
                cn3Rl.rl(qjNr, fux);
                if (qjNr.ty()) {
                    this.J2.n(qjNr, fux.t());
                }
            }
        }
        this.nr.J2(cn3Rl);
    }

    public eZ.w6 az(final Pe.o oVar) {
        final pUk.UGc uGcT = oVar.t();
        return (eZ.w6) this.f67777n.gh("Apply remote event", new wqP.s4() { // from class: gq.z
            @Override // wqP.s4
            public final Object get() {
                return g9s.O(this.f67871n, oVar, uGcT);
            }
        });
    }

    public mz ck(uh.Ln ln2, boolean z2) {
        eZ.I28 i28J2;
        pUk.UGc uGcRl;
        oJ oJVarWPU = WPU(ln2.aYN());
        pUk.UGc uGc = pUk.UGc.f72007t;
        eZ.I28 i28Nr = pUk.C.nr();
        if (oJVarWPU != null) {
            uGcRl = oJVarWPU.rl();
            i28J2 = this.mUb.J2(oJVarWPU.KN());
        } else {
            i28J2 = i28Nr;
            uGcRl = uGc;
        }
        Sis sis = this.KN;
        if (z2) {
            uGc = uGcRl;
        }
        return new mz(sis.O(ln2, uGc, i28J2), i28J2);
    }
}
