package com.facebook.imagepipeline.producers;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.os.SystemClock;
import bA.C1653C;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class DAz {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f52452O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52453n;
    private final Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f52454t = new j();
    private final Runnable nr = new n();
    C1653C J2 = null;
    int Uo = 0;
    Wre KN = Wre.IDLE;
    long xMQ = 0;
    long mUb = 0;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static ScheduledExecutorService f52455n;

        static ScheduledExecutorService n() {
            if (f52455n == null) {
                f52455n = Executors.newSingleThreadScheduledExecutor();
            }
            return f52455n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface Ml {
        void n(C1653C c1653c, int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    enum Wre {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DAz.this.nr();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DAz.this.mUb();
        }
    }

    public synchronized long J2() {
        return this.mUb - this.xMQ;
    }

    public void t() {
        C1653C c1653c;
        synchronized (this) {
            c1653c = this.J2;
            this.J2 = null;
            this.Uo = 0;
        }
        C1653C.Uo(c1653c);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static /* synthetic */ class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f52462n;

        static {
            int[] iArr = new int[Wre.values().length];
            f52462n = iArr;
            try {
                iArr[Wre.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52462n[Wre.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52462n[Wre.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52462n[Wre.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void O(long j2) {
        Runnable runnableN = kd.j.n(this.nr, pTYaLzzmJSGAPQ.XZNnQzllpcB);
        if (j2 > 0) {
            I28.n().schedule(runnableN, j2, TimeUnit.MILLISECONDS);
        } else {
            runnableN.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mUb() {
        this.f52453n.execute(kd.j.n(this.f52454t, "JobScheduler_submitJob"));
    }

    public DAz(Executor executor, Ml ml, int i2) {
        this.f52453n = executor;
        this.rl = ml;
        this.f52452O = i2;
    }

    private void Uo() {
        long jMax;
        boolean z2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.KN == Wre.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.mUb + ((long) this.f52452O), jUptimeMillis);
                    this.xMQ = jUptimeMillis;
                    this.KN = Wre.QUEUED;
                    z2 = true;
                } else {
                    this.KN = Wre.IDLE;
                    jMax = 0;
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            O(jMax - jUptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nr() {
        C1653C c1653c;
        int i2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            c1653c = this.J2;
            i2 = this.Uo;
            this.J2 = null;
            this.Uo = 0;
            this.KN = Wre.RUNNING;
            this.mUb = jUptimeMillis;
        }
        try {
            if (xMQ(c1653c, i2)) {
                this.rl.n(c1653c, i2);
            }
        } finally {
            C1653C.Uo(c1653c);
            Uo();
        }
    }

    private static boolean xMQ(C1653C c1653c, int i2) {
        if (!com.facebook.imagepipeline.producers.w6.nr(i2) && !com.facebook.imagepipeline.producers.w6.az(i2, 4) && !C1653C.qm(c1653c)) {
            return false;
        }
        return true;
    }

    public boolean KN() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z2 = false;
                if (!xMQ(this.J2, this.Uo)) {
                    return false;
                }
                int i2 = w6.f52462n[this.KN.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3) {
                        this.KN = Wre.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.mUb + ((long) this.f52452O), jUptimeMillis);
                    this.xMQ = jUptimeMillis;
                    this.KN = Wre.QUEUED;
                    z2 = true;
                }
                if (z2) {
                    O(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean gh(C1653C c1653c, int i2) {
        C1653C c1653c2;
        if (!xMQ(c1653c, i2)) {
            return false;
        }
        synchronized (this) {
            c1653c2 = this.J2;
            this.J2 = C1653C.rl(c1653c);
            this.Uo = i2;
        }
        C1653C.Uo(c1653c2);
        return true;
    }
}
