package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;)V", "", c.f62177j, "()J", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "rl", "()Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "value", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "state", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1#2:91\n1#2:102\n1603#3,9:92\n1855#3:101\n1856#3:103\n1612#3:104\n766#3:105\n857#3,2:106\n1549#3:108\n1620#3,3:109\n766#3:112\n857#3,2:113\n*S KotlinDebug\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n*L\n58#1:102\n58#1:92,9\n58#1:101\n58#1:103\n58#1:104\n63#1:105\n63#1:106,2\n78#1:108\n78#1:109,3\n79#1:112\n79#1:113,2\n*E\n"})
public final class TransitionClock<T> implements ComposeAnimationClock<TransitionBasedAnimation<T>, TargetState<T>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TransitionBasedAnimation animation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private TargetState state = new TargetState(getAnimation().getAnimationObject().xMQ(), getAnimation().getAnimationObject().Ik());

    /* JADX INFO: renamed from: rl, reason: from getter */
    public TransitionBasedAnimation getAnimation() {
        return this.animation;
    }

    public TransitionClock(TransitionBasedAnimation transitionBasedAnimation) {
        this.animation = transitionBasedAnimation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long n() {
        return Utils_androidKt.nr(getAnimation().getAnimationObject().r());
    }
}
