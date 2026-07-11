package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f48595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f48598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f48599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f48600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f48601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f48602i = new Object();

    class a extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.f48600g.run();
                synchronized (g7.this.f48602i) {
                    try {
                        if (g7.this.f48599f) {
                            g7.this.f48596c = System.currentTimeMillis();
                            g7 g7Var = g7.this;
                            g7Var.f48597d = g7Var.f48598e;
                        } else {
                            g7.this.f48595b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (g7.this.f48594a != null) {
                        g7.this.f48594a.O();
                        if (C1804o.a()) {
                            g7.this.f48594a.O().a("Timer", "Encountered error while executing timed task", th);
                        }
                        g7.this.f48594a.D().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (g7.this.f48602i) {
                        try {
                            if (g7.this.f48599f) {
                                g7.this.f48596c = System.currentTimeMillis();
                                g7 g7Var2 = g7.this;
                                g7Var2.f48597d = g7Var2.f48598e;
                            } else {
                                g7.this.f48595b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (g7.this.f48602i) {
                        try {
                            if (g7.this.f48599f) {
                                g7.this.f48596c = System.currentTimeMillis();
                                g7 g7Var3 = g7.this;
                                g7Var3.f48597d = g7Var3.f48598e;
                            } else {
                                g7.this.f48595b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }

        a() {
        }
    }

    public long c() {
        if (this.f48595b == null) {
            return this.f48597d - this.f48601h;
        }
        return this.f48597d - (System.currentTimeMillis() - this.f48596c);
    }

    public void d() {
        synchronized (this.f48602i) {
            Timer timer = this.f48595b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f48601h = Math.max(1L, System.currentTimeMillis() - this.f48596c);
                } catch (Throwable th) {
                    try {
                        C1802k c1802k = this.f48594a;
                        if (c1802k != null) {
                            c1802k.O();
                            if (C1804o.a()) {
                                this.f48594a.O();
                                if (C1804o.a()) {
                                    this.f48594a.O().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.f48595b = null;
                    } finally {
                        this.f48595b = null;
                    }
                }
            }
        }
    }

    public void e() {
        g7 g7Var;
        synchronized (this.f48602i) {
            try {
                try {
                    long j2 = this.f48601h;
                    if (j2 > 0) {
                        try {
                            long j3 = this.f48597d - j2;
                            this.f48597d = j3;
                            if (j3 < 0) {
                                this.f48597d = 0L;
                            }
                            this.f48595b = new Timer();
                            g7Var = this;
                        } catch (Throwable th) {
                            th = th;
                            g7Var = this;
                        }
                        try {
                            g7Var.a(b(), this.f48597d, this.f48599f, this.f48598e);
                            g7Var.f48596c = System.currentTimeMillis();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                C1802k c1802k = g7Var.f48594a;
                                if (c1802k != null) {
                                    c1802k.O();
                                    if (C1804o.a()) {
                                        g7Var.f48594a.O();
                                        if (C1804o.a()) {
                                            g7Var.f48594a.O().a("Timer", "Encountered error while resuming timer", th);
                                        }
                                    }
                                }
                                g7Var.f48601h = 0L;
                            } finally {
                                g7Var.f48601h = 0L;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    private g7(C1802k c1802k, Runnable runnable) {
        this.f48594a = c1802k;
        this.f48600g = runnable;
    }

    private TimerTask b() {
        return new a();
    }

    public static g7 a(long j2, C1802k c1802k, Runnable runnable) {
        return a(j2, false, c1802k, runnable);
    }

    public static g7 a(long j2, boolean z2, C1802k c1802k, Runnable runnable) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j2 + ".");
        }
        if (runnable != null) {
            g7 g7Var = new g7(c1802k, runnable);
            g7Var.f48596c = System.currentTimeMillis();
            g7Var.f48597d = j2;
            g7Var.f48599f = z2;
            g7Var.f48598e = j2;
            try {
                g7Var.f48595b = new Timer();
                g7Var.a(g7Var.b(), j2, z2, g7Var.f48598e);
                return g7Var;
            } catch (OutOfMemoryError e2) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("Timer", "Failed to create timer due to OOM error", e2);
                }
                return g7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f48602i) {
            Timer timer = this.f48595b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f48595b = null;
                } catch (Throwable th) {
                    try {
                        C1802k c1802k = this.f48594a;
                        if (c1802k != null) {
                            c1802k.O();
                            if (C1804o.a()) {
                                this.f48594a.O();
                                if (C1804o.a()) {
                                    this.f48594a.O().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f48595b = null;
                    } catch (Throwable th2) {
                        this.f48595b = null;
                        this.f48601h = 0L;
                        throw th2;
                    }
                }
                this.f48601h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j2, boolean z2, long j3) {
        if (z2) {
            this.f48595b.schedule(timerTask, j2, j3);
        } else {
            this.f48595b.schedule(timerTask, j2);
        }
    }
}
