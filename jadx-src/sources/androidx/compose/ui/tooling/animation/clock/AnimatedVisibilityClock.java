package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R0\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;)V", "Lkotlin/Pair;", "", "O", "(Ljava/lang/String;)Lkotlin/Pair;", "", c.f62177j, "()J", "animationTimeNanos", "", "nr", "(J)V", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "rl", "()Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "value", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "setState-7IW2chM", "(Ljava/lang/String;)V", "state", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedVisibilityClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n1045#2:98\n766#2:99\n857#2,2:100\n1603#2,9:102\n1855#2:111\n1856#2:113\n1612#2:114\n1045#2:115\n766#2:116\n857#2,2:117\n1#3:112\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n70#1:94\n70#1:95,3\n71#1:98\n72#1:99\n72#1:100,2\n81#1:102,9\n81#1:111\n81#1:113\n81#1:114\n84#1:115\n85#1:116\n85#1:117,2\n81#1:112\n*E\n"})
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnimatedVisibilityComposeAnimation animation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private String state;

    private final Pair O(String str) {
        Boolean bool;
        Boolean bool2;
        if (AnimatedVisibilityState.J2(str, AnimatedVisibilityState.INSTANCE.n())) {
            bool = Boolean.FALSE;
            bool2 = Boolean.TRUE;
        } else {
            bool = Boolean.TRUE;
            bool2 = Boolean.FALSE;
        }
        return TuplesKt.to(bool, bool2);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.animation;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public String getState() {
        return this.state;
    }

    public AnimatedVisibilityClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        String strN;
        this.animation = animatedVisibilityComposeAnimation;
        if (((Boolean) getAnimation().getAnimationObject().xMQ()).booleanValue()) {
            strN = AnimatedVisibilityState.INSTANCE.rl();
        } else {
            strN = AnimatedVisibilityState.INSTANCE.n();
        }
        this.state = strN;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long n() {
        Transition transitionRl = getAnimation().rl();
        if (transitionRl != null) {
            return Utils_androidKt.nr(transitionRl.r());
        }
        return 0L;
    }

    public void nr(long animationTimeNanos) {
        Transition animationObject = getAnimation().getAnimationObject();
        Pair pairO = O(getState());
        Boolean bool = (Boolean) pairO.component1();
        bool.booleanValue();
        Boolean bool2 = (Boolean) pairO.component2();
        bool2.booleanValue();
        animationObject.T(bool, bool2, animationTimeNanos);
    }
}
