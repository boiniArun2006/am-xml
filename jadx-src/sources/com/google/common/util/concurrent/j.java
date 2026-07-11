package com.google.common.util.concurrent;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.internal.ads.ci;
import ep.oxM.esLNYym;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j extends dsf.j implements Xo {
    static final boolean J2;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Object f59839Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final n f59840o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final Pl f59841r;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile o f59842O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f59843n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile I28 f59844t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private static final class C extends n {
        static final long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        static final long f59845O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Unsafe f59846n;
        static final long nr;
        static final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final long f59847t;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.j$C$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
        class C0798j implements PrivilegedExceptionAction {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            C0798j() {
            }
        }

        private C() {
            super();
        }

        static {
            Unsafe unsafe;
            String str = esLNYym.wZlfjtxpZZ;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0798j());
            }
            try {
                f59847t = unsafe.objectFieldOffset(j.class.getDeclaredField("O"));
                rl = unsafe.objectFieldOffset(j.class.getDeclaredField("t"));
                nr = unsafe.objectFieldOffset(j.class.getDeclaredField(str));
                f59845O = unsafe.objectFieldOffset(o.class.getDeclaredField(str));
                J2 = unsafe.objectFieldOffset(o.class.getDeclaredField("rl"));
                f59846n = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // com.google.common.util.concurrent.j.n
        void J2(o oVar, o oVar2) {
            f59846n.putObject(oVar, J2, oVar2);
        }

        @Override // com.google.common.util.concurrent.j.n
        void Uo(o oVar, Thread thread) {
            f59846n.putObject(oVar, f59845O, thread);
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean n(j jVar, I28 i28, I28 i282) {
            return ci.n(f59846n, jVar, rl, i28, i282);
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean rl(j jVar, Object obj, Object obj2) {
            return ci.n(f59846n, jVar, nr, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean t(j jVar, o oVar, o oVar2) {
            return ci.n(f59846n, jVar, f59847t, oVar, oVar2);
        }

        @Override // com.google.common.util.concurrent.j.n
        o O(j jVar, o oVar) {
            o oVar2;
            do {
                oVar2 = jVar.f59842O;
                if (oVar == oVar2) {
                    break;
                }
            } while (!t(jVar, oVar2, oVar));
            return oVar2;
        }

        @Override // com.google.common.util.concurrent.j.n
        I28 nr(j jVar, I28 i28) {
            I28 i282;
            do {
                i282 = jVar.f59844t;
                if (i28 == i282) {
                    break;
                }
            } while (!n(jVar, i282, i28));
            return i282;
        }
    }

    private static final class CN3 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final j f59848n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Xo f59849t;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59848n.f59843n != this) {
                return;
            }
            if (j.f59840o.rl(this.f59848n, this, j.XQ(this.f59849t))) {
                j.r(this.f59848n, false);
            }
        }

        CN3(j jVar, Xo xo) {
            this.f59848n = jVar;
            this.f59849t = xo;
        }
    }

    interface Dsr extends Xo {
    }

    private static final class Ml {
        static final Ml rl = new Ml(new C0799j("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Throwable f59852n;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.j$Ml$j, reason: collision with other inner class name */
        class C0799j extends Throwable {
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }

            C0799j(String str) {
                super(str);
            }
        }

        Ml(Throwable th) {
            this.f59852n = (Throwable) t1.Xo.HI(th);
        }
    }

    private static final class Wre extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f59853O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f59854n;
        final AtomicReferenceFieldUpdater nr;
        final AtomicReferenceFieldUpdater rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f59855t;

        Wre(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f59854n = atomicReferenceFieldUpdater;
            this.rl = atomicReferenceFieldUpdater2;
            this.f59855t = atomicReferenceFieldUpdater3;
            this.nr = atomicReferenceFieldUpdater4;
            this.f59853O = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.j.n
        void J2(o oVar, o oVar2) {
            this.rl.lazySet(oVar, oVar2);
        }

        @Override // com.google.common.util.concurrent.j.n
        o O(j jVar, o oVar) {
            return (o) this.f59855t.getAndSet(jVar, oVar);
        }

        @Override // com.google.common.util.concurrent.j.n
        void Uo(o oVar, Thread thread) {
            this.f59854n.lazySet(oVar, thread);
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean n(j jVar, I28 i28, I28 i282) {
            return androidx.concurrent.futures.j.n(this.nr, jVar, i28, i282);
        }

        @Override // com.google.common.util.concurrent.j.n
        I28 nr(j jVar, I28 i28) {
            return (I28) this.nr.getAndSet(jVar, i28);
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean rl(j jVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.j.n(this.f59853O, jVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean t(j jVar, o oVar, o oVar2) {
            return androidx.concurrent.futures.j.n(this.f59855t, jVar, oVar, oVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class aC extends j implements Dsr {
        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final Object get(long j2, TimeUnit timeUnit) {
            return super.get(j2, timeUnit);
        }

        aC() {
        }

        @Override // com.google.common.util.concurrent.j, com.google.common.util.concurrent.Xo
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            return super.cancel(z2);
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    private static final class fuX extends n {
        private fuX() {
            super();
        }

        @Override // com.google.common.util.concurrent.j.n
        o O(j jVar, o oVar) {
            o oVar2;
            synchronized (jVar) {
                try {
                    oVar2 = jVar.f59842O;
                    if (oVar2 != oVar) {
                        jVar.f59842O = oVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return oVar2;
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean n(j jVar, I28 i28, I28 i282) {
            synchronized (jVar) {
                try {
                    if (jVar.f59844t != i28) {
                        return false;
                    }
                    jVar.f59844t = i282;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.j.n
        I28 nr(j jVar, I28 i28) {
            I28 i282;
            synchronized (jVar) {
                try {
                    i282 = jVar.f59844t;
                    if (i282 != i28) {
                        jVar.f59844t = i28;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i282;
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean rl(j jVar, Object obj, Object obj2) {
            synchronized (jVar) {
                try {
                    if (jVar.f59843n != obj) {
                        return false;
                    }
                    jVar.f59843n = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.j.n
        boolean t(j jVar, o oVar, o oVar2) {
            synchronized (jVar) {
                try {
                    if (jVar.f59842O != oVar) {
                        return false;
                    }
                    jVar.f59842O = oVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.j.n
        void J2(o oVar, o oVar2) {
            oVar.rl = oVar2;
        }

        @Override // com.google.common.util.concurrent.j.n
        void Uo(o oVar, Thread thread) {
            oVar.f59857n = thread;
        }
    }

    private static abstract class n {
        private n() {
        }

        abstract void J2(o oVar, o oVar2);

        abstract o O(j jVar, o oVar);

        abstract void Uo(o oVar, Thread thread);

        abstract boolean n(j jVar, I28 i28, I28 i282);

        abstract I28 nr(j jVar, I28 i28);

        abstract boolean rl(j jVar, Object obj, Object obj2);

        abstract boolean t(j jVar, o oVar, o oVar2);
    }

    private static final class o {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final o f59856t = new o(false);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile Thread f59857n;
        volatile o rl;

        o(boolean z2) {
        }

        o() {
            j.f59840o.Uo(this, Thread.currentThread());
        }

        void rl() {
            Thread thread = this.f59857n;
            if (thread != null) {
                this.f59857n = null;
                LockSupport.unpark(thread);
            }
        }

        void n(o oVar) {
            j.f59840o.J2(this, oVar);
        }
    }

    private static final class w6 {
        static final w6 nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final w6 f59858t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f59859n;
        final Throwable rl;

        static {
            if (j.J2) {
                nr = null;
                f59858t = null;
            } else {
                nr = new w6(false, null);
                f59858t = new w6(true, null);
            }
        }

        w6(boolean z2, Throwable th) {
            this.f59859n = z2;
            this.rl = th;
        }
    }

    private static Object S(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void nY(o oVar) {
        oVar.f59857n = null;
        while (true) {
            o oVar2 = this.f59842O;
            if (oVar2 == o.f59856t) {
                return;
            }
            o oVar3 = null;
            while (oVar2 != null) {
                o oVar4 = oVar2.rl;
                if (oVar2.f59857n != null) {
                    oVar3 = oVar2;
                } else if (oVar3 != null) {
                    oVar3.rl = oVar4;
                    if (oVar3.f59857n == null) {
                        break;
                    }
                } else if (!f59840o.t(this, oVar2, oVar4)) {
                    break;
                }
                oVar2 = oVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(j jVar, boolean z2) {
        I28 i28 = null;
        while (true) {
            jVar.ViF();
            if (z2) {
                jVar.WPU();
                z2 = false;
            }
            jVar.az();
            I28 i28Ik = jVar.Ik(i28);
            while (i28Ik != null) {
                i28 = i28Ik.f59851t;
                Runnable runnable = i28Ik.f59850n;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof CN3) {
                    CN3 cn3 = (CN3) runnable2;
                    jVar = cn3.f59848n;
                    if (jVar.f59843n == cn3) {
                        if (f59840o.rl(jVar, cn3, XQ(cn3.f59849t))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = i28Ik.rl;
                    Objects.requireNonNull(executor);
                    o(runnable2, executor);
                }
                i28Ik = i28;
            }
            return;
        }
    }

    protected void WPU() {
    }

    protected void az() {
    }

    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f59843n;
        if ((obj != null) && (!(obj instanceof CN3))) {
            return Z(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o oVar = this.f59842O;
            if (oVar != o.f59856t) {
                o oVar2 = new o();
                do {
                    oVar2.n(oVar);
                    if (f59840o.t(this, oVar, oVar2)) {
                        do {
                            AbstractC1901c.n(this, nanos);
                            if (Thread.interrupted()) {
                                nY(oVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f59843n;
                            if ((obj2 != null) && (!(obj2 instanceof CN3))) {
                                return Z(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        nY(oVar2);
                    } else {
                        oVar = this.f59842O;
                    }
                } while (oVar != o.f59856t);
            }
            Object obj3 = this.f59843n;
            Objects.requireNonNull(obj3);
            return Z(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f59843n;
            if ((obj4 != null) && (!(obj4 instanceof CN3))) {
                return Z(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.j$j] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    static {
        boolean z2;
        Throwable th;
        n wre;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", V8ValueBoolean.FALSE));
        } catch (SecurityException unused) {
            z2 = false;
        }
        J2 = z2;
        f59841r = new Pl(j.class);
        ?? r42 = 0;
        r42 = 0;
        try {
            wre = new C();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                wre = new Wre(AtomicReferenceFieldUpdater.newUpdater(o.class, Thread.class, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j), AtomicReferenceFieldUpdater.newUpdater(o.class, o.class, "rl"), AtomicReferenceFieldUpdater.newUpdater(j.class, o.class, "O"), AtomicReferenceFieldUpdater.newUpdater(j.class, I28.class, "t"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j));
            } catch (Error | Exception e3) {
                fuX fux = new fuX();
                r42 = e3;
                wre = fux;
            }
        }
        f59840o = wre;
        if (r42 != 0) {
            Pl pl = f59841r;
            Logger loggerN = pl.n();
            Level level = Level.SEVERE;
            loggerN.log(level, "UnsafeAtomicHelper is broken!", th);
            pl.n().log(level, "SafeAtomicHelper is broken!", r42);
        }
        f59839Z = new Object();
    }

    private void HI(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e3) {
            e = e3;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private I28 Ik(I28 i28) {
        I28 i282 = i28;
        I28 i28Nr = f59840o.nr(this, I28.nr);
        while (i28Nr != null) {
            I28 i283 = i28Nr.f59851t;
            i28Nr.f59851t = i282;
            i282 = i28Nr;
            i28Nr = i283;
        }
        return i282;
    }

    private void ViF() {
        for (o oVarO = f59840o.O(this, o.f59856t); oVarO != null; oVarO = oVarO.rl) {
            oVarO.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object XQ(Xo xo) {
        Throwable thN;
        if (xo instanceof Dsr) {
            Object w6Var = ((j) xo).f59843n;
            if (w6Var instanceof w6) {
                w6 w6Var2 = (w6) w6Var;
                if (w6Var2.f59859n) {
                    w6Var = w6Var2.rl != null ? new w6(false, w6Var2.rl) : w6.nr;
                }
            }
            Objects.requireNonNull(w6Var);
            return w6Var;
        }
        if ((xo instanceof dsf.j) && (thN = dsf.n.n((dsf.j) xo)) != null) {
            return new Ml(thN);
        }
        boolean zIsCancelled = xo.isCancelled();
        if ((!J2) && zIsCancelled) {
            w6 w6Var3 = w6.nr;
            Objects.requireNonNull(w6Var3);
            return w6Var3;
        }
        try {
            Object objS = S(xo);
            if (!zIsCancelled) {
                return objS == null ? f59839Z : objS;
            }
            return new w6(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + xo));
        } catch (Error | Exception e2) {
            return new Ml(e2);
        } catch (CancellationException e3) {
            if (zIsCancelled) {
                return new w6(false, e3);
            }
            return new Ml(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + xo, e3));
        } catch (ExecutionException e4) {
            if (!zIsCancelled) {
                return new Ml(e4.getCause());
            }
            return new w6(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + xo, e4));
        }
    }

    private Object Z(Object obj) throws ExecutionException {
        if (obj instanceof w6) {
            throw ck("Task was cancelled.", ((w6) obj).rl);
        }
        if (obj instanceof Ml) {
            throw new ExecutionException(((Ml) obj).f59852n);
        }
        return obj == f59839Z ? l3D.rl() : obj;
    }

    private static CancellationException ck(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private void gh(StringBuilder sb) {
        try {
            Object objS = S(this);
            sb.append("SUCCESS, result=[");
            ty(sb, objS);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void ty(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append(V8ValueNull.NULL);
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String aYN() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void addListener(Runnable runnable, Executor executor) {
        I28 i28;
        t1.Xo.ck(runnable, "Runnable was null.");
        t1.Xo.ck(executor, "Executor was null.");
        if (!isDone() && (i28 = this.f59844t) != I28.nr) {
            I28 i282 = new I28(runnable, executor);
            do {
                i282.f59851t = i28;
                if (f59840o.n(this, i28, i282)) {
                    return;
                } else {
                    i28 = this.f59844t;
                }
            } while (i28 != I28.nr);
        }
        o(runnable, executor);
    }

    public boolean cancel(boolean z2) {
        w6 w6Var;
        Object obj = this.f59843n;
        if (!(obj == null) && !(obj instanceof CN3)) {
            return false;
        }
        if (J2) {
            w6Var = new w6(z2, new CancellationException("Future.cancel() was called."));
        } else {
            w6Var = z2 ? w6.f59858t : w6.nr;
            Objects.requireNonNull(w6Var);
        }
        j jVar = this;
        boolean z3 = false;
        while (true) {
            if (f59840o.rl(jVar, obj, w6Var)) {
                r(jVar, z2);
                if (!(obj instanceof CN3)) {
                    break;
                }
                Xo xo = ((CN3) obj).f59849t;
                if (!(xo instanceof Dsr)) {
                    xo.cancel(z2);
                    break;
                }
                jVar = (j) xo;
                obj = jVar.f59843n;
                if (!(obj == null) && !(obj instanceof CN3)) {
                    break;
                }
                z3 = true;
            } else {
                obj = jVar.f59843n;
                if (!(obj instanceof CN3)) {
                    return z3;
                }
            }
        }
        return true;
    }

    protected final boolean fD() {
        Object obj = this.f59843n;
        return (obj instanceof w6) && ((w6) obj).f59859n;
    }

    protected boolean g(Object obj) {
        if (obj == null) {
            obj = f59839Z;
        }
        if (!f59840o.rl(this, null, obj)) {
            return false;
        }
        r(this, false);
        return true;
    }

    public boolean isCancelled() {
        return this.f59843n instanceof w6;
    }

    public boolean isDone() {
        return (!(r0 instanceof CN3)) & (this.f59843n != null);
    }

    @Override // dsf.j
    protected final Throwable n() {
        if (!(this instanceof Dsr)) {
            return null;
        }
        Object obj = this.f59843n;
        if (obj instanceof Ml) {
            return ((Ml) obj).f59852n;
        }
        return null;
    }

    protected boolean te(Throwable th) {
        if (!f59840o.rl(this, null, new Ml((Throwable) t1.Xo.HI(th)))) {
            return false;
        }
        r(this, false);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            gh(sb);
        } else {
            qie(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    private static final class I28 {
        static final I28 nr = new I28();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f59850n;
        final Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        I28 f59851t;

        I28(Runnable runnable, Executor executor) {
            this.f59850n = runnable;
            this.rl = executor;
        }

        I28() {
            this.f59850n = null;
            this.rl = null;
        }
    }

    protected j() {
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f59841r.n().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private void qie(StringBuilder sb) {
        String strN;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f59843n;
        if (obj instanceof CN3) {
            sb.append(", setFuture=[");
            HI(sb, ((CN3) obj).f59849t);
            sb.append("]");
        } else {
            try {
                strN = t1.s4.n(aYN());
            } catch (Exception | StackOverflowError e2) {
                strN = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strN != null) {
                sb.append(", info=[");
                sb.append(strN);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            gh(sb);
        }
    }

    protected boolean iF(Xo xo) {
        Ml ml;
        t1.Xo.HI(xo);
        Object obj = this.f59843n;
        if (obj == null) {
            if (xo.isDone()) {
                if (!f59840o.rl(this, null, XQ(xo))) {
                    return false;
                }
                r(this, false);
                return true;
            }
            CN3 cn3 = new CN3(this, xo);
            if (f59840o.rl(this, null, cn3)) {
                try {
                    xo.addListener(cn3, com.google.common.util.concurrent.Ml.INSTANCE);
                } catch (Throwable th) {
                    try {
                        ml = new Ml(th);
                    } catch (Error | Exception unused) {
                        ml = Ml.rl;
                    }
                    f59840o.rl(this, cn3, ml);
                }
                return true;
            }
            obj = this.f59843n;
        }
        if (obj instanceof w6) {
            xo.cancel(((w6) obj).f59859n);
        }
        return false;
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f59843n;
            if ((obj2 != null) & (!(obj2 instanceof CN3))) {
                return Z(obj2);
            }
            o oVar = this.f59842O;
            if (oVar != o.f59856t) {
                o oVar2 = new o();
                do {
                    oVar2.n(oVar);
                    if (f59840o.t(this, oVar, oVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f59843n;
                            } else {
                                nY(oVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof CN3))));
                        return Z(obj);
                    }
                    oVar = this.f59842O;
                } while (oVar != o.f59856t);
            }
            Object obj3 = this.f59843n;
            Objects.requireNonNull(obj3);
            return Z(obj3);
        }
        throw new InterruptedException();
    }
}
