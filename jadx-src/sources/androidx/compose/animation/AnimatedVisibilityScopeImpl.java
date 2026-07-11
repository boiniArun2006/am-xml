package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "<init>", "(Landroidx/compose/animation/core/Transition;)V", c.f62177j, "Landroidx/compose/animation/core/Transition;", "rl", "()Landroidx/compose/animation/core/Transition;", "setTransition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/runtime/MutableState;", "targetSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Transition transition;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState targetSize = SnapshotStateKt__SnapshotStateKt.O(IntSize.rl(IntSize.INSTANCE.n()), null, 2, null);

    /* JADX INFO: renamed from: n, reason: from getter */
    public final MutableState getTargetSize() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Transition getTransition() {
        return this.transition;
    }

    public AnimatedVisibilityScopeImpl(Transition transition) {
        this.transition = transition;
    }
}
