package io.grpc.internal;

import JP.DAz;
import JP.Dsr;
import JP.I28;
import JP.Xo;
import ep.oxM.esLNYym;
import io.grpc.QJ;
import io.grpc.SPz;
import io.grpc.internal.Mf;
import io.grpc.internal.l3D;
import io.grpc.internal.tI;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class C2180z extends JP.I28 {
    private boolean Ik;
    private final JP.Xo J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Pl f68826O;
    private volatile ScheduledFuture Uo;
    private boolean az;
    private final ScheduledExecutorService ck;
    private volatile boolean gh;
    private QJ mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.DAz f68827n;
    private final boolean nr;
    private boolean qie;
    private final L3.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f68830t;
    private final I28 ty;
    private io.grpc.n xMQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Logger f68825Z = Logger.getLogger(C2180z.class.getName());
    private static final byte[] XQ = "gzip".getBytes(Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME));

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final double f68824S = TimeUnit.SECONDS.toNanos(1) * 1.0d;
    private final Wre HI = new Wre();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JP.QJ f68829r = JP.QJ.t();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JP.o f68828o = JP.o.n();

    /* JADX INFO: renamed from: io.grpc.internal.z$CN3 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private class CN3 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f68831n;

        CN3(long j2) {
            this.f68831n = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            yg ygVar = new yg();
            C2180z.this.mUb.ty(ygVar);
            long jAbs = Math.abs(this.f68831n);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f68831n) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f68831n < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) C2180z.this.xMQ.KN(io.grpc.w6.f68862n)) == null ? 0.0d : r2.longValue() / C2180z.f68824S)));
            sb.append(ygVar);
            C2180z.this.mUb.t(io.grpc.SPz.xMQ.O(sb.toString()));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$I28 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    interface I28 {
        QJ n(JP.DAz dAz, io.grpc.n nVar, io.grpc.QJ qj, JP.Xo xo);
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$Ml */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private class Ml implements l3D {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28.j f68833n;
        private io.grpc.SPz rl;

        /* JADX INFO: renamed from: io.grpc.internal.z$Ml$Ml, reason: collision with other inner class name */
        final class C0978Ml extends SPz {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ L3.n f68836t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0978Ml(L3.n nVar) {
                super(C2180z.this.J2);
                this.f68836t = nVar;
            }

            private void rl() {
                if (Ml.this.rl != null) {
                    return;
                }
                try {
                    Ml.this.f68833n.nr();
                } catch (Throwable th) {
                    Ml.this.xMQ(io.grpc.SPz.J2.ck(th).Ik("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.SPz
            public void n() {
                L3.I28 i28KN = L3.w6.KN("ClientCall$Listener.onReady");
                try {
                    L3.w6.n(C2180z.this.rl);
                    L3.w6.O(this.f68836t);
                    rl();
                    if (i28KN != null) {
                        i28KN.close();
                    }
                } catch (Throwable th) {
                    if (i28KN != null) {
                        try {
                            i28KN.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.z$Ml$j */
        final class j extends SPz {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68837O;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ L3.n f68838t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(L3.n nVar, io.grpc.QJ qj) {
                super(C2180z.this.J2);
                this.f68838t = nVar;
                this.f68837O = qj;
            }

            private void rl() {
                if (Ml.this.rl != null) {
                    return;
                }
                try {
                    Ml.this.f68833n.rl(this.f68837O);
                } catch (Throwable th) {
                    Ml.this.xMQ(io.grpc.SPz.J2.ck(th).Ik("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.SPz
            public void n() {
                L3.I28 i28KN = L3.w6.KN("ClientCall$Listener.headersRead");
                try {
                    L3.w6.n(C2180z.this.rl);
                    L3.w6.O(this.f68838t);
                    rl();
                    if (i28KN != null) {
                        i28KN.close();
                    }
                } catch (Throwable th) {
                    if (i28KN != null) {
                        try {
                            i28KN.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.z$Ml$n */
        final class n extends SPz {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ tI.j f68839O;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ L3.n f68840t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(L3.n nVar, tI.j jVar) {
                super(C2180z.this.J2);
                this.f68840t = nVar;
                this.f68839O = jVar;
            }

            private void rl() {
                if (Ml.this.rl != null) {
                    psW.nr(this.f68839O);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f68839O.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            Ml.this.f68833n.t(C2180z.this.f68827n.xMQ(next));
                            next.close();
                        } catch (Throwable th) {
                            psW.O(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        psW.nr(this.f68839O);
                        Ml.this.xMQ(io.grpc.SPz.J2.ck(th2).Ik("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.SPz
            public void n() {
                L3.I28 i28KN = L3.w6.KN("ClientCall$Listener.messagesAvailable");
                try {
                    L3.w6.n(C2180z.this.rl);
                    L3.w6.O(this.f68840t);
                    rl();
                    if (i28KN != null) {
                        i28KN.close();
                    }
                } catch (Throwable th) {
                    if (i28KN != null) {
                        try {
                            i28KN.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.z$Ml$w6 */
        final class w6 extends SPz {
            final /* synthetic */ io.grpc.QJ J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68841O;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ L3.n f68843t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(L3.n nVar, io.grpc.SPz sPz, io.grpc.QJ qj) {
                super(C2180z.this.J2);
                this.f68843t = nVar;
                this.f68841O = sPz;
                this.J2 = qj;
            }

            private void rl() {
                io.grpc.SPz sPz = this.f68841O;
                io.grpc.QJ qj = this.J2;
                if (Ml.this.rl != null) {
                    sPz = Ml.this.rl;
                    qj = new io.grpc.QJ();
                }
                C2180z.this.gh = true;
                try {
                    Ml ml = Ml.this;
                    C2180z.this.Z(ml.f68833n, sPz, qj);
                } finally {
                    C2180z.this.g();
                    C2180z.this.f68826O.n(sPz.HI());
                }
            }

            @Override // io.grpc.internal.SPz
            public void n() {
                L3.I28 i28KN = L3.w6.KN("ClientCall$Listener.onClose");
                try {
                    L3.w6.n(C2180z.this.rl);
                    L3.w6.O(this.f68843t);
                    rl();
                    if (i28KN != null) {
                        i28KN.close();
                    }
                } catch (Throwable th) {
                    if (i28KN != null) {
                        try {
                            i28KN.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        public Ml(I28.j jVar) {
            this.f68833n = (I28.j) t1.Xo.ck(jVar, "observer");
        }

        private void KN(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            JP.eO eOVarXQ = C2180z.this.XQ();
            if (sPz.az() == SPz.n.CANCELLED && eOVarXQ != null && eOVarXQ.xMQ()) {
                yg ygVar = new yg();
                C2180z.this.mUb.ty(ygVar);
                sPz = io.grpc.SPz.xMQ.O("ClientCall was cancelled at or after deadline. " + ygVar);
                qj = new io.grpc.QJ();
            }
            C2180z.this.f68830t.execute(new w6(L3.w6.J2(), sPz, qj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xMQ(io.grpc.SPz sPz) {
            this.rl = sPz;
            C2180z.this.mUb.t(sPz);
        }

        @Override // io.grpc.internal.tI
        public void n(tI.j jVar) {
            L3.I28 i28KN = L3.w6.KN("ClientStreamListener.messagesAvailable");
            try {
                L3.w6.n(C2180z.this.rl);
                C2180z.this.f68830t.execute(new n(L3.w6.J2(), jVar));
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.l3D
        public void nr(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            L3.I28 i28KN = L3.w6.KN("ClientStreamListener.closed");
            try {
                L3.w6.n(C2180z.this.rl);
                KN(sPz, jVar, qj);
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.l3D
        public void rl(io.grpc.QJ qj) {
            L3.I28 i28KN = L3.w6.KN("ClientStreamListener.headersRead");
            try {
                L3.w6.n(C2180z.this.rl);
                C2180z.this.f68830t.execute(new j(L3.w6.J2(), qj));
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.tI
        public void t() {
            if (C2180z.this.f68827n.O().n()) {
                return;
            }
            L3.I28 i28KN = L3.w6.KN("ClientStreamListener.onReady");
            try {
                L3.w6.n(C2180z.this.rl);
                C2180z.this.f68830t.execute(new C0978Ml(L3.w6.J2()));
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$Wre */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private final class Wre implements Xo.j {
        private Wre() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class n extends SPz {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28.j f68846t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(I28.j jVar) {
            super(C2180z.this.J2);
            this.f68846t = jVar;
        }

        @Override // io.grpc.internal.SPz
        public void n() {
            C2180z c2180z = C2180z.this;
            c2180z.Z(this.f68846t, io.grpc.Ml.n(c2180z.J2), new io.grpc.QJ());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class w6 extends SPz {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f68847O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28.j f68848t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(I28.j jVar, String str) {
            super(C2180z.this.J2);
            this.f68848t = jVar;
            this.f68847O = str;
        }

        @Override // io.grpc.internal.SPz
        public void n() {
            C2180z.this.Z(this.f68848t, io.grpc.SPz.f68187o.Ik(String.format("Unable to find compressor by name %s", this.f68847O)), new io.grpc.QJ());
        }
    }

    private void S() {
        t1.Xo.S(this.mUb != null, "Not started");
        t1.Xo.S(!this.qie, "call was cancelled");
        t1.Xo.S(!this.az, "call already half-closed");
        this.az = true;
        this.mUb.HI();
    }

    private static JP.eO ViF(JP.eO eOVar, JP.eO eOVar2) {
        return eOVar == null ? eOVar2 : eOVar2 == null ? eOVar : eOVar.mUb(eOVar2);
    }

    private static boolean WPU(JP.eO eOVar, JP.eO eOVar2) {
        if (eOVar == null) {
            return false;
        }
        if (eOVar2 == null) {
            return true;
        }
        return eOVar.KN(eOVar2);
    }

    private void X(I28.j jVar, io.grpc.QJ qj) {
        JP.C cRl;
        t1.Xo.S(this.mUb == null, "Already started");
        t1.Xo.S(!this.qie, "call was cancelled");
        t1.Xo.ck(jVar, "observer");
        t1.Xo.ck(qj, "headers");
        if (this.J2.KN()) {
            this.mUb = QaP.f68363n;
            this.f68830t.execute(new n(jVar));
            return;
        }
        r();
        String strRl = this.xMQ.rl();
        if (strRl != null) {
            cRl = this.f68828o.rl(strRl);
            if (cRl == null) {
                this.mUb = QaP.f68363n;
                this.f68830t.execute(new w6(jVar, strRl));
                return;
            }
        } else {
            cRl = Dsr.n.f4494n;
        }
        nY(qj, this.f68829r, cRl, this.Ik);
        JP.eO eOVarXQ = XQ();
        if (eOVarXQ == null || !eOVarXQ.xMQ()) {
            aYN(eOVarXQ, this.J2.Uo(), this.xMQ.nr());
            this.mUb = this.ty.n(this.f68827n, this.xMQ, qj, this.J2);
        } else {
            io.grpc.w6[] w6VarArrJ2 = psW.J2(this.xMQ, qj, 0, false);
            String str = WPU(this.xMQ.nr(), this.J2.Uo()) ? "CallOptions" : "Context";
            Long l2 = (Long) this.xMQ.KN(io.grpc.w6.f68862n);
            double dGh = eOVarXQ.gh(TimeUnit.NANOSECONDS);
            double d2 = f68824S;
            this.mUb = new u(io.grpc.SPz.xMQ.Ik(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dGh / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), w6VarArrJ2);
        }
        if (this.nr) {
            this.mUb.O();
        }
        if (this.xMQ.n() != null) {
            this.mUb.az(this.xMQ.n());
        }
        if (this.xMQ.J2() != null) {
            this.mUb.Uo(this.xMQ.J2().intValue());
        }
        if (this.xMQ.Uo() != null) {
            this.mUb.KN(this.xMQ.Uo().intValue());
        }
        if (eOVarXQ != null) {
            this.mUb.mUb(eOVarXQ);
        }
        this.mUb.n(cRl);
        boolean z2 = this.Ik;
        if (z2) {
            this.mUb.qie(z2);
        }
        this.mUb.gh(this.f68829r);
        this.f68826O.rl();
        this.mUb.ck(new Ml(jVar));
        this.J2.n(this.HI, com.google.common.util.concurrent.QJ.n());
        if (eOVarXQ != null && !eOVarXQ.equals(this.J2.Uo()) && this.ck != null) {
            this.Uo = e(eOVarXQ);
        }
        if (this.gh) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JP.eO XQ() {
        return ViF(this.xMQ.nr(), this.J2.Uo());
    }

    private static void aYN(JP.eO eOVar, JP.eO eOVar2, JP.eO eOVar3) {
        Logger logger = f68825Z;
        if (logger.isLoggable(Level.FINE) && eOVar != null && eOVar.equals(eOVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, eOVar.gh(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            if (eOVar3 == null) {
                sb.append(esLNYym.XqOKAAHOghsHvYH);
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(eOVar3.gh(timeUnit))));
            }
            logger.fine(sb.toString());
        }
    }

    private ScheduledFuture e(JP.eO eOVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jGh = eOVar.gh(timeUnit);
        return this.ck.schedule(new RunnableC2176p(new CN3(jGh)), jGh, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.J2.xMQ(this.HI);
        ScheduledFuture scheduledFuture = this.Uo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    static void nY(io.grpc.QJ qj, JP.QJ qj2, JP.C c2, boolean z2) {
        qj.O(psW.xMQ);
        QJ.CN3 cn3 = psW.f68686O;
        qj.O(cn3);
        if (c2 != Dsr.n.f4494n) {
            qj.ck(cn3, c2.n());
        }
        QJ.CN3 cn32 = psW.J2;
        qj.O(cn32);
        byte[] bArrN = JP.SPz.n(qj2);
        if (bArrN.length != 0) {
            qj.ck(cn32, bArrN);
        }
        qj.O(psW.Uo);
        QJ.CN3 cn33 = psW.KN;
        qj.O(cn33);
        if (z2) {
            qj.ck(cn33, XQ);
        }
    }

    private void o(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f68825Z.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.qie) {
            return;
        }
        this.qie = true;
        try {
            if (this.mUb != null) {
                io.grpc.SPz sPz = io.grpc.SPz.J2;
                io.grpc.SPz sPzIk = str != null ? sPz.Ik(str) : sPz.Ik("Call cancelled without message");
                if (th != null) {
                    sPzIk = sPzIk.ck(th);
                }
                this.mUb.t(sPzIk);
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    private void r() {
        Mf.n nVar = (Mf.n) this.xMQ.KN(Mf.n.Uo);
        if (nVar == null) {
            return;
        }
        Long l2 = nVar.f68334n;
        if (l2 != null) {
            JP.eO eOVarN = JP.eO.n(l2.longValue(), TimeUnit.NANOSECONDS);
            JP.eO eOVarNr = this.xMQ.nr();
            if (eOVarNr == null || eOVarN.compareTo(eOVarNr) < 0) {
                this.xMQ = this.xMQ.az(eOVarN);
            }
        }
        Boolean bool = nVar.rl;
        if (bool != null) {
            this.xMQ = bool.booleanValue() ? this.xMQ.o() : this.xMQ.Z();
        }
        if (nVar.f68335t != null) {
            Integer numJ2 = this.xMQ.J2();
            if (numJ2 != null) {
                this.xMQ = this.xMQ.HI(Math.min(numJ2.intValue(), nVar.f68335t.intValue()));
            } else {
                this.xMQ = this.xMQ.HI(nVar.f68335t.intValue());
            }
        }
        if (nVar.nr != null) {
            Integer numUo = this.xMQ.Uo();
            if (numUo != null) {
                this.xMQ = this.xMQ.ck(Math.min(numUo.intValue(), nVar.nr.intValue()));
            } else {
                this.xMQ = this.xMQ.ck(nVar.nr.intValue());
            }
        }
    }

    private void te(Object obj) {
        t1.Xo.S(this.mUb != null, "Not started");
        t1.Xo.S(!this.qie, "call was cancelled");
        t1.Xo.S(!this.az, "call was half-closed");
        try {
            QJ qj = this.mUb;
            if (qj instanceof AbstractC2177t) {
                ((AbstractC2177t) qj).eTf(obj);
            } else {
                qj.nr(this.f68827n.mUb(obj));
            }
            if (this.KN) {
                return;
            }
            this.mUb.flush();
        } catch (Error e2) {
            this.mUb.t(io.grpc.SPz.J2.Ik("Client sendMessage() failed with Error"));
            throw e2;
        } catch (RuntimeException e3) {
            this.mUb.t(io.grpc.SPz.J2.ck(e3).Ik("Failed to stream message"));
        }
    }

    C2180z E2(boolean z2) {
        this.Ik = z2;
        return this;
    }

    @Override // JP.I28
    public void O(I28.j jVar, io.grpc.QJ qj) {
        L3.I28 i28KN = L3.w6.KN("ClientCall.start");
        try {
            L3.w6.n(this.rl);
            X(jVar, qj);
            if (i28KN != null) {
                i28KN.close();
            }
        } catch (Throwable th) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    C2180z fD(JP.QJ qj) {
        this.f68829r = qj;
        return this;
    }

    C2180z iF(JP.o oVar) {
        this.f68828o = oVar;
        return this;
    }

    @Override // JP.I28
    public void n(String str, Throwable th) {
        L3.I28 i28KN = L3.w6.KN("ClientCall.cancel");
        try {
            L3.w6.n(this.rl);
            o(str, th);
            if (i28KN != null) {
                i28KN.close();
            }
        } catch (Throwable th2) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // JP.I28
    public void nr(Object obj) {
        L3.I28 i28KN = L3.w6.KN("ClientCall.sendMessage");
        try {
            L3.w6.n(this.rl);
            te(obj);
            if (i28KN != null) {
                i28KN.close();
            }
        } catch (Throwable th) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // JP.I28
    public void rl() {
        L3.I28 i28KN = L3.w6.KN("ClientCall.halfClose");
        try {
            L3.w6.n(this.rl);
            S();
            if (i28KN != null) {
                i28KN.close();
            }
        } catch (Throwable th) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // JP.I28
    public void t(int i2) {
        L3.I28 i28KN = L3.w6.KN("ClientCall.request");
        try {
            L3.w6.n(this.rl);
            t1.Xo.S(this.mUb != null, "Not started");
            t1.Xo.O(i2 >= 0, "Number requested must be non-negative");
            this.mUb.rl(i2);
            if (i28KN != null) {
                i28KN.close();
            }
        } catch (Throwable th) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    C2180z(JP.DAz dAz, Executor executor, io.grpc.n nVar, I28 i28, ScheduledExecutorService scheduledExecutorService, Pl pl, io.grpc.Dsr dsr) {
        this.f68827n = dAz;
        L3.Ml mlT = L3.w6.t(dAz.t(), System.identityHashCode(this));
        this.rl = mlT;
        if (executor == com.google.common.util.concurrent.QJ.n()) {
            this.f68830t = new Ogx();
            this.nr = true;
        } else {
            this.f68830t = new DC(executor);
            this.nr = false;
        }
        this.f68826O = pl;
        this.J2 = JP.Xo.O();
        this.KN = dAz.O() == DAz.Ml.UNARY || dAz.O() == DAz.Ml.SERVER_STREAMING;
        this.xMQ = nVar;
        this.ty = i28;
        this.ck = scheduledExecutorService;
        L3.w6.nr("ClientCall.<init>", mlT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(I28.j jVar, io.grpc.SPz sPz, io.grpc.QJ qj) {
        jVar.n(sPz, qj);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("method", this.f68827n).toString();
    }
}
