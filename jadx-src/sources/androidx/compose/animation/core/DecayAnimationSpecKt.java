package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00012\b\b\u0003\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/animation/core/DecayAnimationSpec;", "", "initialValue", "initialVelocity", c.f62177j, "(Landroidx/compose/animation/core/DecayAnimationSpec;FF)F", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "frictionMultiplier", "absVelocityThreshold", "rl", "(FF)Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "nr", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)Landroidx/compose/animation/core/DecayAnimationSpec;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DecayAnimationSpecKt {
    public static final float n(DecayAnimationSpec decayAnimationSpec, float f3, float f4) {
        return ((AnimationVector1D) decayAnimationSpec.n(VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE)).nr(AnimationVectorsKt.n(f3), AnimationVectorsKt.n(f4))).getValue();
    }

    public static final DecayAnimationSpec nr(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final DecayAnimationSpec rl(float f3, float f4) {
        return nr(new FloatExponentialDecaySpec(f3, f4));
    }

    public static /* synthetic */ DecayAnimationSpec t(float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f4 = 0.1f;
        }
        return rl(f3, f4);
    }
}
