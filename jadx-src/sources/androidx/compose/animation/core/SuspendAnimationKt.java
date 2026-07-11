package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a`\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0098\u0001\u0010\u0017\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001ay\u0010\u001f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0086@¢\u0006\u0004\b\u001f\u0010 \u001ao\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0086@¢\u0006\u0004\b\"\u0010#\u001au\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\b\b\u0002\u0010'\u001a\u00020&2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0080@¢\u0006\u0004\b(\u0010)\u001aY\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010*\"\u0004\b\u0001\u0010\u0012\"\b\b\u0002\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(+\u0012\u0004\u0012\u00028\u00000\u001cH\u0082@¢\u0006\u0004\b-\u0010.\u001aC\u00100\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0000¢\u0006\u0004\b0\u00101\u001a\u008c\u0001\u00104\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010+\u001a\u00020&2\u0006\u00102\u001a\u00020\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0002¢\u0006\u0004\b4\u00105\u001a\u008c\u0001\u00107\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010+\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0002¢\u0006\u0004\b7\u00108\"\u0018\u00102\u001a\u00020\u0000*\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "velocity", "", "block", "rl", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Uo", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "nr", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "mUb", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "KN", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "t", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "qie", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "ck", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "durationScale", "anim", "ty", "(Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "playTimeNanos", "az", "(Landroidx/compose/animation/core/AnimationScope;JJLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "HI", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n52#3,5:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,5\n*E\n"})
public final class SuspendAnimationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(AnimationScope animationScope, long j2, float f3, Animation animation, AnimationState animationState, Function1 function1) {
        az(animationScope, j2, f3 == 0.0f ? animation.getDurationNanos() : (long) ((j2 - animationScope.getStartTimeNanos()) / f3), animation, animationState, function1);
    }

    public static final float HI(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        float fT = motionDurationScale != null ? motionDurationScale.T() : 1.0f;
        if (!(fT >= 0.0f)) {
            PreconditionsKt.rl("negative scale factor");
        }
        return fT;
    }

    public static /* synthetic */ Object J2(AnimationState animationState, Animation animation, long j2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Long.MIN_VALUE;
        }
        long j3 = j2;
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                public final void n(AnimationScope animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    n((AnimationScope) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return t(animationState, animation, j3, function1, continuation);
    }

    public static /* synthetic */ Object O(float f3, float f4, float f5, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
        }
        return rl(f3, f4, f5, animationSpec, function2, continuation);
    }

    public static /* synthetic */ Object gh(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, Function1 function1, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                public final void n(AnimationScope animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    n((AnimationScope) obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        return mUb(animationState, obj, animationSpec2, z3, function1, continuation);
    }

    public static final Object nr(final TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, final Function2 function2, Continuation continuation) {
        AnimationVector animationVectorUo;
        if (obj3 == null || (animationVectorUo = (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj3)) == null) {
            animationVectorUo = AnimationVectorsKt.Uo((AnimationVector) twoWayConverter.getConvertToVector().invoke(obj));
        }
        AnimationVector animationVector = animationVectorUo;
        Object objJ2 = J2(new AnimationState(twoWayConverter, obj, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, obj, obj2, animationVector), 0L, new Function1<AnimationScope<Object, AnimationVector>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Object, AnimationVector> animationScope) {
                n(animationScope);
                return Unit.INSTANCE;
            }

            public final void n(AnimationScope animationScope) {
                function2.invoke(animationScope.O(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, continuation, 2, null);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    public static final Object rl(float f3, float f4, float f5, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        Object objNr = nr(VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f3), Boxing.boxFloat(f4), Boxing.boxFloat(f5), animationSpec, function2, continuation);
        return objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNr : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(final AnimationState animationState, Animation animation, long j2, final Function1 function1, Continuation continuation) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        final Ref.ObjectRef objectRef;
        final AnimationState animationState2;
        AnimationState animationState3;
        final float fHI;
        Ref.ObjectRef objectRef2;
        Function1 function12;
        AnimationScope animationScope;
        AnimationScope animationScope2;
        Function1<Long, Unit> function13;
        final Animation animation2 = animation;
        if (continuation instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuation;
            int i2 = suspendAnimationKt$animate$4.f15633o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.f15633o = i2 - Integer.MIN_VALUE;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuation);
            }
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$42.f15634r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = suspendAnimationKt$animate$42.f15633o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            final Object objJ2 = animation2.J2(0L);
            final AnimationVector animationVectorRl = animation2.rl(0L);
            objectRef = new Ref.ObjectRef();
            if (j2 == Long.MIN_VALUE) {
                try {
                    fHI = HI(suspendAnimationKt$animate$42.getContext());
                    animationState2 = animationState;
                } catch (CancellationException e2) {
                    e = e2;
                    animationState2 = animationState;
                }
                try {
                    Function1<Long, Unit> function14 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                            n(l2.longValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.animation.core.AnimationScope] */
                        public final void n(long j3) {
                            Ref.ObjectRef objectRef3 = objectRef;
                            Object obj2 = objJ2;
                            TwoWayConverter typeConverter = animation2.getTypeConverter();
                            AnimationVector animationVector = animationVectorRl;
                            Object targetValue = animation2.getTargetValue();
                            final AnimationState animationState4 = animationState2;
                            ?? animationScope3 = new AnimationScope(obj2, typeConverter, animationVector, j3, targetValue, j3, true, new Function0<Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6.1
                                {
                                    super(0);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    animationState4.X(false);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            });
                            SuspendAnimationKt.ty(animationScope3, j3, fHI, animation2, animationState2, function1);
                            objectRef3.element = animationScope3;
                        }
                    };
                    objectRef2 = objectRef;
                    try {
                        suspendAnimationKt$animate$42.f15632n = animationState2;
                        suspendAnimationKt$animate$42.f15635t = animation2;
                        suspendAnimationKt$animate$42.f15631O = function1;
                        suspendAnimationKt$animate$42.J2 = objectRef2;
                        suspendAnimationKt$animate$42.f15633o = 1;
                        if (qie(animation2, function14, suspendAnimationKt$animate$42) != coroutine_suspended) {
                            animationState3 = animationState2;
                            function12 = function1;
                            objectRef = objectRef2;
                        }
                        return coroutine_suspended;
                    } catch (CancellationException e3) {
                        e = e3;
                        animationState3 = animationState2;
                        objectRef = objectRef2;
                        animationScope = (AnimationScope) objectRef.element;
                        if (animationScope != null) {
                            animationScope.gh(false);
                        }
                        animationScope2 = (AnimationScope) objectRef.element;
                        if (animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                            animationState3.X(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    animationState3 = animationState2;
                    animationScope = (AnimationScope) objectRef.element;
                    if (animationScope != null) {
                    }
                    animationScope2 = (AnimationScope) objectRef.element;
                    if (animationScope2 != null) {
                        animationState3.X(false);
                    }
                    throw e;
                }
            }
            objectRef2 = objectRef;
            try {
                ?? animationScope3 = new AnimationScope(objJ2, animation2.getTypeConverter(), animationVectorRl, j2, animation2.getTargetValue(), j2, true, new Function0<Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$7
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        animationState.X(false);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
                ty(animationScope3, j2, HI(suspendAnimationKt$animate$42.getContext()), animation2, animationState, function1);
                objectRef2.element = animationScope3;
                animationState3 = animationState;
                animation2 = animation;
                function12 = function1;
                objectRef = objectRef2;
            } catch (CancellationException e5) {
                e = e5;
                animationState3 = animationState;
                objectRef = objectRef2;
                animationScope = (AnimationScope) objectRef.element;
                if (animationScope != null) {
                }
                animationScope2 = (AnimationScope) objectRef.element;
                if (animationScope2 != null) {
                }
                throw e;
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) suspendAnimationKt$animate$42.J2;
            function12 = (Function1) suspendAnimationKt$animate$42.f15631O;
            animation2 = (Animation) suspendAnimationKt$animate$42.f15635t;
            animationState3 = (AnimationState) suspendAnimationKt$animate$42.f15632n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e6) {
                e = e6;
                animationScope = (AnimationScope) objectRef.element;
                if (animationScope != null) {
                }
                animationScope2 = (AnimationScope) objectRef.element;
                if (animationScope2 != null) {
                }
                throw e;
            }
        }
        do {
            T t3 = objectRef.element;
            Intrinsics.checkNotNull(t3);
            if (!((AnimationScope) t3).KN()) {
                return Unit.INSTANCE;
            }
            final float fHI2 = HI(suspendAnimationKt$animate$42.getContext());
            final Ref.ObjectRef objectRef3 = objectRef;
            final Function1 function15 = function12;
            final Animation animation3 = animation2;
            final AnimationState animationState4 = animationState3;
            try {
                function13 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                        n(l2.longValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void n(long j3) {
                        T t4 = objectRef3.element;
                        Intrinsics.checkNotNull(t4);
                        SuspendAnimationKt.ty((AnimationScope) t4, j3, fHI2, animation3, animationState4, function15);
                    }
                };
                objectRef = objectRef3;
                animation2 = animation3;
                animationState3 = animationState4;
                function12 = function15;
                suspendAnimationKt$animate$42.f15632n = animationState3;
                suspendAnimationKt$animate$42.f15635t = animation2;
                suspendAnimationKt$animate$42.f15631O = function12;
                suspendAnimationKt$animate$42.J2 = objectRef;
                suspendAnimationKt$animate$42.f15633o = 2;
            } catch (CancellationException e7) {
                e = e7;
                objectRef = objectRef3;
                animationState3 = animationState4;
                animationScope = (AnimationScope) objectRef.element;
                if (animationScope != null) {
                }
                animationScope2 = (AnimationScope) objectRef.element;
                if (animationScope2 != null) {
                }
                throw e;
            }
        } while (qie(animation2, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static /* synthetic */ Object xMQ(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                public final void n(AnimationScope animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    n((AnimationScope) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return KN(animationState, decayAnimationSpec, z2, function1, continuation);
    }

    public static final Object KN(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z2, Function1 function1, Continuation continuation) {
        long lastFrameTimeNanos;
        DecayAnimation decayAnimation = new DecayAnimation(decayAnimationSpec, animationState.getTypeConverter(), animationState.getValue(), animationState.getVelocityVector());
        if (z2) {
            lastFrameTimeNanos = animationState.getLastFrameTimeNanos();
        } else {
            lastFrameTimeNanos = Long.MIN_VALUE;
        }
        Object objT = t(animationState, decayAnimation, lastFrameTimeNanos, function1, continuation);
        if (objT == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objT;
        }
        return Unit.INSTANCE;
    }

    public static final Object Uo(float f3, float f4, FloatDecayAnimationSpec floatDecayAnimationSpec, final Function2 function2, Continuation continuation) {
        Object objJ2 = J2(AnimationStateKt.t(f3, f4, 0L, 0L, false, 28, null), AnimationKt.n(floatDecayAnimationSpec, f3, f4), 0L, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                n(animationScope);
                return Unit.INSTANCE;
            }

            public final void n(AnimationScope animationScope) {
                function2.invoke(animationScope.O(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
            }
        }, continuation, 2, null);
        if (objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objJ2;
        }
        return Unit.INSTANCE;
    }

    private static final void az(AnimationScope animationScope, long j2, long j3, Animation animation, AnimationState animationState, Function1 function1) {
        animationScope.mUb(j2);
        animationScope.qie(animation.J2(j3));
        animationScope.az(animation.rl(j3));
        if (animation.t(j3)) {
            animationScope.xMQ(animationScope.getLastFrameTimeNanos());
            animationScope.gh(false);
        }
        ck(animationScope, animationState);
        function1.invoke(animationScope);
    }

    public static final void ck(AnimationScope animationScope, AnimationState animationState) {
        animationState.T(animationScope.O());
        AnimationVectorsKt.J2(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.E2(animationScope.getFinishedTimeNanos());
        animationState.e(animationScope.getLastFrameTimeNanos());
        animationState.X(animationScope.KN());
    }

    public static final Object mUb(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, Function1 function1, Continuation continuation) {
        long lastFrameTimeNanos;
        TargetBasedAnimation targetBasedAnimation = new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), obj, animationState.getVelocityVector());
        if (z2) {
            lastFrameTimeNanos = animationState.getLastFrameTimeNanos();
        } else {
            lastFrameTimeNanos = Long.MIN_VALUE;
        }
        Object objT = t(animationState, targetBasedAnimation, lastFrameTimeNanos, function1, continuation);
        if (objT == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objT;
        }
        return Unit.INSTANCE;
    }

    private static final Object qie(Animation animation, final Function1 function1, Continuation continuation) {
        if (animation.getIsInfinite()) {
            return InfiniteAnimationPolicyKt.n(function1, continuation);
        }
        return MonotonicFrameClockKt.t(new Function1<Long, Object>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Long l2) {
                return n(l2.longValue());
            }

            public final Object n(long j2) {
                return function1.invoke(Long.valueOf(j2));
            }
        }, continuation);
    }
}
