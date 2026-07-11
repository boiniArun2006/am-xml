package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d6 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExecutorService f48318r = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f48327i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ExecutorService f48329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f48330l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f48334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f48335q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f48328j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f48331m = new ArrayList(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f48332n = new Object();

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f48343f;

        public c(C1802k c1802k, AbstractRunnableC1782i5 abstractRunnableC1782i5, b bVar, long j2) {
            super(c1802k, abstractRunnableC1782i5, bVar);
            this.f48343f = j2;
        }
    }

    private class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48344a;

        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                C1804o unused = d6.this.f48320b;
                if (C1804o.a()) {
                    d6.this.f48320b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        d(String str) {
            this.f48344a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f48344a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.this.f48319a.a(x4.f50784Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1802k f48347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f48348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C1804o f48349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final AbstractRunnableC1782i5 f48350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final b f48351e;

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a();
                if (!this.f48347a.E0() || this.f48350d.d()) {
                    ScheduledFuture scheduledFutureB = this.f48350d.b(Thread.currentThread(), ((Long) this.f48347a.a(x4.f50847v)).longValue());
                    this.f48350d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (C1804o.a()) {
                        this.f48349c.d(this.f48348b, "Task re-scheduled...");
                    }
                    this.f48347a.q0().a(this.f48350d, this.f48351e, 2000L);
                }
            } catch (Throwable th) {
                try {
                    if (C1804o.a()) {
                        this.f48349c.a(this.f48348b, "Task failed execution", th);
                    }
                    this.f48350d.a(th);
                    if (C1804o.a()) {
                        this.f48349c.d(this.f48348b, this.f48351e + " queue finished task " + this.f48350d.c());
                    }
                } finally {
                    if (C1804o.a()) {
                        this.f48349c.d(this.f48348b, this.f48351e + " queue finished task " + this.f48350d.c());
                    }
                }
            }
        }

        public e(C1802k c1802k, AbstractRunnableC1782i5 abstractRunnableC1782i5, b bVar) {
            this.f48347a = c1802k;
            this.f48349c = c1802k.O();
            this.f48348b = abstractRunnableC1782i5.c();
            this.f48350d = abstractRunnableC1782i5;
            this.f48351e = bVar;
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48336a;

        static {
            int[] iArr = new int[b.values().length];
            f48336a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48336a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48336a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48336a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ExecutorService a() {
        return this.f48329k;
    }

    public ScheduledFuture b(AbstractRunnableC1782i5 abstractRunnableC1782i5, b bVar, long j2) {
        return this.f48334p ? a(new e(this.f48319a, abstractRunnableC1782i5, bVar)).schedule(abstractRunnableC1782i5, j2, TimeUnit.MILLISECONDS) : this.f48321c.schedule(abstractRunnableC1782i5, j2, TimeUnit.MILLISECONDS);
    }

    public Executor c() {
        return this.f48334p ? this.f48323e : this.f48322d;
    }

    public ExecutorService d() {
        return this.f48330l;
    }

    public boolean f() {
        return this.f48333o;
    }

    public void g() {
        synchronized (this.f48332n) {
            try {
                this.f48333o = true;
                for (e eVar : this.f48331m) {
                    if (this.f48335q) {
                        c cVar = (c) eVar;
                        a(cVar.f48350d, cVar.f48351e, cVar.f48343f);
                    } else {
                        a(eVar.f48350d, eVar.f48351e);
                    }
                }
                this.f48331m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.f48332n) {
            this.f48333o = false;
        }
    }

    public d6(C1802k c1802k) {
        this.f48319a = c1802k;
        this.f48320b = c1802k.O();
        this.f48334p = ((Boolean) c1802k.a(x4.f50793T)).booleanValue();
        this.f48335q = ((Boolean) c1802k.a(x4.S6)).booleanValue();
        this.f48321c = b("auxiliary_operations", ((Integer) c1802k.a(x4.f50777O)).intValue());
        this.f48322d = b("shared_thread_pool", ((Integer) c1802k.a(x4.f50775N)).intValue());
        this.f48323e = b("core", ((Integer) c1802k.a(x4.f50796U)).intValue());
        this.f48325g = b("caching", ((Integer) c1802k.a(x4.f50798V)).intValue());
        this.f48326h = b("mediation", ((Integer) c1802k.a(x4.f50799W)).intValue());
        this.f48324f = b("timeout", ((Integer) c1802k.a(x4.f50801X)).intValue());
        this.f48327i = b(InneractiveMediationNameConsts.OTHER, ((Integer) c1802k.a(x4.f50805Y)).intValue());
        if (((Boolean) c1802k.a(x4.I0)).booleanValue() && ((Boolean) c1802k.a(x4.J0)).booleanValue()) {
            this.f48329k = Executors.newFixedThreadPool(((Integer) c1802k.a(x4.f50769K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f48330l = Executors.newFixedThreadPool(((Integer) c1802k.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public void a(AbstractRunnableC1782i5 abstractRunnableC1782i5, b bVar) {
        a(abstractRunnableC1782i5, bVar, 0L);
    }

    public boolean e() {
        if (a() != null && d() != null) {
            return true;
        }
        return false;
    }

    public void a(AbstractRunnableC1782i5 abstractRunnableC1782i5, b bVar, long j2) {
        a(abstractRunnableC1782i5, bVar, j2, false);
    }

    public void a(AbstractRunnableC1782i5 abstractRunnableC1782i5, b bVar, long j2, boolean z2) {
        AbstractRunnableC1782i5 abstractRunnableC1782i52;
        long j3;
        e eVar;
        if (abstractRunnableC1782i5 == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j2 >= 0) {
            if (this.f48335q) {
                abstractRunnableC1782i52 = abstractRunnableC1782i5;
                j3 = j2;
                eVar = new c(this.f48319a, abstractRunnableC1782i52, bVar, j3);
            } else {
                abstractRunnableC1782i52 = abstractRunnableC1782i5;
                j3 = j2;
                eVar = new e(this.f48319a, abstractRunnableC1782i52, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j3, z2);
                return;
            } else {
                if (C1804o.a()) {
                    this.f48320b.d(abstractRunnableC1782i52.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j2);
    }

    public ExecutorService b() {
        return this.f48334p ? this.f48325g : f48318r;
    }

    private boolean b(e eVar) {
        if (eVar.f48350d.d()) {
            return false;
        }
        synchronized (this.f48332n) {
            try {
                if (this.f48333o) {
                    return false;
                }
                this.f48331m.add(eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f48334p) {
            C1802k c1802k = this.f48319a;
            e eVar = new e(c1802k, new C1797r6(c1802k, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f48321c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i2) {
        return new ScheduledThreadPoolExecutor(i2, new d(str));
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.Ln
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f47768n.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new C1797r6(this.f48319a, str, runnable));
    }

    public void a(AbstractRunnableC1782i5 abstractRunnableC1782i5) {
        if (abstractRunnableC1782i5 != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f48334p ? this.f48323e : this.f48322d;
            try {
                if (n7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f48319a, abstractRunnableC1782i5, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = abstractRunnableC1782i5.b(Thread.currentThread(), ((Long) this.f48319a.a(x4.f50847v)).longValue());
                abstractRunnableC1782i5.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (C1804o.a()) {
                    this.f48320b.a(abstractRunnableC1782i5.c(), "Task failed execution", th);
                }
                abstractRunnableC1782i5.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(AbstractRunnableC1782i5 abstractRunnableC1782i5, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f48328j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f48328j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f48319a, abstractRunnableC1782i5, b.MEDIATION));
    }

    private void a(final e eVar, long j2, boolean z2) {
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f48334p ? a(eVar) : this.f48322d;
        if (j2 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z2) {
            g0.a(j2, this.f48319a, new Runnable() { // from class: com.applovin.impl.qf
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(eVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i2 = a.f48336a[eVar.f48351e.ordinal()];
        if (i2 == 1) {
            return this.f48323e;
        }
        if (i2 == 2) {
            return this.f48325g;
        }
        if (i2 == 3) {
            return this.f48326h;
        }
        if (i2 != 4) {
            return this.f48327i;
        }
        return this.f48324f;
    }

    public ExecutorService a(String str, int i2) {
        return Executors.newFixedThreadPool(i2, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (C1804o.a()) {
                this.f48320b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return null;
            }
            this.f48320b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
