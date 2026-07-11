package GJW;

import GJW.Mf;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Md extends Mf implements Runnable {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Md f3426S;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f3427g;

    private final synchronized boolean D76() {
        if (I9f()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final synchronized Thread XNZ() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f3426S.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized void xzo() {
        if (I9f()) {
            debugStatus = 3;
            g6();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @Override // GJW.Mf, GJW.KH
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    static {
        Long l2;
        Md md = new Md();
        f3426S = md;
        KH.Qu(md, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f3427g = timeUnit.toNanos(l2.longValue());
    }

    private final boolean I9f() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final void NP() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final boolean lNy() {
        return debugStatus == 4;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zS;
        Y5.f3467n.nr(this);
        w6.n();
        try {
            if (!D76()) {
                if (zS) {
                    return;
                } else {
                    return;
                }
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jX4T = X4T();
                if (jX4T == Long.MAX_VALUE) {
                    w6.n();
                    long jNanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f3427g + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        xzo();
                        w6.n();
                        if (s()) {
                            return;
                        }
                        xVH();
                        return;
                    }
                    jX4T = RangesKt.coerceAtMost(jX4T, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (jX4T > 0) {
                    if (I9f()) {
                        _thread = null;
                        xzo();
                        w6.n();
                        if (s()) {
                            return;
                        }
                        xVH();
                        return;
                    }
                    w6.n();
                    LockSupport.parkNanos(this, jX4T);
                }
            }
        } finally {
            _thread = null;
            xzo();
            w6.n();
            if (!s()) {
                xVH();
            }
        }
    }

    @Override // GJW.lej
    public String toString() {
        return "DefaultExecutor";
    }

    @Override // GJW.o7q
    protected Thread xVH() {
        Thread thread = _thread;
        return thread == null ? XNZ() : thread;
    }

    private Md() {
    }

    @Override // GJW.o7q
    protected void EF(long j2, Mf.w6 w6Var) {
        NP();
    }

    @Override // GJW.Mf, GJW.iF
    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return Toy(j2, runnable);
    }

    @Override // GJW.Mf
    public void nO(Runnable runnable) {
        if (lNy()) {
            NP();
        }
        super.nO(runnable);
    }
}
