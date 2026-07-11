package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/AnimationResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "remainingOffset", "Landroidx/compose/animation/core/AnimationState;", "currentAnimationState", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationState;)V", c.f62177j, "()Ljava/lang/Object;", "rl", "()Landroidx/compose/animation/core/AnimationState;", "Ljava/lang/Object;", "getRemainingOffset", "Landroidx/compose/animation/core/AnimationState;", "t", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnimationResult<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object remainingOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AnimationState currentAnimationState;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object getRemainingOffset() {
        return this.remainingOffset;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final AnimationState getCurrentAnimationState() {
        return this.currentAnimationState;
    }

    public final AnimationState t() {
        return this.currentAnimationState;
    }

    public AnimationResult(Object obj, AnimationState animationState) {
        this.remainingOffset = obj;
        this.currentAnimationState = animationState;
    }
}
