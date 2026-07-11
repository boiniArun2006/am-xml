package io.grpc.internal;

import io.grpc.Pl;
import io.grpc.internal.l3D;
import io.grpc.internal.o7q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class afx implements o7q {
    private Runnable J2;
    private o7q.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Runnable f68448O;
    private Runnable Uo;
    private Pl.aC gh;
    private io.grpc.SPz mUb;
    private final JP.M nr;
    private long qie;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f68450t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.afx f68449n = JP.afx.n(afx.class, null);
    private final Object rl = new Object();
    private Collection xMQ = new LinkedHashSet();

    private class I28 extends Z {
        private final JP.Xo gh;
        private final Pl.CN3 mUb;
        private final io.grpc.w6[] qie;

        /* synthetic */ I28(afx afxVar, Pl.CN3 cn3, io.grpc.w6[] w6VarArr, j jVar) {
            this(cn3, w6VarArr);
        }

        private I28(Pl.CN3 cn3, io.grpc.w6[] w6VarArr) {
            this.gh = JP.Xo.O();
            this.mUb = cn3;
            this.qie = w6VarArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable g(InterfaceC2171c interfaceC2171c) {
            JP.Xo xoRl = this.gh.rl();
            try {
                QJ qjT = interfaceC2171c.t(this.mUb.t(), this.mUb.rl(), this.mUb.n(), this.qie);
                this.gh.J2(xoRl);
                return WPU(qjT);
            } catch (Throwable th) {
                this.gh.J2(xoRl);
                throw th;
            }
        }

        @Override // io.grpc.internal.Z
        protected void XQ(io.grpc.SPz sPz) {
            for (io.grpc.w6 w6Var : this.qie) {
                w6Var.xMQ(sPz);
            }
        }

        @Override // io.grpc.internal.Z, io.grpc.internal.QJ
        public void ty(yg ygVar) {
            if (this.mUb.n().mUb()) {
                ygVar.n("wait_for_ready");
            }
            super.ty(ygVar);
        }

        @Override // io.grpc.internal.Z, io.grpc.internal.QJ
        public void t(io.grpc.SPz sPz) {
            super.t(sPz);
            synchronized (afx.this.rl) {
                try {
                    if (afx.this.Uo != null) {
                        boolean zRemove = afx.this.xMQ.remove(this);
                        if (!afx.this.r() && zRemove) {
                            afx.this.nr.rl(afx.this.J2);
                            if (afx.this.mUb != null) {
                                afx.this.nr.rl(afx.this.Uo);
                                afx.this.Uo = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            afx.this.nr.n();
        }
    }

    class Ml implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.SPz f68451n;

        Ml(io.grpc.SPz sPz) {
            this.f68451n = sPz;
        }

        @Override // java.lang.Runnable
        public void run() {
            afx.this.KN.n(this.f68451n);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o7q.j f68453n;

        j(o7q.j jVar) {
            this.f68453n = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f68453n.t(true);
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o7q.j f68455n;

        n(o7q.j jVar) {
            this.f68455n = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f68455n.t(false);
        }
    }

    class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o7q.j f68457n;

        w6(o7q.j jVar) {
            this.f68457n = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f68457n.O();
        }
    }

    private I28 ck(Pl.CN3 cn3, io.grpc.w6[] w6VarArr) {
        I28 i28 = new I28(this, cn3, w6VarArr, null);
        this.xMQ.add(i28);
        if (Ik() == 1) {
            this.nr.rl(this.f68448O);
        }
        for (io.grpc.w6 w6Var : w6VarArr) {
            w6Var.mUb();
        }
        return i28;
    }

    final int Ik() {
        int size;
        synchronized (this.rl) {
            size = this.xMQ.size();
        }
        return size;
    }

    @Override // io.grpc.internal.o7q
    public final void J2(io.grpc.SPz sPz) {
        Runnable runnable;
        synchronized (this.rl) {
            try {
                if (this.mUb != null) {
                    return;
                }
                this.mUb = sPz;
                this.nr.rl(new Ml(sPz));
                if (!r() && (runnable = this.Uo) != null) {
                    this.nr.rl(runnable);
                    this.Uo = null;
                }
                this.nr.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.o7q
    public final Runnable Uo(o7q.j jVar) {
        this.KN = jVar;
        this.f68448O = new j(jVar);
        this.J2 = new n(jVar);
        this.Uo = new w6(jVar);
        return null;
    }

    @Override // JP.Z
    public JP.afx nr() {
        return this.f68449n;
    }

    final void o(Pl.aC aCVar) {
        Runnable runnable;
        synchronized (this.rl) {
            this.gh = aCVar;
            this.qie++;
            if (aCVar != null && r()) {
                ArrayList<I28> arrayList = new ArrayList(this.xMQ);
                ArrayList arrayList2 = new ArrayList();
                for (I28 i28 : arrayList) {
                    Pl.Wre wreN = aCVar.n(i28.mUb);
                    io.grpc.n nVarN = i28.mUb.n();
                    InterfaceC2171c interfaceC2171cGh = psW.gh(wreN, nVarN.mUb());
                    if (interfaceC2171cGh != null) {
                        Executor executorO = this.f68450t;
                        if (nVarN.O() != null) {
                            executorO = nVarN.O();
                        }
                        Runnable runnableG = i28.g(interfaceC2171cGh);
                        if (runnableG != null) {
                            executorO.execute(runnableG);
                        }
                        arrayList2.add(i28);
                    }
                }
                synchronized (this.rl) {
                    try {
                        if (r()) {
                            this.xMQ.removeAll(arrayList2);
                            if (this.xMQ.isEmpty()) {
                                this.xMQ = new LinkedHashSet();
                            }
                            if (!r()) {
                                this.nr.rl(this.J2);
                                if (this.mUb != null && (runnable = this.Uo) != null) {
                                    this.nr.rl(runnable);
                                    this.Uo = null;
                                }
                            }
                            this.nr.n();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final boolean r() {
        boolean z2;
        synchronized (this.rl) {
            z2 = !this.xMQ.isEmpty();
        }
        return z2;
    }

    @Override // io.grpc.internal.InterfaceC2171c
    public final QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
        QJ uVar;
        try {
            hQ hQVar = new hQ(dAz, qj, nVar);
            Pl.aC aCVar = null;
            long j2 = -1;
            while (true) {
                synchronized (this.rl) {
                    if (this.mUb == null) {
                        Pl.aC aCVar2 = this.gh;
                        if (aCVar2 != null) {
                            if (aCVar != null && j2 == this.qie) {
                                uVar = ck(hQVar, w6VarArr);
                                break;
                            }
                            j2 = this.qie;
                            InterfaceC2171c interfaceC2171cGh = psW.gh(aCVar2.n(hQVar), nVar.mUb());
                            if (interfaceC2171cGh != null) {
                                uVar = interfaceC2171cGh.t(hQVar.t(), hQVar.rl(), hQVar.n(), w6VarArr);
                                break;
                            }
                            aCVar = aCVar2;
                        } else {
                            uVar = ck(hQVar, w6VarArr);
                            break;
                        }
                    } else {
                        uVar = new u(this.mUb, w6VarArr);
                        break;
                    }
                }
            }
            return uVar;
        } finally {
            this.nr.n();
        }
    }

    afx(Executor executor, JP.M m2) {
        this.f68450t = executor;
        this.nr = m2;
    }

    @Override // io.grpc.internal.o7q
    public final void rl(io.grpc.SPz sPz) {
        Collection<I28> collection;
        Runnable runnable;
        J2(sPz);
        synchronized (this.rl) {
            try {
                collection = this.xMQ;
                runnable = this.Uo;
                this.Uo = null;
                if (!collection.isEmpty()) {
                    this.xMQ = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (I28 i28 : collection) {
                Runnable runnableWPU = i28.WPU(new u(sPz, l3D.j.REFUSED, i28.qie));
                if (runnableWPU != null) {
                    runnableWPU.run();
                }
            }
            this.nr.execute(runnable);
        }
    }
}
