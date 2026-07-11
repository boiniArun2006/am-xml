package GJW;

import GJW.qz;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class eO extends Sis implements Pl, CoroutineStackFrame, HcS {
    private final Continuation J2;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final CoroutineContext f3481r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3480o = AtomicIntegerFieldUpdater.newUpdater(eO.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3479Z = AtomicReferenceFieldUpdater.newUpdater(eO.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3478S = AtomicReferenceFieldUpdater.newUpdater(eO.class, Object.class, "_parentHandle$volatile");

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    private final Object P5(U4 u4, Object obj, int i2, Function3 function3, Object obj2) {
        if (obj instanceof Z) {
            return obj;
        }
        if ((l4Z.rl(i2) || obj2 != null) && !(function3 == null && !(u4 instanceof qz) && obj2 == null)) {
            return new afx(obj, u4 instanceof qz ? (qz) u4 : null, function3, obj2, null, 16, null);
        }
        return obj;
    }

    public static /* synthetic */ void U(eO eOVar, Object obj, int i2, Function3 function3, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            function3 = null;
        }
        eOVar.jB(obj, i2, function3);
    }

    private final Void mUb(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final boolean nHg() {
        if (!l4Z.t(this.f3453O)) {
            return false;
        }
        Continuation continuation = this.J2;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((dzu.fuX) continuation).ty();
    }

    private final void s7N(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @Override // GJW.Pl
    public Object HI(Throwable th) {
        return p5(new Z(th, false, 2, null), null, null);
    }

    @Override // GJW.Pl
    public void J2(Function1 function1) {
        QJ.t(this, new qz.j(function1));
    }

    @Override // GJW.Sis
    public Object O(Object obj) {
        return obj instanceof afx ? ((afx) obj).f3471n : obj;
    }

    @Override // GJW.Pl
    public void aYN(Object obj, Function3 function3) {
        jB(obj, this.f3453O, function3);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.J2;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f3481r;
    }

    @Override // GJW.Pl
    public void o(lej lejVar, Object obj) {
        Continuation continuation = this.J2;
        dzu.fuX fux = continuation instanceof dzu.fuX ? (dzu.fuX) continuation : null;
        U(this, obj, (fux != null ? fux.J2 : null) == lejVar ? 4 : this.f3453O, null, 4, null);
    }

    @Override // GJW.Pl
    public void r(Object obj, final Function1 function1) {
        jB(obj, this.f3453O, function1 != null ? new Function3() { // from class: GJW.Xo
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return eO.Xw(function1, (Throwable) obj2, obj3, (CoroutineContext) obj4);
            }
        } : null);
    }

    public final void rV9() {
        Throwable thZ;
        Continuation continuation = this.J2;
        dzu.fuX fux = continuation instanceof dzu.fuX ? (dzu.fuX) continuation : null;
        if (fux == null || (thZ = fux.Z(this)) == null) {
            return;
        }
        ck();
        cancel(thZ);
    }

    @Override // GJW.Sis
    public final Continuation t() {
        return this.J2;
    }

    @Override // GJW.Pl
    public void te(Object obj) {
        Z(this.f3453O);
    }

    public String toString() {
        return wTp() + '(' + psW.t(this.J2) + "){" + nY() + "}@" + psW.rl(this);
    }

    protected String wTp() {
        return "CancellableContinuation";
    }

    public eO(Continuation continuation, int i2) {
        super(i2);
        this.J2 = continuation;
        this.f3481r = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Ml.f3436n;
    }

    private final void Ik() {
        if (!nHg()) {
            ck();
        }
    }

    private final boolean M7() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3480o;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f3480o.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
        return true;
    }

    private final O S() {
        return (O) f3478S.get(this);
    }

    private final void T(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3479Z;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Ml) {
                if (androidx.concurrent.futures.j.n(f3479Z, this, obj2, obj)) {
                    return;
                }
            } else if (!(obj2 instanceof qz) && !(obj2 instanceof dzu.afx)) {
                if (obj2 instanceof Z) {
                    Z z2 = (Z) obj2;
                    if (!z2.t()) {
                        s7N(obj, obj2);
                    }
                    if (obj2 instanceof l3D) {
                        Throwable th = null;
                        if (obj2 == null) {
                            z2 = null;
                        }
                        if (z2 != null) {
                            th = z2.f3468n;
                        }
                        if (obj instanceof qz) {
                            gh((qz) obj, th);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            az((dzu.afx) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof afx) {
                    afx afxVar = (afx) obj2;
                    if (afxVar.rl != null) {
                        s7N(obj, obj2);
                    }
                    if (obj instanceof dzu.afx) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    qz qzVar = (qz) obj;
                    if (afxVar.t()) {
                        gh(qzVar, afxVar.f3470O);
                        return;
                    } else {
                        if (androidx.concurrent.futures.j.n(f3479Z, this, obj2, afx.rl(afxVar, null, qzVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof dzu.afx) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.j.n(f3479Z, this, obj2, new afx(obj2, (qz) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else {
                s7N(obj, obj2);
            }
        }
    }

    private final O X() {
        xuv xuvVar = (xuv) getContext().get(xuv.nr);
        if (xuvVar != null) {
            O oHI = cA.HI(xuvVar, false, new C1358c(this), 1, null);
            androidx.concurrent.futures.j.n(f3478S, this, null, oHI);
            return oHI;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    private final void Z(int i2) {
        if (M7()) {
            return;
        }
        l4Z.n(this, i2);
    }

    private final void az(dzu.afx afxVar, Throwable th) {
        int i2 = f3480o.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                afxVar.o(i2, th, getContext());
                return;
            } catch (Throwable th2) {
                M.n(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    private final boolean eF() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3480o;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f3480o.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        return true;
    }

    private final String nY() {
        Object objViF = ViF();
        if (objViF instanceof U4) {
            return "Active";
        }
        if (objViF instanceof l3D) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final dzu.nKK p5(Object obj, Object obj2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3479Z;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof U4) {
                Object obj4 = obj;
                Object obj5 = obj2;
                Function3 function32 = function3;
                if (androidx.concurrent.futures.j.n(f3479Z, this, obj3, P5((U4) obj3, obj4, this.f3453O, function32, obj5))) {
                    Ik();
                    return AbstractC1364z.f3512n;
                }
                obj = obj4;
                function3 = function32;
                obj2 = obj5;
            } else {
                Object obj6 = obj2;
                if (!(obj3 instanceof afx) || obj6 == null || ((afx) obj3).nr != obj6) {
                    return null;
                }
                return AbstractC1364z.f3512n;
            }
        }
    }

    private final boolean ty(Throwable th) {
        if (!nHg()) {
            return false;
        }
        Continuation continuation = this.J2;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((dzu.fuX) continuation).ck(th);
    }

    @Override // GJW.Sis
    public Object KN() {
        return ViF();
    }

    public final void N(qz qzVar) {
        T(qzVar);
    }

    public final Object ViF() {
        return f3479Z.get(this);
    }

    public final Object WPU() {
        xuv xuvVar;
        boolean zNHg = nHg();
        if (eF()) {
            if (S() == null) {
                X();
            }
            if (zNHg) {
                rV9();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zNHg) {
            rV9();
        }
        Object objViF = ViF();
        if (!(objViF instanceof Z)) {
            if (l4Z.rl(this.f3453O) && (xuvVar = (xuv) getContext().get(xuv.nr)) != null && !xuvVar.isActive()) {
                CancellationException cancellationException = xuvVar.getCancellationException();
                rl(objViF, cancellationException);
                throw cancellationException;
            }
            return O(objViF);
        }
        throw ((Z) objViF).f3468n;
    }

    public Throwable XQ(xuv xuvVar) {
        return xuvVar.getCancellationException();
    }

    public final boolean bzg() {
        Object obj = f3479Z.get(this);
        if ((obj instanceof afx) && ((afx) obj).nr != null) {
            ck();
            return false;
        }
        f3480o.set(this, 536870911);
        f3479Z.set(this, Ml.f3436n);
        return true;
    }

    @Override // GJW.Pl
    public boolean cancel(Throwable th) {
        Object obj;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3479Z;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z2 = false;
            if (!(obj instanceof U4)) {
                return false;
            }
            if ((obj instanceof qz) || (obj instanceof dzu.afx)) {
                z2 = true;
            }
        } while (!androidx.concurrent.futures.j.n(f3479Z, this, obj, new l3D(this, th, z2)));
        U4 u4 = (U4) obj;
        if (u4 instanceof qz) {
            gh((qz) obj, th);
        } else if (u4 instanceof dzu.afx) {
            az((dzu.afx) obj, th);
        }
        Ik();
        Z(this.f3453O);
        return true;
    }

    public final void ck() {
        O oS = S();
        if (oS == null) {
            return;
        }
        oS.n();
        f3478S.set(this, oXP.f3498n);
    }

    public void e() {
        O oX = X();
        if (oX != null && isCompleted()) {
            oX.n();
            f3478S.set(this, oXP.f3498n);
        }
    }

    @Override // GJW.Pl
    public Object g(Object obj, Object obj2, Function3 function3) {
        return p5(obj, obj2, function3);
    }

    public final void gh(qz qzVar, Throwable th) {
        try {
            qzVar.n(th);
        } catch (Throwable th2) {
            M.n(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // GJW.Pl
    public boolean isActive() {
        return ViF() instanceof U4;
    }

    @Override // GJW.Pl
    public boolean isCancelled() {
        return ViF() instanceof l3D;
    }

    @Override // GJW.Pl
    public boolean isCompleted() {
        return !(ViF() instanceof U4);
    }

    public final void jB(Object obj, int i2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3479Z;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof U4) {
                Object obj3 = obj;
                int i3 = i2;
                Function3 function32 = function3;
                if (androidx.concurrent.futures.j.n(f3479Z, this, obj2, P5((U4) obj2, obj3, i3, function32, null))) {
                    Ik();
                    Z(i3);
                    return;
                } else {
                    obj = obj3;
                    i2 = i3;
                    function3 = function32;
                }
            } else {
                Object obj4 = obj;
                Function3 function33 = function3;
                if (obj2 instanceof l3D) {
                    l3D l3d = (l3D) obj2;
                    if (l3d.O()) {
                        if (function33 != null) {
                            qie(function33, l3d.f3468n, obj4);
                            return;
                        }
                        return;
                    }
                }
                mUb(obj4);
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // GJW.HcS
    public void n(dzu.afx afxVar, int i2) {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3480o;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        T(afxVar);
    }

    @Override // GJW.Sis
    public Throwable nr(Object obj) {
        Throwable thNr = super.nr(obj);
        if (thNr != null) {
            return thNr;
        }
        return null;
    }

    public final void qie(Function3 function3, Throwable th, Object obj) {
        try {
            function3.invoke(th, obj, getContext());
        } catch (Throwable th2) {
            M.n(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        U(this, Ew.t(obj, this), this.f3453O, null, 4, null);
    }

    @Override // GJW.Sis
    public void rl(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3479Z;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof U4)) {
                if (!(obj2 instanceof Z)) {
                    if (obj2 instanceof afx) {
                        afx afxVar = (afx) obj2;
                        if (!afxVar.t()) {
                            Throwable th3 = th;
                            th2 = th3;
                            if (androidx.concurrent.futures.j.n(f3479Z, this, obj2, afx.rl(afxVar, null, null, null, null, th3, 15, null))) {
                                afxVar.nr(this, th2);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else {
                        th2 = th;
                        if (androidx.concurrent.futures.j.n(f3479Z, this, obj2, new afx(obj2, null, null, null, th2, 14, null))) {
                            return;
                        }
                    }
                    th = th2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    public final void v(Throwable th) {
        if (ty(th)) {
            return;
        }
        cancel(th);
        Ik();
    }
}
