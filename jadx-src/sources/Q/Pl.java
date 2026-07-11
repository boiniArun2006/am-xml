package Q;

import GJW.vd;
import JK.w6;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import kP.InterfaceC2210n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import xAo.Ew;
import xAo.UGc;
import xAo.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl implements fuX {
    private String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final w6 f7865O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f7866n;
    private final InterfaceC2210n nr;
    private final xAo.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nYs.Ml f7867t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f7868O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7869n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f7868O = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Pl.this.new j(this.f7868O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7869n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210n = Pl.this.nr;
                Eu.I28 i28 = Eu.I28.f2383Z;
                this.f7869n = 1;
                obj = Eu.Wre.n(interfaceC2210n, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Function0 function0 = this.f7868O;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    if (((Boolean) ((n.w6) nVar).n()).booleanValue()) {
                        function0.invoke();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public Pl(Xo rewardedAdUnlockUseCase, xAo.I28 crisperManager, nYs.Ml getAlightSettingsUseCase, InterfaceC2210n injet, w6 proFeaturePopup) {
        Intrinsics.checkNotNullParameter(rewardedAdUnlockUseCase, "rewardedAdUnlockUseCase");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(injet, "injet");
        Intrinsics.checkNotNullParameter(proFeaturePopup, "proFeaturePopup");
        this.f7866n = rewardedAdUnlockUseCase;
        this.rl = crisperManager;
        this.f7867t = getAlightSettingsUseCase;
        this.nr = injet;
        this.f7865O = proFeaturePopup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function0 function0, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // Q.fuX
    public boolean J2() {
        String str = this.J2;
        if (str != null) {
            return this.f7866n.KN(str);
        }
        return false;
    }

    @Override // Q.fuX
    public boolean KN() {
        String str = this.J2;
        if (str != null) {
            return this.f7866n.J2(str);
        }
        return false;
    }

    @Override // Q.fuX
    public boolean O() {
        String str = this.J2;
        if (str != null) {
            return this.f7866n.t(str);
        }
        return false;
    }

    @Override // Q.fuX
    public void Uo(ComponentActivity activity, final Function0 onUnlock) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onUnlock, "onUnlock");
        nYs.j jVarInvoke = this.f7867t.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            this.rl.r(xAo.o.f75291n, new Function1() { // from class: Q.Dsr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.r(onUnlock, (ComponentActivity) obj);
                }
            });
            return;
        }
        String str = this.J2;
        if (str != null) {
            this.f7865O.Uo(activity, new w6.n(str), Eu.I28.P5, Eu.I28.M7, onUnlock);
        }
    }

    @Override // Q.fuX
    public void mUb(ComponentActivity activity, String effectId, final Function0 onUnlock) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(effectId, "effectId");
        Intrinsics.checkNotNullParameter(onUnlock, "onUnlock");
        nYs.j jVarInvoke = this.f7867t.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            this.rl.r(new g9s(effectId), new Function1() { // from class: Q.qz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.Z(onUnlock, (ComponentActivity) obj);
                }
            });
            return;
        }
        String str = this.J2;
        if (str != null) {
            this.f7865O.Uo(activity, new w6.Ml(str, effectId), Eu.I28.jB, Eu.I28.f2381U, onUnlock);
        }
    }

    @Override // Q.fuX
    public void n(ComponentActivity activity, final Function0 onUnlock) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onUnlock, "onUnlock");
        nYs.j jVarInvoke = this.f7867t.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            this.rl.r(xAo.aC.f75271n, new Function1() { // from class: Q.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.Ik(onUnlock, (ComponentActivity) obj);
                }
            });
            return;
        }
        String str = this.J2;
        if (str != null) {
            this.f7865O.Uo(activity, new w6.j(str), Eu.I28.p5, Eu.I28.eF, onUnlock);
        }
    }

    @Override // Q.fuX
    public void nr(ComponentActivity activity, final Function0 onUnlock) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onUnlock, "onUnlock");
        nYs.j jVarInvoke = this.f7867t.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            this.rl.r(UGc.f75268n, new Function1() { // from class: Q.aC
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.o(onUnlock, (ComponentActivity) obj);
                }
            });
            return;
        }
        String str = this.J2;
        if (str != null) {
            this.f7865O.Uo(activity, new w6.C0153w6(str), Eu.I28.f2373E, Eu.I28.f2376M, onUnlock);
        }
    }

    @Override // Q.fuX
    public void rl(ComponentActivity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.J2 = str;
    }

    @Override // Q.fuX
    public boolean t(String effectId) {
        Intrinsics.checkNotNullParameter(effectId, "effectId");
        String str = this.J2;
        if (str != null) {
            return this.f7866n.nr(str, effectId);
        }
        return false;
    }

    @Override // Q.fuX
    public void xMQ(ComponentActivity activity, final Function0 onUnlock) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onUnlock, "onUnlock");
        nYs.j jVarInvoke = this.f7867t.invoke();
        if (jVarInvoke == null || !jVarInvoke.Xw()) {
            this.rl.r(Ew.f75228n, new Function1() { // from class: Q.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.XQ(onUnlock, (ComponentActivity) obj);
                }
            });
        } else {
            GJW.C.nr(LifecycleOwnerKt.n(activity), null, null, new j(onUnlock, null), 3, null);
        }
    }
}
