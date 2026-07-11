package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {1053}, m = "invokeSuspend", n = {}, s = {})
final class SliderKt$animateToTarget$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f22906O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f22907n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ float f22908r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f22909t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$animateToTarget$2(float f3, float f4, float f5, Continuation continuation) {
        super(2, continuation);
        this.f22906O = f3;
        this.J2 = f4;
        this.f22908r = f5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.f22906O, this.J2, this.f22908r, continuation);
        sliderKt$animateToTarget$2.f22909t = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DragScope dragScope, Continuation continuation) {
        return ((SliderKt$animateToTarget$2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f22907n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final DragScope dragScope = (DragScope) this.f22909t;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float f3 = this.f22906O;
            floatRef.element = f3;
            Animatable animatableRl = AnimatableKt.rl(f3, 0.0f, 2, null);
            Float fBoxFloat = Boxing.boxFloat(this.J2);
            TweenSpec tweenSpec = SliderKt.xMQ;
            Float fBoxFloat2 = Boxing.boxFloat(this.f22908r);
            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt$animateToTarget$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                    n(animatable);
                    return Unit.INSTANCE;
                }

                public final void n(Animatable animatable) {
                    dragScope.n(((Number) animatable.ty()).floatValue() - floatRef.element);
                    floatRef.element = ((Number) animatable.ty()).floatValue();
                }
            };
            this.f22907n = 1;
            if (animatableRl.O(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
