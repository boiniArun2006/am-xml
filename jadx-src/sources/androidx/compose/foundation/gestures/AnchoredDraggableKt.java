package androidx.compose.foundation.gestures;

import GJW.Lu;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0095\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aT\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0019\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001aP\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a`\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0003*\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%\u001aH\u0010,\u001a\u00020\u001a\"\u0004\b\u0000\u0010&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0082@¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b/\u00100\u001a\\\u00105\u001a\u000204\"\u0004\b\u0000\u0010\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u00103\u001a\u0002022!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0000¢\u0006\u0004\b5\u00106\u001aT\u00108\u001a\u000207\"\u0004\b\u0000\u0010\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¢\u0006\u0004\b8\u00109\" \u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010;\" \u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;\"\u001a\u0010D\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "newValue", "", "confirmValueChange", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "rl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "velocity", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchoredDragScope", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "latestTarget", "", "gh", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLandroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "qie", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentOffset", "HI", "(Landroidx/compose/foundation/gestures/DraggableAnchors;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "target", "ty", "(FF)F", "I", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "Ik", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "ck", "()Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "state", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "mUb", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", c.f62177j, "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/jvm/functions/Function1;", "AlwaysDrag", "", "GetOrNan", "Landroidx/compose/ui/unit/Dp;", "t", "F", "getAnchoredDraggableMinFlingVelocity", "()F", "AnchoredDraggableMinFlingVelocity", "nr", "Landroidx/compose/animation/core/DecayAnimationSpec;", "NoOpDecayAnimationSpec", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1753:1\n1749#1,4:1755\n1#2:1754\n113#3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1313#1:1755,4\n1655#1:1759\n*E\n"})
public final class AnchoredDraggableKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f16456n = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };
    private static final Function1 rl = new Function1<Integer, Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Integer num) {
            return n(num.intValue());
        }

        public final Float n(int i2) {
            return Float.valueOf(Float.NaN);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f16457t = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    private static final DecayAnimationSpec nr = DecayAnimationSpecKt.nr(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float O(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float nr(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float rl(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long t(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ty(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return f4 > 0.0f ? RangesKt.coerceAtMost(f3, f4) : RangesKt.coerceAtLeast(f3, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ik(Function0 function0, Function2 function2, Continuation continuation) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (continuation instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuation;
            int i2 = anchoredDraggableKt$restartable$1.f16488t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.f16488t = i2 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuation);
            }
        }
        Object obj = anchoredDraggableKt$restartable$1.f16487n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anchoredDraggableKt$restartable$1.f16488t;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(function0, function2, null);
                anchoredDraggableKt$restartable$1.f16488t = 1;
                if (Lu.J2(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object az(AnchoredDraggableState anchoredDraggableState, Object obj, float f3, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            animationSpec = anchoredDraggableState.WPU() ? anchoredDraggableState.XQ() : AnchoredDraggableDefaults.f16446n.t();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.WPU() ? anchoredDraggableState.HI() : AnchoredDraggableDefaults.f16446n.n();
        }
        return qie(anchoredDraggableState, obj, f3, animationSpec2, decayAnimationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultDraggableAnchors ck() {
        return new DefaultDraggableAnchors(CollectionsKt.emptyList(), new float[0]);
    }

    public static final TargetedFlingBehavior mUb(AnchoredDraggableState anchoredDraggableState, final Density density, Function1 function1, AnimationSpec animationSpec) {
        return SnapFlingBehaviorKt.HI(n(anchoredDraggableState, function1, new Function0<Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$anchoredDraggableFlingBehavior$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(density.l(Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
            }
        }), nr, animationSpec);
    }

    private static final SnapLayoutInfoProvider n(final AnchoredDraggableState anchoredDraggableState, final Function1 function1, final Function0 function0) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float rl(float velocity, float decayOffset) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float n(float velocity) {
                float fG = anchoredDraggableState.g();
                return anchoredDraggableState.qie().t(AnchoredDraggableKt.HI(anchoredDraggableState.qie(), fG, velocity, function1, function0)) - fG;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object qie(AnchoredDraggableState anchoredDraggableState, Object obj, float f3, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Continuation continuation) {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        float f4;
        Ref.FloatRef floatRef;
        if (continuation instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) continuation;
            int i2 = anchoredDraggableKt$animateToWithDecay$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(continuation);
            }
        }
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$12 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj2 = anchoredDraggableKt$animateToWithDecay$12.f16473O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anchoredDraggableKt$animateToWithDecay$12.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = f3;
            AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(anchoredDraggableState, f3, animationSpec, floatRef2, decayAnimationSpec, null);
            anchoredDraggableKt$animateToWithDecay$12.f16475t = floatRef2;
            anchoredDraggableKt$animateToWithDecay$12.f16474n = f3;
            anchoredDraggableKt$animateToWithDecay$12.J2 = 1;
            if (AnchoredDraggableState.gh(anchoredDraggableState, obj, null, anchoredDraggableKt$animateToWithDecay$2, anchoredDraggableKt$animateToWithDecay$12, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f4 = f3;
            floatRef = floatRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = anchoredDraggableKt$animateToWithDecay$12.f16474n;
            floatRef = (Ref.FloatRef) anchoredDraggableKt$animateToWithDecay$12.f16475t;
            ResultKt.throwOnFailure(obj2);
        }
        return Boxing.boxFloat(f4 - floatRef.element);
    }

    public static final AnchoredDraggableState rl(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12) {
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(obj, function12);
        anchoredDraggableState.X(function1);
        anchoredDraggableState.nHg(function0);
        anchoredDraggableState.N(animationSpec);
        anchoredDraggableState.iF(decayAnimationSpec);
        return anchoredDraggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HI(DraggableAnchors draggableAnchors, float f3, float f4, Function1 function1, Function0 function0) {
        boolean z2;
        boolean z3;
        if (!Float.isNaN(f3)) {
            boolean z4 = false;
            if (Math.abs(f4) > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && f4 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2) {
                Object objRl = draggableAnchors.rl(f3);
                Intrinsics.checkNotNull(objRl);
                return objRl;
            }
            if (Math.abs(f4) >= Math.abs(((Number) function0.invoke()).floatValue())) {
                Object objN = draggableAnchors.n(f3, z3);
                Intrinsics.checkNotNull(objN);
                return objN;
            }
            Object objN2 = draggableAnchors.n(f3, false);
            Intrinsics.checkNotNull(objN2);
            float fT = draggableAnchors.t(objN2);
            Object objN3 = draggableAnchors.n(f3, true);
            Intrinsics.checkNotNull(objN3);
            float fT2 = draggableAnchors.t(objN3);
            float fAbs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fT - fT2)))).floatValue());
            if (!z3) {
                fT = fT2;
            }
            if (Math.abs(fT - f3) >= fAbs) {
                z4 = true;
            }
            if (z4) {
                if (!z3) {
                    return objN2;
                }
                return objN3;
            }
            if (!z4) {
                if (z3) {
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gh(AnchoredDraggableState anchoredDraggableState, float f3, final AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, AnimationSpec animationSpec, Continuation continuation) {
        float fR;
        Object objRl;
        float fT = draggableAnchors.t(obj);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        if (Float.isNaN(anchoredDraggableState.r())) {
            fR = 0.0f;
        } else {
            fR = anchoredDraggableState.r();
        }
        floatRef.element = fR;
        if (!Float.isNaN(fT)) {
            float f4 = floatRef.element;
            if (f4 != fT && (objRl = SuspendAnimationKt.rl(f4, fT, f3, animationSpec, new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Float f5, Float f6) {
                    n(f5.floatValue(), f6.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f5, float f6) {
                    anchoredDragScope.n(f5, f6);
                    floatRef.element = f5;
                }
            }, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objRl;
            }
        }
        return Unit.INSTANCE;
    }
}
