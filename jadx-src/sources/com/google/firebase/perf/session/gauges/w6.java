package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 {
    private static final yMa.j Uo = yMa.j.O();
    private static final long KN = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ScheduledFuture f60687O = null;
    private long J2 = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentLinkedQueue f60688n = new ConcurrentLinkedQueue();
    private final ScheduledExecutorService rl = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60689t = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    private final long nr = O();

    public static boolean J2(long j2) {
        return j2 <= 0;
    }

    private synchronized void KN(long j2, final Timer timer) {
        this.J2 = j2;
        try {
            this.f60687O = this.rl.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    w6.n(this.f60680n, timer);
                }
            }, 0L, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            Uo.mUb("Unable to start collecting Cpu Metrics: " + e2.getMessage());
        }
    }

    private synchronized void Uo(final Timer timer) {
        try {
            this.rl.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.n
                @Override // java.lang.Runnable
                public final void run() {
                    w6.rl(this.f60682n, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            Uo.mUb("Unable to collect Cpu Metric: " + e2.getMessage());
        }
    }

    private oK9.I28 gh(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f60689t));
            try {
                long jRl = timer.rl();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                oK9.I28 i28 = (oK9.I28) oK9.I28.qie().xMQ(jRl).mUb(nr(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).gh(nr(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return i28;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            Uo.mUb("Unable to read 'proc/[pid]/stat' file: " + e2.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
            Uo.mUb("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e4) {
            e = e4;
            Uo.mUb("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e5) {
            e = e5;
            Uo.mUb("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    private long nr(long j2) {
        return Math.round((j2 / this.nr) * KN);
    }

    private long O() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public void mUb() {
        ScheduledFuture scheduledFuture = this.f60687O;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f60687O = null;
        this.J2 = -1L;
    }

    public void xMQ(long j2, Timer timer) {
        long j3 = this.nr;
        if (j3 == -1 || j3 == 0 || J2(j2)) {
            return;
        }
        if (this.f60687O == null) {
            KN(j2, timer);
        } else if (this.J2 != j2) {
            mUb();
            KN(j2, timer);
        }
    }

    w6() {
    }

    public static /* synthetic */ void n(w6 w6Var, Timer timer) {
        oK9.I28 i28Gh = w6Var.gh(timer);
        if (i28Gh != null) {
            w6Var.f60688n.add(i28Gh);
        }
    }

    public static /* synthetic */ void rl(w6 w6Var, Timer timer) {
        oK9.I28 i28Gh = w6Var.gh(timer);
        if (i28Gh != null) {
            w6Var.f60688n.add(i28Gh);
        }
    }

    public void t(Timer timer) {
        Uo(timer);
    }
}
