package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/animation/ExitTransitionImpl;", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/TransitionData;", "data", "<init>", "(Landroidx/compose/animation/TransitionData;)V", "nr", "Landroidx/compose/animation/TransitionData;", "rl", "()Landroidx/compose/animation/TransitionData;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ExitTransitionImpl extends ExitTransition {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final TransitionData data;

    public ExitTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.ExitTransition
    /* JADX INFO: renamed from: rl, reason: from getter */
    public TransitionData getData() {
        return this.data;
    }
}
