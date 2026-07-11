package ILs;

import GJW.HcS;
import dzu.Ew;
import dzu.Z;
import dzu.afx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 implements CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function3 f4156O;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f4157n;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Function1 f4158t;
    private static final /* synthetic */ AtomicLongFieldUpdater J2 = AtomicLongFieldUpdater.newUpdater(I28.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4155r = AtomicLongFieldUpdater.newUpdater(I28.class, "receivers$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4154o = AtomicLongFieldUpdater.newUpdater(I28.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4151Z = AtomicLongFieldUpdater.newUpdater(I28.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4149S = AtomicReferenceFieldUpdater.newUpdater(I28.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4153g = AtomicReferenceFieldUpdater.newUpdater(I28.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater E2 = AtomicReferenceFieldUpdater.newUpdater(I28.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4152e = AtomicReferenceFieldUpdater.newUpdater(I28.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4150X = AtomicReferenceFieldUpdater.newUpdater(I28.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: ILs.I28$I28, reason: collision with other inner class name */
    static final class C0142I28 extends ContinuationImpl {
        long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4159O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f4160Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4161n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4163r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4164t;

        C0142I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f4163r = obj;
            this.f4160Z |= Integer.MIN_VALUE;
            Object objRQ = I28.this.RQ(null, 0, 0L, this);
            return objRQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRQ : C.rl(objRQ);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4165O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4166n;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f4166n = obj;
            this.f4165O |= Integer.MIN_VALUE;
            Object objW = I28.W(I28.this, this);
            return objW == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : C.rl(objW);
        }
    }

    private final class j implements Dsr, HcS {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f4169n = Wre.ck;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private GJW.eO f4170t;

        public j() {
        }

        private final Object J2(qz qzVar, int i2, long j2, Continuation continuation) throws Throwable {
            Boolean boolBoxBoolean;
            qz qzVarEF;
            I28 i28 = I28.this;
            GJW.eO eOVarRl = GJW.QJ.rl(IntrinsicsKt.intercepted(continuation));
            try {
                this.f4170t = eOVarRl;
                try {
                    Object objHBN = i28.HBN(qzVar, i2, j2, this);
                    if (objHBN == Wre.az) {
                        i28.ER(this, qzVar, i2);
                    } else {
                        Function3 function3X = null;
                        if (objHBN == Wre.HI) {
                            if (j2 < i28.piY()) {
                                qzVar.t();
                            }
                            qz qzVar2 = (qz) I28.GR().get(i28);
                            while (true) {
                                if (i28.Mx()) {
                                    KN();
                                    break;
                                }
                                long andIncrement = I28.Nxk().getAndIncrement(i28);
                                int i3 = Wre.rl;
                                long j3 = andIncrement / ((long) i3);
                                int i5 = (int) (andIncrement % ((long) i3));
                                if (qzVar2.f63562t != j3) {
                                    qzVarEF = i28.eF(j3, qzVar2);
                                    if (qzVarEF == null) {
                                    }
                                } else {
                                    qzVarEF = qzVar2;
                                }
                                Object objHBN2 = i28.HBN(qzVarEF, i5, andIncrement, this);
                                if (objHBN2 == Wre.az) {
                                    i28.ER(this, qzVarEF, i5);
                                    break;
                                }
                                if (objHBN2 == Wre.HI) {
                                    if (andIncrement < i28.piY()) {
                                        qzVarEF.t();
                                    }
                                    qzVar2 = qzVarEF;
                                } else {
                                    if (objHBN2 == Wre.ty) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    qzVarEF.t();
                                    this.f4169n = objHBN2;
                                    this.f4170t = null;
                                    boolBoxBoolean = Boxing.boxBoolean(true);
                                    Function1 function1 = i28.f4158t;
                                    if (function1 != null) {
                                        function3X = i28.X(function1, objHBN2);
                                    }
                                }
                            }
                        } else {
                            qzVar.t();
                            this.f4169n = objHBN;
                            this.f4170t = null;
                            boolBoxBoolean = Boxing.boxBoolean(true);
                            Function1 function12 = i28.f4158t;
                            if (function12 != null) {
                                function3X = i28.X(function12, objHBN);
                            }
                        }
                        eOVarRl.aYN(boolBoxBoolean, function3X);
                    }
                    Object objWPU = eOVarRl.WPU();
                    if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return objWPU;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    eOVarRl.rV9();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void KN() {
            GJW.eO eOVar = this.f4170t;
            Intrinsics.checkNotNull(eOVar);
            this.f4170t = null;
            this.f4169n = Wre.nY();
            Throwable thJ = I28.this.J();
            if (thJ == null) {
                Result.Companion companion = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thJ)));
            }
        }

        public final void mUb() {
            GJW.eO eOVar = this.f4170t;
            Intrinsics.checkNotNull(eOVar);
            this.f4170t = null;
            this.f4169n = Wre.nY();
            Throwable thJ = I28.this.J();
            if (thJ == null) {
                Result.Companion companion = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thJ)));
            }
        }

        @Override // GJW.HcS
        public void n(afx afxVar, int i2) {
            GJW.eO eOVar = this.f4170t;
            if (eOVar != null) {
                eOVar.n(afxVar, i2);
            }
        }

        @Override // ILs.Dsr
        public Object next() throws Throwable {
            Object obj = this.f4169n;
            if (obj == Wre.ck) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f4169n = Wre.ck;
            if (obj != Wre.nY()) {
                return obj;
            }
            throw Ew.n(I28.this.I());
        }

        @Override // ILs.Dsr
        public Object rl(Continuation continuation) throws Throwable {
            qz qzVarEF;
            boolean zUo = true;
            if (this.f4169n == Wre.ck || this.f4169n == Wre.nY()) {
                I28 i28 = I28.this;
                qz qzVar = (qz) I28.GR().get(i28);
                while (!i28.Mx()) {
                    long andIncrement = I28.Nxk().getAndIncrement(i28);
                    int i2 = Wre.rl;
                    long j2 = andIncrement / ((long) i2);
                    int i3 = (int) (andIncrement % ((long) i2));
                    if (qzVar.f63562t != j2) {
                        qzVarEF = i28.eF(j2, qzVar);
                        if (qzVarEF == null) {
                            continue;
                        }
                    } else {
                        qzVarEF = qzVar;
                    }
                    Object objHBN = i28.HBN(qzVarEF, i3, andIncrement, null);
                    if (objHBN == Wre.az) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objHBN == Wre.HI) {
                        if (andIncrement < i28.piY()) {
                            qzVarEF.t();
                        }
                        qzVar = qzVarEF;
                    } else {
                        if (objHBN == Wre.ty) {
                            return J2(qzVarEF, i3, andIncrement, continuation);
                        }
                        qzVarEF.t();
                        this.f4169n = objHBN;
                    }
                }
                zUo = Uo();
            }
            return Boxing.boxBoolean(zUo);
        }

        public final boolean xMQ(Object obj) {
            GJW.eO eOVar = this.f4170t;
            Intrinsics.checkNotNull(eOVar);
            this.f4170t = null;
            this.f4169n = obj;
            Boolean bool = Boolean.TRUE;
            I28 i28 = I28.this;
            Function1 function1 = i28.f4158t;
            return Wre.te(eOVar, bool, function1 != null ? i28.X(function1, obj) : null);
        }

        private final boolean Uo() throws Throwable {
            this.f4169n = Wre.nY();
            Throwable thJ = I28.this.J();
            if (thJ == null) {
                return false;
            }
            throw Ew.n(thJ);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function3 {
        n(Object obj) {
            super(3, obj, I28.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Throwable) obj, obj2, (CoroutineContext) obj3);
            return Unit.INSTANCE;
        }

        public final void n(Throwable th, Object obj, CoroutineContext coroutineContext) {
            ((I28) this.receiver).HV(th, obj, coroutineContext);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function3 {
        w6(Object obj) {
            super(3, obj, I28.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Throwable) obj, ((C) obj2).az(), (CoroutineContext) obj3);
            return Unit.INSTANCE;
        }

        public final void n(Throwable th, Object obj, CoroutineContext coroutineContext) {
            ((I28) this.receiver).Org(th, obj, coroutineContext);
        }
    }

    private final boolean G7(long j2) {
        return C(j2, true);
    }

    private final void QZ6(HcS hcS) {
        VwL(hcS, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fcU(long j2) {
        return C(j2, false);
    }

    private final qz p5(long j2, qz qzVar, long j3) {
        Object objT;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E2;
        Function2 function2 = (Function2) Wre.ViF();
        loop0: while (true) {
            objT = dzu.n.t(qzVar, j2, function2);
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
        if (Z.t(objT)) {
            U();
            mYa(j2, qzVar);
            xg(this, 0L, 1, null);
            return null;
        }
        qz qzVar2 = (qz) Z.rl(objT);
        if (qzVar2.f63562t <= j2) {
            return qzVar2;
        }
        long j4 = qzVar2.f63562t;
        int i2 = Wre.rl;
        if (f4154o.compareAndSet(this, j3 + 1, j4 * ((long) i2))) {
            eTf((qzVar2.f63562t * ((long) i2)) - j3);
        } else {
            xg(this, 0L, 1, null);
        }
        return null;
    }

    private final void tFV(HcS hcS) {
        VwL(hcS, false);
    }

    private final void v(qz qzVar, long j2) {
        Object objRl = dzu.aC.rl(null, 1, null);
        loop0: while (qzVar != null) {
            for (int i2 = Wre.rl - 1; -1 < i2; i2--) {
                if ((qzVar.f63562t * ((long) Wre.rl)) + ((long) i2) < j2) {
                    break loop0;
                }
                while (true) {
                    Object objTe = qzVar.te(i2);
                    if (objTe != null && objTe != Wre.f4175O) {
                        if (!(objTe instanceof SPz)) {
                            if (!(objTe instanceof HcS)) {
                                break;
                            }
                            if (qzVar.S(i2, objTe, Wre.nY())) {
                                objRl = dzu.aC.t(objRl, objTe);
                                qzVar.iF(i2, true);
                                break;
                            }
                        } else {
                            if (qzVar.S(i2, objTe, Wre.nY())) {
                                objRl = dzu.aC.t(objRl, ((SPz) objTe).f4173n);
                                qzVar.iF(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (qzVar.S(i2, objTe, Wre.nY())) {
                            qzVar.Z();
                            break;
                        }
                    }
                }
            }
            qzVar = (qz) qzVar.KN();
        }
        if (objRl != null) {
            if (!(objRl instanceof ArrayList)) {
                QZ6((HcS) objRl);
                return;
            }
            Intrinsics.checkNotNull(objRl, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objRl;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                QZ6((HcS) arrayList.get(size));
            }
        }
    }

    protected void GD() {
    }

    protected void K() {
    }

    protected boolean eWT() {
        return false;
    }

    protected void i() {
    }

    @Override // ILs.r
    public boolean xMQ(Throwable th) {
        return bzg(th, false);
    }

    private final boolean C(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            jB(j2 & 1152921504606846975L);
            return (z2 && m()) ? false : true;
        }
        if (i2 == 3) {
            Xw(j2 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EWS(GJW.Pl pl) {
        Result.Companion companion = Result.INSTANCE;
        pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(I())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (ILs.qz) r12.KN();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void F(qz qzVar) {
        Function1 function1 = this.f4158t;
        UndeliveredElementException undeliveredElementExceptionRl = null;
        Object objRl = dzu.aC.rl(null, 1, null);
        loop0: do {
            int i2 = Wre.rl - 1;
            while (true) {
                if (-1 >= i2) {
                    break;
                }
                long j2 = (qzVar.f63562t * ((long) Wre.rl)) + ((long) i2);
                while (true) {
                    Object objTe = qzVar.te(i2);
                    if (objTe == Wre.xMQ) {
                        break loop0;
                    }
                    if (objTe != Wre.nr) {
                        if (objTe != Wre.f4175O && objTe != null) {
                            if (!(objTe instanceof HcS) && !(objTe instanceof SPz)) {
                                if (objTe != Wre.Uo && objTe != Wre.J2) {
                                    if (objTe != Wre.Uo) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j2 < Y()) {
                                    break loop0;
                                }
                                HcS hcS = objTe instanceof SPz ? ((SPz) objTe).f4173n : (HcS) objTe;
                                if (qzVar.S(i2, objTe, Wre.nY())) {
                                    if (function1 != null) {
                                        undeliveredElementExceptionRl = dzu.r.rl(function1, qzVar.g(i2), undeliveredElementExceptionRl);
                                    }
                                    objRl = dzu.aC.t(objRl, hcS);
                                    qzVar.WPU(i2);
                                    qzVar.Z();
                                }
                            }
                        } else {
                            if (qzVar.S(i2, objTe, Wre.nY())) {
                                qzVar.Z();
                                break;
                            }
                        }
                    } else {
                        if (j2 < Y()) {
                            break loop0;
                        }
                        if (qzVar.S(i2, objTe, Wre.nY())) {
                            if (function1 != null) {
                                undeliveredElementExceptionRl = dzu.r.rl(function1, qzVar.g(i2), undeliveredElementExceptionRl);
                            }
                            qzVar.WPU(i2);
                            qzVar.Z();
                        }
                    }
                }
                i2--;
            }
        } while (qzVar != null);
        if (objRl != null) {
            if (objRl instanceof ArrayList) {
                Intrinsics.checkNotNull(objRl, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objRl;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    tFV((HcS) arrayList.get(size));
                }
            } else {
                tFV((HcS) objRl);
            }
        }
        if (undeliveredElementExceptionRl != null) {
            throw undeliveredElementExceptionRl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater GR() {
        return f4153g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void HV(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f4158t;
        Intrinsics.checkNotNull(function1);
        dzu.r.n(function1, obj, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 How(final I28 i28, final tj.I28 i282, Object obj, final Object obj2) {
        return new Function3(obj2, i28, i282) { // from class: ILs.Ml

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Object f4171n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ I28 f4172t;

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return I28.tUK(this.f4171n, this.f4172t, null, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater Nxk() {
        return f4155r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Org(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f4158t;
        Intrinsics.checkNotNull(function1);
        Object objJ2 = C.J2(obj);
        Intrinsics.checkNotNull(objJ2);
        dzu.r.n(function1, objJ2, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Po6(GJW.Pl pl) {
        Result.Companion companion = Result.INSTANCE;
        pl.resumeWith(Result.m313constructorimpl(C.rl(C.rl.n(J()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RQ(qz qzVar, int i2, long j2, Continuation continuation) throws Throwable {
        C0142I28 c0142i28;
        UGc uGc;
        C cRl;
        Function3 function3;
        qz qzVar2;
        if (continuation instanceof C0142I28) {
            c0142i28 = (C0142I28) continuation;
            int i3 = c0142i28.f4160Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0142i28.f4160Z = i3 - Integer.MIN_VALUE;
            } else {
                c0142i28 = new C0142I28(continuation);
            }
        }
        Object objWPU = c0142i28.f4163r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c0142i28.f4160Z;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objWPU);
            c0142i28.f4161n = this;
            c0142i28.f4164t = qzVar;
            c0142i28.f4159O = i2;
            c0142i28.J2 = j2;
            c0142i28.f4160Z = 1;
            GJW.eO eOVarRl = GJW.QJ.rl(IntrinsicsKt.intercepted(c0142i28));
            try {
                Intrinsics.checkNotNull(eOVarRl, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                uGc = new UGc(eOVarRl);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object objHBN = HBN(qzVar, i2, j2, uGc);
                if (objHBN == Wre.az) {
                    ER(uGc, qzVar, i2);
                } else {
                    if (objHBN == Wre.HI) {
                        if (j2 < piY()) {
                            qzVar.t();
                        }
                        qz qzVar3 = (qz) GR().get(this);
                        while (true) {
                            if (Mx()) {
                                Po6(eOVarRl);
                                break;
                            }
                            long andIncrement = Nxk().getAndIncrement(this);
                            int i7 = Wre.rl;
                            long j3 = andIncrement / ((long) i7);
                            int i8 = (int) (andIncrement % ((long) i7));
                            if (qzVar3.f63562t != j3) {
                                qz qzVarEF = eF(j3, qzVar3);
                                if (qzVarEF != null) {
                                    qzVar2 = qzVarEF;
                                }
                            } else {
                                qzVar2 = qzVar3;
                            }
                            Object objHBN2 = HBN(qzVar2, i8, andIncrement, uGc);
                            qz qzVar4 = qzVar2;
                            if (objHBN2 == Wre.az) {
                                ER(uGc, qzVar4, i8);
                                break;
                            }
                            if (objHBN2 == Wre.HI) {
                                if (andIncrement < piY()) {
                                    qzVar4.t();
                                }
                                qzVar3 = qzVar4;
                            } else {
                                if (objHBN2 == Wre.ty) {
                                    throw new IllegalStateException("unexpected");
                                }
                                qzVar4.t();
                                cRl = C.rl(C.rl.t(objHBN2));
                                Function1 function1 = this.f4158t;
                                function3 = (Function3) (function1 != null ? nHg(function1) : null);
                            }
                        }
                    } else {
                        qzVar.t();
                        cRl = C.rl(C.rl.t(objHBN));
                        Function1 function12 = this.f4158t;
                        function3 = (Function3) (function12 != null ? nHg(function12) : null);
                    }
                    eOVarRl.aYN(cRl, function3);
                }
                objWPU = eOVarRl.WPU();
                if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c0142i28);
                }
                if (objWPU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                eOVarRl.rV9();
                throw th3;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWPU);
        }
        return ((C) objWPU).az();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction T(Function1 function1) {
        return new n(this);
    }

    private final boolean Uf(Object obj, qz qzVar, int i2) {
        if (obj instanceof GJW.Pl) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return Wre.iF((GJW.Pl) obj, Unit.INSTANCE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UhV(Object obj, GJW.Pl pl) {
        Function1 function1 = this.f4158t;
        if (function1 != null) {
            dzu.r.n(function1, obj, pl.getContext());
        }
        Throwable thK = k();
        Result.Companion companion = Result.INSTANCE;
        pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thK)));
    }

    private final void VwL(HcS hcS, boolean z2) {
        if (hcS instanceof GJW.Pl) {
            Continuation continuation = (Continuation) hcS;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(z2 ? I() : k())));
        } else if (hcS instanceof UGc) {
            GJW.eO eOVar = ((UGc) hcS).f4174n;
            Result.Companion companion2 = Result.INSTANCE;
            eOVar.resumeWith(Result.m313constructorimpl(C.rl(C.rl.n(J()))));
        } else {
            if (hcS instanceof j) {
                ((j) hcS).mUb();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + hcS).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object W(I28 i28, Continuation continuation) throws Throwable {
        Ml ml;
        qz qzVar;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f4165O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f4165O = i2 - Integer.MIN_VALUE;
            } else {
                ml = i28.new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object obj = ml2.f4166n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml2.f4165O;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((C) obj).az();
        }
        ResultKt.throwOnFailure(obj);
        qz qzVar2 = (qz) GR().get(i28);
        while (!i28.Mx()) {
            long andIncrement = Nxk().getAndIncrement(i28);
            int i5 = Wre.rl;
            long j2 = andIncrement / ((long) i5);
            int i7 = (int) (andIncrement % ((long) i5));
            if (qzVar2.f63562t != j2) {
                qz qzVarEF = i28.eF(j2, qzVar2);
                if (qzVarEF == null) {
                    continue;
                } else {
                    qzVar = qzVarEF;
                }
            } else {
                qzVar = qzVar2;
            }
            I28 i282 = i28;
            Object objHBN = i282.HBN(qzVar, i7, andIncrement, null);
            if (objHBN == Wre.az) {
                throw new IllegalStateException("unexpected");
            }
            if (objHBN != Wre.HI) {
                if (objHBN != Wre.ty) {
                    qzVar.t();
                    return C.rl.t(objHBN);
                }
                ml2.f4165O = 1;
                Object objRQ = i282.RQ(qzVar, i7, andIncrement, ml2);
                return objRQ == coroutine_suspended ? coroutine_suspended : objRQ;
            }
            if (andIncrement < i282.piY()) {
                qzVar.t();
            }
            i28 = i282;
            qzVar2 = qzVar;
        }
        return C.rl.n(i28.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function3 X(final Function1 function1, final Object obj) {
        return new Function3() { // from class: ILs.w6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return I28.N(function1, obj, (Throwable) obj2, obj3, (CoroutineContext) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater dR0() {
        return f4149S;
    }

    private final Object hRu(Object obj, Continuation continuation) {
        UndeliveredElementException undeliveredElementExceptionT;
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        Function1 function1 = this.f4158t;
        if (function1 == null || (undeliveredElementExceptionT = dzu.r.t(function1, obj, null, 2, null)) == null) {
            Throwable thK = k();
            Result.Companion companion = Result.INSTANCE;
            eOVar.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thK)));
        } else {
            ExceptionsKt.addSuppressed(undeliveredElementExceptionT, k());
            Result.Companion companion2 = Result.INSTANCE;
            eOVar.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(undeliveredElementExceptionT)));
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lLA(HcS hcS, qz qzVar, int i2) {
        hcS.n(qzVar, i2 + Wre.rl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void mYa(long j2, qz qzVar) {
        qz qzVar2;
        qz qzVar3;
        while (qzVar.f63562t < j2 && (qzVar3 = (qz) qzVar.J2()) != null) {
            qzVar = qzVar3;
        }
        while (true) {
            if (!qzVar.gh() || (qzVar2 = (qz) qzVar.J2()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E2;
                while (true) {
                    afx afxVar = (afx) atomicReferenceFieldUpdater.get(this);
                    if (afxVar.f63562t >= qzVar.f63562t) {
                        return;
                    }
                    if (!qzVar.XQ()) {
                        break;
                    }
                    if (androidx.concurrent.futures.j.n(atomicReferenceFieldUpdater, this, afxVar, qzVar)) {
                        if (afxVar.ck()) {
                            afxVar.ty();
                            return;
                        }
                        return;
                    } else if (qzVar.ck()) {
                        qzVar.ty();
                    }
                }
            } else {
                qzVar = qzVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (ILs.qz) r8.KN();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long n1(qz qzVar) {
        do {
            int i2 = Wre.rl;
            while (true) {
                i2--;
                if (-1 >= i2) {
                    break;
                }
                long j2 = (qzVar.f63562t * ((long) Wre.rl)) + ((long) i2);
                if (j2 < Y()) {
                    return -1L;
                }
                while (true) {
                    Object objTe = qzVar.te(i2);
                    if (objTe == null || objTe == Wre.f4175O) {
                        if (qzVar.S(i2, objTe, Wre.nY())) {
                            qzVar.Z();
                            break;
                        }
                    } else if (objTe == Wre.nr) {
                        return j2;
                    }
                }
            }
        } while (qzVar != null);
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction nHg(Function1 function1) {
        return new w6(this);
    }

    private final boolean p0N(Object obj, Object obj2) {
        if (obj instanceof UGc) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            GJW.eO eOVar = ((UGc) obj).f4174n;
            C cRl = C.rl(C.rl.t(obj2));
            Function1 function1 = this.f4158t;
            return Wre.te(eOVar, cRl, (Function3) (function1 != null ? nHg(function1) : null));
        }
        if (obj instanceof j) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((j) obj).xMQ(obj2);
        }
        if (obj instanceof GJW.Pl) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            GJW.Pl pl = (GJW.Pl) obj;
            Function1 function12 = this.f4158t;
            return Wre.te(pl, obj2, (Function3) (function12 != null ? T(function12) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    static /* synthetic */ void xg(I28 i28, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        i28.eTf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater z() {
        return J2;
    }

    public final void EF(long j2) {
        I28 i28 = this;
        if (i28.ul()) {
            return;
        }
        while (i28.FX() <= j2) {
            i28 = this;
        }
        int i2 = Wre.f4179t;
        for (int i3 = 0; i3 < i2; i3++) {
            long jFX = i28.FX();
            if (jFX == (DurationKt.MAX_MILLIS & f4151Z.get(i28)) && jFX == i28.FX()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4151Z;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(i28);
            if (atomicLongFieldUpdater.compareAndSet(i28, j3, Wre.S(j3 & DurationKt.MAX_MILLIS, true))) {
                break;
            } else {
                i28 = this;
            }
        }
        while (true) {
            long jFX2 = i28.FX();
            long j4 = f4151Z.get(i28);
            long j5 = j4 & DurationKt.MAX_MILLIS;
            boolean z2 = (4611686018427387904L & j4) != 0;
            if (jFX2 == j5 && jFX2 == i28.FX()) {
                break;
            }
            if (z2) {
                i28 = this;
            } else {
                i28 = this;
                f4151Z.compareAndSet(i28, j4, Wre.S(j5, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4151Z;
        while (true) {
            long j6 = atomicLongFieldUpdater2.get(i28);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(i28, j6, Wre.S(j6 & DurationKt.MAX_MILLIS, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            i28 = this;
        }
    }

    protected boolean bzg(Throwable th, boolean z2) {
        if (z2) {
            Jk();
        }
        boolean zN = androidx.concurrent.futures.j.n(f4152e, this, Wre.f4177o, th);
        if (z2) {
            Rl();
        } else {
            qm();
        }
        U();
        GD();
        if (zN) {
            pJg();
        }
        return zN;
    }

    protected final Object f(Object obj) {
        qz qzVarE;
        int i2;
        I28 i28;
        Object obj2 = Wre.nr;
        qz qzVar = (qz) dR0().get(this);
        while (true) {
            long andIncrement = z().getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zFcU = fcU(andIncrement);
            int i3 = Wre.rl;
            long j3 = j2 / ((long) i3);
            int i5 = (int) (j2 % ((long) i3));
            if (qzVar.f63562t != j3) {
                qzVarE = E(j3, qzVar);
                if (qzVarE != null) {
                    i28 = this;
                    i2 = i5;
                } else if (zFcU) {
                    return C.rl.n(k());
                }
            } else {
                qzVarE = qzVar;
                i2 = i5;
                i28 = this;
            }
            Object obj3 = obj;
            int iX4T = i28.X4T(qzVarE, i2, obj3, j2, obj2, zFcU);
            qzVar = qzVarE;
            if (iX4T == 0) {
                qzVar.t();
                return C.rl.t(Unit.INSTANCE);
            }
            if (iX4T == 1) {
                return C.rl.t(Unit.INSTANCE);
            }
            if (iX4T == 2) {
                if (zFcU) {
                    qzVar.Z();
                    return C.rl.n(k());
                }
                HcS hcS = obj2 instanceof HcS ? (HcS) obj2 : null;
                if (hcS != null) {
                    lLA(hcS, qzVar, i2);
                }
                P5((qzVar.f63562t * ((long) i3)) + ((long) i2));
                return C.rl.t(Unit.INSTANCE);
            }
            if (iX4T == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iX4T == 4) {
                if (j2 < Y()) {
                    qzVar.t();
                }
                return C.rl.n(k());
            }
            if (iX4T == 5) {
                qzVar.t();
            }
            obj = obj3;
        }
    }

    @Override // ILs.Q
    public Dsr iterator() {
        return new j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bb, code lost:
    
        r16 = r7;
        r3 = (ILs.qz) r3.J2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c4, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (J2.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f4157n + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z3 = true;
        List listListOf = CollectionsKt.listOf((Object[]) new qz[]{f4153g.get(this), f4149S.get(this), E2.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((qz) obj) != Wre.f4176n) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((qz) next).f63562t;
            do {
                Object next2 = it.next();
                long j3 = ((qz) next2).f63562t;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        qz qzVar = (qz) next;
        long jY = Y();
        long jPiY = piY();
        loop2: while (true) {
            int i5 = Wre.rl;
            int i7 = i3;
            while (true) {
                if (i7 >= i5) {
                    break;
                }
                long j4 = (qzVar.f63562t * ((long) Wre.rl)) + ((long) i7);
                if (j4 >= jPiY && j4 >= jY) {
                    break loop2;
                }
                Object objTe = qzVar.te(i7);
                Object objG = qzVar.g(i7);
                boolean z4 = z3;
                if (objTe instanceof GJW.Pl) {
                    string = (j4 >= jY || j4 < jPiY) ? (j4 >= jPiY || j4 < jY) ? "cont" : "send" : "receive";
                } else if (objTe instanceof UGc) {
                    string = "receiveCatching";
                } else if (objTe instanceof SPz) {
                    string = "EB(" + objTe + ')';
                } else if (Intrinsics.areEqual(objTe, Wre.J2) || Intrinsics.areEqual(objTe, Wre.Uo)) {
                    string = "resuming_sender";
                } else if (objTe == null || Intrinsics.areEqual(objTe, Wre.f4175O) || Intrinsics.areEqual(objTe, Wre.xMQ) || Intrinsics.areEqual(objTe, Wre.KN) || Intrinsics.areEqual(objTe, Wre.gh) || Intrinsics.areEqual(objTe, Wre.mUb) || Intrinsics.areEqual(objTe, Wre.nY())) {
                    i7++;
                    z3 = z4;
                } else {
                    string = objTe.toString();
                }
                if (objG != null) {
                    sb.append('(' + string + ',' + objG + "),");
                } else {
                    sb.append(string + ',');
                }
                i7++;
                z3 = z4;
            }
            z3 = z2;
            i3 = 0;
        }
        if (StringsKt.last(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean wTp(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return bzg(th, true);
    }

    public I28(int i2, Function1 function1) {
        Function3 function3;
        this.f4157n = i2;
        this.f4158t = function1;
        if (i2 >= 0) {
            this.bufferEnd$volatile = Wre.g(i2);
            this.completedExpandBuffersAndPauseFlag$volatile = FX();
            qz qzVar = new qz(0L, null, this, 3);
            this.sendSegment$volatile = qzVar;
            this.receiveSegment$volatile = qzVar;
            if (ul()) {
                qzVar = Wre.f4176n;
                Intrinsics.checkNotNull(qzVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = qzVar;
            if (function1 != null) {
                function3 = new Function3() { // from class: ILs.n
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        I28 i28 = this.f4192n;
                        android.support.v4.media.j.n(obj);
                        return I28.How(i28, null, obj2, obj3);
                    }
                };
            } else {
                function3 = null;
            }
            this.f4156O = function3;
            this._closeCause$volatile = Wre.f4177o;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
    }

    private final boolean Bu(long j2) {
        if (fcU(j2)) {
            return false;
        }
        return !s7N(j2 & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qz E(long j2, qz qzVar) {
        Object objT;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4149S;
        Function2 function2 = (Function2) Wre.ViF();
        loop0: while (true) {
            objT = dzu.n.t(qzVar, j2, function2);
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
        if (Z.t(objT)) {
            U();
            if (qzVar.f63562t * ((long) Wre.rl) < Y()) {
                qzVar.t();
            }
            return null;
        }
        qz qzVar2 = (qz) Z.rl(objT);
        long j3 = qzVar2.f63562t;
        if (j3 > j2) {
            int i2 = Wre.rl;
            xVH(j3 * ((long) i2));
            if (qzVar2.f63562t * ((long) i2) < Y()) {
                qzVar2.t();
            }
            return null;
        }
        return qzVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ER(HcS hcS, qz qzVar, int i2) {
        K();
        hcS.n(qzVar, i2);
    }

    private final long FX() {
        return f4154o.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object HBN(qz qzVar, int i2, long j2, Object obj) {
        Object objTe = qzVar.te(i2);
        if (objTe == null) {
            if (j2 >= (J2.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return Wre.ty;
                }
                if (qzVar.S(i2, objTe, obj)) {
                    M7();
                    return Wre.az;
                }
            }
        } else if (objTe == Wre.nr && qzVar.S(i2, objTe, Wre.xMQ)) {
            M7();
            return qzVar.fD(i2);
        }
        return UF(qzVar, i2, j2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable I() {
        Throwable thJ = J();
        if (thJ == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return thJ;
    }

    private final void JVN(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4155r;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            if (j3 < j2) {
                long j4 = j2;
                if (f4155r.compareAndSet(this, j3, j4)) {
                    return;
                } else {
                    j2 = j4;
                }
            } else {
                return;
            }
        }
    }

    private final void Jk() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = J2;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, Wre.WPU(1152921504606846975L & j2, 1)));
    }

    private final void M7() {
        if (ul()) {
            return;
        }
        qz qzVar = (qz) E2.get(this);
        while (true) {
            long andIncrement = f4154o.getAndIncrement(this);
            int i2 = Wre.rl;
            long j2 = andIncrement / ((long) i2);
            if (piY() <= andIncrement) {
                if (qzVar.f63562t < j2 && qzVar.J2() != null) {
                    mYa(j2, qzVar);
                }
                xg(this, 0L, 1, null);
                return;
            }
            if (qzVar.f63562t != j2) {
                qz qzVarP5 = p5(j2, qzVar, andIncrement);
                if (qzVarP5 == null) {
                    continue;
                } else {
                    qzVar = qzVarP5;
                }
            }
            if (ub(qzVar, (int) (andIncrement % ((long) i2)), andIncrement)) {
                xg(this, 0L, 1, null);
                return;
            }
            xg(this, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        dzu.r.n(function1, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    private final boolean Qu(qz qzVar, int i2, long j2) {
        while (true) {
            Object objTe = qzVar.te(i2);
            if (objTe instanceof HcS) {
                if (j2 < f4155r.get(this)) {
                    if (qzVar.S(i2, objTe, new SPz((HcS) objTe))) {
                        return true;
                    }
                } else if (qzVar.S(i2, objTe, Wre.Uo)) {
                    if (Uf(objTe, qzVar, i2)) {
                        qzVar.e(i2, Wre.nr);
                        return true;
                    }
                    qzVar.e(i2, Wre.mUb);
                    qzVar.iF(i2, false);
                    return false;
                }
            } else {
                if (objTe == Wre.mUb) {
                    return false;
                }
                if (objTe == null) {
                    if (qzVar.S(i2, objTe, Wre.f4175O)) {
                        return true;
                    }
                } else {
                    if (objTe == Wre.nr || objTe == Wre.KN || objTe == Wre.xMQ || objTe == Wre.gh || objTe == Wre.nY()) {
                        return true;
                    }
                    if (objTe != Wre.J2) {
                        throw new IllegalStateException(("Unexpected cell state: " + objTe).toString());
                    }
                }
            }
        }
    }

    private final void Rl() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = J2;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, Wre.WPU(1152921504606846975L & j2, 3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object T3L(qz qzVar, int i2, Object obj, long j2, Continuation continuation) {
        Object objM313constructorimpl;
        Object objWPU;
        qz qzVarE;
        GJW.eO eOVar;
        GJW.eO eOVarRl = GJW.QJ.rl(IntrinsicsKt.intercepted(continuation));
        try {
            int iX4T = X4T(qzVar, i2, obj, j2, eOVarRl, false);
            if (iX4T != 0) {
                if (iX4T != 1) {
                    if (iX4T == 2) {
                        lLA(eOVarRl, qzVar, i2);
                    } else {
                        if (iX4T != 4) {
                            String str = "unexpected";
                            if (iX4T == 5) {
                                qzVar.t();
                                qz qzVar2 = (qz) dR0().get(this);
                                while (true) {
                                    long andIncrement = z().getAndIncrement(this);
                                    long j3 = 1152921504606846975L & andIncrement;
                                    boolean zFcU = fcU(andIncrement);
                                    int i3 = Wre.rl;
                                    long j4 = j3 / ((long) i3);
                                    int i5 = (int) (j3 % ((long) i3));
                                    String str2 = str;
                                    if (qzVar2.f63562t != j4) {
                                        qzVarE = E(j4, qzVar2);
                                        if (qzVarE == null) {
                                            if (zFcU) {
                                                break;
                                            }
                                            str = str2;
                                        }
                                    } else {
                                        qzVarE = qzVar2;
                                    }
                                    int iX4T2 = X4T(qzVarE, i5, obj, j3, eOVarRl, zFcU);
                                    if (iX4T2 != 0) {
                                        if (iX4T2 != 1) {
                                            if (iX4T2 != 2) {
                                                if (iX4T2 != 3) {
                                                    if (iX4T2 != 4) {
                                                        if (iX4T2 == 5) {
                                                            qzVarE.t();
                                                        }
                                                        str = str2;
                                                        qzVar2 = qzVarE;
                                                    } else if (j3 < Y()) {
                                                        qzVarE.t();
                                                    }
                                                } else {
                                                    throw new IllegalStateException(str2);
                                                }
                                            } else if (zFcU) {
                                                qzVarE.Z();
                                            } else {
                                                if (eOVarRl != null) {
                                                    eOVar = eOVarRl;
                                                } else {
                                                    eOVar = null;
                                                }
                                                if (eOVar != null) {
                                                    lLA(eOVar, qzVarE, i5);
                                                }
                                            }
                                        } else {
                                            Result.Companion companion = Result.INSTANCE;
                                            objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
                                            break;
                                        }
                                    } else {
                                        qzVarE.t();
                                        Result.Companion companion2 = Result.INSTANCE;
                                        objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
                                        break;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else if (j2 < Y()) {
                            qzVar.t();
                        }
                        UhV(obj, eOVarRl);
                    }
                    objWPU = eOVarRl.WPU();
                    if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    if (objWPU != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objWPU;
                    }
                    return Unit.INSTANCE;
                }
                Result.Companion companion3 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
            } else {
                qzVar.t();
                Result.Companion companion4 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
            }
            eOVarRl.resumeWith(objM313constructorimpl);
            objWPU = eOVarRl.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (objWPU != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (Throwable th) {
            eOVarRl.rV9();
            throw th;
        }
    }

    private final void U() {
        gh();
    }

    private final Object UF(qz qzVar, int i2, long j2, Object obj) {
        while (true) {
            Object objTe = qzVar.te(i2);
            if (objTe != null && objTe != Wre.f4175O) {
                if (objTe == Wre.nr) {
                    if (qzVar.S(i2, objTe, Wre.xMQ)) {
                        M7();
                        return qzVar.fD(i2);
                    }
                } else {
                    if (objTe != Wre.mUb && objTe != Wre.KN) {
                        if (objTe == Wre.nY()) {
                            M7();
                            return Wre.HI;
                        }
                        if (objTe != Wre.Uo && qzVar.S(i2, objTe, Wre.J2)) {
                            boolean z2 = objTe instanceof SPz;
                            if (z2) {
                                objTe = ((SPz) objTe).f4173n;
                            }
                            if (Uf(objTe, qzVar, i2)) {
                                qzVar.e(i2, Wre.xMQ);
                                M7();
                                return qzVar.fD(i2);
                            }
                            qzVar.e(i2, Wre.mUb);
                            qzVar.iF(i2, false);
                            if (z2) {
                                M7();
                            }
                            return Wre.HI;
                        }
                    }
                    return Wre.HI;
                }
            } else if (j2 < (J2.get(this) & 1152921504606846975L)) {
                if (qzVar.S(i2, objTe, Wre.KN)) {
                    M7();
                    return Wre.HI;
                }
            } else {
                if (obj == null) {
                    return Wre.ty;
                }
                if (qzVar.S(i2, objTe, obj)) {
                    M7();
                    return Wre.az;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X4T(qz qzVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        qzVar.X(i2, obj);
        if (z2) {
            return Zmq(qzVar, i2, obj, j2, obj2, z2);
        }
        Object objTe = qzVar.te(i2);
        if (objTe == null) {
            if (s7N(j2)) {
                if (qzVar.S(i2, null, Wre.nr)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (qzVar.S(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objTe instanceof HcS) {
            qzVar.WPU(i2);
            if (p0N(objTe, obj)) {
                qzVar.e(i2, Wre.xMQ);
                i();
                return 0;
            }
            if (qzVar.aYN(i2, Wre.gh) != Wre.gh) {
                qzVar.iF(i2, true);
                return 5;
            }
            return 5;
        }
        return Zmq(qzVar, i2, obj, j2, obj2, z2);
    }

    private final void Xw(long j2) {
        F(jB(j2));
    }

    private final int Zmq(qz qzVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object objTe = qzVar.te(i2);
            if (objTe == null) {
                if (s7N(j2) && !z2) {
                    if (qzVar.S(i2, null, Wre.nr)) {
                        return 1;
                    }
                } else if (z2) {
                    if (qzVar.S(i2, null, Wre.mUb)) {
                        qzVar.iF(i2, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (qzVar.S(i2, null, obj2)) {
                        return 2;
                    }
                }
            } else if (objTe == Wre.f4175O) {
                if (qzVar.S(i2, objTe, Wre.nr)) {
                    return 1;
                }
            } else {
                if (objTe == Wre.gh) {
                    qzVar.WPU(i2);
                    return 5;
                }
                if (objTe == Wre.KN) {
                    qzVar.WPU(i2);
                    return 5;
                }
                if (objTe == Wre.nY()) {
                    qzVar.WPU(i2);
                    U();
                    return 4;
                }
                qzVar.WPU(i2);
                if (objTe instanceof SPz) {
                    objTe = ((SPz) objTe).f4173n;
                }
                if (p0N(objTe, obj)) {
                    qzVar.e(i2, Wre.xMQ);
                    i();
                    return 0;
                }
                if (qzVar.aYN(i2, Wre.gh) != Wre.gh) {
                    qzVar.iF(i2, true);
                }
                return 5;
            }
        }
    }

    private final Object a63(qz qzVar, int i2, long j2, Continuation continuation) {
        Function3 function3;
        qz qzVar2;
        GJW.eO eOVarRl = GJW.QJ.rl(IntrinsicsKt.intercepted(continuation));
        try {
            Object objHBN = HBN(qzVar, i2, j2, eOVarRl);
            if (objHBN == Wre.az) {
                ER(eOVarRl, qzVar, i2);
            } else {
                KFunction kFunctionT = null;
                KFunction kFunctionT2 = null;
                GJW.eO eOVar = null;
                if (objHBN == Wre.HI) {
                    if (j2 < piY()) {
                        qzVar.t();
                    }
                    qz qzVar3 = (qz) GR().get(this);
                    while (true) {
                        if (Mx()) {
                            EWS(eOVarRl);
                            break;
                        }
                        long andIncrement = Nxk().getAndIncrement(this);
                        int i3 = Wre.rl;
                        long j3 = andIncrement / ((long) i3);
                        int i5 = (int) (andIncrement % ((long) i3));
                        if (qzVar3.f63562t != j3) {
                            qz qzVarEF = eF(j3, qzVar3);
                            if (qzVarEF != null) {
                                qzVar2 = qzVarEF;
                            }
                        } else {
                            qzVar2 = qzVar3;
                        }
                        objHBN = HBN(qzVar2, i5, andIncrement, eOVarRl);
                        qz qzVar4 = qzVar2;
                        if (objHBN == Wre.az) {
                            if (eOVarRl != null) {
                                eOVar = eOVarRl;
                            }
                            if (eOVar != null) {
                                ER(eOVar, qzVar4, i5);
                            }
                        } else if (objHBN == Wre.HI) {
                            if (andIncrement < piY()) {
                                qzVar4.t();
                            }
                            qzVar3 = qzVar4;
                        } else if (objHBN != Wre.ty) {
                            qzVar4.t();
                            Function1 function1 = this.f4158t;
                            if (function1 != null) {
                                kFunctionT2 = T(function1);
                            }
                            function3 = (Function3) kFunctionT2;
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    }
                } else {
                    qzVar.t();
                    Function1 function12 = this.f4158t;
                    if (function12 != null) {
                        kFunctionT = T(function12);
                    }
                    function3 = (Function3) kFunctionT;
                }
                eOVarRl.aYN(objHBN, function3);
            }
            Object objWPU = eOVarRl.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objWPU;
        } catch (Throwable th) {
            eOVarRl.rV9();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qz eF(long j2, qz qzVar) {
        Object objT;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4153g;
        Function2 function2 = (Function2) Wre.ViF();
        loop0: while (true) {
            objT = dzu.n.t(qzVar, j2, function2);
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
        if (Z.t(objT)) {
            U();
            if (qzVar.f63562t * ((long) Wre.rl) < piY()) {
                qzVar.t();
            }
            return null;
        }
        qz qzVar2 = (qz) Z.rl(objT);
        if (!ul() && j2 <= FX() / ((long) Wre.rl)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E2;
            while (true) {
                afx afxVar2 = (afx) atomicReferenceFieldUpdater2.get(this);
                if (afxVar2.f63562t >= qzVar2.f63562t || !qzVar2.XQ()) {
                    break;
                }
                if (androidx.concurrent.futures.j.n(atomicReferenceFieldUpdater2, this, afxVar2, qzVar2)) {
                    if (afxVar2.ck()) {
                        afxVar2.ty();
                    }
                } else if (qzVar2.ck()) {
                    qzVar2.ty();
                }
            }
        }
        long j3 = qzVar2.f63562t;
        if (j3 > j2) {
            int i2 = Wre.rl;
            JVN(j3 * ((long) i2));
            if (qzVar2.f63562t * ((long) i2) < piY()) {
                qzVar2.t();
            }
            return null;
        }
        return qzVar2;
    }

    private final void eTf(long j2) {
        if ((f4151Z.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((f4151Z.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final qz jB(long j2) {
        qz qzVarRV9 = rV9();
        if (eWT()) {
            long jN1 = n1(qzVarRV9);
            if (jN1 != -1) {
                P5(jN1);
            }
        }
        v(qzVarRV9, j2);
        return qzVarRV9;
    }

    static /* synthetic */ Object kSg(I28 i28, Continuation continuation) throws Throwable {
        qz qzVar;
        qz qzVar2 = (qz) GR().get(i28);
        while (!i28.Mx()) {
            long andIncrement = Nxk().getAndIncrement(i28);
            int i2 = Wre.rl;
            long j2 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (qzVar2.f63562t != j2) {
                qz qzVarEF = i28.eF(j2, qzVar2);
                if (qzVarEF == null) {
                    continue;
                } else {
                    qzVar = qzVarEF;
                }
            } else {
                qzVar = qzVar2;
            }
            I28 i282 = i28;
            Object objHBN = i282.HBN(qzVar, i3, andIncrement, null);
            if (objHBN != Wre.az) {
                if (objHBN == Wre.HI) {
                    if (andIncrement < i282.piY()) {
                        qzVar.t();
                    }
                    i28 = i282;
                    qzVar2 = qzVar;
                } else {
                    if (objHBN == Wre.ty) {
                        return i282.a63(qzVar, i3, andIncrement, continuation);
                    }
                    qzVar.t();
                    return objHBN;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw Ew.n(i28.I());
    }

    static /* synthetic */ Object mI(I28 i28, Object obj, Continuation continuation) {
        qz qzVar;
        qz qzVar2 = (qz) dR0().get(i28);
        while (true) {
            long andIncrement = z().getAndIncrement(i28);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zFcU = i28.fcU(andIncrement);
            int i2 = Wre.rl;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            if (qzVar2.f63562t != j3) {
                qz qzVarE = i28.E(j3, qzVar2);
                if (qzVarE == null) {
                    if (zFcU) {
                        Object objHRu = i28.hRu(obj, continuation);
                        if (objHRu == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objHRu;
                        }
                    }
                } else {
                    qzVar = qzVarE;
                }
            } else {
                qzVar = qzVar2;
            }
            I28 i282 = i28;
            Object obj2 = obj;
            int iX4T = i282.X4T(qzVar, i3, obj2, j2, null, zFcU);
            if (iX4T != 0) {
                if (iX4T == 1) {
                    break;
                }
                if (iX4T != 2) {
                    if (iX4T != 3) {
                        if (iX4T != 4) {
                            if (iX4T == 5) {
                                qzVar.t();
                            }
                            i28 = i282;
                            qzVar2 = qzVar;
                            obj = obj2;
                        } else {
                            if (j2 < i282.Y()) {
                                qzVar.t();
                            }
                            Object objHRu2 = i282.hRu(obj2, continuation);
                            if (objHRu2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return objHRu2;
                            }
                        }
                    } else {
                        Object objT3L = i282.T3L(qzVar, i3, obj2, j2, continuation);
                        if (objT3L == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objT3L;
                        }
                    }
                } else if (zFcU) {
                    qzVar.Z();
                    Object objHRu3 = i282.hRu(obj2, continuation);
                    if (objHRu3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objHRu3;
                    }
                }
            } else {
                qzVar.t();
                break;
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean ofS(qz qzVar, int i2, long j2) {
        Object objTe;
        do {
            objTe = qzVar.te(i2);
            if (objTe != null && objTe != Wre.f4175O) {
                if (objTe == Wre.nr) {
                    return true;
                }
                if (objTe == Wre.mUb || objTe == Wre.nY() || objTe == Wre.xMQ || objTe == Wre.KN) {
                    return false;
                }
                if (objTe == Wre.Uo) {
                    return true;
                }
                if (objTe == Wre.J2 || j2 != Y()) {
                    return false;
                }
                return true;
            }
        } while (!qzVar.S(i2, objTe, Wre.KN));
        M7();
        return false;
    }

    private final void pJg() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4150X;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.j.n(atomicReferenceFieldUpdater, this, obj, obj == null ? Wre.Ik : Wre.f4178r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(J());
    }

    private final void qm() {
        long j2;
        long jWPU;
        AtomicLongFieldUpdater atomicLongFieldUpdater = J2;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                jWPU = Wre.WPU(1152921504606846975L & j2, 2);
            } else if (i2 == 1) {
                jWPU = Wre.WPU(1152921504606846975L & j2, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, jWPU));
    }

    private final qz rV9() {
        Object obj = E2.get(this);
        qz qzVar = (qz) f4149S.get(this);
        if (qzVar.f63562t > ((qz) obj).f63562t) {
            obj = qzVar;
        }
        qz qzVar2 = (qz) f4153g.get(this);
        if (qzVar2.f63562t > ((qz) obj).f63562t) {
            obj = qzVar2;
        }
        return (qz) dzu.n.rl((dzu.w6) obj);
    }

    private final boolean s7N(long j2) {
        if (j2 >= FX() && j2 >= Y() + ((long) this.f4157n)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tUK(Object obj, I28 i28, tj.I28 i282, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        if (obj != Wre.nY()) {
            dzu.r.n(i28.f4158t, obj, i282.getContext());
        }
        return Unit.INSTANCE;
    }

    private final boolean ub(qz qzVar, int i2, long j2) {
        Object objTe = qzVar.te(i2);
        if ((objTe instanceof HcS) && j2 >= f4155r.get(this) && qzVar.S(i2, objTe, Wre.Uo)) {
            if (Uf(objTe, qzVar, i2)) {
                qzVar.e(i2, Wre.nr);
                return true;
            }
            qzVar.e(i2, Wre.mUb);
            qzVar.iF(i2, false);
            return false;
        }
        return Qu(qzVar, i2, j2);
    }

    private final boolean ul() {
        long jFX = FX();
        if (jFX != 0 && jFX != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    private final void xVH(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = J2;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j4 = 1152921504606846975L & j3;
            if (j4 < j2) {
            } else {
                return;
            }
        } while (!J2.compareAndSet(this, j3, Wre.WPU(j4, (int) (j3 >> 60))));
    }

    protected final Throwable J() {
        return (Throwable) f4152e.get(this);
    }

    @Override // ILs.Q
    public Object KN(Continuation continuation) {
        return kSg(this, continuation);
    }

    public boolean Mx() {
        return G7(J2.get(this));
    }

    @Override // ILs.Q
    public Object O() {
        qz qzVarEF;
        HcS hcS;
        long j2 = f4155r.get(this);
        long j3 = J2.get(this);
        if (G7(j3)) {
            return C.rl.n(J());
        }
        if (j2 < (j3 & 1152921504606846975L)) {
            Object obj = Wre.gh;
            qz qzVar = (qz) GR().get(this);
            while (!Mx()) {
                long andIncrement = Nxk().getAndIncrement(this);
                int i2 = Wre.rl;
                long j4 = andIncrement / ((long) i2);
                int i3 = (int) (andIncrement % ((long) i2));
                if (qzVar.f63562t != j4) {
                    qzVarEF = eF(j4, qzVar);
                    if (qzVarEF == null) {
                        continue;
                    }
                } else {
                    qzVarEF = qzVar;
                }
                Object objHBN = HBN(qzVarEF, i3, andIncrement, obj);
                if (objHBN == Wre.az) {
                    if (obj instanceof HcS) {
                        hcS = (HcS) obj;
                    } else {
                        hcS = null;
                    }
                    if (hcS != null) {
                        ER(hcS, qzVarEF, i3);
                    }
                    EF(andIncrement);
                    qzVarEF.Z();
                    return C.rl.rl();
                }
                if (objHBN == Wre.HI) {
                    if (andIncrement < piY()) {
                        qzVarEF.t();
                    }
                    qzVar = qzVarEF;
                } else {
                    if (objHBN != Wre.ty) {
                        qzVarEF.t();
                        return C.rl.t(objHBN);
                    }
                    throw new IllegalStateException("unexpected");
                }
            }
            return C.rl.n(J());
        }
        return C.rl.rl();
    }

    protected final void P5(long j2) {
        qz qzVarEF;
        UndeliveredElementException undeliveredElementExceptionT;
        qz qzVar = (qz) f4153g.get(this);
        while (true) {
            long j3 = f4155r.get(this);
            if (j2 < Math.max(((long) this.f4157n) + j3, FX())) {
                return;
            }
            if (f4155r.compareAndSet(this, j3, 1 + j3)) {
                int i2 = Wre.rl;
                long j4 = j3 / ((long) i2);
                int i3 = (int) (j3 % ((long) i2));
                if (qzVar.f63562t != j4) {
                    qzVarEF = eF(j4, qzVar);
                    if (qzVarEF == null) {
                        continue;
                    }
                } else {
                    qzVarEF = qzVar;
                }
                Object objHBN = HBN(qzVarEF, i3, j3, null);
                if (objHBN == Wre.HI) {
                    if (j3 < piY()) {
                        qzVarEF.t();
                    }
                } else {
                    qzVarEF.t();
                    Function1 function1 = this.f4158t;
                    if (function1 != null && (undeliveredElementExceptionT = dzu.r.t(function1, objHBN, null, 2, null)) != null) {
                        throw undeliveredElementExceptionT;
                    }
                }
                qzVar = qzVarEF;
            }
        }
    }

    @Override // ILs.Q
    public Object Uo(Continuation continuation) {
        return W(this, continuation);
    }

    public final long Y() {
        return f4155r.get(this);
    }

    @Override // ILs.Q
    public final void cancel(CancellationException cancellationException) {
        wTp(cancellationException);
    }

    @Override // ILs.r
    public boolean gh() {
        return fcU(J2.get(this));
    }

    protected final Throwable k() {
        Throwable thJ = J();
        if (thJ == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return thJ;
    }

    public final boolean m() {
        while (true) {
            qz qzVarEF = (qz) f4153g.get(this);
            long jY = Y();
            if (piY() <= jY) {
                return false;
            }
            int i2 = Wre.rl;
            long j2 = jY / ((long) i2);
            if (qzVarEF.f63562t != j2 && (qzVarEF = eF(j2, qzVarEF)) == null) {
                if (((qz) f4153g.get(this)).f63562t < j2) {
                    return false;
                }
            } else {
                qzVarEF.t();
                if (ofS(qzVarEF, (int) (jY % ((long) i2)), jY)) {
                    return true;
                }
                f4155r.compareAndSet(this, jY, 1 + jY);
            }
        }
    }

    @Override // ILs.r
    public Object mUb(Object obj, Continuation continuation) {
        return mI(this, obj, continuation);
    }

    @Override // ILs.r
    public Object nr(Object obj) {
        Object obj2;
        int i2;
        qz qzVar;
        I28 i28;
        HcS hcS;
        if (!Bu(J2.get(this))) {
            Object obj3 = Wre.mUb;
            qz qzVar2 = (qz) dR0().get(this);
            while (true) {
                long andIncrement = z().getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean zFcU = fcU(andIncrement);
                int i3 = Wre.rl;
                long j3 = j2 / ((long) i3);
                int i5 = (int) (j2 % ((long) i3));
                if (qzVar2.f63562t != j3) {
                    qz qzVarE = E(j3, qzVar2);
                    if (qzVarE == null) {
                        if (zFcU) {
                            return C.rl.n(k());
                        }
                    } else {
                        i2 = i5;
                        qzVar = qzVarE;
                        i28 = this;
                        obj2 = obj;
                    }
                } else {
                    obj2 = obj;
                    i2 = i5;
                    qzVar = qzVar2;
                    i28 = this;
                }
                int iX4T = i28.X4T(qzVar, i2, obj2, j2, obj3, zFcU);
                qzVar2 = qzVar;
                if (iX4T != 0) {
                    if (iX4T != 1) {
                        if (iX4T != 2) {
                            if (iX4T != 3) {
                                if (iX4T != 4) {
                                    if (iX4T == 5) {
                                        qzVar2.t();
                                    }
                                    obj = obj2;
                                } else {
                                    if (j2 < Y()) {
                                        qzVar2.t();
                                    }
                                    return C.rl.n(k());
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else {
                            if (zFcU) {
                                qzVar2.Z();
                                return C.rl.n(k());
                            }
                            if (obj3 instanceof HcS) {
                                hcS = (HcS) obj3;
                            } else {
                                hcS = null;
                            }
                            if (hcS != null) {
                                lLA(hcS, qzVar2, i2);
                            }
                            qzVar2.Z();
                            return C.rl.rl();
                        }
                    } else {
                        return C.rl.t(Unit.INSTANCE);
                    }
                } else {
                    qzVar2.t();
                    return C.rl.t(Unit.INSTANCE);
                }
            }
        } else {
            return C.rl.rl();
        }
    }

    public final long piY() {
        return J2.get(this) & 1152921504606846975L;
    }

    @Override // ILs.r
    public void t(Function1 function1) {
        if (!androidx.concurrent.futures.j.n(f4150X, this, null, function1)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4150X;
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != Wre.Ik) {
                    if (obj == Wre.f4178r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.j.n(f4150X, this, Wre.Ik, Wre.f4178r));
            function1.invoke(J());
        }
    }
}
