package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/BoundsTransform;", c.f62177j, "Landroidx/compose/animation/BoundsTransform;", "getDefaultBoundsTransform$annotations", "()V", "DefaultBoundsTransform", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimateBoundsModifierKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final BoundsTransform f14937n = new BoundsTransform() { // from class: androidx.compose.animation.j
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec n(Rect rect, Rect rect2) {
            return AnimateBoundsModifierKt.rl(rect, rect2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec rl(Rect rect, Rect rect2) {
        return AnimationSpecKt.gh(1.0f, 400.0f, VisibilityThresholdsKt.Uo(Rect.INSTANCE));
    }
}
