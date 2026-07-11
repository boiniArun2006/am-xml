package io.grpc.internal;

import io.grpc.internal.InterfaceC2171c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import t1.C2369c;

/* JADX INFO: renamed from: io.grpc.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C2173m {
    private static final Logger Uo = Logger.getLogger(C2173m.class.getName());
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Throwable f68631O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f68632n;
    private boolean nr;
    private final C2369c rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f68633t = new LinkedHashMap();

    /* JADX INFO: renamed from: io.grpc.internal.m$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC2171c.j f68634n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f68635t;

        j(InterfaceC2171c.j jVar, long j2) {
            this.f68634n = jVar;
            this.f68635t = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f68634n.n(this.f68635t);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m$n */
    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC2171c.j f68636n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Throwable f68637t;

        n(InterfaceC2171c.j jVar, Throwable th) {
            this.f68636n = jVar;
            this.f68637t = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f68636n.onFailure(this.f68637t);
        }
    }

    public void J2(Throwable th) {
        synchronized (this) {
            try {
                if (this.nr) {
                    return;
                }
                this.nr = true;
                this.f68631O = th;
                Map map = this.f68633t;
                this.f68633t = null;
                for (Map.Entry entry : map.entrySet()) {
                    Uo((InterfaceC2171c.j) entry.getKey(), (Executor) entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(InterfaceC2171c.j jVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.nr) {
                    this.f68633t.put(jVar, executor);
                } else {
                    Throwable th = this.f68631O;
                    O(executor, th != null ? t(jVar, th) : rl(jVar, this.J2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean nr() {
        synchronized (this) {
            try {
                if (this.nr) {
                    return false;
                }
                this.nr = true;
                long jNr = this.rl.nr(TimeUnit.NANOSECONDS);
                this.J2 = jNr;
                Map map = this.f68633t;
                this.f68633t = null;
                for (Map.Entry entry : map.entrySet()) {
                    O((Executor) entry.getValue(), rl((InterfaceC2171c.j) entry.getKey(), jNr));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Runnable rl(InterfaceC2171c.j jVar, long j2) {
        return new j(jVar, j2);
    }

    private static Runnable t(InterfaceC2171c.j jVar, Throwable th) {
        return new n(jVar, th);
    }

    public long KN() {
        return this.f68632n;
    }

    public C2173m(long j2, C2369c c2369c) {
        this.f68632n = j2;
        this.rl = c2369c;
    }

    private static void O(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            Uo.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void Uo(InterfaceC2171c.j jVar, Executor executor, Throwable th) {
        O(executor, t(jVar, th));
    }
}
