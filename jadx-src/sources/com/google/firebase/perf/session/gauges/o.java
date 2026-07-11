package com.google.firebase.perf.session.gauges;

import O2.Pl;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class o {
    private static final yMa.j J2 = yMa.j.O();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f60684O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f60685n;
    private ScheduledFuture nr;
    public final ConcurrentLinkedQueue rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runtime f60686t;

    o() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private synchronized void J2(final Timer timer) {
        try {
            this.f60685n.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.C
                @Override // java.lang.Runnable
                public final void run() {
                    o.rl(this.f60666n, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            J2.mUb("Unable to collect Memory Metric: " + e2.getMessage());
        }
    }

    public static boolean O(long j2) {
        return j2 <= 0;
    }

    private synchronized void Uo(long j2, final Timer timer) {
        this.f60684O = j2;
        try {
            this.nr = this.f60685n.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.aC
                @Override // java.lang.Runnable
                public final void run() {
                    o.n(this.f60678n, timer);
                }
            }, 0L, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            J2.mUb("Unable to start collecting Memory Metrics: " + e2.getMessage());
        }
    }

    o(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.nr = null;
        this.f60684O = -1L;
        this.f60685n = scheduledExecutorService;
        this.rl = new ConcurrentLinkedQueue();
        this.f60686t = runtime;
    }

    private oK9.n mUb(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (oK9.n) oK9.n.gh().xMQ(timer.rl()).mUb(nr()).build();
    }

    private int nr() {
        return Pl.t(O2.C.f7237o.rl(this.f60686t.totalMemory() - this.f60686t.freeMemory()));
    }

    public void xMQ() {
        ScheduledFuture scheduledFuture = this.nr;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.nr = null;
        this.f60684O = -1L;
    }

    public static /* synthetic */ void n(o oVar, Timer timer) {
        oK9.n nVarMUb = oVar.mUb(timer);
        if (nVarMUb != null) {
            oVar.rl.add(nVarMUb);
        }
    }

    public static /* synthetic */ void rl(o oVar, Timer timer) {
        oK9.n nVarMUb = oVar.mUb(timer);
        if (nVarMUb != null) {
            oVar.rl.add(nVarMUb);
        }
    }

    public void KN(long j2, Timer timer) {
        if (!O(j2)) {
            if (this.nr != null) {
                if (this.f60684O != j2) {
                    xMQ();
                    Uo(j2, timer);
                    return;
                }
                return;
            }
            Uo(j2, timer);
        }
    }

    public void t(Timer timer) {
        J2(timer);
    }
}
