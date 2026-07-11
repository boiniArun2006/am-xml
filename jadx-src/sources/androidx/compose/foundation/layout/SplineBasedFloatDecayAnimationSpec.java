package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "velocity", "", "Uo", "(F)D", "J2", "(F)F", "initialValue", "initialVelocity", "nr", "(FF)F", "", "playTimeNanos", "O", "(JFF)F", "t", "(FF)J", "rl", c.f62177j, "F", "magicPhysicalCoefficient", "()F", "absVelocityThreshold", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float O(long playTimeNanos, float initialValue, float initialVelocity) {
        long jT2 = t(0.0f, initialVelocity);
        return initialValue + (J2(initialVelocity) * AndroidFlingSpline.FlingResult.t(AndroidFlingSpline.f17394n.rl(jT2 > 0 ? playTimeNanos / jT2 : 1.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: n */
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float rl(long playTimeNanos, float initialValue, float initialVelocity) {
        long jT2 = t(0.0f, initialVelocity);
        return ((AndroidFlingSpline.FlingResult.nr(AndroidFlingSpline.f17394n.rl(jT2 > 0 ? playTimeNanos / jT2 : 1.0f)) * J2(initialVelocity)) / jT2) * 1.0E9f;
    }

    private final double Uo(float velocity) {
        return AndroidFlingSpline.f17394n.n(velocity, WindowInsetsConnection_androidKt.f17836n * this.magicPhysicalCoefficient);
    }

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    public final float J2(float velocity) {
        return ((float) (((double) (WindowInsetsConnection_androidKt.f17836n * this.magicPhysicalCoefficient)) * Math.exp((WindowInsetsConnection_androidKt.rl / WindowInsetsConnection_androidKt.f17837t) * Uo(velocity)))) * Math.signum(velocity);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float nr(float initialValue, float initialVelocity) {
        return initialValue + J2(initialVelocity);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long t(float initialValue, float initialVelocity) {
        return (long) (Math.exp(Uo(initialVelocity) / WindowInsetsConnection_androidKt.f17837t) * 1.0E9d);
    }
}
