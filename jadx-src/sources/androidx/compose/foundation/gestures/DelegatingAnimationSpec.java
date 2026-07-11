package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/foundation/gestures/AnimationData;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", c.f62177j, "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "Landroidx/compose/animation/core/AnimationSpec;", "zoomAnimationSpec", "Landroidx/compose/ui/geometry/Offset;", "rl", "offsetAnimationSpec", "t", "rotationAnimationSpec", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnimationSpec zoomAnimationSpec;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AnimationSpec offsetAnimationSpec;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AnimationSpec rotationAnimationSpec;

    @Override // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec n(final TwoWayConverter converter) {
        AnimationSpec animationSpec = this.zoomAnimationSpec;
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        final VectorizedAnimationSpec vectorizedAnimationSpecN = animationSpec.n(VectorConvertersKt.xMQ(floatCompanionObject));
        final VectorizedAnimationSpec vectorizedAnimationSpecN2 = this.offsetAnimationSpec.n(VectorConvertersKt.rl(Offset.INSTANCE));
        final VectorizedAnimationSpec vectorizedAnimationSpecN3 = this.rotationAnimationSpec.n(VectorConvertersKt.xMQ(floatCompanionObject));
        return new VectorizedFiniteAnimationSpec<AnimationVector>() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec$vectorize$1
            private final AnimationVector1D KN(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE).getConvertToVector().invoke(Float.valueOf(animationData.getDegrees()));
            }

            private final AnimationVector1D gh(AnimationData animationData) {
                return (AnimationVector1D) VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE).getConvertToVector().invoke(Float.valueOf(animationData.getZoom()));
            }

            private final AnimationVector mUb(AnimationVector1D zoom, AnimationVector2D offset, AnimationVector1D rotation) {
                Function1 convertToVector = converter.getConvertToVector();
                float value = zoom.getValue();
                float v1 = offset.getV1();
                return (AnimationVector) convertToVector.invoke(new AnimationData(value, Offset.O((((long) Float.floatToRawIntBits(offset.getV2())) & 4294967295L) | (Float.floatToRawIntBits(v1) << 32)), rotation.getValue(), null));
            }

            private final AnimationVector2D xMQ(AnimationData animationData) {
                Function1 convertToVector = VectorConvertersKt.rl(Offset.INSTANCE).getConvertToVector();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (animationData.getOffset() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (animationData.getOffset() & 4294967295L));
                return (AnimationVector2D) convertToVector.invoke(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L))));
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector J2(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
                AnimationData animationData = (AnimationData) converter.getConvertFromVector().invoke(initialValue);
                AnimationData animationData2 = (AnimationData) converter.getConvertFromVector().invoke(targetValue);
                AnimationData animationData3 = (AnimationData) converter.getConvertFromVector().invoke(initialVelocity);
                return mUb((AnimationVector1D) vectorizedAnimationSpecN.J2(playTimeNanos, gh(animationData), gh(animationData2), gh(animationData3)), (AnimationVector2D) vectorizedAnimationSpecN2.J2(playTimeNanos, xMQ(animationData), xMQ(animationData2), xMQ(animationData3)), (AnimationVector1D) vectorizedAnimationSpecN3.J2(playTimeNanos, KN(animationData), KN(animationData2), KN(animationData3)));
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector Uo(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
                AnimationData animationData = (AnimationData) converter.getConvertFromVector().invoke(initialValue);
                AnimationData animationData2 = (AnimationData) converter.getConvertFromVector().invoke(targetValue);
                AnimationData animationData3 = (AnimationData) converter.getConvertFromVector().invoke(initialVelocity);
                return mUb((AnimationVector1D) vectorizedAnimationSpecN.Uo(playTimeNanos, gh(animationData), gh(animationData2), gh(animationData3)), (AnimationVector2D) vectorizedAnimationSpecN2.Uo(playTimeNanos, xMQ(animationData), xMQ(animationData2), xMQ(animationData3)), (AnimationVector1D) vectorizedAnimationSpecN3.Uo(playTimeNanos, KN(animationData), KN(animationData2), KN(animationData3)));
            }

            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public long t(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
                AnimationData animationData = (AnimationData) converter.getConvertFromVector().invoke(initialValue);
                AnimationData animationData2 = (AnimationData) converter.getConvertFromVector().invoke(targetValue);
                AnimationData animationData3 = (AnimationData) converter.getConvertFromVector().invoke(initialVelocity);
                return Math.max(vectorizedAnimationSpecN.t(gh(animationData), gh(animationData2), gh(animationData3)), Math.max(vectorizedAnimationSpecN2.t(xMQ(animationData), xMQ(animationData2), xMQ(animationData3)), vectorizedAnimationSpecN3.t(KN(animationData), KN(animationData2), KN(animationData3))));
            }
        };
    }
}
