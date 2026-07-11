package androidx.compose.foundation.gestures;

import GJW.vd;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)F"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {953}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements Function2<vd, Continuation<? super Float>, Object> {
    final /* synthetic */ float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16623O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ScrollScope f16625o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DefaultFlingBehavior f16626r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16627t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(float f3, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.J2 = f3;
        this.f16626r = defaultFlingBehavior;
        this.f16625o = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultFlingBehavior$performFling$2(this.J2, this.f16626r, this.f16625o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((DefaultFlingBehavior$performFling$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Float> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f3;
        AnimationState animationState;
        Ref.FloatRef floatRef;
        DecayAnimationSpec decayAnimationSpec;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16623O;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Math.abs(this.J2) > 1.0f) {
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = this.J2;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateT = AnimationStateKt.t(0.0f, this.J2, 0L, 0L, false, 28, null);
                try {
                    decayAnimationSpec = this.f16626r.flingDecay;
                    final ScrollScope scrollScope = this.f16625o;
                    final DefaultFlingBehavior defaultFlingBehavior = this.f16626r;
                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            n(animationScope);
                            return Unit.INSTANCE;
                        }

                        public final void n(AnimationScope animationScope) {
                            float fFloatValue = ((Number) animationScope.O()).floatValue() - floatRef3.element;
                            float fNr = scrollScope.nr(fFloatValue);
                            floatRef3.element = ((Number) animationScope.O()).floatValue();
                            floatRef2.element = ((Number) animationScope.J2()).floatValue();
                            if (Math.abs(fFloatValue - fNr) > 0.5f) {
                                animationScope.n();
                            }
                            DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                            defaultFlingBehavior2.J2(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                        }
                    };
                    this.f16624n = floatRef2;
                    this.f16627t = animationStateT;
                    this.f16623O = 1;
                    animationState = animationStateT;
                    try {
                    } catch (CancellationException unused) {
                        floatRef = floatRef2;
                        floatRef.element = ((Number) animationState.te()).floatValue();
                    }
                } catch (CancellationException unused2) {
                    animationState = animationStateT;
                }
                if (SuspendAnimationKt.xMQ(animationState, decayAnimationSpec, false, function1, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef = floatRef2;
                f3 = floatRef.element;
            } else {
                f3 = this.J2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animationState = (AnimationState) this.f16627t;
            floatRef = (Ref.FloatRef) this.f16624n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException unused3) {
                floatRef.element = ((Number) animationState.te()).floatValue();
            }
            f3 = floatRef.element;
        }
        return Boxing.boxFloat(f3);
    }
}
