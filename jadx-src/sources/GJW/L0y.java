package GJW;

import GJW.xuv;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class L0y implements xuv, Q, h6y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3405n = AtomicReferenceFieldUpdater.newUpdater(L0y.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3406t = AtomicReferenceFieldUpdater.newUpdater(L0y.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final CN3 f3407n = new CN3();

        CN3() {
            super(3, L0y.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.j.n(obj2);
            n((L0y) obj, null, obj3);
            return Unit.INSTANCE;
        }

        public final void n(L0y l0y, tj.I28 i28, Object obj) {
            l0y.eWT(i28, obj);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Dsr f3408n = new Dsr();

        Dsr() {
            super(3, L0y.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.j.n(obj2);
            n((L0y) obj, null, obj3);
            return Unit.INSTANCE;
        }

        public final void n(L0y l0y, tj.I28 i28, Object obj) {
            l0y.mYa(i28, obj);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private final class I28 extends g9 {
        @Override // GJW.g9
        public boolean S() {
            return false;
        }

        public I28(tj.I28 i28) {
        }

        @Override // GJW.g9
        public void WPU(Throwable th) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private final class Ml extends g9 {
        @Override // GJW.g9
        public boolean S() {
            return false;
        }

        public Ml(tj.I28 i28) {
        }

        @Override // GJW.g9
        public void WPU(Throwable th) {
            Object objJ = L0y.this.J();
            if (!(objJ instanceof Z)) {
                CM.KN(objJ);
            }
            throw null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class Wre extends RestrictedSuspendLambda implements Function2 {
        private /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3411O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3412n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3414t;

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = L0y.this.new Wre(continuation);
            wre.J2 = obj;
            return wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((Wre) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r6.yield(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r4.yield(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            T tRl;
            dzu.Pl pl;
            dzu.Xo xoQie;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3411O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        xoQie = (dzu.Xo) this.f3414t;
                        pl = (dzu.Pl) this.f3412n;
                        sequenceScope = (SequenceScope) this.J2;
                        ResultKt.throwOnFailure(obj);
                        xoQie = xoQie.qie();
                        if (!Intrinsics.areEqual(xoQie, pl)) {
                            if (xoQie instanceof UGc) {
                                Q q2 = ((UGc) xoQie).f3454r;
                                this.J2 = sequenceScope;
                                this.f3412n = pl;
                                this.f3414t = xoQie;
                                this.f3411O = 2;
                            }
                            xoQie = xoQie.qie();
                            if (!Intrinsics.areEqual(xoQie, pl)) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.J2;
                Object objJ = L0y.this.J();
                if (objJ instanceof UGc) {
                    Q q3 = ((UGc) objJ).f3454r;
                    this.f3411O = 1;
                } else if ((objJ instanceof kO4) && (tRl = ((kO4) objJ).rl()) != null) {
                    Object objGh = tRl.gh();
                    Intrinsics.checkNotNull(objGh, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    dzu.Xo xo = (dzu.Xo) objGh;
                    pl = tRl;
                    xoQie = xo;
                    sequenceScope = sequenceScope2;
                    if (!Intrinsics.areEqual(xoQie, pl)) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final fuX f3415n = new fuX();

        fuX() {
            super(3, L0y.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0y l0y, Object obj, Object obj2) {
            return l0y.G7(obj, obj2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class j extends eO {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final L0y f3416g;

        public j(Continuation continuation, L0y l0y) {
            super(continuation, 1);
            this.f3416g = l0y;
        }

        @Override // GJW.eO
        public Throwable XQ(xuv xuvVar) {
            Throwable thO;
            Object objJ = this.f3416g.J();
            return (!(objJ instanceof w6) || (thO = ((w6) objJ).O()) == null) ? objJ instanceof Z ? ((Z) objJ).f3468n : xuvVar.getCancellationException() : thO;
        }

        @Override // GJW.eO
        protected String wTp() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class n extends g9 {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private final Object f3417S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final UGc f3418Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final w6 f3419o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final L0y f3420r;

        @Override // GJW.g9
        public boolean S() {
            return false;
        }

        @Override // GJW.g9
        public void WPU(Throwable th) {
            this.f3420r.s7N(this.f3419o, this.f3418Z, this.f3417S);
        }

        public n(L0y l0y, w6 w6Var, UGc uGc, Object obj) {
            this.f3420r = l0y;
            this.f3419o = w6Var;
            this.f3418Z = uGc;
            this.f3417S = obj;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class w6 implements kO4 {
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final T f3423n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f3422t = AtomicIntegerFieldUpdater.newUpdater(w6.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f3421O = AtomicReferenceFieldUpdater.newUpdater(w6.class, Object.class, "_rootCause$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater J2 = AtomicReferenceFieldUpdater.newUpdater(w6.class, Object.class, "_exceptionsHolder$volatile");

        private final ArrayList t() {
            return new ArrayList(4);
        }

        @Override // GJW.kO4
        public T rl() {
            return this.f3423n;
        }

        public String toString() {
            return "Finishing[cancelling=" + xMQ() + ", completing=" + mUb() + ", rootCause=" + O() + ", exceptions=" + nr() + ", list=" + rl() + ']';
        }

        public w6(T t3, boolean z2, Throwable th) {
            this.f3423n = t3;
            this._isCompleting$volatile = z2 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final Object nr() {
            return J2.get(this);
        }

        private final void ty(Object obj) {
            J2.set(this, obj);
        }

        public final void HI(Throwable th) {
            f3421O.set(this, th);
        }

        public final Throwable O() {
            return (Throwable) f3421O.get(this);
        }

        public final void az(boolean z2) {
            f3422t.set(this, z2 ? 1 : 0);
        }

        public final boolean gh() {
            if (nr() == CM.f3389O) {
                return true;
            }
            return false;
        }

        @Override // GJW.kO4
        public boolean isActive() {
            if (O() == null) {
                return true;
            }
            return false;
        }

        public final boolean mUb() {
            if (f3422t.get(this) == 1) {
                return true;
            }
            return false;
        }

        public final void n(Throwable th) {
            Throwable thO = O();
            if (thO == null) {
                HI(th);
                return;
            }
            if (th != thO) {
                Object objNr = nr();
                if (objNr == null) {
                    ty(th);
                    return;
                }
                if (objNr instanceof Throwable) {
                    if (th == objNr) {
                        return;
                    }
                    ArrayList arrayListT = t();
                    arrayListT.add(objNr);
                    arrayListT.add(th);
                    ty(arrayListT);
                    return;
                }
                if (objNr instanceof ArrayList) {
                    ((ArrayList) objNr).add(th);
                    return;
                }
                throw new IllegalStateException(("State is " + objNr).toString());
            }
        }

        public final List qie(Throwable th) {
            ArrayList arrayListT;
            Object objNr = nr();
            if (objNr == null) {
                arrayListT = t();
            } else if (objNr instanceof Throwable) {
                ArrayList arrayListT2 = t();
                arrayListT2.add(objNr);
                arrayListT = arrayListT2;
            } else if (objNr instanceof ArrayList) {
                arrayListT = (ArrayList) objNr;
            } else {
                throw new IllegalStateException(("State is " + objNr).toString());
            }
            Throwable thO = O();
            if (thO != null) {
                arrayListT.add(0, thO);
            }
            if (th != null && !Intrinsics.areEqual(th, thO)) {
                arrayListT.add(th);
            }
            ty(CM.f3389O);
            return arrayListT;
        }

        public final boolean xMQ() {
            if (O() != null) {
                return true;
            }
            return false;
        }
    }

    private final void C(T t3, Throwable th) throws Throwable {
        t3.Uo(1);
        Object objGh = t3.gh();
        Intrinsics.checkNotNull(objGh, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (dzu.Xo xoQie = (dzu.Xo) objGh; !Intrinsics.areEqual(xoQie, t3); xoQie = xoQie.qie()) {
            if (xoQie instanceof g9) {
                try {
                    ((g9) xoQie).WPU(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + xoQie + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            Nxk(completionHandlerException);
        }
    }

    private final Object ijL(Object obj) throws Throwable {
        Throwable thWTp = null;
        while (true) {
            Object objJ = J();
            if (objJ instanceof w6) {
                synchronized (objJ) {
                    if (((w6) objJ).gh()) {
                        return CM.nr;
                    }
                    boolean zXMQ = ((w6) objJ).xMQ();
                    if (obj != null || !zXMQ) {
                        if (thWTp == null) {
                            thWTp = wTp(obj);
                        }
                        ((w6) objJ).n(thWTp);
                    }
                    Throwable thO = zXMQ ? null : ((w6) objJ).O();
                    if (thO != null) {
                        ofS(((w6) objJ).rl(), thO);
                    }
                    return CM.f3390n;
                }
            }
            if (!(objJ instanceof kO4)) {
                return CM.nr;
            }
            if (thWTp == null) {
                thWTp = wTp(obj);
            }
            kO4 ko4 = (kO4) objJ;
            if (!ko4.isActive()) {
                Object objHow = How(objJ, new Z(thWTp, false, 2, null));
                if (objHow == CM.f3390n) {
                    throw new IllegalStateException(("Cannot happen in " + objJ).toString());
                }
                if (objHow != CM.f3391t) {
                    return objHow;
                }
            } else if (K(ko4, thWTp)) {
                return CM.f3390n;
            }
        }
    }

    protected boolean GR(Throwable th) {
        return false;
    }

    protected void Jk() {
    }

    public boolean M7() {
        return false;
    }

    public void Nxk(Throwable th) throws Throwable {
        throw th;
    }

    protected void S(Object obj) {
    }

    public boolean U() {
        return true;
    }

    @Override // GJW.xuv
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    protected boolean dR0() {
        return false;
    }

    @Override // GJW.xuv
    public final O invokeOnCompletion(Function1 function1) {
        return k(true, new B(function1));
    }

    protected void n1(Object obj) {
    }

    @Override // GJW.xuv
    public xuv plus(xuv xuvVar) {
        return xuv.j.J2(this, xuvVar);
    }

    protected void ul(Throwable th) {
    }

    private final boolean ER(w6 w6Var, UGc uGc, Object obj) {
        while (AbstractC1363t.ty(uGc.f3454r, false, new n(this, w6Var, uGc, obj)) == oXP.f3498n) {
            uGc = pJg(uGc);
            if (uGc == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G7(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof Z) {
            throw ((Z) obj2).f3468n;
        }
        return obj2;
    }

    private final int GD(Object obj) {
        if (obj instanceof fg) {
            if (((fg) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.j.n(f3405n, this, obj, CM.Uo)) {
                return -1;
            }
            Jk();
            return 1;
        }
        if (!(obj instanceof pq)) {
            return 0;
        }
        if (!androidx.concurrent.futures.j.n(f3405n, this, obj, ((pq) obj).rl())) {
            return -1;
        }
        Jk();
        return 1;
    }

    private final Object How(Object obj, Object obj2) {
        return !(obj instanceof kO4) ? CM.f3390n : ((!(obj instanceof fg) && !(obj instanceof g9)) || (obj instanceof UGc) || (obj2 instanceof Z)) ? tUK((kO4) obj, obj2) : i((kO4) obj, obj2) ? obj2 : CM.f3391t;
    }

    private final String Po6(Object obj) {
        if (!(obj instanceof w6)) {
            return obj instanceof kO4 ? ((kO4) obj).isActive() ? "Active" : "New" : obj instanceof Z ? "Cancelled" : "Completed";
        }
        w6 w6Var = (w6) obj;
        return w6Var.xMQ() ? "Cancelling" : w6Var.mUb() ? "Completing" : "Active";
    }

    private final void Rl(fg fgVar) {
        T t3 = new T();
        Object pqVar = t3;
        if (!fgVar.isActive()) {
            pqVar = new pq(t3);
        }
        androidx.concurrent.futures.j.n(f3405n, this, fgVar, pqVar);
    }

    private final Object ViF(Continuation continuation) {
        j jVar = new j(IntrinsicsKt.intercepted(continuation), this);
        jVar.e();
        QJ.n(jVar, cA.HI(this, false, new lS(jVar), 1, null));
        Object objWPU = jVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    private final Throwable bzg(Object obj) {
        Z z2 = obj instanceof Z ? (Z) obj : null;
        if (z2 != null) {
            return z2.f3468n;
        }
        return null;
    }

    public static /* synthetic */ CancellationException hRu(L0y l0y, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return l0y.EWS(th, str);
    }

    private final Object piY(Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        QJ.n(eOVar, cA.HI(this, false, new tI(eOVar), 1, null));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    private final void qm(g9 g9Var) {
        g9Var.J2(new T());
        androidx.concurrent.futures.j.n(f3405n, this, g9Var, g9Var.qie());
    }

    private final Object v(w6 w6Var, Object obj) throws Throwable {
        boolean zXMQ;
        Throwable thXw;
        Z z2 = obj instanceof Z ? (Z) obj : null;
        Throwable th = z2 != null ? z2.f3468n : null;
        synchronized (w6Var) {
            zXMQ = w6Var.xMQ();
            List listQie = w6Var.qie(th);
            thXw = Xw(w6Var, listQie);
            if (thXw != null) {
                XQ(thXw, listQie);
            }
        }
        if (thXw != null && thXw != th) {
            obj = new Z(thXw, false, 2, null);
        }
        if (thXw != null && (e(thXw) || GR(thXw))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((Z) obj).t();
        }
        if (!zXMQ) {
            ul(thXw);
        }
        n1(obj);
        androidx.concurrent.futures.j.n(f3405n, this, w6Var, CM.Uo(obj));
        nHg(w6Var, obj);
        return obj;
    }

    private final Throwable wTp(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(X(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((h6y) obj).FX();
    }

    protected final CancellationException EWS(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = X();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public boolean N(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return iF(th) && U();
    }

    protected final tj.w6 P5() {
        CN3 cn3 = CN3.f3407n;
        Intrinsics.checkNotNull(cn3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(cn3, 3);
        fuX fux = fuX.f3415n;
        Intrinsics.checkNotNull(fux, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new tj.Ml(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(fux, 3), null, 8, null);
    }

    public final String UhV() {
        return xg() + '{' + Po6(J()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String X() {
        return "Job was cancelled";
    }

    protected final void Y(xuv xuvVar) {
        if (xuvVar == null) {
            HV(oXP.f3498n);
            return;
        }
        xuvVar.start();
        s4 s4VarAttachChild = xuvVar.attachChild(this);
        HV(s4VarAttachChild);
        if (isCompleted()) {
            s4VarAttachChild.n();
            HV(oXP.f3498n);
        }
    }

    @Override // GJW.xuv
    public final s4 attachChild(Q q2) {
        UGc uGc = new UGc(q2);
        uGc.aYN(this);
        while (true) {
            Object objJ = J();
            if (objJ instanceof fg) {
                fg fgVar = (fg) objJ;
                if (!fgVar.isActive()) {
                    Rl(fgVar);
                } else if (androidx.concurrent.futures.j.n(f3405n, this, objJ, uGc)) {
                    return uGc;
                }
            } else {
                if (!(objJ instanceof kO4)) {
                    Object objJ2 = J();
                    Z z2 = objJ2 instanceof Z ? (Z) objJ2 : null;
                    uGc.WPU(z2 != null ? z2.f3468n : null);
                    return oXP.f3498n;
                }
                T tRl = ((kO4) objJ).rl();
                if (tRl != null) {
                    if (!tRl.nr(uGc, 7)) {
                        boolean zNr = tRl.nr(uGc, 3);
                        Object objJ3 = J();
                        if (objJ3 instanceof w6) {
                            thO = ((w6) objJ3).O();
                        } else {
                            Z z3 = objJ3 instanceof Z ? (Z) objJ3 : null;
                            if (z3 != null) {
                                thO = z3.f3468n;
                            }
                        }
                        uGc.WPU(thO);
                        if (!zNr) {
                            return oXP.f3498n;
                        }
                    }
                    return uGc;
                }
                Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                qm((g9) objJ);
            }
        }
    }

    @Override // GJW.xuv
    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable jobCancellationException;
        if (th == null || (jobCancellationException = hRu(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(X(), null, this);
        }
        fD(jobCancellationException);
        return true;
    }

    @Override // GJW.xuv
    public final Sequence getChildren() {
        return SequencesKt.sequence(new Wre(null));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return xuv.nr;
    }

    @Override // GJW.xuv
    public final tj.j getOnJoin() {
        Dsr dsr = Dsr.f3408n;
        Intrinsics.checkNotNull(dsr, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new tj.n(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(dsr, 3), null, 4, null);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return xuv.j.Uo(this, coroutineContext);
    }

    public String toString() {
        return UhV() + '@' + psW.rl(this);
    }

    public L0y(boolean z2) {
        this._state$volatile = z2 ? CM.Uo : CM.J2;
    }

    private final T E(kO4 ko4) {
        T tRl = ko4.rl();
        if (tRl == null) {
            if (ko4 instanceof fg) {
                return new T();
            }
            if (ko4 instanceof g9) {
                qm((g9) ko4);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + ko4).toString());
        }
        return tRl;
    }

    private final Object E2(Object obj) {
        Object objHow;
        do {
            Object objJ = J();
            if (!(objJ instanceof kO4) || ((objJ instanceof w6) && ((w6) objJ).mUb())) {
                return CM.f3390n;
            }
            objHow = How(objJ, new Z(wTp(obj), false, 2, null));
        } while (objHow == CM.f3391t);
        return objHow;
    }

    private final boolean K(kO4 ko4, Throwable th) throws Throwable {
        T tE = E(ko4);
        if (tE == null) {
            return false;
        }
        if (!androidx.concurrent.futures.j.n(f3405n, this, ko4, new w6(tE, false, th))) {
            return false;
        }
        ofS(tE, th);
        return true;
    }

    private final void XQ(Throwable th, List list) {
        if (list.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                    ExceptionsKt.addSuppressed(th, th2);
                }
            }
        }
    }

    private final Throwable Xw(w6 w6Var, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (!w6Var.xMQ()) {
                return null;
            }
            return new JobCancellationException(X(), null, this);
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final boolean e(Throwable th) {
        if (dR0()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        s4 s4VarB = B();
        if (s4VarB != null && s4VarB != oXP.f3498n) {
            if (s4VarB.t(th) || z2) {
                return true;
            }
            return false;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eWT(tj.I28 i28, Object obj) {
        Object objJ;
        do {
            objJ = J();
            if (!(objJ instanceof kO4)) {
                if (!(objJ instanceof Z)) {
                    objJ = CM.KN(objJ);
                }
                i28.n(objJ);
                return;
            }
        } while (GD(objJ) < 0);
        i28.rl(cA.HI(this, false, new Ml(i28), 1, null));
    }

    private final boolean i(kO4 ko4, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.j.n(f3405n, this, ko4, CM.Uo(obj))) {
            return false;
        }
        ul(null);
        n1(obj);
        nHg(ko4, obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mYa(tj.I28 i28, Object obj) {
        if (!z()) {
            i28.n(Unit.INSTANCE);
        } else {
            i28.rl(cA.HI(this, false, new I28(i28), 1, null));
        }
    }

    private final void nHg(kO4 ko4, Object obj) throws Throwable {
        Z z2;
        s4 s4VarB = B();
        if (s4VarB != null) {
            s4VarB.n();
            HV(oXP.f3498n);
        }
        Throwable th = null;
        if (obj instanceof Z) {
            z2 = (Z) obj;
        } else {
            z2 = null;
        }
        if (z2 != null) {
            th = z2.f3468n;
        }
        if (ko4 instanceof g9) {
            try {
                ((g9) ko4).WPU(th);
                return;
            } catch (Throwable th2) {
                Nxk(new CompletionHandlerException("Exception in completion handler " + ko4 + " for " + this, th2));
                return;
            }
        }
        T tRl = ko4.rl();
        if (tRl != null) {
            C(tRl, th);
        }
    }

    private final void ofS(T t3, Throwable th) throws Throwable {
        ul(th);
        t3.Uo(4);
        Object objGh = t3.gh();
        Intrinsics.checkNotNull(objGh, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (dzu.Xo xoQie = (dzu.Xo) objGh; !Intrinsics.areEqual(xoQie, t3); xoQie = xoQie.qie()) {
            if ((xoQie instanceof g9) && ((g9) xoQie).S()) {
                try {
                    ((g9) xoQie).WPU(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + xoQie + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            Nxk(completionHandlerException);
        }
        e(th);
    }

    private final UGc pJg(dzu.Xo xo) {
        while (xo.Ik()) {
            xo = xo.az();
        }
        while (true) {
            xo = xo.qie();
            if (!xo.Ik()) {
                if (xo instanceof UGc) {
                    return (UGc) xo;
                }
                if (xo instanceof T) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s7N(w6 w6Var, UGc uGc, Object obj) {
        UGc uGcPJg = pJg(uGc);
        if (uGcPJg == null || !ER(w6Var, uGcPJg, obj)) {
            w6Var.rl().Uo(2);
            UGc uGcPJg2 = pJg(uGc);
            if (uGcPJg2 != null && ER(w6Var, uGcPJg2, obj)) {
                return;
            }
            S(v(w6Var, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object tUK(kO4 ko4, Object obj) throws Throwable {
        w6 w6Var;
        Z z2;
        T tE = E(ko4);
        if (tE == null) {
            return CM.f3391t;
        }
        ?? r2 = 0;
        if (ko4 instanceof w6) {
            w6Var = (w6) ko4;
        } else {
            w6Var = null;
        }
        if (w6Var == null) {
            w6Var = new w6(tE, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (w6Var) {
            if (w6Var.mUb()) {
                return CM.f3390n;
            }
            w6Var.az(true);
            if (w6Var != ko4 && !androidx.concurrent.futures.j.n(f3405n, this, ko4, w6Var)) {
                return CM.f3391t;
            }
            boolean zXMQ = w6Var.xMQ();
            if (obj instanceof Z) {
                z2 = (Z) obj;
            } else {
                z2 = null;
            }
            if (z2 != null) {
                w6Var.n(z2.f3468n);
            }
            Throwable thO = w6Var.O();
            if (!zXMQ) {
                r2 = thO;
            }
            objectRef.element = r2;
            Unit unit = Unit.INSTANCE;
            if (r2 != 0) {
                ofS(tE, r2);
            }
            UGc uGcPJg = pJg(tE);
            if (uGcPJg != null && ER(w6Var, uGcPJg, obj)) {
                return CM.rl;
            }
            tE.Uo(2);
            UGc uGcPJg2 = pJg(tE);
            if (uGcPJg2 != null && ER(w6Var, uGcPJg2, obj)) {
                return CM.rl;
            }
            return v(w6Var, obj);
        }
    }

    private final boolean z() {
        Object objJ;
        do {
            objJ = J();
            if (!(objJ instanceof kO4)) {
                return false;
            }
        } while (GD(objJ) < 0);
        return true;
    }

    public final s4 B() {
        return (s4) f3406t.get(this);
    }

    @Override // GJW.h6y
    public CancellationException FX() {
        Throwable thO;
        Object objJ = J();
        CancellationException cancellationException = null;
        if (objJ instanceof w6) {
            thO = ((w6) objJ).O();
        } else if (objJ instanceof Z) {
            thO = ((Z) objJ).f3468n;
        } else if (!(objJ instanceof kO4)) {
            thO = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + objJ).toString());
        }
        if (thO instanceof CancellationException) {
            cancellationException = (CancellationException) thO;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + Po6(objJ), thO, this);
        }
        return cancellationException;
    }

    public final void HV(s4 s4Var) {
        f3406t.set(this, s4Var);
    }

    public final Object J() {
        return f3405n.get(this);
    }

    public final void Org(g9 g9Var) {
        Object objJ;
        do {
            objJ = J();
            if (objJ instanceof g9) {
                if (objJ != g9Var) {
                    return;
                }
            } else {
                if ((objJ instanceof kO4) && ((kO4) objJ).rl() != null) {
                    g9Var.r();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.j.n(f3405n, this, objJ, CM.Uo));
    }

    protected final Object WPU(Continuation continuation) throws Throwable {
        Object objJ;
        do {
            objJ = J();
            if (!(objJ instanceof kO4)) {
                if (!(objJ instanceof Z)) {
                    return CM.KN(objJ);
                }
                throw ((Z) objJ).f3468n;
            }
        } while (GD(objJ) < 0);
        return ViF(continuation);
    }

    @Override // GJW.Q
    public final void Z(h6y h6yVar) throws Throwable {
        iF(h6yVar);
    }

    public final Object eTf(Object obj) {
        Object objHow;
        do {
            objHow = How(J(), obj);
            if (objHow == CM.f3390n) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, bzg(obj));
            }
        } while (objHow == CM.f3391t);
        return objHow;
    }

    public void fD(Throwable th) throws Throwable {
        iF(th);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return xuv.j.t(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return xuv.j.nr(this, key);
    }

    @Override // GJW.xuv
    public final CancellationException getCancellationException() {
        Object objJ = J();
        if (objJ instanceof w6) {
            Throwable thO = ((w6) objJ).O();
            if (thO != null) {
                CancellationException cancellationExceptionEWS = EWS(thO, psW.n(this) + " is cancelling");
                if (cancellationExceptionEWS != null) {
                    return cancellationExceptionEWS;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objJ instanceof kO4)) {
            if (objJ instanceof Z) {
                return hRu(this, ((Z) objJ).f3468n, null, 1, null);
            }
            return new JobCancellationException(psW.n(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objJ = J();
        if (!(objJ instanceof kO4)) {
            return bzg(objJ);
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // GJW.xuv
    public xuv getParent() {
        s4 s4VarB = B();
        if (s4VarB != null) {
            return s4VarB.getParent();
        }
        return null;
    }

    public final boolean iF(Object obj) throws Throwable {
        Object objIjL = CM.f3390n;
        if (M7() && (objIjL = E2(obj)) == CM.rl) {
            return true;
        }
        if (objIjL == CM.f3390n) {
            objIjL = ijL(obj);
        }
        if (objIjL == CM.f3390n || objIjL == CM.rl) {
            return true;
        }
        if (objIjL == CM.nr) {
            return false;
        }
        S(objIjL);
        return true;
    }

    @Override // GJW.xuv
    public final O invokeOnCompletion(boolean z2, boolean z3, Function1 function1) {
        g9 b2;
        if (z2) {
            b2 = new RGN(function1);
        } else {
            b2 = new B(function1);
        }
        return k(z3, b2);
    }

    @Override // GJW.xuv
    public boolean isActive() {
        Object objJ = J();
        if ((objJ instanceof kO4) && ((kO4) objJ).isActive()) {
            return true;
        }
        return false;
    }

    @Override // GJW.xuv
    public final boolean isCancelled() {
        Object objJ = J();
        if (!(objJ instanceof Z)) {
            if (!(objJ instanceof w6) || !((w6) objJ).xMQ()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // GJW.xuv
    public final boolean isCompleted() {
        return !(J() instanceof kO4);
    }

    @Override // GJW.xuv
    public final Object join(Continuation continuation) {
        if (!z()) {
            AbstractC1363t.qie(continuation.getContext());
            return Unit.INSTANCE;
        }
        Object objPiY = piY(continuation);
        if (objPiY == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objPiY;
        }
        return Unit.INSTANCE;
    }

    public final O k(boolean z2, g9 g9Var) {
        boolean z3;
        Throwable th;
        Z z4;
        boolean zNr;
        w6 w6Var;
        Throwable thO;
        g9Var.aYN(this);
        while (true) {
            Object objJ = J();
            z3 = true;
            th = null;
            if (objJ instanceof fg) {
                fg fgVar = (fg) objJ;
                if (fgVar.isActive()) {
                    if (androidx.concurrent.futures.j.n(f3405n, this, objJ, g9Var)) {
                        break;
                    }
                } else {
                    Rl(fgVar);
                }
            } else if (objJ instanceof kO4) {
                kO4 ko4 = (kO4) objJ;
                T tRl = ko4.rl();
                if (tRl == null) {
                    Intrinsics.checkNotNull(objJ, obbPUqyhtS.OckksJyxRix);
                    qm((g9) objJ);
                } else {
                    if (g9Var.S()) {
                        if (ko4 instanceof w6) {
                            w6Var = (w6) ko4;
                        } else {
                            w6Var = null;
                        }
                        if (w6Var != null) {
                            thO = w6Var.O();
                        } else {
                            thO = null;
                        }
                        if (thO == null) {
                            zNr = tRl.nr(g9Var, 5);
                        } else {
                            if (z2) {
                                g9Var.WPU(thO);
                            }
                            return oXP.f3498n;
                        }
                    } else {
                        zNr = tRl.nr(g9Var, 1);
                    }
                    if (zNr) {
                        break;
                    }
                }
            } else {
                z3 = false;
                break;
            }
        }
        if (z3) {
            return g9Var;
        }
        if (z2) {
            Object objJ2 = J();
            if (objJ2 instanceof Z) {
                z4 = (Z) objJ2;
            } else {
                z4 = null;
            }
            if (z4 != null) {
                th = z4.f3468n;
            }
            g9Var.WPU(th);
        }
        return oXP.f3498n;
    }

    public final boolean m(Object obj) {
        Object objHow;
        do {
            objHow = How(J(), obj);
            if (objHow == CM.f3390n) {
                return false;
            }
            if (objHow == CM.rl) {
                return true;
            }
        } while (objHow == CM.f3391t);
        S(objHow);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return xuv.j.O(this, key);
    }

    public final boolean nY(Throwable th) {
        return iF(th);
    }

    public final Object rV9() throws Throwable {
        Object objJ = J();
        if (!(objJ instanceof kO4)) {
            if (!(objJ instanceof Z)) {
                return CM.KN(objJ);
            }
            throw ((Z) objJ).f3468n;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // GJW.xuv
    public final boolean start() {
        int iGD;
        do {
            iGD = GD(J());
            if (iGD == 0) {
                return false;
            }
        } while (iGD != 1);
        return true;
    }

    public String xg() {
        return psW.n(this);
    }

    @Override // GJW.xuv
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        fD(cancellationException);
    }
}
