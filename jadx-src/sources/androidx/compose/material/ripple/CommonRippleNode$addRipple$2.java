package androidx.compose.material.ripple;

import GJW.vd;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
final class CommonRippleNode$addRipple$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ PressInteraction.Press J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CommonRippleNode f23996O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23997n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ RippleAnimation f23998t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonRippleNode$addRipple$2(RippleAnimation rippleAnimation, CommonRippleNode commonRippleNode, PressInteraction.Press press, Continuation continuation) {
        super(2, continuation);
        this.f23998t = rippleAnimation;
        this.f23996O = commonRippleNode;
        this.J2 = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommonRippleNode$addRipple$2(this.f23998t, this.f23996O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((CommonRippleNode$addRipple$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f23997n;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                RippleAnimation rippleAnimation = this.f23998t;
                this.f23997n = 1;
                if (rippleAnimation.nr(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f23996O.ripples.XQ(this.J2);
            DrawModifierNodeKt.n(this.f23996O);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.f23996O.ripples.XQ(this.J2);
            DrawModifierNodeKt.n(this.f23996O);
            throw th;
        }
    }
}
