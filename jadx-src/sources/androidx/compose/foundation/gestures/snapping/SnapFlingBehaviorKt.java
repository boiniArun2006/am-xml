package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ag\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0018*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0018*\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u001c2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001au\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0018*\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0082@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u0003*\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&\u001a*\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u001a\u00102\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "HI", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "ty", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "animation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "delta", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "xMQ", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "J2", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "KN", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "target", "qie", "(FF)F", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "snappingOffset", "lowerBound", "upperBound", "mUb", "(IFF)F", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "F", "az", "()F", "MinFlingVelocityDp", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n481#1,4:493\n481#1,4:497\n481#1,4:501\n75#2:486\n1247#3,6:487\n113#4:505\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n330#1:493,4\n379#1:497,4\n455#1:501,4\n233#1:486\n235#1:487,6\n441#1:505\n*E\n"})
public final class SnapFlingBehaviorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f17317n = Dp.KN(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE);

    private static final boolean gh(float f3) {
        return (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float qie(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return f4 > 0.0f ? RangesKt.coerceAtMost(f3, f4) : RangesKt.coerceAtLeast(f3, f4);
    }

    public static final TargetedFlingBehavior HI(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J2(final ScrollScope scrollScope, final float f3, AnimationState animationState, DecayAnimationSpec decayAnimationSpec, final Function1 function1, Continuation continuation) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) continuation;
            int i2 = snapFlingBehaviorKt$animateDecay$1.f17320r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.f17320r = i2 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuation);
            }
        }
        Object obj = snapFlingBehaviorKt$animateDecay$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = snapFlingBehaviorKt$animateDecay$1.f17320r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z2 = ((Number) animationState.te()).floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
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
                    if (Math.abs(((Number) animationScope.O()).floatValue()) >= Math.abs(f3)) {
                        float fQie = SnapFlingBehaviorKt.qie(((Number) animationScope.O()).floatValue(), f3);
                        SnapFlingBehaviorKt.Uo(animationScope, scrollScope, function1, fQie - floatRef2.element);
                        animationScope.n();
                        floatRef2.element = fQie;
                        return;
                    }
                    SnapFlingBehaviorKt.Uo(animationScope, scrollScope, function1, ((Number) animationScope.O()).floatValue() - floatRef2.element);
                    floatRef2.element = ((Number) animationScope.O()).floatValue();
                }
            };
            snapFlingBehaviorKt$animateDecay$1.f17321t = animationState;
            snapFlingBehaviorKt$animateDecay$1.f17318O = floatRef2;
            snapFlingBehaviorKt$animateDecay$1.f17319n = f3;
            snapFlingBehaviorKt$animateDecay$1.f17320r = 1;
            if (SuspendAnimationKt.KN(animationState, decayAnimationSpec, !z2, function12, snapFlingBehaviorKt$animateDecay$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = snapFlingBehaviorKt$animateDecay$1.f17319n;
            floatRef = (Ref.FloatRef) snapFlingBehaviorKt$animateDecay$1.f17318O;
            animationState = (AnimationState) snapFlingBehaviorKt$animateDecay$1.f17321t;
            ResultKt.throwOnFailure(obj);
        }
        return new AnimationResult(Boxing.boxFloat(f3 - floatRef.element), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object KN(final ScrollScope scrollScope, float f3, final float f4, AnimationState animationState, AnimationSpec animationSpec, final Function1 function1, Continuation continuation) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        float f5;
        AnimationState animationState2;
        Ref.FloatRef floatRef;
        float f6;
        if (continuation instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) continuation;
            int i2 = snapFlingBehaviorKt$animateWithTarget$1.f17327o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.f17327o = i2 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuation);
            }
        }
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$12 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj = snapFlingBehaviorKt$animateWithTarget$12.f17328r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = snapFlingBehaviorKt$animateWithTarget$12.f17327o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = ((Number) animationState.te()).floatValue();
            Float fBoxFloat = Boxing.boxFloat(f3);
            boolean z2 = ((Number) animationState.te()).floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
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
                    float fNr;
                    float fQie = SnapFlingBehaviorKt.qie(((Number) animationScope.O()).floatValue(), f4);
                    float f7 = fQie - floatRef2.element;
                    if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled) {
                        try {
                            fNr = scrollScope.nr(f7);
                        } catch (CancellationException unused) {
                            animationScope.n();
                            fNr = 0.0f;
                        }
                    } else {
                        fNr = scrollScope.nr(f7);
                    }
                    function1.invoke(Float.valueOf(fNr));
                    if (Math.abs(f7 - fNr) > 0.5f || fQie != ((Number) animationScope.O()).floatValue()) {
                        animationScope.n();
                    }
                    floatRef2.element += fNr;
                }
            };
            snapFlingBehaviorKt$animateWithTarget$12.f17325O = animationState;
            snapFlingBehaviorKt$animateWithTarget$12.J2 = floatRef2;
            f5 = f3;
            snapFlingBehaviorKt$animateWithTarget$12.f17326n = f5;
            snapFlingBehaviorKt$animateWithTarget$12.f17329t = fFloatValue;
            snapFlingBehaviorKt$animateWithTarget$12.f17327o = 1;
            if (SuspendAnimationKt.mUb(animationState, fBoxFloat, animationSpec, !z2, function12, snapFlingBehaviorKt$animateWithTarget$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            animationState2 = animationState;
            floatRef = floatRef2;
            f6 = fFloatValue;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6 = snapFlingBehaviorKt$animateWithTarget$12.f17329t;
            float f7 = snapFlingBehaviorKt$animateWithTarget$12.f17326n;
            floatRef = (Ref.FloatRef) snapFlingBehaviorKt$animateWithTarget$12.J2;
            AnimationState animationState3 = (AnimationState) snapFlingBehaviorKt$animateWithTarget$12.f17325O;
            ResultKt.throwOnFailure(obj);
            f5 = f7;
            animationState2 = animationState3;
        }
        return new AnimationResult(Boxing.boxFloat(f5 - floatRef.element), AnimationStateKt.Uo(animationState2, 0.0f, qie(((Number) animationState2.te()).floatValue(), f6), 0L, 0L, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(AnimationScope animationScope, ScrollScope scrollScope, Function1 function1, float f3) {
        float fNr;
        if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled) {
            try {
                fNr = scrollScope.nr(f3);
            } catch (CancellationException unused) {
                animationScope.n();
                fNr = 0.0f;
            }
        } else {
            fNr = scrollScope.nr(f3);
        }
        function1.invoke(Float.valueOf(fNr));
        if (Math.abs(f3 - fNr) > 0.5f) {
            animationScope.n();
        }
    }

    public static final float az() {
        return f17317n;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float mUb(int i2, float f3, float f4) {
        FinalSnappingItem.Companion companion = FinalSnappingItem.INSTANCE;
        if (FinalSnappingItem.J2(i2, companion.n())) {
            if (Math.abs(f4) <= Math.abs(f3)) {
                f3 = f4;
            }
        } else if (!FinalSnappingItem.J2(i2, companion.rl())) {
            if (!FinalSnappingItem.J2(i2, companion.t())) {
                f3 = 0.0f;
            }
        }
        if (gh(f3)) {
            return f3;
        }
        return 0.0f;
    }

    public static final TargetedFlingBehavior ty(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1921733134, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:231)");
        }
        Object obj = (Density) composer.ty(CompositionLocalsKt.J2());
        boolean z2 = false;
        DecayAnimationSpec decayAnimationSpecRl = SplineBasedFloatDecayAnimationSpec_androidKt.rl(composer, 0);
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(snapLayoutInfoProvider)) || (i2 & 6) == 4) {
            z2 = true;
        }
        boolean zP5 = composer.p5(decayAnimationSpecRl) | z2 | composer.p5(obj);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = HI(snapLayoutInfoProvider, decayAnimationSpecRl, AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null));
            composer.o(objIF);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return targetedFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object xMQ(ScrollScope scrollScope, float f3, float f4, ApproachAnimation approachAnimation, Function1 function1, Continuation continuation) {
        return approachAnimation.n(scrollScope, Boxing.boxFloat(f3), Boxing.boxFloat(f4), function1, continuation);
    }
}
