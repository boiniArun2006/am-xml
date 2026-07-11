package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000f\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "valueDelta", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "KN", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", c.f62177j, "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "vectorizedSpec", "", "rl", "J", "lastFrameTime", "t", "Landroidx/compose/animation/core/AnimationVector1D;", "lastVelocity", "", "nr", "Z", "isRunning", "O", "F", "xMQ", "()F", "mUb", "(F)V", "value", "J2", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,176:1\n50#2,5:177\n*S KotlinDebug\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n*L\n92#1:177,5\n*E\n"})
public final class UpdatableAnimationState {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final VectorizedAnimationSpec vectorizedSpec;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean isRunning;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long lastFrameTime = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AnimationVector1D lastVelocity = KN;
    private static final Companion J2 = new Companion(null);
    public static final int Uo = 8;
    private static final AnimationVector1D KN = new AnimationVector1D(0.0f);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "<init>", "()V", "", "", "rl", "(F)Z", "Landroidx/compose/animation/core/AnimationVector1D;", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", c.f62177j, "()Landroidx/compose/animation/core/AnimationVector1D;", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D n() {
            return UpdatableAnimationState.KN;
        }

        public final boolean rl(float f3) {
            if (Math.abs(f3) < 0.01f) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.t(r0, r2) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x00b3, PHI: r0 r2 r12 r13 r14
      0x0087: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r12v6 float) = (r12v3 float), (r12v7 float) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r13v6 kotlin.jvm.functions.Function1) = (r13v3 kotlin.jvm.functions.Function1), (r13v7 kotlin.jvm.functions.Function1) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v9 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[PHI: r0 r2 r13 r14
      0x00ae: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r13v4 kotlin.jvm.functions.Function1) = (r13v6 kotlin.jvm.functions.Function1), (r13v7 kotlin.jvm.functions.Function1) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r14v12 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:54:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(Function1 function1, Function0 function0, Continuation continuation) throws Throwable {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        ?? r02;
        final Function1 function12;
        final float f3;
        final UpdatableAnimationState updatableAnimationState;
        ?? r03;
        ?? r13;
        ?? r12;
        if (continuation instanceof UpdatableAnimationState$animateToZero$1) {
            updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) continuation;
            int i2 = updatableAnimationState$animateToZero$1.f17277Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatableAnimationState$animateToZero$1.f17277Z = i2 - Integer.MIN_VALUE;
            } else {
                updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, continuation);
            }
        }
        Object obj = updatableAnimationState$animateToZero$1.f17280r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = updatableAnimationState$animateToZero$1.f17277Z;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.isRunning) {
                    InlineClassHelperKt.t("animateToZero called while previous animation is running");
                }
                MotionDurationScale motionDurationScale = (MotionDurationScale) updatableAnimationState$animateToZero$1.get$context().get(MotionDurationScale.INSTANCE);
                float fT = motionDurationScale != null ? motionDurationScale.T() : 1.0f;
                this.isRunning = true;
                updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                r02 = function0;
                function12 = function1;
                f3 = fT;
                updatableAnimationState = this;
                r03 = r02;
                if (J2.rl(updatableAnimationState.value)) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function0 function02 = (Function0) updatableAnimationState$animateToZero$1.f17281t;
                UpdatableAnimationState updatableAnimationState2 = (UpdatableAnimationState) updatableAnimationState$animateToZero$1.f17278n;
                ResultKt.throwOnFailure(obj);
                r12 = function02;
                function0 = updatableAnimationState2;
                r12.invoke();
                r13 = function0;
                r13.lastFrameTime = Long.MIN_VALUE;
                r13.lastVelocity = KN;
                r13.isRunning = false;
                return Unit.INSTANCE;
            }
            f3 = updatableAnimationState$animateToZero$1.J2;
            Function0 function03 = (Function0) updatableAnimationState$animateToZero$1.f17276O;
            Function1 function13 = (Function1) updatableAnimationState$animateToZero$1.f17281t;
            UpdatableAnimationState updatableAnimationState3 = (UpdatableAnimationState) updatableAnimationState$animateToZero$1.f17278n;
            try {
                ResultKt.throwOnFailure(obj);
                UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$13 = updatableAnimationState$animateToZero$1;
                ?? r04 = function03;
                function12 = function13;
                updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$13;
                updatableAnimationState = updatableAnimationState3;
                try {
                    r04.invoke();
                    r02 = r04;
                    r03 = r04;
                    if (f3 == 0.0f) {
                        r03 = r02;
                        if (J2.rl(updatableAnimationState.value)) {
                            Function1<Long, Unit> function14 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                    n(l2.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(long j2) {
                                    if (this.f17283n.lastFrameTime == Long.MIN_VALUE) {
                                        this.f17283n.lastFrameTime = j2;
                                    }
                                    AnimationVector1D animationVector1D = new AnimationVector1D(this.f17283n.getValue());
                                    long jT2 = f3 == 0.0f ? this.f17283n.vectorizedSpec.t(new AnimationVector1D(this.f17283n.getValue()), UpdatableAnimationState.J2.n(), this.f17283n.lastVelocity) : MathKt.roundToLong((j2 - this.f17283n.lastFrameTime) / f3);
                                    float value = ((AnimationVector1D) this.f17283n.vectorizedSpec.Uo(jT2, animationVector1D, UpdatableAnimationState.J2.n(), this.f17283n.lastVelocity)).getValue();
                                    UpdatableAnimationState updatableAnimationState4 = this.f17283n;
                                    updatableAnimationState4.lastVelocity = (AnimationVector1D) updatableAnimationState4.vectorizedSpec.J2(jT2, animationVector1D, UpdatableAnimationState.J2.n(), this.f17283n.lastVelocity);
                                    this.f17283n.lastFrameTime = j2;
                                    float value2 = this.f17283n.getValue() - value;
                                    this.f17283n.mUb(value);
                                    function12.invoke(Float.valueOf(value2));
                                }
                            };
                            updatableAnimationState$animateToZero$12.f17278n = updatableAnimationState;
                            updatableAnimationState$animateToZero$12.f17281t = function12;
                            updatableAnimationState$animateToZero$12.f17276O = r02;
                            updatableAnimationState$animateToZero$12.J2 = f3;
                            updatableAnimationState$animateToZero$12.f17277Z = 1;
                            r04 = r02;
                            if (MonotonicFrameClockKt.t(function14, updatableAnimationState$animateToZero$12) == coroutine_suspended) {
                            }
                            r04.invoke();
                            r02 = r04;
                            r03 = r04;
                            if (f3 == 0.0f) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    UpdatableAnimationState updatableAnimationState4 = updatableAnimationState;
                    final Function1 function15 = function12;
                    final UpdatableAnimationState updatableAnimationState5 = updatableAnimationState4;
                    ?? r122 = r03;
                    if (Math.abs(updatableAnimationState5.value) == 0.0f) {
                        r13 = updatableAnimationState5;
                    } else {
                        Function1<Long, Unit> function16 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                n(l2.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(long j2) {
                                float value = this.f17285n.getValue();
                                this.f17285n.mUb(0.0f);
                                function15.invoke(Float.valueOf(value));
                            }
                        };
                        updatableAnimationState$animateToZero$12.f17278n = updatableAnimationState5;
                        updatableAnimationState$animateToZero$12.f17281t = r122;
                        updatableAnimationState$animateToZero$12.f17276O = null;
                        updatableAnimationState$animateToZero$12.f17277Z = 2;
                        r12 = r122;
                        function0 = updatableAnimationState5;
                    }
                    r13.lastFrameTime = Long.MIN_VALUE;
                    r13.lastVelocity = KN;
                    r13.isRunning = false;
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    function0 = updatableAnimationState;
                    function0.lastFrameTime = Long.MIN_VALUE;
                    function0.lastVelocity = KN;
                    function0.isRunning = false;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                function0 = updatableAnimationState3;
                function0.lastFrameTime = Long.MIN_VALUE;
                function0.lastVelocity = KN;
                function0.isRunning = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void mUb(float f3) {
        this.value = f3;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public UpdatableAnimationState(AnimationSpec animationSpec) {
        this.vectorizedSpec = animationSpec.n(VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE));
    }
}
