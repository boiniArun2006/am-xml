package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
final class TransformableStateKt$animateBy$3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationData J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f17238O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17239n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DelegatingAnimationSpec f17240r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17241t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateBy$3(Ref.ObjectRef objectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.f17238O = objectRef;
        this.J2 = animationData;
        this.f17240r = delegatingAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.f17238O, this.J2, this.f17240r, continuation);
        transformableStateKt$animateBy$3.f17241t = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(TransformScope transformScope, Continuation continuation) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17239n;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final TransformScope transformScope = (TransformScope) this.f17241t;
            AnimationState animationStateNr = AnimationStateKt.nr(AnimationDataConverter.f16574n, this.f17238O.element, TransformableStateKt.f17237n, 0L, 0L, false, 56, null);
            AnimationData animationData = this.J2;
            DelegatingAnimationSpec delegatingAnimationSpec = this.f17240r;
            final Ref.ObjectRef objectRef = this.f17238O;
            Function1<AnimationScope<AnimationData, AnimationVector4D>, Unit> function1 = new Function1<AnimationScope<AnimationData, AnimationVector4D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    n(animationScope);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object] */
                public final void n(AnimationScope animationScope) {
                    float zoom = ((AnimationData) objectRef.element).getZoom() == 0.0f ? 1.0f : ((AnimationData) animationScope.O()).getZoom() / ((AnimationData) objectRef.element).getZoom();
                    transformScope.n(zoom, Offset.ck(((AnimationData) animationScope.O()).getOffset(), ((AnimationData) objectRef.element).getOffset()), ((AnimationData) animationScope.O()).getDegrees() - ((AnimationData) objectRef.element).getDegrees());
                    objectRef.element = animationScope.O();
                }
            };
            this.f17239n = 1;
            if (SuspendAnimationKt.gh(animationStateNr, animationData, delegatingAnimationSpec, false, function1, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
