package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "floatDecaySpec", "<init>", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "O", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "t", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "rl", "nr", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", c.f62177j, "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "getFloatDecaySpec", "()Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FloatDecayAnimationSpec floatDecaySpec;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private AnimationVector targetVector;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private AnimationVector valueVector;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AnimationVector velocityVector;

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector O(long playTimeNanos, AnimationVector initialValue, AnimationVector initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.Uo(initialValue);
        }
        AnimationVector animationVector = this.valueVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            AnimationVector animationVector2 = this.valueVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector2 = null;
            }
            animationVector2.O(i2, this.floatDecaySpec.O(playTimeNanos, initialValue.n(i2), initialVelocity.n(i2)));
        }
        AnimationVector animationVector3 = this.valueVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* JADX INFO: renamed from: n, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector nr(AnimationVector initialValue, AnimationVector initialVelocity) {
        if (this.targetVector == null) {
            this.targetVector = AnimationVectorsKt.Uo(initialValue);
        }
        AnimationVector animationVector = this.targetVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            AnimationVector animationVector2 = this.targetVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                animationVector2 = null;
            }
            animationVector2.O(i2, this.floatDecaySpec.nr(initialValue.n(i2), initialVelocity.n(i2)));
        }
        AnimationVector animationVector3 = this.targetVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public AnimationVector rl(long playTimeNanos, AnimationVector initialValue, AnimationVector initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.Uo(initialValue);
        }
        AnimationVector animationVector = this.velocityVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            AnimationVector animationVector2 = this.velocityVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector2 = null;
            }
            animationVector2.O(i2, this.floatDecaySpec.rl(playTimeNanos, initialValue.n(i2), initialVelocity.n(i2)));
        }
        AnimationVector animationVector3 = this.velocityVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long t(AnimationVector initialValue, AnimationVector initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.Uo(initialValue);
        }
        AnimationVector animationVector = this.velocityVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.floatDecaySpec.t(initialValue.n(i2), initialVelocity.n(i2)));
        }
        return jMax;
    }

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }
}
