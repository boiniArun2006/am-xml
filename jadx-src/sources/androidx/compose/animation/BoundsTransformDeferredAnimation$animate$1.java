package androidx.compose.animation;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
final class BoundsTransformDeferredAnimation$animate$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ BoundsTransform J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Rect f15135O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15136n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ BoundsTransformDeferredAnimation f15137r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Animatable f15138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoundsTransformDeferredAnimation$animate$1(Animatable animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, Continuation continuation) {
        super(2, continuation);
        this.f15138t = animatable;
        this.f15135O = rect;
        this.J2 = boundsTransform;
        this.f15137r = boundsTransformDeferredAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoundsTransformDeferredAnimation$animate$1(this.f15138t, this.f15135O, this.J2, this.f15137r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((BoundsTransformDeferredAnimation$animate$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15136n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Animatable animatable = this.f15138t;
            Rect rect = this.f15135O;
            BoundsTransform boundsTransform = this.J2;
            Rect rectT = this.f15137r.t();
            Intrinsics.checkNotNull(rectT);
            FiniteAnimationSpec finiteAnimationSpecN = boundsTransform.n(rectT, this.f15135O);
            this.f15136n = 1;
            if (Animatable.J2(animatable, rect, finiteAnimationSpecN, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
