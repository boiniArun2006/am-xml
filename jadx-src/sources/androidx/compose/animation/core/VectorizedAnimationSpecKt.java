package androidx.compose.animation.core;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "playTimeMillis", TtmlNode.START, TtmlNode.END, "startVelocity", "Uo", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "playTime", "O", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Landroidx/compose/animation/core/Animations;", "J2", "(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;", "", c.f62177j, "[I", "EmptyIntArray", "", "rl", "[F", "EmptyFloatArray", "Landroidx/compose/animation/core/ArcSpline;", "t", "Landroidx/compose/animation/core/ArcSpline;", "EmptyArcSpline", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1038:1\n119#2,10:1039\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt\n*L\n187#1:1039,10\n*E\n"})
public final class VectorizedAnimationSpecKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f15748n = new int[0];
    private static final float[] rl = new float[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ArcSpline f15749t = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animations J2(final AnimationVector animationVector, final float f3, final float f4) {
        return animationVector != null ? new Animations(animationVector, f3, f4) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final FloatSpringSpec[] anims;

            @Override // androidx.compose.animation.core.Animations
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public FloatSpringSpec get(int index) {
                return this.anims[index];
            }

            {
                int size = animationVector.getSize();
                FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[size];
                for (int i2 = 0; i2 < size; i2++) {
                    floatSpringSpecArr[i2] = new FloatSpringSpec(f3, f4, animationVector.n(i2));
                }
                this.anims = floatSpringSpecArr;
            }
        } : new Animations(f3, f4) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final FloatSpringSpec anim;

            @Override // androidx.compose.animation.core.Animations
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public FloatSpringSpec get(int index) {
                return this.anim;
            }

            {
                this.anim = new FloatSpringSpec(f3, f4, 0.0f, 4, null);
            }
        };
    }

    public static final long O(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, long j2) {
        long delayMillis = j2 - ((long) vectorizedDurationBasedAnimationSpec.getDelayMillis());
        long jRl = vectorizedDurationBasedAnimationSpec.rl();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        if (delayMillis > jRl) {
            return jRl;
        }
        return delayMillis;
    }

    public static final AnimationVector Uo(VectorizedAnimationSpec vectorizedAnimationSpec, long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return vectorizedAnimationSpec.Uo(j2 * 1000000, animationVector, animationVector2, animationVector3);
    }
}
