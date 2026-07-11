package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00028F¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\f\u0010\u000b¨\u0006!"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "", "animationObject", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", c.f62177j, "Landroidx/compose/animation/core/Transition;", "()Landroidx/compose/animation/core/Transition;", "rl", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "t", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "nr", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "getChildTransition$annotations", "()V", "childTransition", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Transition animationObject;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Set states;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ComposeAnimationType type = ComposeAnimationType.ANIMATED_VISIBILITY;

    /* JADX INFO: renamed from: n, reason: from getter */
    public Transition getAnimationObject() {
        return this.animationObject;
    }

    public AnimatedVisibilityComposeAnimation(Transition transition, String str) {
        this.animationObject = transition;
        this.label = str;
        AnimatedVisibilityState.Companion companion = AnimatedVisibilityState.INSTANCE;
        this.states = SetsKt.setOf((Object[]) new AnimatedVisibilityState[]{AnimatedVisibilityState.t(companion.n()), AnimatedVisibilityState.t(companion.rl())});
    }

    public final Transition rl() {
        Object orNull = CollectionsKt.getOrNull(getAnimationObject().o(), 0);
        if (orNull instanceof Transition) {
            return (Transition) orNull;
        }
        return null;
    }
}
