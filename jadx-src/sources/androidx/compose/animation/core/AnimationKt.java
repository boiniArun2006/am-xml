package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001ac\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\" \u0010\u0017\u001a\u00020\u0014*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/TargetBasedAnimation;", "rl", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/TargetBasedAnimation;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "Landroidx/compose/animation/core/DecayAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", c.f62177j, "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;FF)Landroidx/compose/animation/core/DecayAnimation;", "Landroidx/compose/animation/core/Animation;", "", "t", "(Landroidx/compose/animation/core/Animation;)J", "durationMillis", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationKt {
    public static final DecayAnimation n(FloatDecayAnimationSpec floatDecayAnimationSpec, float f3, float f4) {
        return new DecayAnimation(DecayAnimationSpecKt.nr(floatDecayAnimationSpec), VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), Float.valueOf(f3), AnimationVectorsKt.n(f4));
    }

    public static final TargetBasedAnimation rl(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3) {
        return new TargetBasedAnimation(animationSpec, twoWayConverter, obj, obj2, (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj3));
    }

    public static final long t(Animation animation) {
        return animation.getDurationNanos() / 1000000;
    }
}
