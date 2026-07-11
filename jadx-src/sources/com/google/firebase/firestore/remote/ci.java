package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.DAz;
import com.google.firebase.firestore.remote.Ew;
import com.google.firebase.firestore.remote.UGc;
import com.google.firebase.firestore.remote.Z;
import com.google.firebase.firestore.remote.ci;
import com.google.firebase.firestore.remote.nKK;
import com.google.firebase.firestore.remote.qz;
import gq.l4Z;
import gq.oJ;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import uh.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class ci implements Ew.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qz f60430O;
    private final UGc Uo;
    private Ew gh;
    private final DAz mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.Wre f60431n;
    private final Pl nr;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final gq.g9s f60432t;
    private final nKK xMQ;
    private boolean KN = false;
    private final Map J2 = new HashMap();
    private final Deque qie = new ArrayDeque();

    class j implements nKK.j {
        j() {
        }

        @Override // Pe.eO
        public void n(io.grpc.SPz sPz) {
            ci.this.XQ(sPz);
        }

        @Override // com.google.firebase.firestore.remote.nKK.j
        public void nr(pUk.UGc uGc, Z z2) {
            ci.this.Z(uGc, z2);
        }

        @Override // Pe.eO
        public void rl() {
            ci.this.S();
        }
    }

    class n implements DAz.j {
        n() {
        }

        @Override // com.google.firebase.firestore.remote.DAz.j
        public void O(pUk.UGc uGc, List list) {
            ci.this.g(uGc, list);
        }

        @Override // Pe.eO
        public void n(io.grpc.SPz sPz) {
            ci.this.ViF(sPz);
        }

        @Override // Pe.eO
        public void rl() {
            ci.this.mUb.iF();
        }

        @Override // com.google.firebase.firestore.remote.DAz.j
        public void t() {
            ci.this.nY();
        }
    }

    public interface w6 {
        void J2(Pe.o oVar);

        void O(int i2, io.grpc.SPz sPz);

        void n(u uVar);

        void nr(BC.fuX fux);

        eZ.I28 rl(int i2);

        void t(int i2, io.grpc.SPz sPz);
    }

    private void E2() {
        this.KN = false;
        ck();
        this.Uo.KN(u.UNKNOWN);
        this.mUb.qie();
        this.xMQ.qie();
        Ik();
    }

    private void HI() {
        this.gh = null;
    }

    public void Ik() {
        this.KN = true;
        if (ty()) {
            this.mUb.te(this.f60432t.Z());
            if (T()) {
                s7N();
            } else {
                this.Uo.KN(u.UNKNOWN);
            }
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        Iterator it = this.J2.values().iterator();
        while (it.hasNext()) {
            X((oJ) it.next());
        }
    }

    private void X(oJ oJVar) {
        this.gh.HI(oJVar.KN());
        if (!oJVar.nr().isEmpty() || oJVar.J2().compareTo(pUk.UGc.f72007t) > 0) {
            oJVar = oJVar.xMQ(Integer.valueOf(rl(oJVar.KN()).size()));
        }
        this.xMQ.g(oJVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(pUk.UGc uGc, Z z2) {
        this.Uo.KN(u.ONLINE);
        wqP.n.t((this.xMQ == null || this.gh == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z3 = z2 instanceof Z.Ml;
        Z.Ml ml = z3 ? (Z.Ml) z2 : null;
        if (ml != null && ml.rl().equals(Z.I28.Removed) && ml.n() != null) {
            iF(ml);
            return;
        }
        if (z2 instanceof Z.n) {
            this.gh.xMQ((Z.n) z2);
        } else if (z2 instanceof Z.w6) {
            this.gh.mUb((Z.w6) z2);
        } else {
            wqP.n.t(z3, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.gh.gh((Z.Ml) z2);
        }
        if (uGc.equals(pUk.UGc.f72007t) || uGc.compareTo(this.f60432t.o()) < 0) {
            return;
        }
        fD(uGc);
    }

    private void ck() {
        this.xMQ.XQ();
        this.mUb.XQ();
        if (!this.qie.isEmpty()) {
            wqP.QJ.n("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.qie.size()));
            this.qie.clear();
        }
        HI();
    }

    private void e(int i2) {
        this.gh.HI(i2);
        this.xMQ.nY(i2);
    }

    private void fD(pUk.UGc uGc) {
        wqP.n.t(!uGc.equals(pUk.UGc.f72007t), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        Pe.o oVarT = this.gh.t(uGc);
        for (Map.Entry entry : oVarT.nr().entrySet()) {
            Pe.z zVar = (Pe.z) entry.getValue();
            if (!zVar.O().isEmpty()) {
                Integer num = (Integer) entry.getKey();
                num.intValue();
                oJ oJVar = (oJ) this.J2.get(num);
                if (oJVar != null) {
                    this.J2.put(num, oJVar.gh(zVar.O(), uGc));
                }
            }
        }
        for (Map.Entry entry2 : oVarT.O().entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            int iIntValue = num2.intValue();
            oJ oJVar2 = (oJ) this.J2.get(num2);
            if (oJVar2 != null) {
                this.J2.put(num2, oJVar2.gh(com.google.protobuf.C.EMPTY, oJVar2.J2()));
                e(iIntValue);
                X(new oJ(oJVar2.Uo(), iIntValue, oJVar2.O(), (l4Z) entry2.getValue()));
            }
        }
        this.rl.J2(oVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(pUk.UGc uGc, List list) {
        this.rl.nr(BC.fuX.n((BC.CN3) this.qie.poll(), uGc, list, this.mUb.aYN()));
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nY() {
        this.f60432t.fD(this.mUb.aYN());
        Iterator it = this.qie.iterator();
        while (it.hasNext()) {
            this.mUb.fD(((BC.CN3) it.next()).Uo());
        }
    }

    @Override // com.google.firebase.firestore.remote.Ew.w6
    public oJ n(int i2) {
        return (oJ) this.J2.get(Integer.valueOf(i2));
    }

    public void r() {
        int iNr = this.qie.isEmpty() ? -1 : ((BC.CN3) this.qie.getLast()).nr();
        while (true) {
            if (!az()) {
                break;
            }
            BC.CN3 cn3S = this.f60432t.S(iNr);
            if (cn3S != null) {
                qie(cn3S);
                iNr = cn3S.nr();
            } else if (this.qie.size() == 0) {
                this.mUb.HI();
            }
        }
        if (N()) {
            wTp();
        }
    }

    @Override // com.google.firebase.firestore.remote.Ew.w6
    public eZ.I28 rl(int i2) {
        return this.rl.rl(i2);
    }

    public boolean ty() {
        return this.KN;
    }

    public void v(int i2) {
        wqP.n.t(((oJ) this.J2.remove(Integer.valueOf(i2))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i2));
        if (this.xMQ.az()) {
            e(i2);
        }
        if (this.J2.isEmpty()) {
            if (this.xMQ.az()) {
                this.xMQ.HI();
            } else if (ty()) {
                this.Uo.KN(u.UNKNOWN);
            }
        }
    }

    public ci(pUk.Wre wre, final w6 w6Var, gq.g9s g9sVar, Pl pl, final wqP.I28 i28, qz qzVar) {
        this.f60431n = wre;
        this.rl = w6Var;
        this.f60432t = g9sVar;
        this.nr = pl;
        this.f60430O = qzVar;
        Objects.requireNonNull(w6Var);
        this.Uo = new UGc(i28, new UGc.j() { // from class: com.google.firebase.firestore.remote.SPz
            @Override // com.google.firebase.firestore.remote.UGc.j
            public final void n(u uVar) {
                w6Var.n(uVar);
            }
        });
        this.xMQ = pl.n(new j());
        this.mUb = pl.rl(new n());
        qzVar.n(new wqP.C() { // from class: Pe.qz
            @Override // wqP.C
            public final void accept(Object obj) {
                ci.nr(this.f7739n, i28, (qz.j) obj);
            }
        });
    }

    private boolean N() {
        if (ty() && !this.mUb.ty() && !this.qie.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean T() {
        if (ty() && !this.xMQ.ty() && !this.J2.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ViF(io.grpc.SPz sPz) {
        if (sPz.HI()) {
            wqP.n.t(!N(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!sPz.HI() && !this.qie.isEmpty()) {
            if (this.mUb.ViF()) {
                WPU(sPz);
            } else {
                aYN(sPz);
            }
        }
        if (N()) {
            wTp();
        }
    }

    private void WPU(io.grpc.SPz sPz) {
        wqP.n.t(!sPz.HI(), "Handling write error with status OK.", new Object[0]);
        if (Pl.J2(sPz)) {
            BC.CN3 cn3 = (BC.CN3) this.qie.poll();
            this.mUb.qie();
            this.rl.O(cn3.nr(), sPz);
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(io.grpc.SPz sPz) {
        if (sPz.HI()) {
            wqP.n.t(!T(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        HI();
        if (T()) {
            this.Uo.nr(sPz);
            s7N();
        } else {
            this.Uo.KN(u.UNKNOWN);
        }
    }

    private void aYN(io.grpc.SPz sPz) {
        wqP.n.t(!sPz.HI(), "Handling write error with status OK.", new Object[0]);
        if (Pl.O(sPz)) {
            wqP.QJ.n("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", wqP.Z.WPU(this.mUb.aYN()), sPz);
            DAz dAz = this.mUb;
            com.google.protobuf.C c2 = DAz.f60374S;
            dAz.te(c2);
            this.f60432t.fD(c2);
        }
    }

    private boolean az() {
        if (ty() && this.qie.size() < 10) {
            return true;
        }
        return false;
    }

    private void iF(Z.Ml ml) {
        boolean z2;
        if (ml.n() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Processing target error without a cause", new Object[0]);
        for (Integer num : ml.nr()) {
            if (this.J2.containsKey(num)) {
                this.J2.remove(num);
                this.gh.Ik(num.intValue());
                this.rl.t(num.intValue(), ml.n());
            }
        }
    }

    public static /* synthetic */ void nr(final ci ciVar, wqP.I28 i28, final qz.j jVar) {
        ciVar.getClass();
        i28.xMQ(new Runnable() { // from class: Pe.Pl
            @Override // java.lang.Runnable
            public final void run() {
                ci.t(this.f7719n, jVar);
            }
        });
    }

    private void qie(BC.CN3 cn3) {
        wqP.n.t(az(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.qie.add(cn3);
        if (this.mUb.az() && this.mUb.ViF()) {
            this.mUb.fD(cn3.Uo());
        }
    }

    private void s7N() {
        wqP.n.t(T(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.gh = new Ew(this.f60431n, this);
        this.xMQ.Z();
        this.Uo.O();
    }

    public static /* synthetic */ void t(ci ciVar, qz.j jVar) {
        ciVar.getClass();
        if (!jVar.equals(qz.j.REACHABLE) || !ciVar.Uo.t().equals(u.ONLINE)) {
            if ((jVar.equals(qz.j.UNREACHABLE) && ciVar.Uo.t().equals(u.OFFLINE)) || !ciVar.ty()) {
                return;
            }
            wqP.QJ.n("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            ciVar.E2();
        }
    }

    private void wTp() {
        wqP.n.t(N(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.mUb.Z();
    }

    public void nHg() {
        Ik();
    }

    public void o() {
        if (ty()) {
            wqP.QJ.n("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            E2();
        }
    }

    public void te(oJ oJVar) {
        Integer numValueOf = Integer.valueOf(oJVar.KN());
        if (!this.J2.containsKey(numValueOf)) {
            this.J2.put(numValueOf, oJVar);
            if (T()) {
                s7N();
            } else if (this.xMQ.az()) {
                X(oJVar);
            }
        }
    }
}
