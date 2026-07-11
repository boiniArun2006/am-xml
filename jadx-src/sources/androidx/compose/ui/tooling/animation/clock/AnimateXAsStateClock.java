package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "t", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "", c.f62177j, "()J", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "rl", "()Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "value", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "nr", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "state", "Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "Landroidx/compose/animation/core/TargetBasedAnimation;", "currAnimation", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimateXAsStateClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class AnimateXAsStateClock<T, V extends AnimationVector> implements ComposeAnimationClock<AnimateXAsStateComposeAnimation<T, V>, TargetState<T>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnimateXAsStateComposeAnimation animation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private TargetState state = new TargetState(getAnimation().getAnimationObject().ty(), getAnimation().getAnimationObject().ty());

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object currentValue = getAnimation().getToolingState().getValue();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private TargetBasedAnimation currAnimation = t();

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long n() {
        return Utils_androidKt.nr(this.currAnimation.getDurationNanos());
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public TargetState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public AnimateXAsStateComposeAnimation getAnimation() {
        return this.animation;
    }

    public AnimateXAsStateClock(AnimateXAsStateComposeAnimation animateXAsStateComposeAnimation) {
        this.animation = animateXAsStateComposeAnimation;
    }

    private final TargetBasedAnimation t() {
        return AnimationKt.rl(getAnimation().getAnimationSpec(), getAnimation().getAnimationObject().getTypeConverter(), getState().getInitial(), getState().getTarget(), getAnimation().getAnimationObject().HI());
    }
}
