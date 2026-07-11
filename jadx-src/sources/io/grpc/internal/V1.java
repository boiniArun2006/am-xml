package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class V1 {
    private static final V1 nr = new V1(new j());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IdentityHashMap f68389n = new IdentityHashMap();
    private final I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ScheduledExecutorService f68390t;

    interface I28 {
        ScheduledExecutorService n();
    }

    public interface Ml {
        Object n();

        void rl(Object obj);
    }

    class j implements I28 {
        @Override // io.grpc.internal.V1.I28
        public ScheduledExecutorService n() {
            return Executors.newSingleThreadScheduledExecutor(psW.mUb("grpc-shared-destroyer-%d", true));
        }

        j() {
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f68391O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f68392n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml f68393t;

        n(w6 w6Var, Ml ml, Object obj) {
            this.f68392n = w6Var;
            this.f68393t = ml;
            this.f68391O = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (V1.this) {
                try {
                    if (this.f68392n.rl == 0) {
                        try {
                            this.f68393t.rl(this.f68391O);
                            V1.this.f68389n.remove(this.f68393t);
                            if (V1.this.f68389n.isEmpty()) {
                                V1.this.f68390t.shutdown();
                                V1.this.f68390t = null;
                            }
                        } catch (Throwable th) {
                            V1.this.f68389n.remove(this.f68393t);
                            if (V1.this.f68389n.isEmpty()) {
                                V1.this.f68390t.shutdown();
                                V1.this.f68390t = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    synchronized Object O(Ml ml) {
        w6 w6Var;
        try {
            w6Var = (w6) this.f68389n.get(ml);
            if (w6Var == null) {
                w6Var = new w6(ml.n());
                this.f68389n.put(ml, w6Var);
            }
            ScheduledFuture scheduledFuture = w6Var.f68395t;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                w6Var.f68395t = null;
            }
            w6Var.rl++;
        } catch (Throwable th) {
            throw th;
        }
        return w6Var.f68394n;
    }

    synchronized Object Uo(Ml ml, Object obj) {
        try {
            w6 w6Var = (w6) this.f68389n.get(ml);
            if (w6Var == null) {
                throw new IllegalArgumentException("No cached instance found for " + ml);
            }
            t1.Xo.O(obj == w6Var.f68394n, "Releasing the wrong instance");
            t1.Xo.S(w6Var.rl > 0, "Refcount has already reached zero");
            int i2 = w6Var.rl - 1;
            w6Var.rl = i2;
            if (i2 == 0) {
                t1.Xo.S(w6Var.f68395t == null, "Destroy task already scheduled");
                if (this.f68390t == null) {
                    this.f68390t = this.rl.n();
                }
                w6Var.f68395t = this.f68390t.schedule(new RunnableC2176p(new n(w6Var, ml, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f68394n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ScheduledFuture f68395t;

        w6(Object obj) {
            this.f68394n = obj;
        }
    }

    public static Object J2(Ml ml, Object obj) {
        return nr.Uo(ml, obj);
    }

    public static Object nr(Ml ml) {
        return nr.O(ml);
    }

    V1(I28 i28) {
        this.rl = i28;
    }
}
