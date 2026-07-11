package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import com.alightcreative.time.Kw.znsSxz;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.google.common.util.concurrent.Xo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Locale;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public abstract class AbstractResolvableFuture<V> implements Xo {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Object f34379Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final AtomicHelper f34380o;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    volatile Waiter f34382O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile Object f34383n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    volatile Listener f34384t;
    static final boolean J2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", V8ValueBoolean.FALSE));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f34381r = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        abstract void O(Waiter waiter, Thread thread);

        abstract boolean n(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2);

        abstract void nr(Waiter waiter, Waiter waiter2);

        abstract boolean rl(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        abstract boolean t(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class Cancellation {
        static final Cancellation nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Cancellation f34385t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f34386n;
        final Throwable rl;

        static {
            if (AbstractResolvableFuture.J2) {
                nr = null;
                f34385t = null;
            } else {
                nr = new Cancellation(false, null);
                f34385t = new Cancellation(true, null);
            }
        }

        Cancellation(boolean z2, Throwable th) {
            this.f34386n = z2;
            this.rl = th;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f34390O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f34391n;
        final AtomicReferenceFieldUpdater nr;
        final AtomicReferenceFieldUpdater rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f34392t;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f34391n = atomicReferenceFieldUpdater;
            this.rl = atomicReferenceFieldUpdater2;
            this.f34392t = atomicReferenceFieldUpdater3;
            this.nr = atomicReferenceFieldUpdater4;
            this.f34390O = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void O(Waiter waiter, Thread thread) {
            this.f34391n.lazySet(waiter, thread);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean n(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            return j.n(this.nr, abstractResolvableFuture, listener, listener2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void nr(Waiter waiter, Waiter waiter2) {
            this.rl.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean rl(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            return j.n(this.f34390O, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean t(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            return j.n(this.f34392t, abstractResolvableFuture, waiter, waiter2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class SetFuture<V> implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AbstractResolvableFuture f34393n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Xo f34394t;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f34393n.f34383n != this) {
                return;
            }
            if (AbstractResolvableFuture.f34380o.rl(this.f34393n, this, AbstractResolvableFuture.mUb(this.f34394t))) {
                AbstractResolvableFuture.Uo(this.f34393n);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean n(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f34384t != listener) {
                        return false;
                    }
                    abstractResolvableFuture.f34384t = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean rl(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f34383n != obj) {
                        return false;
                    }
                    abstractResolvableFuture.f34383n = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean t(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f34382O != waiter) {
                        return false;
                    }
                    abstractResolvableFuture.f34382O = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void O(Waiter waiter, Thread thread) {
            waiter.f34396n = thread;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void nr(Waiter waiter, Waiter waiter2) {
            waiter.rl = waiter2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class Waiter {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Waiter f34395t = new Waiter(false);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile Thread f34396n;
        volatile Waiter rl;

        Waiter(boolean z2) {
        }

        Waiter() {
            AbstractResolvableFuture.f34380o.O(this, Thread.currentThread());
        }

        void n(Waiter waiter) {
            AbstractResolvableFuture.f34380o.nr(this, waiter);
        }

        void rl() {
            Thread thread = this.f34396n;
            if (thread != null) {
                this.f34396n = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void HI(Waiter waiter) {
        waiter.f34396n = null;
        while (true) {
            Waiter waiter2 = this.f34382O;
            if (waiter2 == Waiter.f34395t) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.rl;
                if (waiter2.f34396n != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.rl = waiter4;
                    if (waiter3.f34396n == null) {
                        break;
                    }
                } else if (!f34380o.t(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    static void Uo(AbstractResolvableFuture abstractResolvableFuture) {
        Listener listener = null;
        while (true) {
            abstractResolvableFuture.ty();
            abstractResolvableFuture.rl();
            Listener listenerJ2 = abstractResolvableFuture.J2(listener);
            while (listenerJ2 != null) {
                listener = listenerJ2.f34389t;
                Runnable runnable = listenerJ2.f34388n;
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractResolvableFuture = setFuture.f34393n;
                    if (abstractResolvableFuture.f34383n == setFuture) {
                        if (f34380o.rl(abstractResolvableFuture, setFuture, mUb(setFuture.f34394t))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    KN(runnable, listenerJ2.rl);
                }
                listenerJ2 = listener;
            }
            return;
        }
    }

    static Object gh(Future future) {
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

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34383n;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return xMQ(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.f34382O;
            if (waiter != Waiter.f34395t) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.n(waiter);
                    if (f34380o.t(this, waiter, waiter2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                HI(waiter2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34383n;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return xMQ(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        HI(waiter2);
                    } else {
                        waiter = this.f34382O;
                    }
                } while (waiter != Waiter.f34395t);
            }
            return xMQ(this.f34383n);
        }
        while (nanos > 0) {
            Object obj3 = this.f34383n;
            if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                return xMQ(obj3);
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

    protected void qie() {
    }

    protected void rl() {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class Failure {
        static final Failure rl = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Throwable f34387n;

        Failure(Throwable th) {
            this.f34387n = (Throwable) AbstractResolvableFuture.nr(th);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class Listener {
        static final Listener nr = new Listener(null, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f34388n;
        final Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Listener f34389t;

        Listener(Runnable runnable, Executor executor) {
            this.f34388n = runnable;
            this.rl = executor;
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, c.f62177j), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "rl"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "O"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "t"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, c.f62177j));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        f34380o = synchronizedHelper;
        if (th != null) {
            f34381r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f34379Z = new Object();
    }

    private Listener J2(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.f34384t;
        } while (!f34380o.n(this, listener2, Listener.nr));
        Listener listener3 = listener;
        Listener listener4 = listener2;
        while (listener4 != null) {
            Listener listener5 = listener4.f34389t;
            listener4.f34389t = listener3;
            listener3 = listener4;
            listener4 = listener5;
        }
        return listener3;
    }

    static Object mUb(Xo xo) {
        if (xo instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) xo).f34383n;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.f34386n ? cancellation.rl != null ? new Cancellation(false, cancellation.rl) : Cancellation.nr : obj;
        }
        boolean zIsCancelled = xo.isCancelled();
        if ((!J2) && zIsCancelled) {
            return Cancellation.nr;
        }
        try {
            Object objGh = gh(xo);
            return objGh == null ? f34379Z : objGh;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new Cancellation(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + xo, e2));
        } catch (ExecutionException e3) {
            return new Failure(e3.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    private void n(StringBuilder sb) {
        try {
            Object objGh = gh(this);
            sb.append("SUCCESS, result=[");
            sb.append(r(objGh));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static CancellationException t(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private void ty() {
        Waiter waiter;
        do {
            waiter = this.f34382O;
        } while (!f34380o.t(this, waiter, Waiter.f34395t));
        while (waiter != null) {
            waiter.rl();
            waiter = waiter.rl;
        }
    }

    private Object xMQ(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw t("Task was cancelled.", ((Cancellation) obj).rl);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f34387n);
        }
        if (obj == f34379Z) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Ik(Throwable th) {
        if (!f34380o.rl(this, null, new Failure((Throwable) nr(th)))) {
            return false;
        }
        Uo(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String az() {
        Object obj = this.f34383n;
        if (obj instanceof SetFuture) {
            return "setFuture=[" + r(((SetFuture) obj).f34394t) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f34383n;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        Cancellation cancellation = J2 ? new Cancellation(z2, new CancellationException("Future.cancel() was called.")) : z2 ? Cancellation.f34385t : Cancellation.nr;
        AbstractResolvableFuture<V> abstractResolvableFuture = this;
        boolean z3 = false;
        while (true) {
            if (f34380o.rl(abstractResolvableFuture, obj, cancellation)) {
                if (z2) {
                    abstractResolvableFuture.qie();
                }
                Uo(abstractResolvableFuture);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                Xo xo = ((SetFuture) obj).f34394t;
                if (!(xo instanceof AbstractResolvableFuture)) {
                    xo.cancel(z2);
                    break;
                }
                abstractResolvableFuture = (AbstractResolvableFuture) xo;
                obj = abstractResolvableFuture.f34383n;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z3 = true;
            } else {
                obj = abstractResolvableFuture.f34383n;
                if (!(obj instanceof SetFuture)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ck(Object obj) {
        if (obj == null) {
            obj = f34379Z;
        }
        if (!f34380o.rl(this, null, obj)) {
            return false;
        }
        Uo(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34383n instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f34383n != null);
    }

    protected final boolean o() {
        Object obj = this.f34383n;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f34386n;
    }

    public String toString() {
        String strAz;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            n(sb);
        } else {
            try {
                strAz = az();
            } catch (RuntimeException e2) {
                strAz = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strAz != null && !strAz.isEmpty()) {
                sb.append(znsSxz.OSJcw);
                sb.append(strAz);
                sb.append("]");
            } else if (isDone()) {
                n(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected AbstractResolvableFuture() {
    }

    private static void KN(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f34381r.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    static Object nr(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // com.google.common.util.concurrent.Xo
    public final void addListener(Runnable runnable, Executor executor) {
        nr(runnable);
        nr(executor);
        Listener listener = this.f34384t;
        if (listener != Listener.nr) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f34389t = listener;
                if (f34380o.n(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.f34384t;
                }
            } while (listener != Listener.nr);
        }
        KN(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f34383n;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return xMQ(obj2);
            }
            Waiter waiter = this.f34382O;
            if (waiter != Waiter.f34395t) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.n(waiter);
                    if (f34380o.t(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f34383n;
                            } else {
                                HI(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return xMQ(obj);
                    }
                    waiter = this.f34382O;
                } while (waiter != Waiter.f34395t);
            }
            return xMQ(this.f34383n);
        }
        throw new InterruptedException();
    }
}
