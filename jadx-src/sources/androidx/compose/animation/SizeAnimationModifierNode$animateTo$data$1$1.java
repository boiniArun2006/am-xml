package androidx.compose.animation;

import GJW.vd;
import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ SizeAnimationModifierNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ long f15370O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15371n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SizeAnimationModifierNode.AnimData f15372t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j2, SizeAnimationModifierNode sizeAnimationModifierNode, Continuation continuation) {
        super(2, continuation);
        this.f15372t = animData;
        this.f15370O = j2;
        this.J2 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.f15372t, this.f15370O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SizeAnimationModifierNode$animateTo$data$1$1 sizeAnimationModifierNode$animateTo$data$1$1;
        Function2 function2PoH;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15371n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                sizeAnimationModifierNode$animateTo$data$1$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Animatable animatableN = this.f15372t.getAnim();
            IntSize intSizeRl = IntSize.rl(this.f15370O);
            AnimationSpec animationSpecEx = this.J2.getAnimationSpec();
            this.f15371n = 1;
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
            obj = Animatable.J2(animatableN, intSizeRl, animationSpecEx, null, null, sizeAnimationModifierNode$animateTo$data$1$1, 12, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.f15436t && (function2PoH = sizeAnimationModifierNode$animateTo$data$1$1.J2.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) != null) {
            function2PoH.invoke(IntSize.rl(sizeAnimationModifierNode$animateTo$data$1$1.f15372t.getStartSize()), animationResult.getEndState().getValue());
        }
        return Unit.INSTANCE;
    }
}
