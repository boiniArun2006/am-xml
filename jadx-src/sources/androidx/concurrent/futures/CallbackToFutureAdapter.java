package androidx.concurrent.futures;

import com.google.common.util.concurrent.Xo;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CallbackToFutureAdapter {

    public static final class Completer<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f34397n;
        private boolean nr;
        SafeFuture rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ResolvableFuture f34398t = ResolvableFuture.Z();

        private void O() {
            this.f34397n = null;
            this.rl = null;
            this.f34398t = null;
        }

        public boolean J2(Throwable th) {
            this.nr = true;
            SafeFuture safeFuture = this.rl;
            boolean z2 = safeFuture != null && safeFuture.t(th);
            if (z2) {
                O();
            }
            return z2;
        }

        public boolean nr() {
            this.nr = true;
            SafeFuture safeFuture = this.rl;
            boolean z2 = safeFuture != null && safeFuture.n(true);
            if (z2) {
                O();
            }
            return z2;
        }

        void rl() {
            this.f34397n = null;
            this.rl = null;
            this.f34398t.ck(null);
        }

        public boolean t(Object obj) {
            this.nr = true;
            SafeFuture safeFuture = this.rl;
            boolean z2 = safeFuture != null && safeFuture.rl(obj);
            if (z2) {
                O();
            }
            return z2;
        }

        protected void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.rl;
            if (safeFuture != null && !safeFuture.isDone()) {
                safeFuture.t(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f34397n));
            }
            if (this.nr || (resolvableFuture = this.f34398t) == null) {
                return;
            }
            resolvableFuture.ck(null);
        }

        public void n(Runnable runnable, Executor executor) {
            ResolvableFuture resolvableFuture = this.f34398t;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        Completer() {
        }
    }

    public interface Resolver<T> {
        Object attachCompleter(Completer completer);
    }

    private static final class SafeFuture<T> implements Xo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final WeakReference f34399n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final AbstractResolvableFuture f34400t = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected String az() {
                Completer completer = (Completer) SafeFuture.this.f34399n.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.f34397n + "]";
            }
        };

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f34400t.get();
        }

        @Override // com.google.common.util.concurrent.Xo
        public void addListener(Runnable runnable, Executor executor) {
            this.f34400t.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            Completer completer = (Completer) this.f34399n.get();
            boolean zCancel = this.f34400t.cancel(z2);
            if (zCancel && completer != null) {
                completer.rl();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j2, TimeUnit timeUnit) {
            return this.f34400t.get(j2, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f34400t.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f34400t.isDone();
        }

        boolean n(boolean z2) {
            return this.f34400t.cancel(z2);
        }

        boolean rl(Object obj) {
            return this.f34400t.ck(obj);
        }

        boolean t(Throwable th) {
            return this.f34400t.Ik(th);
        }

        public String toString() {
            return this.f34400t.toString();
        }

        SafeFuture(Completer completer) {
            this.f34399n = new WeakReference(completer);
        }
    }

    static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        FutureGarbageCollectedException(String str) {
            super(str);
        }
    }

    public static Xo n(Resolver resolver) {
        Completer completer = new Completer();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.rl = safeFuture;
        completer.f34397n = resolver.getClass();
        try {
            Object objAttachCompleter = resolver.attachCompleter(completer);
            if (objAttachCompleter != null) {
                completer.f34397n = objAttachCompleter;
                return safeFuture;
            }
        } catch (Exception e2) {
            safeFuture.t(e2);
        }
        return safeFuture;
    }
}
