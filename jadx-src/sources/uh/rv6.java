package uh;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.ci;
import gq.C2145p;
import gq.l4Z;
import gq.mz;
import gq.oJ;
import io.grpc.SPz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uh.K;
import uh.Md;
import uh.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class rv6 implements ci.w6 {
    private static final String HI = "rv6";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f74540O;
    private VtZ.aC az;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final gq.g9s f74541n;
    private final com.google.firebase.firestore.remote.ci rl;
    private w6 ty;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f74542t = new HashMap();
    private final Map nr = new HashMap();
    private final LinkedHashSet J2 = new LinkedHashSet();
    private final Map Uo = new HashMap();
    private final Map KN = new HashMap();
    private final C2145p xMQ = new C2145p();
    private final Map mUb = new HashMap();
    private final Lu qie = Lu.n();
    private final Map gh = new HashMap();

    private static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final pUk.C f74544n;
        private boolean rl;

        n(pUk.C c2) {
            this.f74544n = c2;
        }
    }

    interface w6 {
        void n(u uVar);

        void rl(Ln ln2, io.grpc.SPz sPz);

        void t(List list);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74543n;

        static {
            int[] iArr = new int[Z.j.values().length];
            f74543n = iArr;
            try {
                iArr[Z.j.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74543n[Z.j.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void Ik() {
        while (!this.J2.isEmpty() && this.Uo.size() < this.f74540O) {
            Iterator it = this.J2.iterator();
            pUk.C c2 = (pUk.C) it.next();
            it.remove();
            int iT = this.qie.t();
            this.KN.put(Integer.valueOf(iT), new n(c2));
            this.Uo.put(c2, Integer.valueOf(iT));
            this.rl.te(new oJ(Ln.rl(c2.qie()).aYN(), iT, -1L, l4Z.LIMBO_RESOLUTION));
        }
    }

    private void KN(eZ.w6 w6Var, Pe.o oVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f74542t.entrySet().iterator();
        while (it.hasNext()) {
            iwV iwv = (iwV) ((Map.Entry) it.next()).getValue();
            K kT = iwv.t();
            K.n nVarKN = kT.KN(w6Var);
            boolean z2 = false;
            if (nVarKN.rl()) {
                nVarKN = kT.xMQ(this.f74541n.ck(iwv.n(), false).n(), nVarKN);
            }
            Pe.z zVar = oVar == null ? null : (Pe.z) oVar.nr().get(Integer.valueOf(iwv.rl()));
            if (oVar != null && oVar.O().get(Integer.valueOf(iwv.rl())) != null) {
                z2 = true;
            }
            psW pswNr = iwv.t().nr(nVarKN, zVar, z2);
            ViF(pswNr.n(), iwv.rl());
            if (pswNr.rl() != null) {
                arrayList.add(pswNr.rl());
                arrayList2.add(gq.afx.n(iwv.rl(), pswNr.rl()));
            }
        }
        this.ty.t(arrayList);
        this.f74541n.nY(arrayList2);
    }

    private void Uo(String str) {
        wqP.n.t(this.ty != null, "Trying to call %s before setting callback", str);
    }

    private void Z(int i2) {
        if (this.gh.containsKey(Integer.valueOf(i2))) {
            Iterator it = ((List) this.gh.get(Integer.valueOf(i2))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            this.gh.remove(Integer.valueOf(i2));
        }
    }

    private void ck(int i2, io.grpc.SPz sPz) {
        Map map = (Map) this.mUb.get(this.az);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i2);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (sPz != null) {
                    taskCompletionSource.setException(wqP.Z.o(sPz));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    private void mUb() {
        Iterator it = this.gh.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((TaskCompletionSource) it2.next()).setException(new FirebaseFirestoreException("'waitForPendingWrites' task is cancelled due to User change.", FirebaseFirestoreException.j.CANCELLED));
            }
        }
        this.gh.clear();
    }

    private void o(pUk.C c2) {
        this.J2.remove(c2);
        Integer num = (Integer) this.Uo.get(c2);
        if (num != null) {
            this.rl.v(num.intValue());
            this.Uo.remove(c2);
            this.KN.remove(num);
            Ik();
        }
    }

    private Md qie(Ln ln2, int i2, com.google.protobuf.C c2) {
        mz mzVarCk = this.f74541n.ck(ln2, true);
        Md.j jVarMUb = Md.j.NONE;
        if (this.nr.get(Integer.valueOf(i2)) != null) {
            jVarMUb = ((iwV) this.f74542t.get((Ln) ((List) this.nr.get(Integer.valueOf(i2))).get(0))).t().mUb();
        }
        Pe.z zVarN = Pe.z.n(jVarMUb == Md.j.SYNCED, c2);
        K k2 = new K(ln2, mzVarCk.rl());
        psW pswT = k2.t(k2.KN(mzVarCk.n()), zVarN);
        ViF(pswT.n(), i2);
        this.f74542t.put(ln2, new iwV(ln2, i2, k2));
        if (!this.nr.containsKey(Integer.valueOf(i2))) {
            this.nr.put(Integer.valueOf(i2), new ArrayList(1));
        }
        ((List) this.nr.get(Integer.valueOf(i2))).add(ln2);
        return pswT.rl();
    }

    private void r(int i2, io.grpc.SPz sPz) {
        for (Ln ln2 : (List) this.nr.get(Integer.valueOf(i2))) {
            this.f74542t.remove(ln2);
            if (!sPz.HI()) {
                this.ty.rl(ln2, sPz);
                HI(sPz, "Listen for %s failed", ln2);
            }
        }
        this.nr.remove(Integer.valueOf(i2));
        eZ.I28<pUk.C> i28Nr = this.xMQ.nr(i2);
        this.xMQ.KN(i2);
        for (pUk.C c2 : i28Nr) {
            if (!this.xMQ.t(c2)) {
                o(c2);
            }
        }
    }

    @Override // com.google.firebase.firestore.remote.ci.w6
    public void J2(Pe.o oVar) {
        Uo("handleRemoteEvent");
        for (Map.Entry entry : oVar.nr().entrySet()) {
            Integer num = (Integer) entry.getKey();
            Pe.z zVar = (Pe.z) entry.getValue();
            n nVar = (n) this.KN.get(num);
            if (nVar != null) {
                wqP.n.t((zVar.rl().size() + zVar.t().size()) + zVar.nr().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (zVar.rl().size() > 0) {
                    nVar.rl = true;
                } else if (zVar.t().size() > 0) {
                    wqP.n.t(nVar.rl, "Received change for limbo target document without add.", new Object[0]);
                } else if (zVar.nr().size() > 0) {
                    wqP.n.t(nVar.rl, "Received remove for limbo target document without add.", new Object[0]);
                    nVar.rl = false;
                }
            }
        }
        KN(this.f74541n.az(oVar), oVar);
    }

    @Override // com.google.firebase.firestore.remote.ci.w6
    public void O(int i2, io.grpc.SPz sPz) {
        Uo("handleRejectedWrite");
        eZ.w6 w6VarTe = this.f74541n.te(i2);
        if (!w6VarTe.isEmpty()) {
            HI(sPz, "Write failed at %s", ((pUk.C) w6VarTe.J2()).qie());
        }
        ck(i2, sPz);
        Z(i2);
        KN(w6VarTe, null);
    }

    void S(Ln ln2, boolean z2) {
        Uo("stopListening");
        iwV iwv = (iwV) this.f74542t.get(ln2);
        wqP.n.t(iwv != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f74542t.remove(ln2);
        int iRl = iwv.rl();
        List list = (List) this.nr.get(Integer.valueOf(iRl));
        list.remove(ln2);
        if (list.isEmpty()) {
            this.f74541n.iF(iRl);
            if (z2) {
                this.rl.v(iRl);
            }
            r(iRl, io.grpc.SPz.f68184O);
        }
    }

    void WPU(Ln ln2) {
        Uo("stopListeningToRemoteStore");
        iwV iwv = (iwV) this.f74542t.get(ln2);
        wqP.n.t(iwv != null, "Trying to stop listening to a query not found", new Object[0]);
        int iRl = iwv.rl();
        List list = (List) this.nr.get(Integer.valueOf(iRl));
        list.remove(ln2);
        if (list.isEmpty()) {
            this.rl.v(iRl);
        }
    }

    public void XQ(w6 w6Var) {
        this.ty = w6Var;
    }

    public int az(Ln ln2, boolean z2) {
        Uo("listen");
        wqP.n.t(!this.f74542t.containsKey(ln2), "We already listen to query: %s", ln2);
        oJ oJVarQie = this.f74541n.qie(ln2.aYN());
        this.ty.t(Collections.singletonList(qie(ln2, oJVarQie.KN(), oJVarQie.nr())));
        if (z2) {
            this.rl.te(oJVarQie);
        }
        return oJVarQie.KN();
    }

    public void gh(VtZ.aC aCVar) {
        boolean zEquals = this.az.equals(aCVar);
        this.az = aCVar;
        if (!zEquals) {
            mUb();
            KN(this.f74541n.aYN(aCVar), null);
        }
        this.rl.o();
    }

    @Override // com.google.firebase.firestore.remote.ci.w6
    public void n(u uVar) {
        Uo("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f74542t.entrySet().iterator();
        while (it.hasNext()) {
            psW pswO = ((iwV) ((Map.Entry) it.next()).getValue()).t().O(uVar);
            wqP.n.t(pswO.n().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (pswO.rl() != null) {
                arrayList.add(pswO.rl());
            }
        }
        this.ty.t(arrayList);
        this.ty.n(uVar);
    }

    @Override // com.google.firebase.firestore.remote.ci.w6
    public void nr(BC.fuX fux) {
        Uo("handleSuccessfulWrite");
        ck(fux.rl().nr(), null);
        Z(fux.rl().nr());
        KN(this.f74541n.gh(fux), null);
    }

    @Override // com.google.firebase.firestore.remote.ci.w6
    public eZ.I28 rl(int i2) {
        n nVar = (n) this.KN.get(Integer.valueOf(i2));
        if (nVar != null && nVar.rl) {
            return pUk.C.nr().nr(nVar.f74544n);
        }
        eZ.I28 i28Nr = pUk.C.nr();
        if (this.nr.containsKey(Integer.valueOf(i2))) {
            for (Ln ln2 : (List) this.nr.get(Integer.valueOf(i2))) {
                if (this.f74542t.containsKey(ln2)) {
                    i28Nr = i28Nr.Uo(((iwV) this.f74542t.get(ln2)).t().gh());
                }
            }
        }
        return i28Nr;
    }

    @Override // com.google.firebase.firestore.remote.ci.w6
    public void t(int i2, io.grpc.SPz sPz) {
        Uo("handleRejectedListen");
        n nVar = (n) this.KN.get(Integer.valueOf(i2));
        pUk.C c2 = nVar != null ? nVar.f74544n : null;
        if (c2 == null) {
            this.f74541n.iF(i2);
            r(i2, sPz);
            return;
        }
        this.Uo.remove(c2);
        this.KN.remove(Integer.valueOf(i2));
        Ik();
        pUk.UGc uGc = pUk.UGc.f72007t;
        Map mapSingletonMap = Collections.singletonMap(c2, pUk.QJ.Ik(c2, uGc));
        Set setSingleton = Collections.singleton(c2);
        Map map = Collections.EMPTY_MAP;
        J2(new Pe.o(uGc, map, map, mapSingletonMap, setSingleton));
    }

    public void ty(Ln ln2) {
        Uo("listenToRemoteStore");
        wqP.n.t(this.f74542t.containsKey(ln2), "This is the first listen to query: %s", ln2);
        this.rl.te(this.f74541n.qie(ln2.aYN()));
    }

    public rv6(gq.g9s g9sVar, com.google.firebase.firestore.remote.ci ciVar, VtZ.aC aCVar, int i2) {
        this.f74541n = g9sVar;
        this.rl = ciVar;
        this.f74540O = i2;
        this.az = aCVar;
    }

    private void HI(io.grpc.SPz sPz, String str, Object... objArr) {
        if (xMQ(sPz)) {
            wqP.QJ.nr("Firestore", "%s: %s", String.format(str, objArr), sPz);
        }
    }

    private void ViF(List list, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            int i3 = j.f74543n[z2.rl().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    wqP.QJ.n(HI, "Document no longer in limbo: %s", z2.n());
                    pUk.C cN = z2.n();
                    this.xMQ.J2(cN, i2);
                    if (!this.xMQ.t(cN)) {
                        o(cN);
                    }
                } else {
                    throw wqP.n.n("Unknown limbo change type: %s", z2.rl());
                }
            } else {
                this.xMQ.n(z2.n(), i2);
                aYN(z2);
            }
        }
    }

    private void aYN(Z z2) {
        pUk.C cN = z2.n();
        if (!this.Uo.containsKey(cN) && !this.J2.contains(cN)) {
            wqP.QJ.n(HI, "New document in limbo: %s", cN);
            this.J2.add(cN);
            Ik();
        }
    }

    private boolean xMQ(io.grpc.SPz sPz) {
        String strTy;
        SPz.n nVarAz = sPz.az();
        if (sPz.ty() != null) {
            strTy = sPz.ty();
        } else {
            strTy = "";
        }
        if ((nVarAz == SPz.n.FAILED_PRECONDITION && strTy.contains("requires an index")) || nVarAz == SPz.n.PERMISSION_DENIED) {
            return true;
        }
        return false;
    }
}
