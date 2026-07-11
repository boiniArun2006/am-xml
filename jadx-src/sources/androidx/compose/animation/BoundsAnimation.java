package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ExperimentalSharedTransitionApi
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRW\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00042\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\b\u0012\u0004\u0012\u00020\u00050\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 \"\u0004\b!\u0010\"R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010)\u001a\u0004\b\u001e\u0010*\"\u0004\b+\u0010,R;\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010.2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001f\u001a\u0004\b#\u00100\"\u0004\b1\u00102R\u0011\u00106\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00109\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u00105¨\u0006;"}, d2 = {"Landroidx/compose/animation/BoundsAnimation;", "", "Landroidx/compose/animation/SharedTransitionScope;", "transitionScope", "Landroidx/compose/animation/core/Transition;", "", "transition", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "animation", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "<init>", "(Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V", "", "az", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V", "currentBounds", "targetBounds", c.f62177j, "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/animation/SharedTransitionScope;", "getTransitionScope", "()Landroidx/compose/animation/SharedTransitionScope;", "rl", "Landroidx/compose/animation/core/Transition;", "Uo", "()Landroidx/compose/animation/core/Transition;", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "mUb", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "nr", "O", "()Landroidx/compose/animation/BoundsTransform;", "qie", "(Landroidx/compose/animation/BoundsTransform;)V", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animationSpec", "Landroidx/compose/runtime/State;", "J2", "()Landroidx/compose/runtime/State;", "gh", "(Landroidx/compose/runtime/State;)V", "animationState", "xMQ", "()Z", "isRunning", "KN", "()Landroidx/compose/ui/geometry/Rect;", "value", "target", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBoundsAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,103:1\n85#2:104\n113#2,2:105\n85#2:107\n113#2,2:108\n85#2:110\n113#2,2:111\n*S KotlinDebug\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n*L\n39#1:104\n39#1:105,2\n54#1:107\n54#1:108,2\n69#1:110\n69#1:111,2\n*E\n"})
public final class BoundsAnimation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SharedTransitionScope transitionScope;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState boundsTransform;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Transition transition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState animation;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private FiniteAnimationSpec animationSpec = BoundsAnimationKt.f15127n;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState animationState = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    private final BoundsTransform O() {
        return (BoundsTransform) this.boundsTransform.getValue();
    }

    private final void mUb(Transition.DeferredAnimation deferredAnimation) {
        this.animation.setValue(deferredAnimation);
    }

    private final void qie(BoundsTransform boundsTransform) {
        this.boundsTransform.setValue(boundsTransform);
    }

    public final boolean J2() {
        return ((Boolean) this.transition.Ik()).booleanValue();
    }

    public final Rect KN() {
        State stateNr;
        if (!this.transitionScope.J2() || (stateNr = nr()) == null) {
            return null;
        }
        return (Rect) stateNr.getValue();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Transition getTransition() {
        return this.transition;
    }

    public final void gh(State state) {
        this.animationState.setValue(state);
    }

    public final void n(final Rect currentBounds, final Rect targetBounds) {
        if (this.transitionScope.J2()) {
            if (nr() == null) {
                this.animationSpec = O().n(currentBounds, targetBounds);
            }
            gh(rl().n(new Function1<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>>() { // from class: androidx.compose.animation.BoundsAnimation$animate$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final FiniteAnimationSpec invoke(Transition.Segment segment) {
                    return this.f15120n.getAnimationSpec();
                }
            }, new Function1<Boolean, Rect>() { // from class: androidx.compose.animation.BoundsAnimation$animate$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Rect invoke(Boolean bool) {
                    return n(bool.booleanValue());
                }

                public final Rect n(boolean z2) {
                    return z2 == ((Boolean) this.f15122n.getTransition().Ik()).booleanValue() ? targetBounds : currentBounds;
                }
            }));
        }
    }

    public final State nr() {
        return (State) this.animationState.getValue();
    }

    public final Transition.DeferredAnimation rl() {
        return (Transition.DeferredAnimation) this.animation.getValue();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final FiniteAnimationSpec getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean xMQ() {
        Transition parentTransition = this.transition;
        while (parentTransition.getParentTransition() != null) {
            parentTransition = parentTransition.getParentTransition();
            Intrinsics.checkNotNull(parentTransition);
        }
        return !Intrinsics.areEqual(parentTransition.xMQ(), parentTransition.Ik());
    }

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition transition, Transition.DeferredAnimation deferredAnimation, BoundsTransform boundsTransform) {
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.animation = SnapshotStateKt__SnapshotStateKt.O(deferredAnimation, null, 2, null);
        this.boundsTransform = SnapshotStateKt__SnapshotStateKt.O(boundsTransform, null, 2, null);
    }

    public final void az(Transition.DeferredAnimation animation, BoundsTransform boundsTransform) {
        if (!Intrinsics.areEqual(rl(), animation)) {
            mUb(animation);
            gh(null);
            this.animationSpec = BoundsAnimationKt.f15127n;
        }
        qie(boundsTransform);
    }
}
