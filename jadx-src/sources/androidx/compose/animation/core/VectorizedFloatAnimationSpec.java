package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "Landroidx/compose/animation/core/Animations;", "anims", "<init>", "(Landroidx/compose/animation/core/Animations;)V", "Landroidx/compose/animation/core/FloatAnimationSpec;", "anim", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "Uo", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "J2", "O", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "t", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", c.f62177j, "Landroidx/compose/animation/core/Animations;", "rl", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "nr", "endVelocityVector", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Animations anims;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private AnimationVector endVelocityVector;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private AnimationVector valueVector;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AnimationVector velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector J2(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.Uo(initialVelocity);
        }
        AnimationVector animationVector = this.velocityVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int iRl = animationVector.getSize();
        for (int i2 = 0; i2 < iRl; i2++) {
            AnimationVector animationVector2 = this.velocityVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector2 = null;
            }
            animationVector2.O(i2, this.anims.get(i2).nr(playTimeNanos, initialValue.n(i2), targetValue.n(i2), initialVelocity.n(i2)));
        }
        AnimationVector animationVector3 = this.velocityVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector O(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = AnimationVectorsKt.Uo(initialVelocity);
        }
        AnimationVector animationVector = this.endVelocityVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            animationVector = null;
        }
        int iRl = animationVector.getSize();
        for (int i2 = 0; i2 < iRl; i2++) {
            AnimationVector animationVector2 = this.endVelocityVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                animationVector2 = null;
            }
            animationVector2.O(i2, this.anims.get(i2).rl(initialValue.n(i2), targetValue.n(i2), initialVelocity.n(i2)));
        }
        AnimationVector animationVector3 = this.endVelocityVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector Uo(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.Uo(initialValue);
        }
        AnimationVector animationVector = this.valueVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector = null;
        }
        int iRl = animationVector.getSize();
        for (int i2 = 0; i2 < iRl; i2++) {
            AnimationVector animationVector2 = this.valueVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector2 = null;
            }
            animationVector2.O(i2, this.anims.get(i2).t(playTimeNanos, initialValue.n(i2), targetValue.n(i2), initialVelocity.n(i2)));
        }
        AnimationVector animationVector3 = this.valueVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int index) {
                return floatAnimationSpec;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long t(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        int iRl = initialValue.getSize();
        long jMax = 0;
        for (int i2 = 0; i2 < iRl; i2++) {
            jMax = Math.max(jMax, this.anims.get(i2).O(initialValue.n(i2), targetValue.n(i2), initialVelocity.n(i2)));
        }
        return jMax;
    }
}
