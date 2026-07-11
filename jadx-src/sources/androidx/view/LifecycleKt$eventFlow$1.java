package androidx.view;

import ILs.l3D;
import ILs.r;
import ILs.s4;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LILs/s4;", "Landroidx/lifecycle/Lifecycle$Event;", "", "<anonymous>", "(LILs/s4;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements Function2<s4, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Lifecycle f38903O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38904n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f38905t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleKt$eventFlow$1(Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.f38903O = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.f38903O, continuation);
        lifecycleKt$eventFlow$1.f38905t = obj;
        return lifecycleKt$eventFlow$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.nr(lifecycleEventObserver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(s4 s4Var, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        s4Var.nr(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            r.j.n(s4Var, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f38904n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final s4 s4Var = (s4) this.f38905t;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.I28
                @Override // androidx.view.LifecycleEventObserver
                public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LifecycleKt$eventFlow$1.mUb(s4Var, lifecycleOwner, event);
                }
            };
            this.f38903O.n(lifecycleEventObserver);
            final Lifecycle lifecycle = this.f38903O;
            Function0 function0 = new Function0() { // from class: androidx.lifecycle.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.gh(lifecycle, lifecycleEventObserver);
                }
            };
            this.f38904n = 1;
            if (l3D.rl(s4Var, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s4 s4Var, Continuation continuation) {
        return ((LifecycleKt$eventFlow$1) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
