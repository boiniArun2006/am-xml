package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Landroidx/compose/animation/core/AnimationVector1D;", c.f62177j, "(F)Landroidx/compose/animation/core/AnimationVector1D;", "v2", "Landroidx/compose/animation/core/AnimationVector2D;", "rl", "(FF)Landroidx/compose/animation/core/AnimationVector2D;", "v3", "Landroidx/compose/animation/core/AnimationVector3D;", "t", "(FFF)Landroidx/compose/animation/core/AnimationVector3D;", "v4", "Landroidx/compose/animation/core/AnimationVector4D;", "nr", "(FFFF)Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Uo", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "O", "source", "", "J2", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationVectorsKt {
    public static final AnimationVector1D n(float f3) {
        return new AnimationVector1D(f3);
    }

    public static final AnimationVector4D nr(float f3, float f4, float f5, float f6) {
        return new AnimationVector4D(f3, f4, f5, f6);
    }

    public static final AnimationVector2D rl(float f3, float f4) {
        return new AnimationVector2D(f3, f4);
    }

    public static final AnimationVector3D t(float f3, float f4, float f5) {
        return new AnimationVector3D(f3, f4, f5);
    }

    public static final void J2(AnimationVector animationVector, AnimationVector animationVector2) {
        int size = animationVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            animationVector.O(i2, animationVector2.n(i2));
        }
    }

    public static final AnimationVector O(AnimationVector animationVector) {
        AnimationVector animationVectorUo = Uo(animationVector);
        int size = animationVectorUo.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            animationVectorUo.O(i2, animationVector.n(i2));
        }
        return animationVectorUo;
    }

    public static final AnimationVector Uo(AnimationVector animationVector) {
        AnimationVector animationVectorT = animationVector.t();
        Intrinsics.checkNotNull(animationVectorT, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return animationVectorT;
    }
}
