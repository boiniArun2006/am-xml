package yB;

import GJW.HcS;
import GJW.Pl;
import GJW.QJ;
import GJW.eO;
import dzu.Z;
import dzu.afx;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class aC {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75577n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function3 f75578t;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f75573O = AtomicReferenceFieldUpdater.newUpdater(aC.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater J2 = AtomicLongFieldUpdater.newUpdater(aC.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f75576r = AtomicReferenceFieldUpdater.newUpdater(aC.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f75575o = AtomicLongFieldUpdater.newUpdater(aC.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f75574Z = AtomicIntegerFieldUpdater.newUpdater(aC.class, "_availablePermits$volatile");

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f75579n = new j();

        j() {
            super(2, o.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (qz) obj2);
        }

        public final qz n(long j2, qz qzVar) {
            return o.mUb(j2, qzVar);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f75580n = new n();

        n() {
            super(2, o.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (qz) obj2);
        }

        public final qz n(long j2, qz qzVar) {
            return o.mUb(j2, qzVar);
        }
    }

    private final boolean o(Object obj) {
        if (!(obj instanceof Pl)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        Pl pl = (Pl) obj;
        Object objG = pl.g(Unit.INSTANCE, null, this.f75578t);
        if (objG == null) {
            return false;
        }
        pl.te(objG);
        return true;
    }

    public aC(int i2, int i3) {
        this.f75577n = i2;
        if (i2 > 0) {
            if (i3 >= 0 && i3 <= i2) {
                qz qzVar = new qz(0L, null, 2);
                this.head$volatile = qzVar;
                this.tail$volatile = qzVar;
                this._availablePermits$volatile = i2 - i3;
                this.f75578t = new Function3() { // from class: yB.Dsr
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return aC.Ik(this.f75563n, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                    }
                };
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i2).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(aC aCVar, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        aCVar.release();
        return Unit.INSTANCE;
    }

    private final Object KN(Continuation continuation) {
        eO eOVarRl = QJ.rl(IntrinsicsKt.intercepted(continuation));
        try {
            if (!xMQ(eOVarRl)) {
                J2(eOVarRl);
            }
            Object objWPU = eOVarRl.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objWPU;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            eOVarRl.rV9();
            throw th;
        }
    }

    private final boolean XQ() {
        Object objT;
        qz qzVar = (qz) f75573O.get(this);
        long andIncrement = J2.getAndIncrement(this);
        long j2 = andIncrement / ((long) o.J2);
        n nVar = n.f75580n;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75573O;
        loop0: while (true) {
            objT = dzu.n.t(qzVar, j2, nVar);
            if (Z.t(objT)) {
                break;
            }
            afx afxVarRl = Z.rl(objT);
            while (true) {
                afx afxVar = (afx) atomicReferenceFieldUpdater.get(this);
                if (afxVar.f63562t >= afxVarRl.f63562t) {
                    break loop0;
                }
                if (!afxVarRl.XQ()) {
                    break;
                }
                if (androidx.concurrent.futures.j.n(atomicReferenceFieldUpdater, this, afxVar, afxVarRl)) {
                    if (afxVar.ck()) {
                        afxVar.ty();
                    }
                } else if (afxVarRl.ck()) {
                    afxVarRl.ty();
                }
            }
        }
        qz qzVar2 = (qz) Z.rl(objT);
        qzVar2.t();
        if (qzVar2.f63562t > j2) {
            return false;
        }
        int i2 = (int) (andIncrement % ((long) o.J2));
        Object andSet = qzVar2.S().getAndSet(i2, o.rl);
        if (andSet == null) {
            int i3 = o.f75583n;
            for (int i5 = 0; i5 < i3; i5++) {
                if (qzVar2.S().get(i2) == o.f75584t) {
                    return true;
                }
            }
            return !ILs.o.n(qzVar2.S(), i2, o.rl, o.nr);
        }
        if (andSet == o.f75582O) {
            return false;
        }
        return o(andSet);
    }

    private final int gh() {
        int andDecrement;
        do {
            andDecrement = f75574Z.getAndDecrement(this);
        } while (andDecrement > this.f75577n);
        return andDecrement;
    }

    private final void mUb() {
        int i2;
        do {
            i2 = f75574Z.get(this);
            if (i2 <= this.f75577n) {
                return;
            }
        } while (!f75574Z.compareAndSet(this, i2, this.f75577n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean xMQ(HcS hcS) {
        Object objT;
        qz qzVar = (qz) f75576r.get(this);
        long andIncrement = f75575o.getAndIncrement(this);
        j jVar = j.f75579n;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75576r;
        long j2 = andIncrement / ((long) o.J2);
        loop0: while (true) {
            objT = dzu.n.t(qzVar, j2, jVar);
            if (!Z.t(objT)) {
                afx afxVarRl = Z.rl(objT);
                while (true) {
                    afx afxVar = (afx) atomicReferenceFieldUpdater.get(this);
                    if (afxVar.f63562t >= afxVarRl.f63562t) {
                        break loop0;
                    }
                    if (!afxVarRl.XQ()) {
                        break;
                    }
                    if (androidx.concurrent.futures.j.n(atomicReferenceFieldUpdater, this, afxVar, afxVarRl)) {
                        if (afxVar.ck()) {
                            afxVar.ty();
                        }
                    } else if (afxVarRl.ck()) {
                        afxVarRl.ty();
                    }
                }
            } else {
                break;
            }
        }
        qz qzVar2 = (qz) Z.rl(objT);
        int i2 = (int) (andIncrement % ((long) o.J2));
        if (!ILs.o.n(qzVar2.S(), i2, null, hcS)) {
            if (ILs.o.n(qzVar2.S(), i2, o.rl, o.f75584t)) {
                if (hcS instanceof Pl) {
                    Intrinsics.checkNotNull(hcS, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((Pl) hcS).aYN(Unit.INSTANCE, this.f75578t);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + hcS).toString());
            }
            return false;
        }
        hcS.n(qzVar2, i2);
        return true;
    }

    protected final void J2(Pl pl) {
        while (gh() <= 0) {
            Intrinsics.checkNotNull(pl, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (xMQ((HcS) pl)) {
                return;
            }
        }
        pl.aYN(Unit.INSTANCE, this.f75578t);
    }

    public final int n() {
        return Math.max(f75574Z.get(this), 0);
    }

    public final boolean r() {
        while (true) {
            int i2 = f75574Z.get(this);
            if (i2 > this.f75577n) {
                mUb();
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (f75574Z.compareAndSet(this, i2, i2 - 1)) {
                    return true;
                }
            }
        }
    }

    public final void release() {
        do {
            int andIncrement = f75574Z.getAndIncrement(this);
            if (andIncrement < this.f75577n) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                mUb();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f75577n).toString());
            }
        } while (!XQ());
    }

    public final Object t(Continuation continuation) {
        if (gh() > 0) {
            return Unit.INSTANCE;
        }
        Object objKN = KN(continuation);
        if (objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objKN;
        }
        return Unit.INSTANCE;
    }
}
