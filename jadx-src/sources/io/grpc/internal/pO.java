package io.grpc.internal;

import JP.M;
import JP.Ml;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import io.grpc.internal.aC;
import io.grpc.internal.l3D;
import io.grpc.internal.o7q;
import io.grpc.internal.s4;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class pO implements JP.g9s, i {
    private volatile List HI;
    private final C2369c Ik;
    private final s4 J2;
    private final JP.Q KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final aC f68647O;
    private final ScheduledExecutorService Uo;
    private Q WPU;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private o7q f68649Z;
    private volatile o7q aYN;
    private final JP.M az;
    private io.grpc.internal.aC ck;
    private final JP.Ml gh;
    private final eO mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.afx f68650n;
    private io.grpc.SPz nY;
    private final aC.j nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private M.Ml f68651o;
    private final List qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private M.Ml f68652r;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f68653t;
    private final C ty;
    private final Pl xMQ;
    private final Collection XQ = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final iF f68648S = new j();
    private volatile JP.Pl ViF = JP.Pl.n(JP.qz.IDLE);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class C {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f68654n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f68655t;

        public void J2() {
            this.rl = 0;
            this.f68655t = 0;
        }

        public boolean Uo(SocketAddress socketAddress) {
            for (int i2 = 0; i2 < this.f68654n.size(); i2++) {
                int iIndexOf = ((io.grpc.I28) this.f68654n.get(i2)).n().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.rl = i2;
                    this.f68655t = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void KN(List list) {
            this.f68654n = list;
            J2();
        }

        public boolean O() {
            return this.rl < this.f68654n.size();
        }

        public SocketAddress n() {
            return (SocketAddress) ((io.grpc.I28) this.f68654n.get(this.rl)).n().get(this.f68655t);
        }

        public boolean nr() {
            return this.rl == 0 && this.f68655t == 0;
        }

        public io.grpc.j rl() {
            return ((io.grpc.I28) this.f68654n.get(this.rl)).rl();
        }

        public void t() {
            io.grpc.I28 i28 = (io.grpc.I28) this.f68654n.get(this.rl);
            int i2 = this.f68655t + 1;
            this.f68655t = i2;
            if (i2 >= i28.n().size()) {
                this.rl++;
                this.f68655t = 0;
            }
        }

        public C(List list) {
            this.f68654n = list;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class CN3 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Q f68657n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f68658t;

        CN3(Q q2, boolean z2) {
            this.f68657n = q2;
            this.f68658t = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            pO.this.f68648S.O(this.f68657n, this.f68658t);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class Dsr extends iwV {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Q f68659n;
        private final Pl rl;

        class j extends Ln {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ QJ f68660n;

            /* JADX INFO: renamed from: io.grpc.internal.pO$Dsr$j$j, reason: collision with other inner class name */
            class C0975j extends lej {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ l3D f68661n;

                C0975j(l3D l3d) {
                    this.f68661n = l3d;
                }

                @Override // io.grpc.internal.lej
                protected l3D O() {
                    return this.f68661n;
                }

                @Override // io.grpc.internal.lej, io.grpc.internal.l3D
                public void nr(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
                    Dsr.this.rl.n(sPz.HI());
                    super.nr(sPz, jVar, qj);
                }
            }

            j(QJ qj) {
                this.f68660n = qj;
            }

            @Override // io.grpc.internal.Ln
            protected QJ J2() {
                return this.f68660n;
            }

            @Override // io.grpc.internal.Ln, io.grpc.internal.QJ
            public void ck(l3D l3d) {
                Dsr.this.rl.rl();
                super.ck(new C0975j(l3d));
            }
        }

        /* synthetic */ Dsr(Q q2, Pl pl, j jVar) {
            this(q2, pl);
        }

        private Dsr(Q q2, Pl pl) {
            this.f68659n = q2;
            this.rl = pl;
        }

        @Override // io.grpc.internal.iwV
        protected Q n() {
            return this.f68659n;
        }

        @Override // io.grpc.internal.iwV, io.grpc.internal.InterfaceC2171c
        public QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
            return new j(super.t(dAz, qj, nVar, w6VarArr));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class I28 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.SPz f68662n;

        I28(io.grpc.SPz sPz) {
            this.f68662n = sPz;
        }

        @Override // java.lang.Runnable
        public void run() {
            JP.qz qzVarT = pO.this.ViF.t();
            JP.qz qzVar = JP.qz.SHUTDOWN;
            if (qzVarT == qzVar) {
                return;
            }
            pO.this.nY = this.f68662n;
            o7q o7qVar = pO.this.aYN;
            Q q2 = pO.this.WPU;
            pO.this.aYN = null;
            pO.this.WPU = null;
            pO.this.bzg(qzVar);
            pO.this.ty.J2();
            if (pO.this.XQ.isEmpty()) {
                pO.this.jB();
            }
            pO.this.v();
            if (pO.this.f68651o != null) {
                pO.this.f68651o.n();
                pO.this.f68649Z.J2(this.f68662n);
                pO.this.f68651o = null;
                pO.this.f68649Z = null;
            }
            if (o7qVar != null) {
                o7qVar.J2(this.f68662n);
            }
            if (q2 != null) {
                q2.J2(this.f68662n);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class Ml implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f68664n;

        class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o7q o7qVar = pO.this.f68649Z;
                pO.this.f68651o = null;
                pO.this.f68649Z = null;
                o7qVar.J2(io.grpc.SPz.f68186Z.Ik("InternalSubchannel closed transport due to address change"));
            }
        }

        Ml(List list) {
            this.f68664n = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            o7q o7qVar;
            SocketAddress socketAddressN = pO.this.ty.n();
            pO.this.ty.KN(this.f68664n);
            pO.this.HI = this.f68664n;
            JP.qz qzVarT = pO.this.ViF.t();
            JP.qz qzVar = JP.qz.READY;
            if ((qzVarT != qzVar && pO.this.ViF.t() != JP.qz.CONNECTING) || pO.this.ty.Uo(socketAddressN)) {
                o7qVar = null;
            } else if (pO.this.ViF.t() == qzVar) {
                o7qVar = pO.this.aYN;
                pO.this.aYN = null;
                pO.this.ty.J2();
                pO.this.bzg(JP.qz.IDLE);
            } else {
                pO.this.WPU.J2(io.grpc.SPz.f68186Z.Ik("InternalSubchannel closed pending transport due to address change"));
                pO.this.WPU = null;
                pO.this.ty.J2();
                pO.this.p5();
                o7qVar = null;
            }
            if (o7qVar != null) {
                if (pO.this.f68651o != null) {
                    pO.this.f68649Z.J2(io.grpc.SPz.f68186Z.Ik("InternalSubchannel closed transport early due to address change"));
                    pO.this.f68651o.n();
                    pO.this.f68651o = null;
                    pO.this.f68649Z = null;
                }
                pO.this.f68649Z = o7qVar;
                pO pOVar = pO.this;
                pOVar.f68651o = pOVar.az.t(new j(), 5L, TimeUnit.SECONDS, pO.this.Uo);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class Wre implements Runnable {
        Wre() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pO.this.gh.n(Ml.j.INFO, "Terminated");
            pO.this.f68647O.nr(pO.this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class fuX implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.SPz f68668n;

        fuX(io.grpc.SPz sPz) {
            this.f68668n = sPz;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(pO.this.XQ).iterator();
            while (it.hasNext()) {
                ((o7q) it.next()).rl(this.f68668n);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class j extends iF {
        j() {
        }

        @Override // io.grpc.internal.iF
        protected void rl() {
            pO.this.f68647O.n(pO.this);
        }

        @Override // io.grpc.internal.iF
        protected void t() {
            pO.this.f68647O.rl(pO.this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pO.this.f68652r = null;
            pO.this.gh.n(Ml.j.INFO, "CONNECTING after backoff");
            pO.this.bzg(JP.qz.CONNECTING);
            pO.this.p5();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private class o implements o7q.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Q f68671n;
        boolean rl = false;

        class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                pO.this.ck = null;
                if (pO.this.nY != null) {
                    t1.Xo.S(pO.this.aYN == null, "Unexpected non-null activeTransport");
                    o oVar = o.this;
                    oVar.f68671n.J2(pO.this.nY);
                    return;
                }
                Q q2 = pO.this.WPU;
                o oVar2 = o.this;
                Q q3 = oVar2.f68671n;
                if (q2 == q3) {
                    pO.this.aYN = q3;
                    pO.this.WPU = null;
                    pO.this.bzg(JP.qz.READY);
                }
            }
        }

        class n implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68674n;

            n(io.grpc.SPz sPz) {
                this.f68674n = sPz;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (pO.this.ViF.t() == JP.qz.SHUTDOWN) {
                    return;
                }
                o7q o7qVar = pO.this.aYN;
                o oVar = o.this;
                if (o7qVar == oVar.f68671n) {
                    pO.this.aYN = null;
                    pO.this.ty.J2();
                    pO.this.bzg(JP.qz.IDLE);
                    return;
                }
                Q q2 = pO.this.WPU;
                o oVar2 = o.this;
                if (q2 == oVar2.f68671n) {
                    t1.Xo.aYN(pO.this.ViF.t() == JP.qz.CONNECTING, "Expected state is CONNECTING, actual state is %s", pO.this.ViF.t());
                    pO.this.ty.t();
                    if (pO.this.ty.O()) {
                        pO.this.p5();
                        return;
                    }
                    pO.this.WPU = null;
                    pO.this.ty.J2();
                    pO.this.M7(this.f68674n);
                }
            }
        }

        class w6 implements Runnable {
            w6() {
            }

            @Override // java.lang.Runnable
            public void run() {
                pO.this.XQ.remove(o.this.f68671n);
                if (pO.this.ViF.t() == JP.qz.SHUTDOWN && pO.this.XQ.isEmpty()) {
                    pO.this.jB();
                }
            }
        }

        o(Q q2) {
            this.f68671n = q2;
        }

        @Override // io.grpc.internal.o7q.j
        public void O() {
            t1.Xo.S(this.rl, "transportShutdown() must be called before transportTerminated().");
            pO.this.gh.rl(Ml.j.INFO, "{0} Terminated", this.f68671n.nr());
            pO.this.KN.xMQ(this.f68671n);
            pO.this.U(this.f68671n, false);
            Iterator it = pO.this.qie.iterator();
            if (!it.hasNext()) {
                pO.this.az.execute(new w6());
            } else {
                android.support.v4.media.j.n(it.next());
                this.f68671n.xMQ();
                throw null;
            }
        }

        @Override // io.grpc.internal.o7q.j
        public void n(io.grpc.SPz sPz) {
            pO.this.gh.rl(Ml.j.INFO, "{0} SHUTDOWN with {1}", this.f68671n.nr(), pO.this.P5(sPz));
            this.rl = true;
            pO.this.az.execute(new n(sPz));
        }

        @Override // io.grpc.internal.o7q.j
        public io.grpc.j nr(io.grpc.j jVar) {
            Iterator it = pO.this.qie.iterator();
            if (!it.hasNext()) {
                return jVar;
            }
            android.support.v4.media.j.n(it.next());
            throw null;
        }

        @Override // io.grpc.internal.o7q.j
        public void rl() {
            pO.this.gh.n(Ml.j.INFO, "READY");
            pO.this.az.execute(new j());
        }

        @Override // io.grpc.internal.o7q.j
        public void t(boolean z2) {
            pO.this.U(this.f68671n, z2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class qz extends JP.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        JP.afx f68677n;

        @Override // JP.Ml
        public void n(Ml.j jVar, String str) {
            Xo.nr(this.f68677n, jVar, str);
        }

        @Override // JP.Ml
        public void rl(Ml.j jVar, String str, Object... objArr) {
            Xo.O(this.f68677n, jVar, str, objArr);
        }

        qz() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class w6 implements Runnable {
        w6() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (pO.this.ViF.t() == JP.qz.IDLE) {
                pO.this.gh.n(Ml.j.INFO, "CONNECTING as requested");
                pO.this.bzg(JP.qz.CONNECTING);
                pO.this.p5();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static abstract class aC {
        abstract void n(pO pOVar);

        abstract void nr(pO pOVar);

        abstract void rl(pO pOVar);

        abstract void t(pO pOVar, JP.Pl pl);

        aC() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M7(io.grpc.SPz sPz) {
        this.az.O();
        Xw(JP.Pl.rl(sPz));
        if (this.ck == null) {
            this.ck = this.nr.get();
        }
        long jN = this.ck.n();
        C2369c c2369c = this.Ik;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jNr = jN - c2369c.nr(timeUnit);
        this.gh.rl(Ml.j.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", P5(sPz), Long.valueOf(jNr));
        t1.Xo.S(this.f68652r == null, "previous reconnectTask is not done");
        this.f68652r = this.az.t(new n(), jNr, timeUnit, this.Uo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String P5(io.grpc.SPz sPz) {
        StringBuilder sb = new StringBuilder();
        sb.append(sPz.az());
        if (sPz.ty() != null) {
            sb.append("(");
            sb.append(sPz.ty());
            sb.append(")");
        }
        if (sPz.qie() != null) {
            sb.append("[");
            sb.append(sPz.qie());
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(Q q2, boolean z2) {
        this.az.execute(new CN3(q2, z2));
    }

    private void Xw(JP.Pl pl) {
        this.az.O();
        if (this.ViF.t() != pl.t()) {
            t1.Xo.S(this.ViF.t() != JP.qz.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + pl);
            this.ViF = pl;
            this.f68647O.t(this, pl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bzg(JP.qz qzVar) {
        this.az.O();
        Xw(JP.Pl.n(qzVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jB() {
        this.az.execute(new Wre());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p5() {
        SocketAddress socketAddressT;
        JP.UGc uGc;
        this.az.O();
        t1.Xo.S(this.f68652r == null, "Should have no reconnectTask scheduled");
        if (this.ty.nr()) {
            this.Ik.J2().Uo();
        }
        SocketAddress socketAddressN = this.ty.n();
        j jVar = null;
        if (socketAddressN instanceof JP.UGc) {
            uGc = (JP.UGc) socketAddressN;
            socketAddressT = uGc.t();
        } else {
            socketAddressT = socketAddressN;
            uGc = null;
        }
        io.grpc.j jVarRl = this.ty.rl();
        String str = (String) jVarRl.rl(io.grpc.I28.nr);
        s4.j jVar2 = new s4.j();
        if (str == null) {
            str = this.rl;
        }
        s4.j jVarUo = jVar2.O(str).J2(jVarRl).KN(this.f68653t).Uo(uGc);
        qz qzVar = new qz();
        qzVar.f68677n = nr();
        Dsr dsr = new Dsr(this.J2.s7N(socketAddressT, jVarUo, qzVar), this.xMQ, jVar);
        qzVar.f68677n = dsr.nr();
        this.KN.t(dsr);
        this.WPU = dsr;
        this.XQ.add(dsr);
        Runnable runnableUo = dsr.Uo(new o(dsr));
        if (runnableUo != null) {
            this.az.rl(runnableUo);
        }
        this.gh.rl(Ml.j.INFO, "Started transport {0}", qzVar.f68677n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.az.O();
        M.Ml ml = this.f68652r;
        if (ml != null) {
            ml.n();
            this.f68652r = null;
            this.ck = null;
        }
    }

    public void J2(io.grpc.SPz sPz) {
        this.az.execute(new I28(sPz));
    }

    public void eF(List list) {
        t1.Xo.ck(list, "newAddressGroups");
        rV9(list, "newAddressGroups contains null entry");
        t1.Xo.O(!list.isEmpty(), "newAddressGroups is empty");
        this.az.execute(new Ml(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.i
    public InterfaceC2171c n() {
        o7q o7qVar = this.aYN;
        if (o7qVar != null) {
            return o7qVar;
        }
        this.az.execute(new w6());
        return null;
    }

    @Override // JP.Z
    public JP.afx nr() {
        return this.f68650n;
    }

    pO(List list, String str, String str2, aC.j jVar, s4 s4Var, ScheduledExecutorService scheduledExecutorService, t1.UGc uGc, JP.M m2, aC aCVar, JP.Q q2, Pl pl, eO eOVar, JP.afx afxVar, JP.Ml ml, List list2) {
        t1.Xo.ck(list, "addressGroups");
        t1.Xo.O(!list.isEmpty(), YjqZUJsVmhcjko.bgGBYwWuONVet);
        rV9(list, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.HI = listUnmodifiableList;
        this.ty = new C(listUnmodifiableList);
        this.rl = str;
        this.f68653t = str2;
        this.nr = jVar;
        this.J2 = s4Var;
        this.Uo = scheduledExecutorService;
        this.Ik = (C2369c) uGc.get();
        this.az = m2;
        this.f68647O = aCVar;
        this.KN = q2;
        this.xMQ = pl;
        this.mUb = (eO) t1.Xo.ck(eOVar, "channelTracer");
        this.f68650n = (JP.afx) t1.Xo.ck(afxVar, "logId");
        this.gh = (JP.Ml) t1.Xo.ck(ml, "channelLogger");
        this.qie = list2;
    }

    private static void rV9(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t1.Xo.ck(it.next(), str);
        }
    }

    void rl(io.grpc.SPz sPz) {
        J2(sPz);
        this.az.execute(new fuX(sPz));
    }

    public String toString() {
        return t1.Dsr.t(this).t("logId", this.f68650n.nr()).nr("addressGroups", this.HI).toString();
    }
}
