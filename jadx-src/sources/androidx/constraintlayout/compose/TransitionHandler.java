package androidx.constraintlayout.compose;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/constraintlayout/compose/TransitionHandler;", "", "Landroidx/constraintlayout/compose/MotionMeasurer;", "motionMeasurer", "Landroidx/compose/runtime/MutableFloatState;", "motionProgress", "<init>", "(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/MutableFloatState;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "nr", "(J)Z", "dragAmount", "", "Uo", "(J)V", "Landroidx/compose/ui/unit/Velocity;", "velocity", "O", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KN", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J2", "()Z", c.f62177j, "Landroidx/constraintlayout/compose/MotionMeasurer;", "rl", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/constraintlayout/core/state/Transition;", "t", "()Landroidx/constraintlayout/core/state/Transition;", "transition", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransitionHandler {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MotionMeasurer motionMeasurer;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableFloatState motionProgress;

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.constraintlayout.core.state.Transition t() {
        return this.motionMeasurer.getTransition();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(Continuation continuation) {
        TransitionHandler$updateProgressWhileTouchUp$1 transitionHandler$updateProgressWhileTouchUp$1;
        TransitionHandler transitionHandler;
        if (continuation instanceof TransitionHandler$updateProgressWhileTouchUp$1) {
            transitionHandler$updateProgressWhileTouchUp$1 = (TransitionHandler$updateProgressWhileTouchUp$1) continuation;
            int i2 = transitionHandler$updateProgressWhileTouchUp$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transitionHandler$updateProgressWhileTouchUp$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                transitionHandler$updateProgressWhileTouchUp$1 = new TransitionHandler$updateProgressWhileTouchUp$1(this, continuation);
            }
        }
        Object objT = transitionHandler$updateProgressWhileTouchUp$1.f34850t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = transitionHandler$updateProgressWhileTouchUp$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            Function1<Long, Float> function1 = new Function1<Long, Float>() { // from class: androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Long l2) {
                    return n(l2.longValue());
                }

                public final Float n(long j2) {
                    return Float.valueOf(this.f34851n.t().iF(j2));
                }
            };
            transitionHandler$updateProgressWhileTouchUp$1.f34849n = this;
            transitionHandler$updateProgressWhileTouchUp$1.J2 = 1;
            objT = MonotonicFrameClockKt.t(function1, transitionHandler$updateProgressWhileTouchUp$1);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            transitionHandler = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionHandler = (TransitionHandler) transitionHandler$updateProgressWhileTouchUp$1.f34849n;
            ResultKt.throwOnFailure(objT);
        }
        transitionHandler.motionProgress.Z(((Number) objT).floatValue());
        return Unit.INSTANCE;
    }

    public final Object O(final long j2, Continuation continuation) {
        Object objT = MonotonicFrameClockKt.t(new Function1<Long, Unit>() { // from class: androidx.constraintlayout.compose.TransitionHandler$onTouchUp$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j3) {
                this.f34846n.t().wTp(this.f34846n.motionProgress.n(), j3, Velocity.KN(j2), Velocity.xMQ(j2));
            }
        }, continuation);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    public TransitionHandler(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.motionMeasurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    public final boolean J2() {
        return t().nHg(this.motionProgress.n());
    }

    public final void Uo(long dragAmount) {
        this.motionProgress.Z(RangesKt.coerceIn(this.motionProgress.n() + t().HI(this.motionProgress.n(), this.motionMeasurer.mUb(), this.motionMeasurer.xMQ(), Offset.az(dragAmount), Offset.ty(dragAmount)), 0.0f, 1.0f));
    }

    public final boolean nr(long offset) {
        return t().N(Offset.az(offset), Offset.ty(offset));
    }
}
