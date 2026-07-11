package GJW;

import GJW.iF;
import dzu.C1959z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Mf extends o7q implements iF {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3430r = AtomicReferenceFieldUpdater.newUpdater(Mf.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3429o = AtomicReferenceFieldUpdater.newUpdater(Mf.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3428Z = AtomicIntegerFieldUpdater.newUpdater(Mf.class, "_isCompleted$volatile");

    private final class j extends w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Pl f3432O;

        public j(long j2, Pl pl) {
            super(j2);
            this.f3432O = pl;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3432O.o(Mf.this, Unit.INSTANCE);
        }

        @Override // GJW.Mf.w6
        public String toString() {
            return super.toString() + this.f3432O;
        }
    }

    private static final class n extends w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Runnable f3433O;

        @Override // java.lang.Runnable
        public void run() {
            this.f3433O.run();
        }

        @Override // GJW.Mf.w6
        public String toString() {
            return super.toString() + this.f3433O;
        }

        public n(long j2, Runnable runnable) {
            super(j2);
            this.f3433O = runnable;
        }
    }

    public static abstract class w6 implements Runnable, Comparable, O, dzu.K {
        private volatile Object _heap;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f3434n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f3435t = -1;

        public final int Uo(long j2, Ml ml, Mf mf) {
            synchronized (this) {
                if (this._heap == M5.f3425n) {
                    return 2;
                }
                synchronized (ml) {
                    try {
                        w6 w6Var = (w6) ml.rl();
                        if (mf.isCompleted()) {
                            return 1;
                        }
                        if (w6Var == null) {
                            ml.f3431t = j2;
                        } else {
                            long j3 = w6Var.f3434n;
                            if (j3 - j2 < 0) {
                                j2 = j3;
                            }
                            if (j2 - ml.f3431t > 0) {
                                ml.f3431t = j2;
                            }
                        }
                        long j4 = this.f3434n;
                        long j5 = ml.f3431t;
                        if (j4 - j5 < 0) {
                            this.f3434n = j5;
                        }
                        ml.n(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // GJW.O
        public final void n() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == M5.f3425n) {
                        return;
                    }
                    Ml ml = obj instanceof Ml ? (Ml) obj : null;
                    if (ml != null) {
                        ml.KN(this);
                    }
                    this._heap = M5.f3425n;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public int compareTo(w6 w6Var) {
            long j2 = this.f3434n - w6Var.f3434n;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        public final boolean KN(long j2) {
            return j2 - this.f3434n >= 0;
        }

        @Override // dzu.K
        public int getIndex() {
            return this.f3435t;
        }

        @Override // dzu.K
        public dzu.h nr() {
            Object obj = this._heap;
            if (obj instanceof dzu.h) {
                return (dzu.h) obj;
            }
            return null;
        }

        @Override // dzu.K
        public void rl(dzu.h hVar) {
            if (this._heap == M5.f3425n) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = hVar;
        }

        @Override // dzu.K
        public void setIndex(int i2) {
            this.f3435t = i2;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f3434n + ']';
        }

        public w6(long j2) {
            this.f3434n = j2;
        }
    }

    public static final class Ml extends dzu.h {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f3431t;

        public Ml(long j2) {
            this.f3431t = j2;
        }
    }

    @Override // GJW.KH
    public void shutdown() {
        Y5.f3467n.t();
        wKp(true);
        y();
        while (X4T() <= 0) {
        }
        Lp6();
    }

    private final void Lp6() {
        w6 w6Var;
        GJW.w6.n();
        long jNanoTime = System.nanoTime();
        while (true) {
            Ml ml = (Ml) f3429o.get(this);
            if (ml != null && (w6Var = (w6) ml.mUb()) != null) {
                EF(jNanoTime, w6Var);
            } else {
                return;
            }
        }
    }

    private final boolean Th(w6 w6Var) {
        w6 w6Var2;
        Ml ml = (Ml) f3429o.get(this);
        if (ml != null) {
            w6Var2 = (w6) ml.J2();
        } else {
            w6Var2 = null;
        }
        if (w6Var2 == w6Var) {
            return true;
        }
        return false;
    }

    private final Runnable Zn() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3430r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C1959z) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C1959z c1959z = (C1959z) obj;
                Object objAz = c1959z.az();
                if (objAz != C1959z.KN) {
                    return (Runnable) objAz;
                }
                androidx.concurrent.futures.j.n(f3430r, this, obj, c1959z.qie());
            } else {
                if (obj == M5.rl) {
                    return null;
                }
                if (androidx.concurrent.futures.j.n(f3430r, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        if (f3428Z.get(this) == 1) {
            return true;
        }
        return false;
    }

    private final int jO(long j2, w6 w6Var) {
        if (isCompleted()) {
            return 1;
        }
        Ml ml = (Ml) f3429o.get(this);
        if (ml == null) {
            androidx.concurrent.futures.j.n(f3429o, this, null, new Ml(j2));
            Object obj = f3429o.get(this);
            Intrinsics.checkNotNull(obj);
            ml = (Ml) obj;
        }
        return w6Var.Uo(j2, ml, this);
    }

    private final boolean v0j(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3430r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.j.n(f3430r, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C1959z) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C1959z c1959z = (C1959z) obj;
                int iN = c1959z.n(runnable);
                if (iN == 0) {
                    return true;
                }
                if (iN != 1) {
                    if (iN == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.j.n(f3430r, this, obj, c1959z.qie());
                }
            } else {
                if (obj == M5.rl) {
                    return false;
                }
                C1959z c1959z2 = new C1959z(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c1959z2.n((Runnable) obj);
                c1959z2.n(runnable);
                if (androidx.concurrent.futures.j.n(f3430r, this, obj, c1959z2)) {
                    return true;
                }
            }
        }
    }

    private final void vl() {
        dzu.K kXMQ;
        boolean zV0j;
        Ml ml = (Ml) f3429o.get(this);
        if (ml != null && !ml.O()) {
            GJW.w6.n();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (ml) {
                    try {
                        dzu.K kRl = ml.rl();
                        kXMQ = null;
                        if (kRl != null) {
                            w6 w6Var = (w6) kRl;
                            if (w6Var.KN(jNanoTime)) {
                                zV0j = v0j(w6Var);
                            } else {
                                zV0j = false;
                            }
                            if (zV0j) {
                                kXMQ = ml.xMQ(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((w6) kXMQ) != null);
        }
    }

    private final void wKp(boolean z2) {
        f3428Z.set(this, z2 ? 1 : 0);
    }

    private final void y() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3430r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.j.n(f3430r, this, null, M5.rl)) {
                    return;
                }
            } else if (obj instanceof C1959z) {
                ((C1959z) obj).nr();
                return;
            } else if (obj != M5.rl) {
                C1959z c1959z = new C1959z(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c1959z.n((Runnable) obj);
                if (androidx.concurrent.futures.j.n(f3430r, this, obj, c1959z)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void Mh(long j2, w6 w6Var) {
        int iJO = jO(j2, w6Var);
        if (iJO != 0) {
            if (iJO != 1) {
                if (iJO != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                EF(j2, w6Var);
                return;
            }
        }
        if (Th(w6Var)) {
            uG();
        }
    }

    protected final O Toy(long j2, Runnable runnable) {
        long jT2 = M5.t(j2);
        if (jT2 < DurationKt.MAX_MILLIS) {
            GJW.w6.n();
            long jNanoTime = System.nanoTime();
            n nVar = new n(jT2 + jNanoTime, runnable);
            Mh(jNanoTime, nVar);
            return nVar;
        }
        return oXP.f3498n;
    }

    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return iF.j.n(this, j2, runnable, coroutineContext);
    }

    @Override // GJW.KH
    public long X4T() {
        if (Zmq()) {
            return 0L;
        }
        vl();
        Runnable runnableZn = Zn();
        if (runnableZn != null) {
            runnableZn.run();
            return 0L;
        }
        return f();
    }

    @Override // GJW.KH
    protected long f() {
        w6 w6Var;
        if (super.f() == 0) {
            return 0L;
        }
        Object obj = f3430r.get(this);
        if (obj != null) {
            if (obj instanceof C1959z) {
                if (!((C1959z) obj).mUb()) {
                    return 0L;
                }
            } else {
                if (obj != M5.rl) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        Ml ml = (Ml) f3429o.get(this);
        if (ml == null || (w6Var = (w6) ml.J2()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = w6Var.f3434n;
        GJW.w6.n();
        return RangesKt.coerceAtLeast(j2 - System.nanoTime(), 0L);
    }

    protected final void g6() {
        f3430r.set(this, null);
        f3429o.set(this, null);
    }

    @Override // GJW.lej
    public final void n1(CoroutineContext coroutineContext, Runnable runnable) {
        nO(runnable);
    }

    public void nO(Runnable runnable) {
        vl();
        if (v0j(runnable)) {
            uG();
        } else {
            Md.f3426S.nO(runnable);
        }
    }

    protected boolean s() {
        if (!UF()) {
            return false;
        }
        Ml ml = (Ml) f3429o.get(this);
        if (ml != null && !ml.O()) {
            return false;
        }
        Object obj = f3430r.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C1959z) {
            return ((C1959z) obj).mUb();
        }
        if (obj != M5.rl) {
            return false;
        }
        return true;
    }

    @Override // GJW.iF
    public void z(long j2, Pl pl) {
        long jT2 = M5.t(j2);
        if (jT2 < DurationKt.MAX_MILLIS) {
            GJW.w6.n();
            long jNanoTime = System.nanoTime();
            j jVar = new j(jT2 + jNanoTime, pl);
            Mh(jNanoTime, jVar);
            QJ.n(pl, jVar);
        }
    }
}
