package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class DC implements Executor, Runnable {
    private static final Logger J2 = Logger.getLogger(DC.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final n f68246r = t();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Executor f68248n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Queue f68249t = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile int f68247O = 0;

    private static final class Ml extends n {
        private Ml() {
            super();
        }

        @Override // io.grpc.internal.DC.n
        public boolean n(DC dc, int i2, int i3) {
            synchronized (dc) {
                try {
                    if (dc.f68247O != i2) {
                        return false;
                    }
                    dc.f68247O = i3;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.DC.n
        public void rl(DC dc, int i2) {
            synchronized (dc) {
                dc.f68247O = i2;
            }
        }
    }

    private static abstract class n {
        private n() {
        }

        public abstract boolean n(DC dc, int i2, int i3);

        public abstract void rl(DC dc, int i2);
    }

    private static final class w6 extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater f68250n;

        private w6(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f68250n = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.DC.n
        public boolean n(DC dc, int i2, int i3) {
            return this.f68250n.compareAndSet(dc, i2, i3);
        }

        @Override // io.grpc.internal.DC.n
        public void rl(DC dc, int i2) {
            this.f68250n.set(dc, i2);
        }
    }

    private static n t() {
        try {
            return new w6(AtomicIntegerFieldUpdater.newUpdater(DC.class, "O"));
        } catch (Throwable th) {
            J2.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new Ml();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.f68248n;
            while (executor == this.f68248n && (runnable = (Runnable) this.f68249t.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    J2.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e2);
                }
            }
            f68246r.rl(this, 0);
            if (this.f68249t.isEmpty()) {
                return;
            }
            nr(null);
        } catch (Throwable th) {
            f68246r.rl(this, 0);
            throw th;
        }
    }

    private void nr(Runnable runnable) {
        if (f68246r.n(this, 0, -1)) {
            try {
                this.f68248n.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f68249t.remove(runnable);
                }
                f68246r.rl(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f68249t.add((Runnable) t1.Xo.ck(runnable, "'r' must not be null."));
        nr(runnable);
    }

    public DC(Executor executor) {
        t1.Xo.ck(executor, "'executor' must not be null.");
        this.f68248n = executor;
    }
}
