package com.alightcreative.mediacore.naxyasync;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {
    public static final int $stable = 8;
    private boolean _stopRequested;
    private final LinkedBlockingQueue<Function0<Unit>> actionQueue;
    private final boolean canInterruptWorker;
    private final long defaultSleepTimeNanos;
    private final CountDownLatch joinWorkerLatch;
    private long nextWorkNanos;
    private long nowMicros;
    private int nowMillis;
    private long nowNanos;
    private volatile boolean running;
    private boolean startedWorker;
    private Thread workerThread;

    public o(long j2, boolean z2) {
        this.defaultSleepTimeNanos = j2;
        this.canInterruptWorker = z2;
        this.actionQueue = new LinkedBlockingQueue<>();
        this.running = true;
        this.joinWorkerLatch = new CountDownLatch(1);
    }

    protected abstract void doWork();

    protected abstract void onStart();

    protected abstract void onStop();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik() {
        return "Dispatch stopWorkerThread";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S() {
        return "Dispatch stopWorkerThreadSync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ() {
        return "Process stopWorkerThreadSync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(o oVar) {
        XoT.C.Uo(oVar, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.XQ();
            }
        });
        oVar.running = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o() {
        return "Process stopWorkerThread";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(o oVar) {
        Function0<Unit> function0Poll;
        XoT.C.Uo(oVar, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.fuX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.az();
            }
        });
        oVar.WPU();
        oVar.onStart();
        XoT.C.Uo(oVar, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.ty();
            }
        });
        while (oVar.running) {
            while (true) {
                Function0<Unit> function0Poll2 = oVar.actionQueue.poll();
                if (function0Poll2 == null) {
                    break;
                }
                oVar.WPU();
                if (oVar.nextWorkNanos == Long.MAX_VALUE) {
                    oVar.nextWorkNanos = 0L;
                }
                function0Poll2.invoke();
            }
            oVar.WPU();
            long j2 = oVar.nowNanos;
            long j3 = oVar.nextWorkNanos;
            if (j2 >= j3) {
                oVar.nextWorkNanos = j2 + oVar.defaultSleepTimeNanos;
                oVar.doWork();
            } else {
                try {
                    function0Poll = oVar.actionQueue.poll(j3 - j2, TimeUnit.NANOSECONDS);
                } catch (InterruptedException unused) {
                    function0Poll = null;
                }
                if (function0Poll != null) {
                    if (oVar.nextWorkNanos == Long.MAX_VALUE) {
                        oVar.nextWorkNanos = 0L;
                    }
                    oVar.WPU();
                    function0Poll.invoke();
                }
            }
        }
        XoT.C.Uo(oVar, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.HI();
            }
        });
        oVar.WPU();
        oVar.onStop();
        XoT.C.Uo(oVar, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.ck();
            }
        });
        oVar.joinWorkerLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(o oVar) {
        XoT.C.Uo(oVar, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.o();
            }
        });
        oVar.running = false;
        return Unit.INSTANCE;
    }

    protected final void allowSleepFor(long j2) {
        this.nextWorkNanos = Math.max(this.nextWorkNanos, this.nowNanos + j2);
    }

    protected final void allowSleepUntil(long j2) {
        this.nextWorkNanos = Math.max(this.nextWorkNanos, j2);
    }

    protected final void cancelSleep() {
        this.nextWorkNanos = 0L;
    }

    public final boolean getCanInterruptWorker() {
        return this.canInterruptWorker;
    }

    public final long getDefaultSleepTimeNanos() {
        return this.defaultSleepTimeNanos;
    }

    protected final long getNowMicros() {
        return this.nowMicros;
    }

    protected final int getNowMillis() {
        return this.nowMillis;
    }

    protected final long getNowNanos() {
        return this.nowNanos;
    }

    public final boolean getRunning() {
        return this.running;
    }

    protected final boolean getStopWorkerRequested() {
        return this._stopRequested;
    }

    protected final boolean runInWorker(Function0<Unit> action) throws InterruptedException {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!this.running) {
            return false;
        }
        this.actionQueue.put(action);
        return true;
    }

    protected final void startWorker() {
        if (this.startedWorker) {
            throw new IllegalStateException("Check failed.");
        }
        this.startedWorker = true;
        this.workerThread = ThreadsKt.thread$default(false, false, null, "Worker:" + getClass().getSimpleName(), 0, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.qie(this.f46750n);
            }
        }, 23, null);
    }

    protected final void stopWorkerThread() throws InterruptedException {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.Ik();
            }
        });
        this._stopRequested = true;
        runInWorker(new Function0() { // from class: com.alightcreative.mediacore.naxyasync.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.r(this.f46749n);
            }
        });
        if (this.canInterruptWorker) {
            Thread thread = this.workerThread;
            if (thread == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workerThread");
                thread = null;
            }
            thread.interrupt();
        }
    }

    protected final void stopWorkerThreadSync() throws InterruptedException {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.mediacore.naxyasync.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.S();
            }
        });
        this._stopRequested = true;
        runInWorker(new Function0() { // from class: com.alightcreative.mediacore.naxyasync.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.Z(this.f46751n);
            }
        });
        if (this.canInterruptWorker) {
            Thread thread = this.workerThread;
            if (thread == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workerThread");
                thread = null;
            }
            thread.interrupt();
        }
        while (this.running) {
            this.joinWorkerLatch.await(250L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI() {
        return "Begin worker thread termination : " + Thread.currentThread().getName();
    }

    private final void WPU() {
        long jNanoTime = System.nanoTime();
        this.nowNanos = jNanoTime;
        long j2 = 1000;
        long j3 = jNanoTime / j2;
        this.nowMicros = j3;
        this.nowMillis = (int) (j3 / j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az() {
        return "Start worker thread : " + Thread.currentThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck() {
        return "Terminated worker thread : " + Thread.currentThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty() {
        return Apsps.jRBIHHchnqWaI + Thread.currentThread().getName();
    }

    public /* synthetic */ o(long j2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000000L : j2, (i2 & 2) != 0 ? false : z2);
    }

    protected final void allowSleepUntilCommand() {
        this.nextWorkNanos = Long.MAX_VALUE;
    }
}
