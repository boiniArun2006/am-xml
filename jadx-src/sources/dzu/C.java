package dzu;

import GJW.O;
import GJW.Zs;
import GJW.iF;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C extends GJW.lej implements iF {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f63540S = AtomicIntegerFieldUpdater.newUpdater(C.class, "runningWorkers$volatile");
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GJW.lej f63541O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Object f63542Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final eO f63543o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f63544r;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ iF f63545t;

    private final class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Runnable f63546n;

        @Override // java.lang.Runnable
        public void run() {
            int i2 = 0;
            while (true) {
                try {
                    this.f63546n.run();
                } catch (Throwable th) {
                    GJW.M.n(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableUb = C.this.ub();
                if (runnableUb == null) {
                    return;
                }
                try {
                    this.f63546n = runnableUb;
                    i2++;
                    if (i2 >= 16 && Dsr.nr(C.this.f63541O, C.this)) {
                        Dsr.t(C.this.f63541O, C.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = C.this.f63542Z;
                    C c2 = C.this;
                    synchronized (obj) {
                        C.f().decrementAndGet(c2);
                        throw th2;
                    }
                }
            }
        }

        public j(Runnable runnable) {
            this.f63546n = runnable;
        }
    }

    private final boolean Qu() {
        synchronized (this.f63542Z) {
            if (f63540S.get(this) >= this.J2) {
                return false;
            }
            f63540S.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f() {
        return f63540S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable ub() {
        while (true) {
            Runnable runnable = (Runnable) this.f63543o.O();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f63542Z) {
                f63540S.decrementAndGet(this);
                if (this.f63543o.t() == 0) {
                    return null;
                }
                f63540S.incrementAndGet(this);
            }
        }
    }

    @Override // GJW.iF
    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f63545t.U(j2, runnable, coroutineContext);
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableUb;
        this.f63543o.n(runnable);
        if (f63540S.get(this) >= this.J2 || !Qu() || (runnableUb = ub()) == null) {
            return;
        }
        try {
            Dsr.t(this.f63541O, this, new j(runnableUb));
        } catch (Throwable th) {
            f63540S.decrementAndGet(this);
            throw th;
        }
    }

    @Override // GJW.lej
    public void qm(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableUb;
        this.f63543o.n(runnable);
        if (f63540S.get(this) >= this.J2 || !Qu() || (runnableUb = ub()) == null) {
            return;
        }
        try {
            this.f63541O.qm(this, new j(runnableUb));
        } catch (Throwable th) {
            f63540S.decrementAndGet(this);
            throw th;
        }
    }

    @Override // GJW.lej
    public String toString() {
        String str = this.f63544r;
        if (str != null) {
            return str;
        }
        return this.f63541O + ".limitedParallelism(" + this.J2 + ')';
    }

    @Override // GJW.iF
    public void z(long j2, GJW.Pl pl) {
        this.f63545t.z(j2, pl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(GJW.lej lejVar, int i2, String str) {
        iF iFVar;
        if (lejVar instanceof iF) {
            iFVar = (iF) lejVar;
        } else {
            iFVar = null;
        }
        this.f63545t = iFVar == null ? Zs.n() : iFVar;
        this.f63541O = lejVar;
        this.J2 = i2;
        this.f63544r = str;
        this.f63543o = new eO(false);
        this.f63542Z = new Object();
    }

    @Override // GJW.lej
    public GJW.lej K(int i2, String str) {
        o.n(i2);
        if (i2 >= this.J2) {
            return o.rl(this, str);
        }
        return super.K(i2, str);
    }
}
