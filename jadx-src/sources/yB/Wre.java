package yB;

import GJW.HcS;
import GJW.Pl;
import GJW.QJ;
import GJW.eO;
import GJW.lej;
import GJW.psW;
import dzu.afx;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import yB.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Wre extends aC implements yB.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f75568g = AtomicReferenceFieldUpdater.newUpdater(Wre.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Function3 f75569S;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class j implements Pl, HcS {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final eO f75571n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Object f75572t;

        public j(eO eOVar, Object obj) {
            this.f75571n = eOVar;
            this.f75572t = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Wre wre, j jVar, Throwable th) {
            wre.T(jVar.f75572t);
            return Unit.INSTANCE;
        }

        @Override // GJW.Pl
        public Object HI(Throwable th) {
            return this.f75571n.HI(th);
        }

        @Override // GJW.Pl
        public void J2(Function1 function1) {
            this.f75571n.J2(function1);
        }

        @Override // GJW.Pl
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void o(lej lejVar, Unit unit) {
            this.f75571n.o(lejVar, unit);
        }

        @Override // GJW.Pl
        public boolean cancel(Throwable th) {
            return this.f75571n.cancel(th);
        }

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext get$context() {
            return this.f75571n.get$context();
        }

        @Override // GJW.Pl
        public boolean isActive() {
            return this.f75571n.isActive();
        }

        @Override // GJW.Pl
        public boolean isCancelled() {
            return this.f75571n.isCancelled();
        }

        @Override // GJW.Pl
        public boolean isCompleted() {
            return this.f75571n.isCompleted();
        }

        @Override // GJW.HcS
        public void n(afx afxVar, int i2) {
            this.f75571n.n(afxVar, i2);
        }

        @Override // GJW.Pl
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void r(Unit unit, Function1 function1) {
            this.f75571n.r(unit, function1);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.f75571n.resumeWith(obj);
        }

        @Override // GJW.Pl
        public void te(Object obj) {
            this.f75571n.te(obj);
        }

        @Override // GJW.Pl
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public Object g(Unit unit, Object obj, Function3 function3) {
            final Wre wre = Wre.this;
            Object objG = this.f75571n.g(unit, obj, new Function3() { // from class: yB.Ml
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return Wre.j.mUb(wre, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                }
            });
            if (objG != null) {
                Wre.ViF().set(Wre.this, this.f75572t);
            }
            return objG;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(Wre wre, j jVar, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            Wre.ViF().set(wre, jVar.f75572t);
            wre.T(jVar.f75572t);
            return Unit.INSTANCE;
        }

        @Override // GJW.Pl
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void aYN(Unit unit, Function3 function3) {
            Wre.ViF().set(Wre.this, this.f75572t);
            eO eOVar = this.f75571n;
            final Wre wre = Wre.this;
            eOVar.r(unit, new Function1() { // from class: yB.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wre.j.Uo(wre, this, (Throwable) obj);
                }
            });
        }
    }

    public Wre(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : CN3.f75562n;
        this.f75569S = new Function3() { // from class: yB.n
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Wre wre = this.f75581n;
                android.support.v4.media.j.n(obj);
                return Wre.iF(wre, null, obj2, obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater ViF() {
        return f75568g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 iF(final Wre wre, tj.I28 i28, final Object obj, Object obj2) {
        return new Function3() { // from class: yB.w6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return Wre.fD(this.f75586n, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    public String toString() {
        return "Mutex@" + psW.rl(this) + "[isLocked=" + Uo() + ",owner=" + f75568g.get(this) + ']';
    }

    private final int E2(Object obj) {
        while (!r()) {
            if (obj == null) {
                return 1;
            }
            int iNY = nY(obj);
            if (iNY == 1) {
                return 2;
            }
            if (iNY == 2) {
                return 1;
            }
        }
        f75568g.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(Wre wre, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        wre.T(obj);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object g(Wre wre, Object obj, Continuation continuation) {
        if (wre.rl(obj)) {
            return Unit.INSTANCE;
        }
        Object objTe = wre.te(obj, continuation);
        if (objTe == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objTe;
        }
        return Unit.INSTANCE;
    }

    private final int nY(Object obj) {
        while (Uo()) {
            Object obj2 = f75568g.get(this);
            if (obj2 != CN3.f75562n) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    private final Object te(Object obj, Continuation continuation) {
        eO eOVarRl = QJ.rl(IntrinsicsKt.intercepted(continuation));
        try {
            J2(new j(eOVarRl, obj));
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

    @Override // yB.j
    public void T(Object obj) {
        while (Uo()) {
            Object obj2 = f75568g.get(this);
            if (obj2 != CN3.f75562n) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.j.n(f75568g, this, obj2, CN3.f75562n)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // yB.j
    public boolean Uo() {
        if (n() == 0) {
            return true;
        }
        return false;
    }

    @Override // yB.j
    public Object Z(Object obj, Continuation continuation) {
        return g(this, obj, continuation);
    }

    @Override // yB.j
    public boolean rl(Object obj) {
        int iE2 = E2(obj);
        if (iE2 == 0) {
            return true;
        }
        if (iE2 != 1) {
            if (iE2 != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }
}
