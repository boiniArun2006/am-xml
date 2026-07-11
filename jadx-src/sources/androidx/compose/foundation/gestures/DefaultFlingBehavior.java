package androidx.compose.foundation.gestures;

import GJW.Dsr;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "flingDecay", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", c.f62177j, "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "density", "", "Uo", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "rl", "Landroidx/compose/ui/MotionDurationScale;", "", "t", "I", "O", "()I", "J2", "(I)V", "lastAnimationCycleCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private DecayAnimationSpec flingDecay;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MotionDurationScale motionDurationScale;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object n(ScrollScope scrollScope, float f3, Continuation continuation) {
        this.lastAnimationCycleCount = 0;
        return Dsr.Uo(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f3, this, scrollScope, null), continuation);
    }

    public final void J2(int i2) {
        this.lastAnimationCycleCount = i2;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public void Uo(Density density) {
        this.flingDecay = SplineBasedDecayKt.t(density);
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i2 & 2) != 0 ? ScrollableKt.J2() : motionDurationScale);
    }
}
