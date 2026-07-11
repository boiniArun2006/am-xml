package io.grpc.internal;

import JP.I28;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class g9s extends JP.I28 {
    private JP.I28 J2;
    private List KN = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private I28.j f68489O;
    private io.grpc.SPz Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledFuture f68490n;
    private volatile boolean nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JP.Xo f68491t;
    private C xMQ;
    private static final Logger mUb = Logger.getLogger(g9s.class.getName());
    private static final JP.I28 gh = new Dsr();

    private static final class C extends I28.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28.j f68492n;
        private volatile boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f68493t = new ArrayList();

        class Ml implements Runnable {
            Ml() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C.this.f68492n.nr();
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68495n;

            j(io.grpc.QJ qj) {
                this.f68495n = qj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C.this.f68492n.rl(this.f68495n);
            }
        }

        class n implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Object f68497n;

            n(Object obj) {
                this.f68497n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C.this.f68492n.t(this.f68497n);
            }
        }

        class w6 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68500n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68501t;

            w6(io.grpc.SPz sPz, io.grpc.QJ qj) {
                this.f68500n = sPz;
                this.f68501t = qj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C.this.f68492n.n(this.f68500n, this.f68501t);
            }
        }

        private void J2(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.rl) {
                        runnable.run();
                    } else {
                        this.f68493t.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void Uo() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f68493t.isEmpty()) {
                            this.f68493t = null;
                            this.rl = true;
                            return;
                        } else {
                            list = this.f68493t;
                            this.f68493t = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // JP.I28.j
        public void n(io.grpc.SPz sPz, io.grpc.QJ qj) {
            J2(new w6(sPz, qj));
        }

        @Override // JP.I28.j
        public void nr() {
            if (this.rl) {
                this.f68492n.nr();
            } else {
                J2(new Ml());
            }
        }

        @Override // JP.I28.j
        public void rl(io.grpc.QJ qj) {
            if (this.rl) {
                this.f68492n.rl(qj);
            } else {
                J2(new j(qj));
            }
        }

        @Override // JP.I28.j
        public void t(Object obj) {
            if (this.rl) {
                this.f68492n.t(obj);
            } else {
                J2(new n(obj));
            }
        }

        public C(I28.j jVar) {
            this.f68492n = jVar;
        }
    }

    class CN3 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68502n;

        CN3(int i2) {
            this.f68502n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g9s.this.J2.t(this.f68502n);
        }
    }

    class I28 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.SPz f68504n;

        I28(io.grpc.SPz sPz) {
            this.f68504n = sPz;
        }

        @Override // java.lang.Runnable
        public void run() {
            g9s.this.J2.n(this.f68504n.ty(), this.f68504n.qie());
        }
    }

    class Ml implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ I28.j f68507n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ io.grpc.QJ f68508t;

        Ml(I28.j jVar, io.grpc.QJ qj) {
            this.f68507n = jVar;
            this.f68508t = qj;
        }

        @Override // java.lang.Runnable
        public void run() {
            g9s.this.J2.O(this.f68507n, this.f68508t);
        }
    }

    class Wre implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f68509n;

        Wre(Object obj) {
            this.f68509n = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            g9s.this.J2.nr(this.f68509n);
        }
    }

    private final class aC extends SPz {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final io.grpc.SPz f68511O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final I28.j f68512t;

        aC(I28.j jVar, io.grpc.SPz sPz) {
            super(g9s.this.f68491t);
            this.f68512t = jVar;
            this.f68511O = sPz;
        }

        @Override // io.grpc.internal.SPz
        public void n() {
            this.f68512t.n(this.f68511O, new io.grpc.QJ());
        }
    }

    class fuX implements Runnable {
        fuX() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g9s.this.J2.rl();
        }
    }

    class j extends SPz {
        j(JP.Xo xo) {
            super(xo);
        }

        @Override // io.grpc.internal.SPz
        public void n() {
            g9s.this.az();
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ StringBuilder f68515n;

        n(StringBuilder sb) {
            this.f68515n = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            g9s.this.gh(io.grpc.SPz.xMQ.Ik(this.f68515n.toString()), true);
        }
    }

    class w6 extends SPz {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C f68518t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(C c2) {
            super(g9s.this.f68491t);
            this.f68518t = c2;
        }

        @Override // io.grpc.internal.SPz
        public void n() {
            this.f68518t.Uo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh(io.grpc.SPz sPz, boolean z2) {
        boolean z3;
        I28.j jVar;
        synchronized (this) {
            try {
                if (this.J2 == null) {
                    Ik(gh);
                    jVar = this.f68489O;
                    this.Uo = sPz;
                    z3 = false;
                } else {
                    if (z2) {
                        return;
                    }
                    z3 = true;
                    jVar = null;
                }
                if (z3) {
                    qie(new I28(sPz));
                } else {
                    if (jVar != null) {
                        this.rl.execute(new aC(jVar, sPz));
                    }
                    az();
                }
                mUb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void qie(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.nr) {
                    runnable.run();
                } else {
                    this.KN.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Runnable ck(JP.I28 i28) {
        synchronized (this) {
            try {
                if (this.J2 != null) {
                    return null;
                }
                Ik((JP.I28) t1.Xo.ck(i28, "call"));
                return new j(this.f68491t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void mUb() {
    }

    class Dsr extends JP.I28 {
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

        Dsr() {
        }
    }

    private ScheduledFuture HI(ScheduledExecutorService scheduledExecutorService, JP.eO eOVar) {
        JP.eO eOVarUo = this.f68491t.Uo();
        if (eOVar == null && eOVarUo == null) {
            return null;
        }
        long jGh = eOVar != null ? eOVar.gh(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (eOVarUo != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (eOVarUo.gh(timeUnit) < jGh) {
                jGh = eOVarUo.gh(timeUnit);
                Logger logger = mUb;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jGh)));
                    if (eOVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(eOVar.gh(timeUnit))));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long jAbs = Math.abs(jGh);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jGh) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str = ty(eOVarUo, eOVar) ? "Context" : "CallOptions";
        if (jGh < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str);
            sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb2.append("Deadline ");
            sb2.append(str);
            sb2.append(" will be exceeded in ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new n(sb2), jGh, TimeUnit.NANOSECONDS);
    }

    private void Ik(JP.I28 i28) {
        JP.I28 i282 = this.J2;
        t1.Xo.aYN(i282 == null, "realCall already set to %s", i282);
        ScheduledFuture scheduledFuture = this.f68490n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.J2 = i28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void az() {
        C c2;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.KN.isEmpty()) {
                    break;
                }
                list = this.KN;
                this.KN = arrayList;
            }
            if (c2 == null) {
                this.rl.execute(new w6(c2));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.KN = null;
        this.nr = true;
        c2 = this.xMQ;
        if (c2 == null) {
        }
    }

    private boolean ty(JP.eO eOVar, JP.eO eOVar2) {
        if (eOVar2 == null) {
            return true;
        }
        if (eOVar == null) {
            return false;
        }
        return eOVar.KN(eOVar2);
    }

    @Override // JP.I28
    public final void O(I28.j jVar, io.grpc.QJ qj) {
        io.grpc.SPz sPz;
        boolean z2;
        t1.Xo.S(this.f68489O == null, "already started");
        synchronized (this) {
            try {
                this.f68489O = (I28.j) t1.Xo.ck(jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                sPz = this.Uo;
                z2 = this.nr;
                if (!z2) {
                    C c2 = new C(jVar);
                    this.xMQ = c2;
                    jVar = c2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sPz != null) {
            this.rl.execute(new aC(jVar, sPz));
        } else if (z2) {
            this.J2.O(jVar, qj);
        } else {
            qie(new Ml(jVar, qj));
        }
    }

    @Override // JP.I28
    public final void n(String str, Throwable th) {
        io.grpc.SPz sPz = io.grpc.SPz.J2;
        io.grpc.SPz sPzIk = str != null ? sPz.Ik(str) : sPz.Ik("Call cancelled without message");
        if (th != null) {
            sPzIk = sPzIk.ck(th);
        }
        gh(sPzIk, false);
    }

    @Override // JP.I28
    public final void nr(Object obj) {
        if (this.nr) {
            this.J2.nr(obj);
        } else {
            qie(new Wre(obj));
        }
    }

    @Override // JP.I28
    public final void rl() {
        qie(new fuX());
    }

    @Override // JP.I28
    public final void t(int i2) {
        if (this.nr) {
            this.J2.t(i2);
        } else {
            qie(new CN3(i2));
        }
    }

    protected g9s(Executor executor, ScheduledExecutorService scheduledExecutorService, JP.eO eOVar) {
        this.rl = (Executor) t1.Xo.ck(executor, "callExecutor");
        t1.Xo.ck(scheduledExecutorService, "scheduler");
        this.f68491t = JP.Xo.O();
        this.f68490n = HI(scheduledExecutorService, eOVar);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("realCall", this.J2).toString();
    }
}
