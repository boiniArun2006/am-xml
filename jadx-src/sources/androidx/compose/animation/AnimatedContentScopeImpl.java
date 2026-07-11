package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/AnimatedContentScopeImpl;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "animatedVisibilityScope", "<init>", "(Landroidx/compose/animation/AnimatedVisibilityScope;)V", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "rl", "()Landroidx/compose/animation/core/Transition;", "transition", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnimatedContentScopeImpl implements AnimatedContentScope, AnimatedVisibilityScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ AnimatedVisibilityScope f14983n;

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition rl() {
        return this.f14983n.rl();
    }

    public AnimatedContentScopeImpl(AnimatedVisibilityScope animatedVisibilityScope) {
        this.f14983n = animatedVisibilityScope;
    }
}
