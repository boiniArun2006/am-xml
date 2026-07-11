package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001a\u0010%\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010)\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u001a\u0010.\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/DecayAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "J2", "(J)Ljava/lang/Object;", "rl", "(J)Landroidx/compose/animation/core/AnimationVector;", c.f62177j, "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "Landroidx/compose/animation/core/TwoWayConverter;", "O", "()Landroidx/compose/animation/core/TwoWayConverter;", "t", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "nr", "Landroidx/compose/animation/core/AnimationVector;", "initialValueVector", "getInitialVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "endVelocity", "Uo", "targetValue", "KN", "J", "()J", "durationNanos", "", "xMQ", "Z", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final AnimationVector endVelocity;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AnimationVector initialVelocityVector;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Object targetValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final VectorizedDecayAnimationSpec animationSpec;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AnimationVector initialValueVector;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TwoWayConverter typeConverter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object initialValue;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final boolean isInfinite;

    public DecayAnimation(VectorizedDecayAnimationSpec vectorizedDecayAnimationSpec, TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector) {
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = obj;
        AnimationVector animationVector2 = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj);
        this.initialValueVector = animationVector2;
        this.initialVelocityVector = AnimationVectorsKt.O(animationVector);
        this.targetValue = getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.nr(animationVector2, animationVector));
        this.durationNanos = vectorizedDecayAnimationSpec.t(animationVector2, animationVector);
        AnimationVector animationVectorO = AnimationVectorsKt.O(vectorizedDecayAnimationSpec.rl(getDurationNanos(), animationVector2, animationVector));
        this.endVelocity = animationVectorO;
        int size = animationVectorO.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            AnimationVector animationVector3 = this.endVelocity;
            animationVector3.O(i2, RangesKt.coerceIn(animationVector3.n(i2), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: O, reason: from getter */
    public TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public Object getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: nr, reason: from getter */
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.Animation
    public Object J2(long playTimeNanos) {
        if (!t(playTimeNanos)) {
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.O(playTimeNanos, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public AnimationVector rl(long playTimeNanos) {
        if (!t(playTimeNanos)) {
            return this.animationSpec.rl(playTimeNanos, this.initialValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    public DecayAnimation(DecayAnimationSpec decayAnimationSpec, TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector) {
        this(decayAnimationSpec.n(twoWayConverter), twoWayConverter, obj, animationVector);
    }
}
