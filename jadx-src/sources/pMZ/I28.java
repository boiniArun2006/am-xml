package pMZ;

import QNA.Z;
import QNA.h;
import QNA.yg;
import android.os.SystemClock;
import bF.aC;
import bF.fuX;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1M.CN3;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import veW.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class I28 {
    private final BlockingQueue J2;
    private final fuX KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f71886O;
    private final ThreadPoolExecutor Uo;
    private long gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f71887n;
    private final long nr;
    private final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f71888t;
    private final h xMQ;

    private final class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Z f71890n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final TaskCompletionSource f71891t;

        private n(Z z2, TaskCompletionSource taskCompletionSource) {
            this.f71890n = z2;
            this.f71891t = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            I28.this.ty(this.f71890n, this.f71891t);
            I28.this.xMQ.t();
            double dUo = I28.this.Uo();
            CN3.J2().rl("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dUo / 1000.0d)) + " s for report: " + this.f71890n.nr());
            I28.HI(dUo);
        }
    }

    I28(fuX fux, F5.Ml ml, h hVar) {
        this(ml.J2, ml.Uo, ((long) ml.KN) * 1000, fux, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void HI(double d2) {
        try {
            Thread.sleep((long) d2);
        } catch (InterruptedException unused) {
        }
    }

    I28(double d2, double d4, long j2, fuX fux, h hVar) {
        this.f71887n = d2;
        this.rl = d4;
        this.f71888t = j2;
        this.KN = fux;
        this.xMQ = hVar;
        this.nr = SystemClock.elapsedRealtime();
        int i2 = (int) d2;
        this.f71886O = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.J2 = arrayBlockingQueue;
        this.Uo = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.mUb = 0;
        this.gh = 0L;
    }

    private int KN() {
        if (this.gh == 0) {
            this.gh = az();
        }
        int iAz = (int) ((az() - this.gh) / this.f71888t);
        int iMin = qie() ? Math.min(100, this.mUb + iAz) : Math.max(0, this.mUb - iAz);
        if (this.mUb != iMin) {
            this.mUb = iMin;
            this.gh = az();
        }
        return iMin;
    }

    private boolean gh() {
        return this.J2.size() < this.f71886O;
    }

    private boolean qie() {
        return this.J2.size() == this.f71886O;
    }

    public void mUb() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: pMZ.Ml
            @Override // java.lang.Runnable
            public final void run() {
                I28.rl(this.f71892n, countDownLatch);
            }
        }).start();
        yg.t(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    TaskCompletionSource xMQ(Z z2, boolean z3) {
        synchronized (this.J2) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z3) {
                    ty(z2, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.xMQ.rl();
                if (!gh()) {
                    KN();
                    CN3.J2().rl("Dropping report due to queue being full: " + z2.nr());
                    this.xMQ.n();
                    taskCompletionSource.trySetResult(z2);
                    return taskCompletionSource;
                }
                CN3.J2().rl("Enqueueing report: " + z2.nr());
                CN3.J2().rl("Queue size: " + this.J2.size());
                this.Uo.execute(new n(z2, taskCompletionSource));
                CN3.J2().rl("Closing task for report: " + z2.nr());
                taskCompletionSource.trySetResult(z2);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long az() {
        return System.currentTimeMillis();
    }

    public static /* synthetic */ void n(I28 i28, TaskCompletionSource taskCompletionSource, boolean z2, Z z3, Exception exc) {
        i28.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z2) {
            i28.mUb();
        }
        taskCompletionSource.trySetResult(z3);
    }

    public static /* synthetic */ void rl(I28 i28, CountDownLatch countDownLatch) {
        i28.getClass();
        try {
            o.n(i28.KN, bF.I28.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(final Z z2, final TaskCompletionSource taskCompletionSource) {
        final boolean z3;
        CN3.J2().rl("Sending report through Google DataTransport: " + z2.nr());
        if (SystemClock.elapsedRealtime() - this.nr < 2000) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.KN.rl(bF.w6.Uo(z2.rl()), new aC() { // from class: pMZ.w6
            @Override // bF.aC
            public final void n(Exception exc) {
                I28.n(this.f71897n, taskCompletionSource, z3, z2, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double Uo() {
        return Math.min(3600000.0d, (60000.0d / this.f71887n) * Math.pow(this.rl, KN()));
    }
}
