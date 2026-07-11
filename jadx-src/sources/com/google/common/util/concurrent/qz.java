package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
abstract class qz extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Runnable f59863n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Runnable f59864t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final qz f59865n;

        @Override // java.lang.Runnable
        public void run() {
        }

        private n(qz qzVar) {
            this.f59865n = qzVar;
        }

        public String toString() {
            return this.f59865n.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rl(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class w6 implements Runnable {
        private w6() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    abstract String J2();

    abstract Object O();

    abstract void n(Throwable th);

    abstract boolean nr();

    abstract void rl(Object obj);

    static {
        f59863n = new w6();
        f59864t = new w6();
    }

    qz() {
    }

    private void Uo(Thread thread) {
        Runnable runnable = (Runnable) get();
        n nVar = null;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean z3 = runnable instanceof n;
            if (!z3 && runnable != f59864t) {
                break;
            }
            if (z3) {
                nVar = (n) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = f59864t;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    LockSupport.park(nVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objO = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zNr = nr();
            if (!zNr) {
                try {
                    objO = O();
                } catch (Throwable th) {
                    try {
                        s4.n(th);
                        if (!compareAndSet(threadCurrentThread, f59863n)) {
                            Uo(threadCurrentThread);
                        }
                        if (!zNr) {
                            n(th);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, f59863n)) {
                            Uo(threadCurrentThread);
                        }
                        if (!zNr) {
                            rl(l3D.n(null));
                        }
                    }
                }
            }
        }
    }

    final void t() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            n nVar = new n();
            nVar.rl(Thread.currentThread());
            if (compareAndSet(runnable, nVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f59863n)) == f59864t) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f59863n) {
            str = "running=[DONE]";
        } else if (runnable instanceof n) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = dpcnwfoVOnrtRA.GRNygYu + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + J2();
    }
}
