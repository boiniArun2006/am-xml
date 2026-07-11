package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.j;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public abstract class AbstractFuture<V> implements Xo {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Object f43048Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final AtomicHelper f43049o;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    volatile Waiter f43051O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile Object f43052n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    volatile Listener f43053t;
    static final boolean J2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", V8ValueBoolean.FALSE));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f43050r = Logger.getLogger(AbstractFuture.class.getName());

    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        abstract void O(Waiter waiter, Thread thread);

        abstract boolean n(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        abstract void nr(Waiter waiter, Waiter waiter2);

        abstract boolean rl(AbstractFuture abstractFuture, Object obj, Object obj2);

        abstract boolean t(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);
    }

    private static final class Cancellation {
        static final Cancellation nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Cancellation f43054t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final boolean f43055n;
        final Throwable rl;

        static {
            if (AbstractFuture.J2) {
                nr = null;
                f43054t = null;
            } else {
                nr = new Cancellation(false, null);
                f43054t = new Cancellation(true, null);
            }
        }

        Cancellation(boolean z2, Throwable th) {
            this.f43055n = z2;
            this.rl = th;
        }
    }

    private static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f43059O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f43060n;
        final AtomicReferenceFieldUpdater nr;
        final AtomicReferenceFieldUpdater rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f43061t;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f43060n = atomicReferenceFieldUpdater;
            this.rl = atomicReferenceFieldUpdater2;
            this.f43061t = atomicReferenceFieldUpdater3;
            this.nr = atomicReferenceFieldUpdater4;
            this.f43059O = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void O(Waiter waiter, Thread thread) {
            this.f43060n.lazySet(waiter, thread);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean n(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return j.n(this.nr, abstractFuture, listener, listener2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void nr(Waiter waiter, Waiter waiter2) {
            this.rl.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean rl(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return j.n(this.f43059O, abstractFuture, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean t(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return j.n(this.f43061t, abstractFuture, waiter, waiter2);
        }
    }

    private static final class SetFuture<V> implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AbstractFuture f43062n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Xo f43063t;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43062n.f43052n != this) {
                return;
            }
            if (AbstractFuture.f43049o.rl(this.f43062n, this, AbstractFuture.xMQ(this.f43063t))) {
                AbstractFuture.J2(this.f43062n);
            }
        }

        SetFuture(AbstractFuture abstractFuture, Xo xo) {
            this.f43062n = abstractFuture;
            this.f43063t = xo;
        }
    }

    private static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean n(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f43053t != listener) {
                        return false;
                    }
                    abstractFuture.f43053t = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean rl(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f43052n != obj) {
                        return false;
                    }
                    abstractFuture.f43052n = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean t(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f43051O != waiter) {
                        return false;
                    }
                    abstractFuture.f43051O = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void O(Waiter waiter, Thread thread) {
            waiter.f43065n = thread;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void nr(Waiter waiter, Waiter waiter2) {
            waiter.rl = waiter2;
        }
    }

    private static final class Waiter {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final Waiter f43064t = new Waiter(false);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile Thread f43065n;
        volatile Waiter rl;

        Waiter(boolean z2) {
        }

        Waiter() {
            AbstractFuture.f43049o.O(this, Thread.currentThread());
        }

        void n(Waiter waiter) {
            AbstractFuture.f43049o.nr(this, waiter);
        }

        void rl() {
            Thread thread = this.f43065n;
            if (thread != null) {
                this.f43065n = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static void J2(AbstractFuture abstractFuture) {
        Listener listener = null;
        while (true) {
            abstractFuture.az();
            abstractFuture.rl();
            Listener listenerO = abstractFuture.O(listener);
            while (listenerO != null) {
                listener = listenerO.f43058t;
                Runnable runnable = listenerO.f43057n;
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    abstractFuture = setFuture.f43062n;
                    if (abstractFuture.f43052n == setFuture) {
                        if (f43049o.rl(abstractFuture, setFuture, xMQ(setFuture.f43063t))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Uo(runnable, listenerO.rl);
                }
                listenerO = listener;
            }
            return;
        }
    }

    private static Object mUb(Future future) {
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

    private void ty(Waiter waiter) {
        waiter.f43065n = null;
        while (true) {
            Waiter waiter2 = this.f43051O;
            if (waiter2 == Waiter.f43064t) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.rl;
                if (waiter2.f43065n != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.rl = waiter4;
                    if (waiter3.f43065n == null) {
                        break;
                    }
                } else if (!f43049o.t(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f43052n;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return KN(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.f43051O;
            if (waiter != Waiter.f43064t) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.n(waiter);
                    if (f43049o.t(this, waiter, waiter2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                ty(waiter2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f43052n;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return KN(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        ty(waiter2);
                    } else {
                        waiter = this.f43051O;
                    }
                } while (waiter != Waiter.f43064t);
            }
            return KN(this.f43052n);
        }
        while (nanos > 0) {
            Object obj3 = this.f43052n;
            if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                return KN(obj3);
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

    protected void gh() {
    }

    protected void rl() {
    }

    private static final class Failure {
        static final Failure rl = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Throwable f43056n;

        Failure(Throwable th) {
            this.f43056n = (Throwable) AbstractFuture.nr(th);
        }
    }

    private static final class Listener {
        static final Listener nr = new Listener(null, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f43057n;
        final Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Listener f43058t;

        Listener(Runnable runnable, Executor executor) {
            this.f43057n = runnable;
            this.rl = executor;
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, c.f62177j), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "rl"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "O"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "t"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, c.f62177j));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        f43049o = synchronizedHelper;
        if (th != null) {
            f43050r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f43048Z = new Object();
    }

    private Object KN(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw t("Task was cancelled.", ((Cancellation) obj).rl);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f43056n);
        }
        if (obj == f43048Z) {
            return null;
        }
        return obj;
    }

    private Listener O(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.f43053t;
        } while (!f43049o.n(this, listener2, Listener.nr));
        Listener listener3 = listener;
        Listener listener4 = listener2;
        while (listener4 != null) {
            Listener listener5 = listener4.f43058t;
            listener4.f43058t = listener3;
            listener3 = listener4;
            listener4 = listener5;
        }
        return listener3;
    }

    private void az() {
        Waiter waiter;
        do {
            waiter = this.f43051O;
        } while (!f43049o.t(this, waiter, Waiter.f43064t));
        while (waiter != null) {
            waiter.rl();
            waiter = waiter.rl;
        }
    }

    private void n(StringBuilder sb) {
        try {
            Object objMUb = mUb(this);
            sb.append("SUCCESS, result=[");
            sb.append(r(objMUb));
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

    static Object xMQ(Xo xo) {
        if (xo instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) xo).f43052n;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.f43055n ? cancellation.rl != null ? new Cancellation(false, cancellation.rl) : Cancellation.nr : obj;
        }
        boolean zIsCancelled = xo.isCancelled();
        if ((!J2) && zIsCancelled) {
            return Cancellation.nr;
        }
        try {
            Object objMUb = mUb(xo);
            return objMUb == null ? f43048Z : objMUb;
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

    protected boolean HI(Object obj) {
        if (obj == null) {
            obj = f43048Z;
        }
        if (!f43049o.rl(this, null, obj)) {
            return false;
        }
        J2(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f43052n;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        Cancellation cancellation = J2 ? new Cancellation(z2, new CancellationException("Future.cancel() was called.")) : z2 ? Cancellation.f43054t : Cancellation.nr;
        AbstractFuture<V> abstractFuture = this;
        boolean z3 = false;
        while (true) {
            if (f43049o.rl(abstractFuture, obj, cancellation)) {
                if (z2) {
                    abstractFuture.gh();
                }
                J2(abstractFuture);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                Xo xo = ((SetFuture) obj).f43063t;
                if (!(xo instanceof AbstractFuture)) {
                    xo.cancel(z2);
                    break;
                }
                abstractFuture = (AbstractFuture) xo;
                obj = abstractFuture.f43052n;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z3 = true;
            } else {
                obj = abstractFuture.f43052n;
                if (!(obj instanceof SetFuture)) {
                    return z3;
                }
            }
        }
        return true;
    }

    protected boolean ck(Throwable th) {
        if (!f43049o.rl(this, null, new Failure((Throwable) nr(th)))) {
            return false;
        }
        J2(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f43052n instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f43052n != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String qie() {
        Object obj = this.f43052n;
        if (obj instanceof SetFuture) {
            return "setFuture=[" + r(((SetFuture) obj).f43063t) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strQie;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            n(sb);
        } else {
            try {
                strQie = qie();
            } catch (RuntimeException e2) {
                strQie = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strQie != null && !strQie.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strQie);
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

    protected AbstractFuture() {
    }

    private static void Uo(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f43050r.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    static Object nr(Object obj) {
        obj.getClass();
        return obj;
    }

    protected boolean Ik(Xo xo) {
        Failure failure;
        nr(xo);
        Object obj = this.f43052n;
        if (obj == null) {
            if (xo.isDone()) {
                if (!f43049o.rl(this, null, xMQ(xo))) {
                    return false;
                }
                J2(this);
                return true;
            }
            SetFuture setFuture = new SetFuture(this, xo);
            if (f43049o.rl(this, null, setFuture)) {
                try {
                    xo.addListener(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.rl;
                    }
                    f43049o.rl(this, setFuture, failure);
                }
                return true;
            }
            obj = this.f43052n;
        }
        if (obj instanceof Cancellation) {
            xo.cancel(((Cancellation) obj).f43055n);
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.Xo
    public final void addListener(Runnable runnable, Executor executor) {
        nr(runnable);
        nr(executor);
        Listener listener = this.f43053t;
        if (listener != Listener.nr) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f43058t = listener;
                if (f43049o.n(this, listener, listener2)) {
                    return;
                } else {
                    listener = this.f43053t;
                }
            } while (listener != Listener.nr);
        }
        Uo(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f43052n;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return KN(obj2);
            }
            Waiter waiter = this.f43051O;
            if (waiter != Waiter.f43064t) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.n(waiter);
                    if (f43049o.t(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f43052n;
                            } else {
                                ty(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return KN(obj);
                    }
                    waiter = this.f43051O;
                } while (waiter != Waiter.f43064t);
            }
            return KN(this.f43052n);
        }
        throw new InterruptedException();
    }
}
