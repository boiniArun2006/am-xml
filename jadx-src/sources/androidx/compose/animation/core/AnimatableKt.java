package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"", "initialValue", "visibilityThreshold", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", c.f62177j, "(FF)Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "positiveInfinityBounds1D", "Landroidx/compose/animation/core/AnimationVector2D;", "rl", "Landroidx/compose/animation/core/AnimationVector2D;", "positiveInfinityBounds2D", "Landroidx/compose/animation/core/AnimationVector3D;", "t", "Landroidx/compose/animation/core/AnimationVector3D;", "positiveInfinityBounds3D", "Landroidx/compose/animation/core/AnimationVector4D;", "nr", "Landroidx/compose/animation/core/AnimationVector4D;", "positiveInfinityBounds4D", "O", "negativeInfinityBounds1D", "J2", "negativeInfinityBounds2D", "Uo", "negativeInfinityBounds3D", "KN", "negativeInfinityBounds4D", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimatableKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AnimationVector1D f15416n = AnimationVectorsKt.n(Float.POSITIVE_INFINITY);
    private static final AnimationVector2D rl = AnimationVectorsKt.rl(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AnimationVector3D f15417t = AnimationVectorsKt.t(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final AnimationVector4D nr = AnimationVectorsKt.nr(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final AnimationVector1D f15415O = AnimationVectorsKt.n(Float.NEGATIVE_INFINITY);
    private static final AnimationVector2D J2 = AnimationVectorsKt.rl(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final AnimationVector3D Uo = AnimationVectorsKt.t(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final AnimationVector4D KN = AnimationVectorsKt.nr(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final Animatable n(float f3, float f4) {
        return new Animatable(Float.valueOf(f3), VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), Float.valueOf(f4), null, 8, null);
    }

    public static /* synthetic */ Animatable rl(float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f4 = 0.01f;
        }
        return n(f3, f4);
    }
}
