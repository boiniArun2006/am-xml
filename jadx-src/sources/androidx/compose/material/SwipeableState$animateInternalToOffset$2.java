package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invokeSuspend", n = {}, s = {})
final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SwipeableState f23260O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23261n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f23262r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f23263t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(SwipeableState swipeableState, float f3, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.f23260O = swipeableState;
        this.J2 = f3;
        this.f23262r = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.f23260O, this.J2, this.f23262r, continuation);
        swipeableState$animateInternalToOffset$2.f23263t = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DragScope dragScope, Continuation continuation) {
        return ((SwipeableState$animateInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f23261n;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.f23263t;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.element = this.f23260O.absoluteOffset.n();
                this.f23260O.animationTarget.setValue(Boxing.boxFloat(this.J2));
                this.f23260O.iF(true);
                Animatable animatableRl = AnimatableKt.rl(floatRef.element, 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat(this.J2);
                AnimationSpec animationSpec = this.f23262r;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SwipeableState$animateInternalToOffset$2.1
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
                this.f23261n = 1;
                if (Animatable.J2(animatableRl, fBoxFloat, animationSpec, null, function1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f23260O.animationTarget.setValue(null);
            this.f23260O.iF(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.f23260O.animationTarget.setValue(null);
            this.f23260O.iF(false);
            throw th;
        }
    }
}
