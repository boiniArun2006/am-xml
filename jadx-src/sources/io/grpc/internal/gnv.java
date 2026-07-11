package io.grpc.internal;

import JP.AbstractC1377c;
import JP.I28;
import JP.M;
import JP.Ml;
import JP.eO;
import JP.r;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import io.grpc.AbstractC2170c;
import io.grpc.Dsr;
import io.grpc.Pl;
import io.grpc.internal.AbstractC2177t;
import io.grpc.internal.C2180z;
import io.grpc.internal.DAz;
import io.grpc.internal.Dsr;
import io.grpc.internal.L0y;
import io.grpc.internal.Mf;
import io.grpc.internal.Pl;
import io.grpc.internal.aC;
import io.grpc.internal.o7q;
import io.grpc.internal.pO;
import io.grpc.j;
import io.grpc.w6;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class gnv extends JP.nKK implements JP.g9s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final Mf f68519C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final JP.I28 f68520G7;
    private static final io.grpc.Dsr Mx;
    static final io.grpc.SPz ofS;
    static final io.grpc.SPz pJg;
    static final io.grpc.SPz xg;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Mf f68522B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f68523D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final JP.Q f68524E;
    private l3D E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private UGc f68525FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private final long f68526GR;
    private final eO HI;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final AbstractC2177t.C2178c f68527I;
    private final int Ik;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Mf f68528J;
    private final io.grpc.internal.Dsr J2;
    private final io.grpc.internal.s4 KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final s4 f68529M;
    private final io.grpc.internal.Pl M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Collection f68530N;
    private final long Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AbstractC2170c.j f68531O;
    private final Pl.n P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final t1.UGc f68532S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Set f68533T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final CountDownLatch f68534U;
    private final io.grpc.internal.s4 Uo;
    private final aC.j ViF;
    private final long WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f68535X;
    private final JP.o XQ;
    private boolean Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final boolean f68536Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final JP.QJ f68537Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f68538a;
    private final io.grpc.internal.r aYN;
    private final FKk az;
    private boolean bzg;
    private final Pmq ck;
    private final o7q.j dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Pl.aC f68539e;
    private final JP.Ml eF;
    private boolean fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f68540g;
    private final Executor gh;
    private AbstractC2170c iF;
    private final c7r ijL;
    private volatile boolean jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final eO.w6 f68541k;
    private final Q mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.afx f68542n;
    private final Object nHg;
    private final JP.n nY;
    private final io.grpc.UGc nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f68543o;
    private final io.grpc.internal.eO p5;
    private final qz piY;
    private final FKk qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final JP.M f68544r;
    private final AtomicBoolean rV9;
    private final String rl;
    private final Set s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f68545t;
    private final String te;
    private final eO ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SPz f68546v;
    private final afx wTp;
    private final io.grpc.internal.s4 xMQ;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final iF f68547z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Logger f68521m = Logger.getLogger(gnv.class.getName());
    static final Pattern eTf = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    class C extends vd {
        final /* synthetic */ String rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(AbstractC2170c abstractC2170c, String str) {
            super(abstractC2170c);
            this.rl = str;
        }

        @Override // io.grpc.internal.vd, io.grpc.AbstractC2170c
        public String n() {
            return this.rl;
        }
    }

    final class CN3 implements Runnable {
        CN3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gnv.this.Jk();
            if (gnv.this.f68539e != null) {
                gnv.this.f68539e.rl();
            }
            if (gnv.this.E2 != null) {
                gnv.this.E2.f68579n.t();
            }
        }
    }

    final class Dsr implements Runnable {
        Dsr() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gnv.this.bzg) {
                return;
            }
            gnv.this.bzg = true;
            gnv.this.Org();
        }
    }

    final class I28 extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Wre f68550n;
        final /* synthetic */ Throwable rl;

        I28(Throwable th) {
            this.rl = th;
            this.f68550n = Pl.Wre.O(io.grpc.SPz.f68187o.Ik("Panic! This is a bug!").ck(th));
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return this.f68550n;
        }

        public String toString() {
            return t1.Dsr.rl(I28.class).nr("panicPickResult", this.f68550n).toString();
        }
    }

    final class Ml implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f68553n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ JP.qz f68554t;

        Ml(Runnable runnable, JP.qz qzVar) {
            this.f68553n = runnable;
            this.f68554t = qzVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            gnv.this.aYN.t(this.f68553n, gnv.this.gh, this.f68554t);
        }
    }

    static final class Pl extends AbstractC1377c {
        private io.grpc.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final JP.Xo f68555O;
        private JP.I28 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final io.grpc.Dsr f68556n;
        private final JP.DAz nr;
        private final JP.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Executor f68557t;

        class j extends io.grpc.internal.SPz {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68558O;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28.j f68559t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(I28.j jVar, io.grpc.SPz sPz) {
                super(Pl.this.f68555O);
                this.f68559t = jVar;
                this.f68558O = sPz;
            }

            @Override // io.grpc.internal.SPz
            public void n() {
                this.f68559t.n(this.f68558O, new io.grpc.QJ());
            }
        }

        private void KN(I28.j jVar, io.grpc.SPz sPz) {
            this.f68557t.execute(new j(jVar, sPz));
        }

        @Override // JP.AbstractC1377c, JP.u
        protected JP.I28 J2() {
            return this.Uo;
        }

        @Override // JP.AbstractC1377c, JP.I28
        public void O(I28.j jVar, io.grpc.QJ qj) {
            Dsr.n nVarN = this.f68556n.n(new hQ(this.nr, qj, this.J2));
            io.grpc.SPz sPzT = nVarN.t();
            if (!sPzT.HI()) {
                KN(jVar, psW.HI(sPzT));
                this.Uo = gnv.f68520G7;
                return;
            }
            nVarN.rl();
            Mf.n nVarJ2 = ((Mf) nVarN.n()).J2(this.nr);
            if (nVarJ2 != null) {
                this.J2 = this.J2.Ik(Mf.n.Uo, nVarJ2);
            }
            JP.I28 i28KN = this.rl.KN(this.nr, this.J2);
            this.Uo = i28KN;
            i28KN.O(jVar, qj);
        }

        @Override // JP.AbstractC1377c, JP.u, JP.I28
        public void n(String str, Throwable th) {
            JP.I28 i28 = this.Uo;
            if (i28 != null) {
                i28.n(str, th);
            }
        }

        Pl(io.grpc.Dsr dsr, JP.n nVar, Executor executor, JP.DAz dAz, io.grpc.n nVar2) {
            this.f68556n = dsr;
            this.rl = nVar;
            this.nr = dAz;
            executor = nVar2.O() != null ? nVar2.O() : executor;
            this.f68557t = executor;
            this.J2 = nVar2.ty(executor);
            this.f68555O = JP.Xo.O();
        }
    }

    private static final class Q implements ScheduledExecutorService {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ScheduledExecutorService f68560n;

        /* synthetic */ Q(ScheduledExecutorService scheduledExecutorService, j jVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return this.f68560n.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return this.f68560n.invokeAny(collection);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
            return this.f68560n.schedule(callable, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return this.f68560n.submit(callable);
        }

        private Q(ScheduledExecutorService scheduledExecutorService) {
            this.f68560n = (ScheduledExecutorService) t1.Xo.ck(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) {
            return this.f68560n.awaitTermination(j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f68560n.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j2, TimeUnit timeUnit) {
            return this.f68560n.invokeAll(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
            return this.f68560n.invokeAny(collection, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f68560n.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f68560n.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.f68560n.schedule(runnable, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            return this.f68560n.scheduleAtFixedRate(runnable, j2, j3, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            return this.f68560n.scheduleWithFixedDelay(runnable, j2, j3, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return this.f68560n.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return this.f68560n.submit(runnable, obj);
        }
    }

    private class QJ implements Runnable {
        private QJ() {
        }

        /* synthetic */ QJ(gnv gnvVar, j jVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gnv.this.E2 == null) {
                return;
            }
            gnv.this.n1();
        }
    }

    private final class SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f68562n;
        Collection rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        io.grpc.SPz f68563t;

        private SPz() {
            this.f68562n = new Object();
            this.rl = new HashSet();
        }

        io.grpc.SPz n(AbstractC2177t abstractC2177t) {
            synchronized (this.f68562n) {
                try {
                    io.grpc.SPz sPz = this.f68563t;
                    if (sPz != null) {
                        return sPz;
                    }
                    this.rl.add(abstractC2177t);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void nr(AbstractC2177t abstractC2177t) {
            io.grpc.SPz sPz;
            synchronized (this.f68562n) {
                try {
                    this.rl.remove(abstractC2177t);
                    if (this.rl.isEmpty()) {
                        sPz = this.f68563t;
                        this.rl = new HashSet();
                    } else {
                        sPz = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (sPz != null) {
                gnv.this.wTp.J2(sPz);
            }
        }

        void rl(io.grpc.SPz sPz) {
            synchronized (this.f68562n) {
                try {
                    if (this.f68563t != null) {
                        return;
                    }
                    this.f68563t = sPz;
                    boolean zIsEmpty = this.rl.isEmpty();
                    if (zIsEmpty) {
                        gnv.this.wTp.J2(sPz);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void t(io.grpc.SPz sPz) {
            ArrayList arrayList;
            rl(sPz);
            synchronized (this.f68562n) {
                arrayList = new ArrayList(this.rl);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.grpc.internal.QJ) it.next()).t(sPz);
            }
            gnv.this.wTp.rl(sPz);
        }

        /* synthetic */ SPz(gnv gnvVar, j jVar) {
            this();
        }
    }

    enum UGc {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    final class Wre implements Runnable {
        Wre() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gnv.this.rV9.get() || gnv.this.E2 == null) {
                return;
            }
            gnv.this.ul(false);
            gnv.this.n1();
        }
    }

    private final class Xo implements o7q.j {
        private Xo() {
        }

        @Override // io.grpc.internal.o7q.j
        public io.grpc.j nr(io.grpc.j jVar) {
            return jVar;
        }

        @Override // io.grpc.internal.o7q.j
        public void rl() {
        }

        /* synthetic */ Xo(gnv gnvVar, j jVar) {
            this();
        }

        @Override // io.grpc.internal.o7q.j
        public void O() {
            t1.Xo.S(gnv.this.rV9.get(), "Channel must have been shut down");
            gnv.this.Xw = true;
            gnv.this.UhV(false);
            gnv.this.Org();
            gnv.this.HV();
        }

        @Override // io.grpc.internal.o7q.j
        public void n(io.grpc.SPz sPz) {
            t1.Xo.S(gnv.this.rV9.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.o7q.j
        public void t(boolean z2) {
            gnv gnvVar = gnv.this;
            gnvVar.f68547z.O(gnvVar.wTp, z2);
        }
    }

    class aC implements Thread.UncaughtExceptionHandler {
        aC() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            gnv.f68521m.log(Level.SEVERE, "[" + gnv.this.nr() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            gnv.this.GD(th);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.gnv$c, reason: case insensitive filesystem */
    final class C2172c extends AbstractC2170c.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final l3D f68570n;
        final AbstractC2170c rl;

        /* JADX INFO: renamed from: io.grpc.internal.gnv$c$j */
        final class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68572n;

            j(io.grpc.SPz sPz) {
                this.f68572n = sPz;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2172c.this.nr(this.f68572n);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.gnv$c$n */
        final class n implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ AbstractC2170c.I28 f68574n;

            n(AbstractC2170c.I28 i28) {
                this.f68574n = i28;
            }

            @Override // java.lang.Runnable
            public void run() {
                Mf mf;
                if (gnv.this.iF != C2172c.this.rl) {
                    return;
                }
                List listN = this.f68574n.n();
                JP.Ml ml = gnv.this.eF;
                Ml.j jVar = Ml.j.DEBUG;
                ml.rl(jVar, "Resolved address: {0}, config={1}", listN, this.f68574n.rl());
                UGc uGc = gnv.this.f68525FX;
                UGc uGc2 = UGc.SUCCESS;
                if (uGc != uGc2) {
                    gnv.this.eF.rl(Ml.j.INFO, "Address resolved: {0}", listN);
                    gnv.this.f68525FX = uGc2;
                }
                AbstractC2170c.n nVarT = this.f68574n.t();
                L0y.n nVar = (L0y.n) this.f68574n.rl().rl(L0y.f68293O);
                io.grpc.Dsr dsr = (io.grpc.Dsr) this.f68574n.rl().rl(io.grpc.Dsr.f68153n);
                Mf mf2 = (nVarT == null || nVarT.t() == null) ? null : (Mf) nVarT.t();
                io.grpc.SPz sPzNr = nVarT != null ? nVarT.nr() : null;
                if (gnv.this.f68538a) {
                    if (mf2 != null) {
                        if (dsr != null) {
                            gnv.this.f68529M.Ik(dsr);
                            if (mf2.t() != null) {
                                gnv.this.eF.n(jVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            gnv.this.f68529M.Ik(mf2.t());
                        }
                    } else if (gnv.this.f68528J != null) {
                        mf2 = gnv.this.f68528J;
                        gnv.this.f68529M.Ik(mf2.t());
                        gnv.this.eF.n(Ml.j.INFO, "Received no service config, using default service config");
                    } else if (sPzNr == null) {
                        mf2 = gnv.f68519C;
                        gnv.this.f68529M.Ik(null);
                    } else {
                        if (!gnv.this.f68523D) {
                            gnv.this.eF.n(Ml.j.INFO, "Fallback to error due to invalid first service config without default config");
                            C2172c.this.n(nVarT.nr());
                            if (nVar != null) {
                                nVar.n(nVarT.nr());
                                return;
                            }
                            return;
                        }
                        mf2 = gnv.this.f68522B;
                    }
                    if (!mf2.equals(gnv.this.f68522B)) {
                        gnv.this.eF.rl(Ml.j.INFO, "Service config changed{0}", mf2 == gnv.f68519C ? " to empty" : "");
                        gnv.this.f68522B = mf2;
                        gnv.this.piY.f68585n = mf2.Uo();
                    }
                    try {
                        gnv.this.f68523D = true;
                    } catch (RuntimeException e2) {
                        gnv.f68521m.log(Level.WARNING, "[" + gnv.this.nr() + "] Unexpected exception from parsing service config", (Throwable) e2);
                    }
                    mf = mf2;
                } else {
                    if (mf2 != null) {
                        gnv.this.eF.n(Ml.j.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    mf = gnv.this.f68528J == null ? gnv.f68519C : gnv.this.f68528J;
                    if (dsr != null) {
                        gnv.this.eF.n(Ml.j.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    gnv.this.f68529M.Ik(mf.t());
                }
                io.grpc.j jVarRl = this.f68574n.rl();
                C2172c c2172c = C2172c.this;
                if (c2172c.f68570n == gnv.this.E2) {
                    j.n nVarT2 = jVarRl.nr().t(io.grpc.Dsr.f68153n);
                    Map mapNr = mf.nr();
                    if (mapNr != null) {
                        nVarT2.nr(io.grpc.Pl.rl, mapNr).n();
                    }
                    io.grpc.SPz sPzO = C2172c.this.f68570n.f68579n.O(Pl.fuX.nr().rl(listN).t(nVarT2.n()).nr(mf.O()).n());
                    if (nVar != null) {
                        nVar.n(sPzO);
                    }
                }
            }
        }

        C2172c(l3D l3d, AbstractC2170c abstractC2170c) {
            this.f68570n = (l3D) t1.Xo.ck(l3d, "helperImpl");
            this.rl = (AbstractC2170c) t1.Xo.ck(abstractC2170c, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nr(io.grpc.SPz sPz) {
            gnv.f68521m.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{gnv.this.nr(), sPz});
            gnv.this.f68529M.ty();
            UGc uGc = gnv.this.f68525FX;
            UGc uGc2 = UGc.ERROR;
            if (uGc != uGc2) {
                gnv.this.eF.rl(Ml.j.WARNING, "Failed to resolve name: {0}", sPz);
                gnv.this.f68525FX = uGc2;
            }
            if (this.f68570n != gnv.this.E2) {
                return;
            }
            this.f68570n.f68579n.rl(sPz);
        }

        @Override // io.grpc.AbstractC2170c.Ml
        public void rl(AbstractC2170c.I28 i28) {
            gnv.this.f68544r.execute(new n(i28));
        }

        @Override // io.grpc.AbstractC2170c.Ml
        public void n(io.grpc.SPz sPz) {
            t1.Xo.O(!sPz.HI(), "the error status must not be OK");
            gnv.this.f68544r.execute(new j(sPz));
        }
    }

    final class fuX implements Runnable {
        fuX() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gnv.this.eF.n(Ml.j.INFO, "Entering SHUTDOWN state");
            gnv.this.aYN.rl(JP.qz.SHUTDOWN);
        }
    }

    class j extends io.grpc.Dsr {
        @Override // io.grpc.Dsr
        public Dsr.n n(Pl.CN3 cn3) {
            throw new IllegalStateException("Resolution is pending");
        }

        j() {
        }
    }

    private final class l3D extends Pl.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Dsr.n f68579n;

        final class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                gnv.this.Po6();
            }
        }

        final class n implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl.aC f68582n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ JP.qz f68583t;

            n(Pl.aC aCVar, JP.qz qzVar) {
                this.f68582n = aCVar;
                this.f68583t = qzVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                l3D l3d = l3D.this;
                if (l3d != gnv.this.E2) {
                    return;
                }
                gnv.this.K(this.f68582n);
                if (this.f68583t != JP.qz.SHUTDOWN) {
                    gnv.this.eF.rl(Ml.j.INFO, "Entering {0} state with picker: {1}", this.f68583t, this.f68582n);
                    gnv.this.aYN.rl(this.f68583t);
                }
            }
        }

        private l3D() {
        }

        /* synthetic */ l3D(gnv gnvVar, j jVar) {
            this();
        }

        @Override // io.grpc.Pl.I28
        public void J2(JP.qz qzVar, Pl.aC aCVar) {
            gnv.this.f68544r.O();
            t1.Xo.ck(qzVar, "newState");
            t1.Xo.ck(aCVar, "newPicker");
            gnv.this.f68544r.execute(new n(aCVar, qzVar));
        }

        @Override // io.grpc.Pl.I28
        public void O() {
            gnv.this.f68544r.O();
            gnv.this.f68544r.execute(new j());
        }

        @Override // io.grpc.Pl.I28
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public io.grpc.internal.Ml n(Pl.n nVar) {
            gnv.this.f68544r.O();
            t1.Xo.S(!gnv.this.Xw, "Channel is being terminated");
            return gnv.this.new r(nVar);
        }

        @Override // io.grpc.Pl.I28
        public JP.M nr() {
            return gnv.this.f68544r;
        }

        @Override // io.grpc.Pl.I28
        public JP.Ml rl() {
            return gnv.this.eF;
        }

        @Override // io.grpc.Pl.I28
        public ScheduledExecutorService t() {
            return gnv.this.mUb;
        }
    }

    final class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gnv.this.ul(true);
        }
    }

    private final class qz implements C2180z.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile AbstractC2177t.Ew f68585n;

        final class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                gnv.this.Jk();
            }
        }

        final class n extends AbstractC2177t {
            final /* synthetic */ JP.DAz E2;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ Zs f68587N;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            final /* synthetic */ cA f68588T;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            final /* synthetic */ io.grpc.n f68589X;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68590e;
            final /* synthetic */ JP.Xo nHg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, cA cAVar, Zs zs, JP.Xo xo) {
                super(dAz, qj, gnv.this.f68527I, gnv.this.f68526GR, gnv.this.Nxk, gnv.this.Rl(nVar), gnv.this.KN.J(), cAVar, zs, qz.this.f68585n);
                this.E2 = dAz;
                this.f68590e = qj;
                this.f68589X = nVar;
                this.f68588T = cAVar;
                this.f68587N = zs;
                this.nHg = xo;
            }

            @Override // io.grpc.internal.AbstractC2177t
            io.grpc.internal.QJ dR0(io.grpc.QJ qj, w6.j jVar, int i2, boolean z2) {
                io.grpc.n nVarR = this.f68589X.r(jVar);
                io.grpc.w6[] w6VarArrJ2 = psW.J2(nVarR, qj, i2, z2);
                InterfaceC2171c interfaceC2171cT = qz.this.t(new hQ(this.E2, qj, nVarR));
                JP.Xo xoRl = this.nHg.rl();
                try {
                    return interfaceC2171cT.t(this.E2, qj, nVarR, w6VarArrJ2);
                } finally {
                    this.nHg.J2(xoRl);
                }
            }

            @Override // io.grpc.internal.AbstractC2177t
            io.grpc.SPz piY() {
                return gnv.this.f68546v.n(this);
            }

            @Override // io.grpc.internal.AbstractC2177t
            void z() {
                gnv.this.f68546v.nr(this);
            }
        }

        private qz() {
        }

        /* synthetic */ qz(gnv gnvVar, j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC2171c t(Pl.CN3 cn3) {
            Pl.aC aCVar = gnv.this.f68539e;
            if (gnv.this.rV9.get()) {
                return gnv.this.wTp;
            }
            if (aCVar == null) {
                gnv.this.f68544r.execute(new j());
                return gnv.this.wTp;
            }
            InterfaceC2171c interfaceC2171cGh = psW.gh(aCVar.n(cn3), cn3.n().mUb());
            return interfaceC2171cGh != null ? interfaceC2171cGh : gnv.this.wTp;
        }

        @Override // io.grpc.internal.C2180z.I28
        public io.grpc.internal.QJ n(JP.DAz dAz, io.grpc.n nVar, io.grpc.QJ qj, JP.Xo xo) {
            if (gnv.this.f68536Y) {
                Mf.n nVar2 = (Mf.n) nVar.KN(Mf.n.Uo);
                return new n(dAz, qj, nVar, nVar2 == null ? null : nVar2.f68333O, nVar2 != null ? nVar2.J2 : null, xo);
            }
            InterfaceC2171c interfaceC2171cT = t(new hQ(dAz, qj, nVar));
            JP.Xo xoRl = xo.rl();
            try {
                return interfaceC2171cT.t(dAz, qj, nVar, psW.J2(nVar, qj, 0, false));
            } finally {
                xo.J2(xoRl);
            }
        }
    }

    private final class r extends io.grpc.internal.Ml {
        pO J2;
        boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        List f68591O;
        boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Pl.n f68592n;
        final io.grpc.internal.eO nr;
        final JP.afx rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final io.grpc.internal.Xo f68593t;
        M.Ml xMQ;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        final class j extends pO.aC {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl.C f68594n;

            j(Pl.C c2) {
                this.f68594n = c2;
            }

            @Override // io.grpc.internal.pO.aC
            void n(pO pOVar) {
                gnv.this.f68547z.O(pOVar, true);
            }

            @Override // io.grpc.internal.pO.aC
            void nr(pO pOVar) {
                gnv.this.f68533T.remove(pOVar);
                gnv.this.f68524E.gh(pOVar);
                gnv.this.HV();
            }

            @Override // io.grpc.internal.pO.aC
            void rl(pO pOVar) {
                gnv.this.f68547z.O(pOVar, false);
            }

            @Override // io.grpc.internal.pO.aC
            void t(pO pOVar, JP.Pl pl) {
                t1.Xo.S(this.f68594n != null, YjqZUJsVmhcjko.INHOSU);
                this.f68594n.n(pl);
            }
        }

        final class n implements Runnable {
            n() {
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.J2.J2(gnv.ofS);
            }
        }

        r(Pl.n nVar) {
            t1.Xo.ck(nVar, "args");
            this.f68591O = nVar.n();
            if (gnv.this.f68545t != null) {
                nVar = nVar.O().O(mUb(nVar.n())).t();
            }
            this.f68592n = nVar;
            JP.afx afxVarRl = JP.afx.rl("Subchannel", gnv.this.n());
            this.rl = afxVarRl;
            io.grpc.internal.eO eOVar = new io.grpc.internal.eO(afxVarRl, gnv.this.Ik, gnv.this.ck.n(), "Subchannel for " + nVar.n());
            this.nr = eOVar;
            this.f68593t = new io.grpc.internal.Xo(eOVar, gnv.this.ck);
        }

        private List mUb(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.grpc.I28 i28 = (io.grpc.I28) it.next();
                arrayList.add(new io.grpc.I28(i28.n(), i28.rl().nr().t(io.grpc.I28.nr).n()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // io.grpc.Pl.Dsr
        public void J2() {
            gnv.this.f68544r.O();
            t1.Xo.S(this.Uo, "not started");
            this.J2.n();
        }

        @Override // io.grpc.Pl.Dsr
        public void KN(Pl.C c2) {
            gnv.this.f68544r.O();
            t1.Xo.S(!this.Uo, "already started");
            t1.Xo.S(!this.KN, "already shutdown");
            t1.Xo.S(!gnv.this.Xw, "Channel is being terminated");
            this.Uo = true;
            pO pOVar = new pO(this.f68592n.n(), gnv.this.n(), gnv.this.te, gnv.this.ViF, gnv.this.KN, gnv.this.KN.J(), gnv.this.f68532S, gnv.this.f68544r, new j(c2), gnv.this.f68524E, gnv.this.P5.n(), this.nr, this.rl, this.f68593t, gnv.this.f68540g);
            gnv.this.p5.O(new r.j().rl("Child Subchannel started").t(r.n.CT_INFO).O(gnv.this.ck.n()).nr(pOVar).n());
            this.J2 = pOVar;
            gnv.this.f68524E.O(pOVar);
            gnv.this.f68533T.add(pOVar);
        }

        @Override // io.grpc.Pl.Dsr
        public Object O() {
            t1.Xo.S(this.Uo, "Subchannel is not started");
            return this.J2;
        }

        @Override // io.grpc.Pl.Dsr
        public void Uo() {
            M.Ml ml;
            gnv.this.f68544r.O();
            if (this.J2 == null) {
                this.KN = true;
                return;
            }
            if (!this.KN) {
                this.KN = true;
            } else {
                if (!gnv.this.Xw || (ml = this.xMQ) == null) {
                    return;
                }
                ml.n();
                this.xMQ = null;
            }
            if (gnv.this.Xw) {
                this.J2.J2(gnv.pJg);
            } else {
                this.xMQ = gnv.this.f68544r.t(new RunnableC2176p(new n()), 5L, TimeUnit.SECONDS, gnv.this.KN.J());
            }
        }

        @Override // io.grpc.Pl.Dsr
        public JP.Ml nr() {
            return this.f68593t;
        }

        @Override // io.grpc.Pl.Dsr
        public List rl() {
            gnv.this.f68544r.O();
            t1.Xo.S(this.Uo, "not started");
            return this.f68591O;
        }

        @Override // io.grpc.Pl.Dsr
        public io.grpc.j t() {
            return this.f68592n.rl();
        }

        public String toString() {
            return this.rl.toString();
        }

        @Override // io.grpc.Pl.Dsr
        public void xMQ(List list) {
            gnv.this.f68544r.O();
            this.f68591O = list;
            if (gnv.this.f68545t != null) {
                list = mUb(list);
            }
            this.J2.eF(list);
        }
    }

    private class s4 extends JP.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicReference f68596n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final JP.n f68597t;

        private final class CN3 extends g9s {
            private final long HI;
            final JP.DAz az;
            final JP.Xo qie;
            final io.grpc.n ty;

            class j implements Runnable {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Runnable f68598n;

                j(Runnable runnable) {
                    this.f68598n = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f68598n.run();
                    CN3 cn3 = CN3.this;
                    gnv.this.f68544r.execute(cn3.new n());
                }
            }

            final class n implements Runnable {
                n() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (gnv.this.f68530N != null) {
                        gnv.this.f68530N.remove(CN3.this);
                        if (gnv.this.f68530N.isEmpty()) {
                            gnv gnvVar = gnv.this;
                            gnvVar.f68547z.O(gnvVar.nHg, false);
                            gnv.this.f68530N = null;
                            if (gnv.this.rV9.get()) {
                                gnv.this.f68546v.rl(gnv.pJg);
                            }
                        }
                    }
                }
            }

            CN3(JP.Xo xo, JP.DAz dAz, io.grpc.n nVar) {
                super(gnv.this.Rl(nVar), gnv.this.mUb, nVar.nr());
                this.qie = xo;
                this.az = dAz;
                this.ty = nVar;
                this.HI = gnv.this.f68541k.n();
            }

            void r() {
                JP.Xo xoRl = this.qie.rl();
                try {
                    JP.I28 i28Az = s4.this.az(this.az, this.ty.Ik(io.grpc.w6.f68862n, Long.valueOf(gnv.this.f68541k.n() - this.HI)));
                    this.qie.J2(xoRl);
                    Runnable runnableCk = ck(i28Az);
                    if (runnableCk == null) {
                        gnv.this.f68544r.execute(new n());
                    } else {
                        gnv.this.Rl(this.ty).execute(new j(runnableCk));
                    }
                } catch (Throwable th) {
                    this.qie.J2(xoRl);
                    throw th;
                }
            }

            @Override // io.grpc.internal.g9s
            protected void mUb() {
                super.mUb();
                gnv.this.f68544r.execute(new n());
            }
        }

        class I28 extends JP.I28 {
            @Override // JP.I28
            public void n(String str, Throwable th) {
            }

            @Override // JP.I28
            public void nr(Object obj) {
            }

            @Override // JP.I28
            public void rl() {
            }

            @Override // JP.I28
            public void t(int i2) {
            }

            I28() {
            }

            @Override // JP.I28
            public void O(I28.j jVar, io.grpc.QJ qj) {
                jVar.n(gnv.pJg, new io.grpc.QJ());
            }
        }

        class Ml implements Runnable {
            Ml() {
            }

            @Override // java.lang.Runnable
            public void run() {
                gnv.this.Jk();
            }
        }

        class Wre implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f68603n;

            Wre(CN3 cn3) {
                this.f68603n = cn3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (s4.this.f68596n.get() != gnv.Mx) {
                    this.f68603n.r();
                    return;
                }
                if (gnv.this.f68530N == null) {
                    gnv.this.f68530N = new LinkedHashSet();
                    gnv gnvVar = gnv.this;
                    gnvVar.f68547z.O(gnvVar.nHg, true);
                }
                gnv.this.f68530N.add(this.f68603n);
            }
        }

        class j extends JP.n {
            j() {
            }

            @Override // JP.n
            public JP.I28 KN(JP.DAz dAz, io.grpc.n nVar) {
                return new C2180z(dAz, gnv.this.Rl(nVar), nVar, gnv.this.piY, gnv.this.jB ? null : gnv.this.KN.J(), gnv.this.M7, null).E2(gnv.this.f68543o).fD(gnv.this.f68537Z).iF(gnv.this.XQ);
            }

            @Override // JP.n
            public String n() {
                return s4.this.rl;
            }
        }

        final class n implements Runnable {
            n() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (gnv.this.f68530N == null) {
                    if (s4.this.f68596n.get() == gnv.Mx) {
                        s4.this.f68596n.set(null);
                    }
                    gnv.this.f68546v.rl(gnv.pJg);
                }
            }
        }

        final class w6 implements Runnable {
            w6() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (s4.this.f68596n.get() == gnv.Mx) {
                    s4.this.f68596n.set(null);
                }
                if (gnv.this.f68530N != null) {
                    Iterator it = gnv.this.f68530N.iterator();
                    while (it.hasNext()) {
                        ((CN3) it.next()).n("Channel is forcefully shutdown", null);
                    }
                }
                gnv.this.f68546v.t(gnv.xg);
            }
        }

        /* synthetic */ s4(gnv gnvVar, String str, j jVar) {
            this(str);
        }

        private s4(String str) {
            this.f68596n = new AtomicReference(gnv.Mx);
            this.f68597t = new j();
            this.rl = (String) t1.Xo.ck(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JP.I28 az(JP.DAz dAz, io.grpc.n nVar) {
            io.grpc.Dsr dsr = (io.grpc.Dsr) this.f68596n.get();
            if (dsr == null) {
                return this.f68597t.KN(dAz, nVar);
            }
            if (!(dsr instanceof Mf.w6)) {
                return new Pl(dsr, this.f68597t, gnv.this.gh, dAz, nVar);
            }
            Mf.n nVarJ2 = ((Mf.w6) dsr).rl.J2(dAz);
            if (nVarJ2 != null) {
                nVar = nVar.Ik(Mf.n.Uo, nVarJ2);
            }
            return this.f68597t.KN(dAz, nVar);
        }

        void HI() {
            gnv.this.f68544r.execute(new n());
        }

        void Ik(io.grpc.Dsr dsr) {
            io.grpc.Dsr dsr2 = (io.grpc.Dsr) this.f68596n.get();
            this.f68596n.set(dsr);
            if (dsr2 != gnv.Mx || gnv.this.f68530N == null) {
                return;
            }
            Iterator it = gnv.this.f68530N.iterator();
            while (it.hasNext()) {
                ((CN3) it.next()).r();
            }
        }

        @Override // JP.n
        public JP.I28 KN(JP.DAz dAz, io.grpc.n nVar) {
            if (this.f68596n.get() != gnv.Mx) {
                return az(dAz, nVar);
            }
            gnv.this.f68544r.execute(new Ml());
            if (this.f68596n.get() != gnv.Mx) {
                return az(dAz, nVar);
            }
            if (gnv.this.rV9.get()) {
                return new I28();
            }
            CN3 cn3 = new CN3(JP.Xo.O(), dAz, nVar);
            gnv.this.f68544r.execute(new Wre(cn3));
            return cn3;
        }

        void ck() {
            gnv.this.f68544r.execute(new w6());
        }

        @Override // JP.n
        public String n() {
            return this.rl;
        }

        void ty() {
            if (this.f68596n.get() == gnv.Mx) {
                Ik(null);
            }
        }
    }

    final class w6 implements Pl.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pmq f68608n;

        w6(Pmq pmq) {
            this.f68608n = pmq;
        }

        @Override // io.grpc.internal.Pl.n
        public io.grpc.internal.Pl n() {
            return new io.grpc.internal.Pl(this.f68608n);
        }
    }

    private final class z extends iF {
        private z() {
        }

        /* synthetic */ z(gnv gnvVar, j jVar) {
            this();
        }

        @Override // io.grpc.internal.iF
        protected void rl() {
            gnv.this.Jk();
        }

        @Override // io.grpc.internal.iF
        protected void t() {
            if (gnv.this.rV9.get()) {
                return;
            }
            gnv.this.EWS();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        UhV(true);
        this.wTp.o(null);
        this.eF.n(Ml.j.INFO, "Entering IDLE state");
        this.aYN.rl(JP.qz.IDLE);
        if (this.f68547z.n(this.nHg, this.wTp)) {
            Jk();
        }
    }

    static final class eO implements Executor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FKk f68576n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Executor f68577t;

        synchronized Executor n() {
            try {
                if (this.f68577t == null) {
                    this.f68577t = (Executor) t1.Xo.Ik((Executor) this.f68576n.n(), "%s.getObject()", this.f68577t);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f68577t;
        }

        synchronized void release() {
            Executor executor = this.f68577t;
            if (executor != null) {
                this.f68577t = (Executor) this.f68576n.rl(executor);
            }
        }

        eO(FKk fKk) {
            this.f68576n = (FKk) t1.Xo.ck(fKk, "executorPool");
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            n().execute(runnable);
        }
    }

    class o extends JP.I28 {
        @Override // JP.I28
        public void O(I28.j jVar, io.grpc.QJ qj) {
        }

        @Override // JP.I28
        public void n(String str, Throwable th) {
        }

        @Override // JP.I28
        public void nr(Object obj) {
        }

        @Override // JP.I28
        public void rl() {
        }

        @Override // JP.I28
        public void t(int i2) {
        }

        o() {
        }
    }

    static {
        io.grpc.SPz sPz = io.grpc.SPz.f68186Z;
        xg = sPz.Ik("Channel shutdownNow invoked");
        pJg = sPz.Ik("Channel shutdown invoked");
        ofS = sPz.Ik("Subchannel shutdown invoked");
        f68519C = Mf.n();
        Mx = new j();
        f68520G7 = new o();
    }

    gnv(fg fgVar, io.grpc.internal.s4 s4Var, aC.j jVar, FKk fKk, t1.UGc uGc, List list, Pmq pmq) {
        j jVar2;
        JP.M m2 = new JP.M(new aC());
        this.f68544r = m2;
        this.aYN = new io.grpc.internal.r();
        this.f68533T = new HashSet(16, 0.75f);
        this.nHg = new Object();
        this.s7N = new HashSet(1, 0.75f);
        j jVar3 = null;
        this.f68546v = new SPz(this, jVar3);
        this.rV9 = new AtomicBoolean(false);
        this.f68534U = new CountDownLatch(1);
        this.f68525FX = UGc.NO_RESOLUTION;
        this.f68522B = f68519C;
        this.f68523D = false;
        this.f68527I = new AbstractC2177t.C2178c();
        this.f68541k = JP.eO.Uo();
        Xo xo = new Xo(this, jVar3);
        this.dR0 = xo;
        this.f68547z = new z(this, jVar3);
        this.piY = new qz(this, jVar3);
        String str = (String) t1.Xo.ck(fgVar.J2, "target");
        this.rl = str;
        JP.afx afxVarRl = JP.afx.rl("Channel", str);
        this.f68542n = afxVarRl;
        this.ck = (Pmq) t1.Xo.ck(pmq, "timeProvider");
        FKk fKk2 = (FKk) t1.Xo.ck(fgVar.f68484n, "executorPool");
        this.qie = fKk2;
        Executor executor = (Executor) t1.Xo.ck((Executor) fKk2.n(), "executor");
        this.gh = executor;
        this.Uo = s4Var;
        eO eOVar = new eO((FKk) t1.Xo.ck(fgVar.rl, "offloadExecutorPool"));
        this.HI = eOVar;
        io.grpc.internal.qz qzVar = new io.grpc.internal.qz(s4Var, fgVar.Uo, eOVar);
        this.KN = qzVar;
        this.xMQ = new io.grpc.internal.qz(s4Var, null, eOVar);
        Q q2 = new Q(qzVar.J(), jVar3);
        this.mUb = q2;
        this.Ik = fgVar.f68479S;
        io.grpc.internal.eO eOVar2 = new io.grpc.internal.eO(afxVarRl, fgVar.f68479S, pmq.n(), "Channel for '" + str + "'");
        this.p5 = eOVar2;
        io.grpc.internal.Xo xo2 = new io.grpc.internal.Xo(eOVar2, pmq);
        this.eF = xo2;
        JP.Ln ln2 = fgVar.ViF;
        ln2 = ln2 == null ? psW.Ik : ln2;
        boolean z2 = fgVar.f68481Z;
        this.f68536Y = z2;
        io.grpc.internal.Dsr dsr = new io.grpc.internal.Dsr(fgVar.gh);
        this.J2 = dsr;
        io.grpc.UGc uGc2 = fgVar.nr;
        this.nr = uGc2;
        crp crpVar = new crp(z2, fgVar.ck, fgVar.Ik, dsr);
        String str2 = fgVar.mUb;
        this.f68545t = str2;
        AbstractC2170c.j jVarN = AbstractC2170c.j.Uo().t(fgVar.O()).J2(ln2).xMQ(m2).Uo(q2).KN(crpVar).rl(xo2).nr(eOVar).O(str2).n();
        this.f68531O = jVarN;
        this.iF = mYa(str, str2, uGc2, jVarN, qzVar.tFV());
        this.az = (FKk) t1.Xo.ck(fKk, "balancerRpcExecutorPool");
        this.ty = new eO(fKk);
        afx afxVar = new afx(executor, m2);
        this.wTp = afxVar;
        afxVar.Uo(xo);
        this.ViF = jVar;
        Map map = fgVar.WPU;
        if (map != null) {
            AbstractC2170c.n nVarN = crpVar.n(map);
            t1.Xo.aYN(nVarN.nr() == null, "Default config is invalid: %s", nVarN.nr());
            Mf mf = (Mf) nVarN.t();
            this.f68528J = mf;
            this.f68522B = mf;
            jVar2 = null;
        } else {
            jVar2 = null;
            this.f68528J = null;
        }
        boolean z3 = fgVar.aYN;
        this.f68538a = z3;
        s4 s4Var2 = new s4(this, this.iF.n(), jVar2);
        this.f68529M = s4Var2;
        this.nY = JP.fuX.n(s4Var2, list);
        this.f68540g = new ArrayList(fgVar.f68478O);
        this.f68532S = (t1.UGc) t1.Xo.ck(uGc, "stopwatchSupplier");
        long j2 = fgVar.HI;
        if (j2 == -1) {
            this.WPU = j2;
        } else {
            t1.Xo.mUb(j2 >= fg.nHg, "invalid idleTimeoutMillis %s", j2);
            this.WPU = fgVar.HI;
        }
        this.ijL = new c7r(new QJ(this, null), m2, qzVar.J(), (C2369c) uGc.get());
        this.f68543o = fgVar.qie;
        this.f68537Z = (JP.QJ) t1.Xo.ck(fgVar.az, "decompressorRegistry");
        this.XQ = (JP.o) t1.Xo.ck(fgVar.ty, "compressorRegistry");
        this.te = fgVar.xMQ;
        this.Nxk = fgVar.f68486r;
        this.f68526GR = fgVar.f68485o;
        w6 w6Var = new w6(pmq);
        this.P5 = w6Var;
        this.M7 = w6Var.n();
        JP.Q q3 = (JP.Q) t1.Xo.HI(fgVar.XQ);
        this.f68524E = q3;
        q3.nr(this);
        if (z3) {
            return;
        }
        if (this.f68528J != null) {
            xo2.n(Ml.j.INFO, "Service config look-up disabled, using default service config");
        }
        this.f68523D = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EWS() {
        long j2 = this.WPU;
        if (j2 == -1) {
            return;
        }
        this.ijL.gh(j2, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HV() {
        if (!this.jB && this.rV9.get() && this.f68533T.isEmpty() && this.s7N.isEmpty()) {
            this.eF.n(Ml.j.INFO, "Terminated");
            this.f68524E.mUb(this);
            this.qie.rl(this.gh);
            this.ty.release();
            this.HI.release();
            this.KN.close();
            this.jB = true;
            this.f68534U.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(Pl.aC aCVar) {
        this.f68539e = aCVar;
        this.wTp.o(aCVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Org() {
        if (this.bzg) {
            Iterator it = this.f68533T.iterator();
            while (it.hasNext()) {
                ((pO) it.next()).rl(xg);
            }
            Iterator it2 = this.s7N.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.j.n(it2.next());
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Po6() {
        this.f68544r.O();
        if (this.fD) {
            this.iF.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UhV(boolean z2) {
        this.f68544r.O();
        if (z2) {
            t1.Xo.S(this.fD, "nameResolver is not started");
            t1.Xo.S(this.E2 != null, "lbHelper is null");
        }
        AbstractC2170c abstractC2170c = this.iF;
        if (abstractC2170c != null) {
            abstractC2170c.t();
            this.fD = false;
            if (z2) {
                this.iF = mYa(this.rl, this.f68545t, this.nr, this.f68531O, this.KN.tFV());
            } else {
                this.iF = null;
            }
        }
        l3D l3d = this.E2;
        if (l3d != null) {
            l3d.f68579n.nr();
            this.E2 = null;
        }
        this.f68539e = null;
    }

    private static AbstractC2170c qm(String str, io.grpc.UGc uGc, AbstractC2170c.j jVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        io.grpc.s4 s4VarO = uri != null ? uGc.O(uri.getScheme()) : null;
        String str2 = "";
        if (s4VarO == null && !eTf.matcher(str).matches()) {
            try {
                uri = new URI(uGc.t(), "", "/" + str, null);
                s4VarO = uGc.O(uri.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (s4VarO == null) {
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(s4VarO.t())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        AbstractC2170c abstractC2170cRl = s4VarO.rl(uri, jVar);
        if (abstractC2170cRl != null) {
            return abstractC2170cRl;
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        throw new IllegalArgumentException(String.format("cannot create a NameResolver for %s%s", str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ul(boolean z2) {
        this.ijL.xMQ(z2);
    }

    void GD(Throwable th) {
        if (this.f68535X) {
            return;
        }
        this.f68535X = true;
        ul(true);
        UhV(false);
        K(new I28(th));
        this.f68529M.Ik(null);
        this.eF.n(Ml.j.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.aYN.rl(JP.qz.TRANSIENT_FAILURE);
    }

    void Jk() {
        this.f68544r.O();
        if (this.rV9.get() || this.f68535X) {
            return;
        }
        if (this.f68547z.nr()) {
            ul(false);
        } else {
            EWS();
        }
        if (this.E2 != null) {
            return;
        }
        this.eF.n(Ml.j.INFO, "Exiting idle mode");
        l3D l3d = new l3D(this, null);
        l3d.f68579n = this.J2.O(l3d);
        this.E2 = l3d;
        this.iF.nr(new C2172c(l3d, this.iF));
        this.fD = true;
    }

    @Override // JP.n
    public JP.I28 KN(JP.DAz dAz, io.grpc.n nVar) {
        return this.nY.KN(dAz, nVar);
    }

    @Override // JP.nKK
    public JP.qz gh(boolean z2) {
        JP.qz qzVarN = this.aYN.n();
        if (z2 && qzVarN == JP.qz.IDLE) {
            this.f68544r.execute(new CN3());
        }
        return qzVarN;
    }

    public gnv hRu() {
        this.eF.n(Ml.j.DEBUG, "shutdown() called");
        if (!this.rV9.compareAndSet(false, true)) {
            return this;
        }
        this.f68544r.execute(new fuX());
        this.f68529M.HI();
        this.f68544r.execute(new n());
        return this;
    }

    @Override // JP.nKK
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public gnv az() {
        this.eF.n(Ml.j.DEBUG, "shutdownNow() called");
        hRu();
        this.f68529M.ck();
        this.f68544r.execute(new Dsr());
        return this;
    }

    @Override // JP.nKK
    public void mUb() {
        this.f68544r.execute(new Wre());
    }

    @Override // JP.n
    public String n() {
        return this.nY.n();
    }

    @Override // JP.Z
    public JP.afx nr() {
        return this.f68542n;
    }

    @Override // JP.nKK
    public void qie(JP.qz qzVar, Runnable runnable) {
        this.f68544r.execute(new Ml(runnable, qzVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor Rl(io.grpc.n nVar) {
        Executor executorO = nVar.O();
        if (executorO == null) {
            return this.gh;
        }
        return executorO;
    }

    static AbstractC2170c mYa(String str, String str2, io.grpc.UGc uGc, AbstractC2170c.j jVar, Collection collection) {
        L0y l0y = new L0y(qm(str, uGc, jVar, collection), new C2175o(new DAz.j(), jVar.nr(), jVar.J2()), jVar.J2());
        if (str2 == null) {
            return l0y;
        }
        return new C(l0y, str2);
    }

    public String toString() {
        return t1.Dsr.t(this).t("logId", this.f68542n.nr()).nr("target", this.rl).toString();
    }
}
