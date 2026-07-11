package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "originalFlingBehavior", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "<init>", "(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", c.f62177j, "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "getOriginalFlingBehavior", "()Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "rl", "Landroidx/compose/foundation/pager/PagerState;", "nr", "()Landroidx/compose/foundation/pager/PagerState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PagerWrapperFlingBehavior implements FlingBehavior {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TargetedFlingBehavior originalFlingBehavior;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final PagerState pagerState;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(final ScrollScope scrollScope, float f3, Continuation continuation) {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior;
        if (continuation instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) continuation;
            int i2 = pagerWrapperFlingBehavior$performFling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, continuation);
            }
        }
        Object objT = pagerWrapperFlingBehavior$performFling$1.f19034t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pagerWrapperFlingBehavior$performFling$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            TargetedFlingBehavior targetedFlingBehavior = this.originalFlingBehavior;
            Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                    n(f4.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f4) {
                    this.f19035n.getPagerState().pJg(scrollScope, MathKt.roundToInt(this.f19035n.getPagerState().nHg() != 0 ? f4 / this.f19035n.getPagerState().nHg() : 0.0f) + this.f19035n.getPagerState().S());
                }
            };
            pagerWrapperFlingBehavior$performFling$1.f19033n = this;
            pagerWrapperFlingBehavior$performFling$1.J2 = 1;
            objT = targetedFlingBehavior.t(scrollScope, f3, function1, pagerWrapperFlingBehavior$performFling$1);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            pagerWrapperFlingBehavior = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) pagerWrapperFlingBehavior$performFling$1.f19033n;
            ResultKt.throwOnFailure(objT);
        }
        float fFloatValue = ((Number) objT).floatValue();
        if (pagerWrapperFlingBehavior.pagerState.WPU() != 0.0f && Math.abs(pagerWrapperFlingBehavior.pagerState.WPU()) < 0.001d) {
            PagerState pagerState = pagerWrapperFlingBehavior.pagerState;
            PagerState.D(pagerState, pagerState.S(), 0.0f, 2, null);
        } else {
            pagerWrapperFlingBehavior.pagerState.WPU();
        }
        return Boxing.boxFloat(fFloatValue);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final PagerState getPagerState() {
        return this.pagerState;
    }

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }
}
