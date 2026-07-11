package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "startVelocity", "J2", "(F)F", "initialValue", "initialVelocity", "nr", "(FF)F", "", "playTimeNanos", "O", "(JFF)F", "t", "(FF)J", "rl", "Landroidx/compose/animation/FlingCalculator;", c.f62177j, "Landroidx/compose/animation/FlingCalculator;", "flingCalculator", "()F", "absVelocityThreshold", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FlingCalculator flingCalculator;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: n */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    private final float J2(float startVelocity) {
        return this.flingCalculator.rl(startVelocity) * Math.signum(startVelocity);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long t(float initialValue, float initialVelocity) {
        return this.flingCalculator.t(initialVelocity) * 1000000;
    }

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.n(), density);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float O(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialValue + this.flingCalculator.nr(initialVelocity).n(playTimeNanos / 1000000);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float nr(float initialValue, float initialVelocity) {
        return initialValue + J2(initialVelocity);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float rl(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.flingCalculator.nr(initialVelocity).rl(playTimeNanos / 1000000);
    }
}
