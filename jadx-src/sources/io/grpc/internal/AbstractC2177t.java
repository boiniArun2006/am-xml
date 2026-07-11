package io.grpc.internal;

import io.grpc.QJ;
import io.grpc.internal.l3D;
import io.grpc.internal.tI;
import io.grpc.w6;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.grpc.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class AbstractC2177t implements io.grpc.internal.QJ {
    private static Random fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final QJ.CN3 f68726g;
    private static final io.grpc.SPz iF;
    static final QJ.CN3 te;
    private final cA J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final io.grpc.QJ f68727O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private s4 f68728S;
    private final Zs Uo;
    private io.grpc.SPz ViF;
    private s4 WPU;
    private io.grpc.internal.l3D XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f68729Z;
    private long aYN;
    private final Ew az;
    private final long gh;
    private final C2178c mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.DAz f68730n;
    private boolean nY;
    private final ScheduledExecutorService nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SPz f68731o;
    private final long qie;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f68733t = new JP.M(new j());
    private final Object xMQ = new Object();
    private final yg ty = new yg();
    private volatile g9s HI = new g9s(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    private final AtomicBoolean ck = new AtomicBoolean();
    private final AtomicInteger Ik = new AtomicInteger();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicInteger f68732r = new AtomicInteger();

    /* JADX INFO: renamed from: io.grpc.internal.t$C */
    class C implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68734n;

        C(int i2) {
            this.f68734n = i2;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.KN(this.f68734n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$CN3 */
    class CN3 implements QJ {
        CN3() {
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.flush();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Dsr */
    class Dsr implements QJ {
        Dsr() {
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.HI();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Ew */
    static final class Ew {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f68737n;
        final AtomicInteger nr;
        final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f68738t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ew)) {
                return false;
            }
            Ew ew = (Ew) obj;
            return this.f68737n == ew.f68737n && this.f68738t == ew.f68738t;
        }

        public int hashCode() {
            return t1.C.rl(Integer.valueOf(this.f68737n), Integer.valueOf(this.f68738t));
        }

        boolean n() {
            return this.nr.get() > this.rl;
        }

        boolean rl() {
            int i2;
            int i3;
            do {
                i2 = this.nr.get();
                if (i2 == 0) {
                    return false;
                }
                i3 = i2 - 1000;
            } while (!this.nr.compareAndSet(i2, Math.max(i3, 0)));
            return i3 > this.rl;
        }

        void t() {
            int i2;
            int i3;
            do {
                i2 = this.nr.get();
                i3 = this.f68737n;
                if (i2 == i3) {
                    return;
                }
            } while (!this.nr.compareAndSet(i2, Math.min(this.f68738t + i2, i3)));
        }

        Ew(float f3, float f4) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.nr = atomicInteger;
            this.f68738t = (int) (f4 * 1000.0f);
            int i2 = (int) (f3 * 1000.0f);
            this.f68737n = i2;
            this.rl = i2 / 2;
            atomicInteger.set(i2);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$I28 */
    class I28 implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.eO f68739n;

        I28(JP.eO eOVar) {
            this.f68739n = eOVar;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.mUb(this.f68739n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Ml */
    class Ml implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.C f68740n;

        Ml(JP.C c2) {
            this.f68740n = c2;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.n(this.f68740n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Pl */
    class Pl implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f68741n;

        Pl(Object obj) {
            this.f68741n = obj;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.nr(AbstractC2177t.this.f68730n.mUb(this.f68741n));
            z2.f68751n.flush();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Q */
    private final class Q implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final s4 f68742n;

        /* JADX INFO: renamed from: io.grpc.internal.t$Q$j */
        class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Z f68744n;

            j(Z z2) {
                this.f68744n = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                s4 s4Var;
                boolean z2;
                synchronized (AbstractC2177t.this.xMQ) {
                    try {
                        s4Var = null;
                        if (Q.this.f68742n.n()) {
                            z2 = true;
                        } else {
                            AbstractC2177t abstractC2177t = AbstractC2177t.this;
                            abstractC2177t.HI = abstractC2177t.HI.n(this.f68744n);
                            AbstractC2177t abstractC2177t2 = AbstractC2177t.this;
                            if (abstractC2177t2.k(abstractC2177t2.HI) && (AbstractC2177t.this.az == null || AbstractC2177t.this.az.n())) {
                                AbstractC2177t abstractC2177t3 = AbstractC2177t.this;
                                s4Var = new s4(abstractC2177t3.xMQ);
                                abstractC2177t3.WPU = s4Var;
                            } else {
                                AbstractC2177t abstractC2177t4 = AbstractC2177t.this;
                                abstractC2177t4.HI = abstractC2177t4.HI.nr();
                                AbstractC2177t.this.WPU = null;
                            }
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    this.f68744n.f68751n.ck(AbstractC2177t.this.new afx(this.f68744n));
                    this.f68744n.f68751n.t(io.grpc.SPz.J2.Ik("Unneeded hedging"));
                } else {
                    if (s4Var != null) {
                        s4Var.t(AbstractC2177t.this.nr.schedule(AbstractC2177t.this.new Q(s4Var), AbstractC2177t.this.Uo.rl, TimeUnit.NANOSECONDS));
                    }
                    AbstractC2177t.this.Nxk(this.f68744n);
                }
            }
        }

        Q(s4 s4Var) {
            this.f68742n = s4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2177t abstractC2177t = AbstractC2177t.this;
            Z zI = abstractC2177t.I(abstractC2177t.HI.f68770O, false);
            if (zI == null) {
                return;
            }
            AbstractC2177t.this.rl.execute(new j(zI));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$QJ */
    private interface QJ {
        void n(Z z2);
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$SPz */
    private static final class SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final io.grpc.SPz f68746n;
        private final l3D.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final io.grpc.QJ f68747t;

        SPz(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            this.f68746n = sPz;
            this.rl = jVar;
            this.f68747t = qj;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Wre */
    class Wre implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.QJ f68749n;

        Wre(JP.QJ qj) {
            this.f68749n = qj;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.gh(this.f68749n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Xo */
    class Xo extends w6.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.w6 f68750n;

        Xo(io.grpc.w6 w6Var) {
            this.f68750n = w6Var;
        }

        @Override // io.grpc.w6.j
        public io.grpc.w6 n(w6.n nVar, io.grpc.QJ qj) {
            return this.f68750n;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$aC */
    class aC implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68753n;

        aC(int i2) {
            this.f68753n = i2;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.Uo(this.f68753n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$afx */
    private final class afx implements io.grpc.internal.l3D {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Z f68754n;

        /* JADX INFO: renamed from: io.grpc.internal.t$afx$I28 */
        class I28 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ tI.j f68755n;

            I28(tI.j jVar) {
                this.f68755n = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC2177t.this.XQ.n(this.f68755n);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.t$afx$Ml */
        class Ml implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Z f68757n;

            Ml(Z z2) {
                this.f68757n = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC2177t.this.Nxk(this.f68757n);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.t$afx$Wre */
        class Wre implements Runnable {
            Wre() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC2177t.this.nY) {
                    return;
                }
                AbstractC2177t.this.XQ.t();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.t$afx$j */
        class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68760n;

            j(io.grpc.QJ qj) {
                this.f68760n = qj;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC2177t.this.XQ.rl(this.f68760n);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.t$afx$n */
        class n implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Z f68762n;

            /* JADX INFO: renamed from: io.grpc.internal.t$afx$n$j */
            class j implements Runnable {
                j() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    n nVar = n.this;
                    AbstractC2177t.this.Nxk(nVar.f68762n);
                }
            }

            n(Z z2) {
                this.f68762n = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC2177t.this.rl.execute(new j());
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.t$afx$w6 */
        class w6 implements Runnable {
            w6() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC2177t.this.nY = true;
                AbstractC2177t.this.XQ.nr(AbstractC2177t.this.f68731o.f68746n, AbstractC2177t.this.f68731o.rl, AbstractC2177t.this.f68731o.f68747t);
            }
        }

        afx(Z z2) {
            this.f68754n = z2;
        }

        private Integer O(io.grpc.QJ qj) {
            String str = (String) qj.Uo(AbstractC2177t.te);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private r Uo(io.grpc.SPz sPz, io.grpc.QJ qj) {
            long nanos = 0;
            boolean z2 = false;
            if (AbstractC2177t.this.J2 == null) {
                return new r(false, 0L);
            }
            boolean zContains = AbstractC2177t.this.J2.J2.contains(sPz.az());
            Integer numO = O(qj);
            boolean z3 = (AbstractC2177t.this.az == null || (!zContains && (numO == null || numO.intValue() >= 0))) ? false : !AbstractC2177t.this.az.rl();
            if (AbstractC2177t.this.J2.f68465n > this.f68754n.nr + 1 && !z3) {
                if (numO == null) {
                    if (zContains) {
                        nanos = (long) (AbstractC2177t.this.aYN * AbstractC2177t.fD.nextDouble());
                        AbstractC2177t.this.aYN = Math.min((long) (r10.aYN * AbstractC2177t.this.J2.nr), AbstractC2177t.this.J2.f68466t);
                        z2 = true;
                    }
                } else if (numO.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numO.intValue());
                    AbstractC2177t abstractC2177t = AbstractC2177t.this;
                    abstractC2177t.aYN = abstractC2177t.J2.rl;
                    z2 = true;
                }
            }
            return new r(z2, nanos);
        }

        @Override // io.grpc.internal.tI
        public void n(tI.j jVar) {
            g9s g9sVar = AbstractC2177t.this.HI;
            t1.Xo.S(g9sVar.J2 != null, "Headers should be received prior to messages.");
            if (g9sVar.J2 != this.f68754n) {
                psW.nr(jVar);
            } else {
                AbstractC2177t.this.f68733t.execute(new I28(jVar));
            }
        }

        @Override // io.grpc.internal.l3D
        public void nr(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            s4 s4Var;
            synchronized (AbstractC2177t.this.xMQ) {
                AbstractC2177t abstractC2177t = AbstractC2177t.this;
                abstractC2177t.HI = abstractC2177t.HI.Uo(this.f68754n);
                AbstractC2177t.this.ty.n(sPz.az());
            }
            if (AbstractC2177t.this.f68732r.decrementAndGet() == Integer.MIN_VALUE) {
                AbstractC2177t.this.f68733t.execute(new w6());
                return;
            }
            Z z2 = this.f68754n;
            if (z2.f68752t) {
                AbstractC2177t.this.a(z2);
                if (AbstractC2177t.this.HI.J2 == this.f68754n) {
                    AbstractC2177t.this.m(sPz, jVar, qj);
                    return;
                }
                return;
            }
            l3D.j jVar2 = l3D.j.MISCARRIED;
            if (jVar == jVar2 && AbstractC2177t.this.Ik.incrementAndGet() > 1000) {
                AbstractC2177t.this.a(this.f68754n);
                if (AbstractC2177t.this.HI.J2 == this.f68754n) {
                    AbstractC2177t.this.m(io.grpc.SPz.f68187o.Ik("Too many transparent retries. Might be a bug in gRPC").ck(sPz.nr()), jVar, qj);
                    return;
                }
                return;
            }
            if (AbstractC2177t.this.HI.J2 == null) {
                if (jVar == jVar2 || (jVar == l3D.j.REFUSED && AbstractC2177t.this.ck.compareAndSet(false, true))) {
                    Z zI = AbstractC2177t.this.I(this.f68754n.nr, true);
                    if (zI == null) {
                        return;
                    }
                    if (AbstractC2177t.this.KN) {
                        synchronized (AbstractC2177t.this.xMQ) {
                            AbstractC2177t abstractC2177t2 = AbstractC2177t.this;
                            abstractC2177t2.HI = abstractC2177t2.HI.J2(this.f68754n, zI);
                        }
                    }
                    AbstractC2177t.this.rl.execute(new Ml(zI));
                    return;
                }
                if (jVar != l3D.j.DROPPED) {
                    AbstractC2177t.this.ck.set(true);
                    if (AbstractC2177t.this.KN) {
                        UGc uGcJ2 = J2(sPz, qj);
                        if (uGcJ2.f68748n) {
                            AbstractC2177t.this.ijL(uGcJ2.rl);
                        }
                        synchronized (AbstractC2177t.this.xMQ) {
                            try {
                                AbstractC2177t abstractC2177t3 = AbstractC2177t.this;
                                abstractC2177t3.HI = abstractC2177t3.HI.O(this.f68754n);
                                if (uGcJ2.f68748n) {
                                    AbstractC2177t abstractC2177t4 = AbstractC2177t.this;
                                    if (!abstractC2177t4.k(abstractC2177t4.HI)) {
                                        if (!AbstractC2177t.this.HI.nr.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        r rVarUo = Uo(sPz, qj);
                        if (rVarUo.f68778n) {
                            Z zI2 = AbstractC2177t.this.I(this.f68754n.nr + 1, false);
                            if (zI2 == null) {
                                return;
                            }
                            synchronized (AbstractC2177t.this.xMQ) {
                                AbstractC2177t abstractC2177t5 = AbstractC2177t.this;
                                s4Var = new s4(abstractC2177t5.xMQ);
                                abstractC2177t5.f68728S = s4Var;
                            }
                            s4Var.t(AbstractC2177t.this.nr.schedule(new n(zI2), rVarUo.rl, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (AbstractC2177t.this.KN) {
                    AbstractC2177t.this.Y();
                }
            }
            AbstractC2177t.this.a(this.f68754n);
            if (AbstractC2177t.this.HI.J2 == this.f68754n) {
                AbstractC2177t.this.m(sPz, jVar, qj);
            }
        }

        @Override // io.grpc.internal.l3D
        public void rl(io.grpc.QJ qj) {
            if (this.f68754n.nr > 0) {
                QJ.CN3 cn3 = AbstractC2177t.f68726g;
                qj.O(cn3);
                qj.ck(cn3, String.valueOf(this.f68754n.nr));
            }
            AbstractC2177t.this.a(this.f68754n);
            if (AbstractC2177t.this.HI.J2 == this.f68754n) {
                if (AbstractC2177t.this.az != null) {
                    AbstractC2177t.this.az.t();
                }
                AbstractC2177t.this.f68733t.execute(new j(qj));
            }
        }

        @Override // io.grpc.internal.tI
        public void t() {
            if (AbstractC2177t.this.isReady()) {
                AbstractC2177t.this.f68733t.execute(new Wre());
            }
        }

        private UGc J2(io.grpc.SPz sPz, io.grpc.QJ qj) {
            boolean z2;
            Integer numO = O(qj);
            boolean zContains = AbstractC2177t.this.Uo.f68447t.contains(sPz.az());
            boolean z3 = true;
            if (AbstractC2177t.this.az != null && (zContains || (numO != null && numO.intValue() < 0))) {
                z2 = !AbstractC2177t.this.az.rl();
            } else {
                z2 = false;
            }
            if (zContains && !z2 && !sPz.HI() && numO != null && numO.intValue() > 0) {
                numO = 0;
            }
            if (!zContains || z2) {
                z3 = false;
            }
            return new UGc(z3, numO);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$c, reason: case insensitive filesystem */
    static final class C2178c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicLong f68766n = new AtomicLong();

        long n(long j2) {
            return this.f68766n.addAndGet(j2);
        }

        C2178c() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$ci */
    class ci implements QJ {
        ci() {
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.ck(AbstractC2177t.this.new afx(z2));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$eO */
    class eO implements Runnable {
        eO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC2177t.this.nY) {
                return;
            }
            AbstractC2177t.this.XQ.t();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$fuX */
    class fuX implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f68769n;

        fuX(boolean z2) {
            this.f68769n = z2;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.qie(this.f68769n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$g9s */
    private static final class g9s {
        final Z J2;
        final boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final int f68770O;
        final boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f68771n;
        final Collection nr;
        final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Collection f68772t;

        g9s Uo(Z z2) {
            z2.rl = true;
            if (!this.f68772t.contains(z2)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f68772t);
            arrayList.remove(z2);
            return new g9s(this.rl, Collections.unmodifiableCollection(arrayList), this.nr, this.J2, this.Uo, this.f68771n, this.KN, this.f68770O);
        }

        g9s J2(Z z2, Z z3) {
            ArrayList arrayList = new ArrayList(this.nr);
            arrayList.remove(z2);
            arrayList.add(z3);
            return new g9s(this.rl, this.f68772t, Collections.unmodifiableCollection(arrayList), this.J2, this.Uo, this.f68771n, this.KN, this.f68770O);
        }

        g9s KN(Z z2) {
            Collection collectionUnmodifiableCollection;
            t1.Xo.S(!this.f68771n, "Already passThrough");
            if (z2.rl) {
                collectionUnmodifiableCollection = this.f68772t;
            } else if (this.f68772t.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(z2);
            } else {
                ArrayList arrayList = new ArrayList(this.f68772t);
                arrayList.add(z2);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            Z z3 = this.J2;
            boolean z4 = z3 != null;
            List list = this.rl;
            if (z4) {
                t1.Xo.S(z3 == z2, "Another RPC attempt has already committed");
                list = null;
            }
            return new g9s(list, collection, this.nr, this.J2, this.Uo, z4, this.KN, this.f68770O);
        }

        g9s O(Z z2) {
            ArrayList arrayList = new ArrayList(this.nr);
            arrayList.remove(z2);
            return new g9s(this.rl, this.f68772t, Collections.unmodifiableCollection(arrayList), this.J2, this.Uo, this.f68771n, this.KN, this.f68770O);
        }

        g9s n(Z z2) {
            Collection collectionUnmodifiableCollection;
            t1.Xo.S(!this.KN, "hedging frozen");
            t1.Xo.S(this.J2 == null, "already committed");
            if (this.nr == null) {
                collectionUnmodifiableCollection = Collections.singleton(z2);
            } else {
                ArrayList arrayList = new ArrayList(this.nr);
                arrayList.add(z2);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new g9s(this.rl, this.f68772t, collectionUnmodifiableCollection, this.J2, this.Uo, this.f68771n, this.KN, this.f68770O + 1);
        }

        g9s nr() {
            return this.KN ? this : new g9s(this.rl, this.f68772t, this.nr, this.J2, this.Uo, this.f68771n, true, this.f68770O);
        }

        g9s rl() {
            return new g9s(this.rl, this.f68772t, this.nr, this.J2, true, this.f68771n, this.KN, this.f68770O);
        }

        g9s t(Z z2) {
            List list;
            boolean z3;
            Collection collectionSingleton;
            t1.Xo.S(this.J2 == null, "Already committed");
            List list2 = this.rl;
            if (this.f68772t.contains(z2)) {
                collectionSingleton = Collections.singleton(z2);
                list = null;
                z3 = true;
            } else {
                list = list2;
                z3 = false;
                collectionSingleton = Collections.EMPTY_LIST;
            }
            return new g9s(list, collectionSingleton, this.nr, z2, this.Uo, z3, this.KN, this.f68770O);
        }

        g9s(List list, Collection collection, Collection collection2, Z z2, boolean z3, boolean z4, boolean z5, int i2) {
            boolean z6;
            boolean z7;
            boolean z9;
            this.rl = list;
            this.f68772t = (Collection) t1.Xo.ck(collection, "drainedSubstreams");
            this.J2 = z2;
            this.nr = collection2;
            this.Uo = z3;
            this.f68771n = z4;
            this.KN = z5;
            this.f68770O = i2;
            if (z4 && list != null) {
                z6 = false;
            } else {
                z6 = true;
            }
            t1.Xo.S(z6, "passThrough should imply buffer is null");
            if (z4 && z2 == null) {
                z7 = false;
            } else {
                z7 = true;
            }
            t1.Xo.S(z7, "passThrough should imply winningSubstream != null");
            if (z4 && ((collection.size() != 1 || !collection.contains(z2)) && (collection.size() != 0 || !z2.rl))) {
                z9 = false;
            } else {
                z9 = true;
            }
            t1.Xo.S(z9, "passThrough should imply winningSubstream is drained");
            t1.Xo.S((z3 && z2 == null) ? false : true, "cancelled should imply committed");
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$j */
    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw io.grpc.SPz.gh(th).Ik("Uncaught exception in the SynchronizationContext. Re-thrown.").nr();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$l3D */
    class l3D extends io.grpc.w6 {
        private final Z rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f68774t;

        l3D(Z z2) {
            this.rl = z2;
        }

        @Override // JP.iwV
        public void KN(long j2) {
            if (AbstractC2177t.this.HI.J2 != null) {
                return;
            }
            synchronized (AbstractC2177t.this.xMQ) {
                try {
                    if (AbstractC2177t.this.HI.J2 == null && !this.rl.rl) {
                        long j3 = this.f68774t + j2;
                        this.f68774t = j3;
                        if (j3 <= AbstractC2177t.this.f68729Z) {
                            return;
                        }
                        if (this.f68774t > AbstractC2177t.this.gh) {
                            this.rl.f68752t = true;
                        } else {
                            long jN = AbstractC2177t.this.mUb.n(this.f68774t - AbstractC2177t.this.f68729Z);
                            AbstractC2177t.this.f68729Z = this.f68774t;
                            if (jN > AbstractC2177t.this.qie) {
                                this.rl.f68752t = true;
                            }
                        }
                        Z z2 = this.rl;
                        Runnable runnableD = z2.f68752t ? AbstractC2177t.this.D(z2) : null;
                        if (runnableD != null) {
                            runnableD.run();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$n */
    class n implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f68775n;

        n(String str) {
            this.f68775n = str;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.az(this.f68775n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$o */
    class o implements QJ {
        o() {
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.O();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$qz */
    class qz implements QJ {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68777n;

        qz(int i2) {
            this.f68777n = i2;
        }

        @Override // io.grpc.internal.AbstractC2177t.QJ
        public void n(Z z2) {
            z2.f68751n.rl(this.f68777n);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$s4 */
    private static final class s4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f68779n;
        Future rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f68780t;

        Future rl() {
            this.f68780t = true;
            return this.rl;
        }

        boolean n() {
            return this.f68780t;
        }

        void t(Future future) {
            synchronized (this.f68779n) {
                try {
                    if (!this.f68780t) {
                        this.rl = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        s4(Object obj) {
            this.f68779n = obj;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$w6 */
    class w6 implements Runnable {
        final /* synthetic */ Future J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Future f68781O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Collection f68782n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Z f68784t;

        w6(Collection collection, Z z2, Future future, Future future2) {
            this.f68782n = collection;
            this.f68784t = z2;
            this.f68781O = future;
            this.J2 = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Z z2 : this.f68782n) {
                if (z2 != this.f68784t) {
                    z2.f68751n.t(AbstractC2177t.iF);
                }
            }
            Future future = this.f68781O;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.J2;
            if (future2 != null) {
                future2.cancel(false);
            }
            AbstractC2177t.this.z();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$z, reason: case insensitive filesystem */
    class RunnableC2179z implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ io.grpc.QJ f68785O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.SPz f68786n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ l3D.j f68787t;

        RunnableC2179z(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            this.f68786n = sPz;
            this.f68787t = jVar;
            this.f68785O = qj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2177t.this.nY = true;
            AbstractC2177t.this.XQ.nr(this.f68786n, this.f68787t, this.f68785O);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        r8.f68733t.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r9.f68751n.ck(new io.grpc.internal.AbstractC2177t.afx(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r0 = r9.f68751n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r8.HI.J2 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r9 = r8.ViF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = io.grpc.internal.AbstractC2177t.iF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r0.t(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (io.grpc.internal.AbstractC2177t.QJ) r0.next();
        r4.n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof io.grpc.internal.AbstractC2177t.ci) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.HI;
        r5 = r4.J2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.Uo == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Nxk(Z z2) {
        int iMin;
        int i2 = 0;
        eO eOVar = null;
        boolean z3 = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.xMQ) {
                try {
                    g9s g9sVar = this.HI;
                    Z z4 = g9sVar.J2;
                    if (z4 == null || z4 == z2) {
                        if (!g9sVar.Uo) {
                            if (i2 == g9sVar.rl.size()) {
                                this.HI = g9sVar.KN(z2);
                                if (!isReady()) {
                                    return;
                                } else {
                                    eOVar = new eO();
                                }
                            } else {
                                if (z2.rl) {
                                    return;
                                }
                                iMin = Math.min(i2 + 128, g9sVar.rl.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(g9sVar.rl.subList(i2, iMin));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(g9sVar.rl.subList(i2, iMin));
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            i2 = iMin;
        }
    }

    abstract io.grpc.internal.QJ dR0(io.grpc.QJ qj, w6.j jVar, int i2, boolean z2);

    abstract io.grpc.SPz piY();

    abstract void z();

    /* JADX INFO: renamed from: io.grpc.internal.t$UGc */
    private static final class UGc {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f68748n;
        final Integer rl;

        public UGc(boolean z2, Integer num) {
            this.f68748n = z2;
            this.rl = num;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$Z */
    private static final class Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        io.grpc.internal.QJ f68751n;
        final int nr;
        boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f68752t;

        Z(int i2) {
            this.nr = i2;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.t$r */
    private static final class r {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f68778n;
        final long rl;

        r(boolean z2, long j2) {
            this.f68778n = z2;
            this.rl = j2;
        }
    }

    static {
        QJ.Ml ml = io.grpc.QJ.f68177O;
        f68726g = QJ.CN3.O("grpc-previous-rpc-attempts", ml);
        te = QJ.CN3.O("grpc-retry-pushback-ms", ml);
        iF = io.grpc.SPz.J2.Ik("Stream thrown away because RetriableStream committed");
        fD = new Random();
    }

    AbstractC2177t(JP.DAz dAz, io.grpc.QJ qj, C2178c c2178c, long j2, long j3, Executor executor, ScheduledExecutorService scheduledExecutorService, cA cAVar, Zs zs, Ew ew) {
        this.f68730n = dAz;
        this.mUb = c2178c;
        this.gh = j2;
        this.qie = j3;
        this.rl = executor;
        this.nr = scheduledExecutorService;
        this.f68727O = qj;
        this.J2 = cAVar;
        if (cAVar != null) {
            this.aYN = cAVar.rl;
        }
        this.Uo = zs;
        t1.Xo.O(cAVar == null || zs == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.KN = zs != null;
        this.az = ew;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable D(Z z2) {
        Future future;
        Future future2;
        synchronized (this.xMQ) {
            try {
                if (this.HI.J2 != null) {
                    return null;
                }
                Collection collection = this.HI.f68772t;
                this.HI = this.HI.t(z2);
                this.mUb.n(-this.f68729Z);
                s4 s4Var = this.f68728S;
                if (s4Var != null) {
                    Future futureRl = s4Var.rl();
                    this.f68728S = null;
                    future = futureRl;
                } else {
                    future = null;
                }
                s4 s4Var2 = this.WPU;
                if (s4Var2 != null) {
                    Future futureRl2 = s4Var2.rl();
                    this.WPU = null;
                    future2 = futureRl2;
                } else {
                    future2 = null;
                }
                return new w6(collection, z2, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void GR(QJ qj) {
        Collection collection;
        synchronized (this.xMQ) {
            try {
                if (!this.HI.f68771n) {
                    this.HI.rl.add(qj);
                }
                collection = this.HI.f68772t;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            qj.n((Z) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Z I(int i2, boolean z2) {
        int i3;
        do {
            i3 = this.f68732r.get();
            if (i3 < 0) {
                return null;
            }
        } while (!this.f68732r.compareAndSet(i3, i3 + 1));
        Z z3 = new Z(i2);
        z3.f68751n = dR0(xg(this.f68727O, i2), new Xo(new l3D(z3)), i2, z2);
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        Future future;
        synchronized (this.xMQ) {
            try {
                s4 s4Var = this.WPU;
                future = null;
                if (s4Var != null) {
                    Future futureRl = s4Var.rl();
                    this.WPU = null;
                    future = futureRl;
                }
                this.HI = this.HI.nr();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ijL(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            Y();
            return;
        }
        synchronized (this.xMQ) {
            try {
                s4 s4Var = this.WPU;
                if (s4Var == null) {
                    return;
                }
                Future futureRl = s4Var.rl();
                s4 s4Var2 = new s4(this.xMQ);
                this.WPU = s4Var2;
                if (futureRl != null) {
                    futureRl.cancel(false);
                }
                s4Var2.t(this.nr.schedule(new Q(s4Var2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(g9s g9sVar) {
        return g9sVar.J2 == null && g9sVar.f68770O < this.Uo.f68446n && !g9sVar.KN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
        this.f68731o = new SPz(sPz, jVar, qj);
        if (this.f68732r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f68733t.execute(new RunnableC2179z(sPz, jVar, qj));
        }
    }

    @Override // io.grpc.internal.QJ
    public final void HI() {
        GR(new Dsr());
    }

    @Override // io.grpc.internal.QJ
    public final void KN(int i2) {
        GR(new C(i2));
    }

    @Override // io.grpc.internal.lS
    public void O() {
        GR(new o());
    }

    @Override // io.grpc.internal.QJ
    public final void Uo(int i2) {
        GR(new aC(i2));
    }

    @Override // io.grpc.internal.QJ
    public final void az(String str) {
        GR(new n(str));
    }

    @Override // io.grpc.internal.QJ
    public final void ck(io.grpc.internal.l3D l3d) {
        s4 s4Var;
        Ew ew;
        this.XQ = l3d;
        io.grpc.SPz sPzPiY = piY();
        if (sPzPiY != null) {
            t(sPzPiY);
            return;
        }
        synchronized (this.xMQ) {
            this.HI.rl.add(new ci());
        }
        Z zI = I(0, false);
        if (zI == null) {
            return;
        }
        if (this.KN) {
            synchronized (this.xMQ) {
                try {
                    this.HI = this.HI.n(zI);
                    if (k(this.HI) && ((ew = this.az) == null || ew.n())) {
                        s4Var = new s4(this.xMQ);
                        this.WPU = s4Var;
                    } else {
                        s4Var = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (s4Var != null) {
                s4Var.t(this.nr.schedule(new Q(s4Var), this.Uo.rl, TimeUnit.NANOSECONDS));
            }
        }
        Nxk(zI);
    }

    final void eTf(Object obj) {
        g9s g9sVar = this.HI;
        if (g9sVar.f68771n) {
            g9sVar.J2.f68751n.nr(this.f68730n.mUb(obj));
        } else {
            GR(new Pl(obj));
        }
    }

    @Override // io.grpc.internal.lS
    public final void flush() {
        g9s g9sVar = this.HI;
        if (g9sVar.f68771n) {
            g9sVar.J2.f68751n.flush();
        } else {
            GR(new CN3());
        }
    }

    @Override // io.grpc.internal.QJ
    public final void gh(JP.QJ qj) {
        GR(new Wre(qj));
    }

    @Override // io.grpc.internal.lS
    public final boolean isReady() {
        Iterator it = this.HI.f68772t.iterator();
        while (it.hasNext()) {
            if (((Z) it.next()).f68751n.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.QJ
    public final void mUb(JP.eO eOVar) {
        GR(new I28(eOVar));
    }

    @Override // io.grpc.internal.lS
    public final void n(JP.C c2) {
        GR(new Ml(c2));
    }

    @Override // io.grpc.internal.lS
    public final void nr(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.QJ
    public final void qie(boolean z2) {
        GR(new fuX(z2));
    }

    @Override // io.grpc.internal.lS
    public final void rl(int i2) {
        g9s g9sVar = this.HI;
        if (g9sVar.f68771n) {
            g9sVar.J2.f68751n.rl(i2);
        } else {
            GR(new qz(i2));
        }
    }

    @Override // io.grpc.internal.QJ
    public final void t(io.grpc.SPz sPz) {
        Z z2;
        Z z3 = new Z(0);
        z3.f68751n = new QaP();
        Runnable runnableD = D(z3);
        if (runnableD != null) {
            synchronized (this.xMQ) {
                this.HI = this.HI.KN(z3);
            }
            runnableD.run();
            m(sPz, l3D.j.PROCESSED, new io.grpc.QJ());
            return;
        }
        synchronized (this.xMQ) {
            try {
                if (this.HI.f68772t.contains(this.HI.J2)) {
                    z2 = this.HI.J2;
                } else {
                    this.ViF = sPz;
                    z2 = null;
                }
                this.HI = this.HI.rl();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 != null) {
            z2.f68751n.t(sPz);
        }
    }

    @Override // io.grpc.internal.QJ
    public void ty(yg ygVar) {
        g9s g9sVar;
        synchronized (this.xMQ) {
            ygVar.rl("closed", this.ty);
            g9sVar = this.HI;
        }
        if (g9sVar.J2 != null) {
            yg ygVar2 = new yg();
            g9sVar.J2.f68751n.ty(ygVar2);
            ygVar.rl("committed", ygVar2);
            return;
        }
        yg ygVar3 = new yg();
        for (Z z2 : g9sVar.f68772t) {
            yg ygVar4 = new yg();
            z2.f68751n.ty(ygVar4);
            ygVar3.n(ygVar4);
        }
        ygVar.rl("open", ygVar3);
    }

    final io.grpc.QJ xg(io.grpc.QJ qj, int i2) {
        io.grpc.QJ qj2 = new io.grpc.QJ();
        qj2.az(qj);
        if (i2 > 0) {
            qj2.ck(f68726g, String.valueOf(i2));
        }
        return qj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Z z2) {
        Runnable runnableD = D(z2);
        if (runnableD != null) {
            this.rl.execute(runnableD);
        }
    }
}
