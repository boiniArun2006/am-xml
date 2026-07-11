package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "<init>", "()V", "exit", "t", "(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Landroidx/compose/animation/TransitionData;", "rl", "()Landroidx/compose/animation/TransitionData;", "data", c.f62177j, "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ExitTransition {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ExitTransition rl = new ExitTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ExitTransition f15250t = new ExitTransitionImpl(new TransitionData(null, null, null, null, true, null, 47, null));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/ExitTransition;", "None", "Landroidx/compose/animation/ExitTransition;", c.f62177j, "()Landroidx/compose/animation/ExitTransition;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExitTransition n() {
            return ExitTransition.rl;
        }
    }

    public /* synthetic */ ExitTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData rl();

    private ExitTransition() {
    }

    public boolean equals(Object other) {
        return (other instanceof ExitTransition) && Intrinsics.areEqual(((ExitTransition) other).rl(), rl());
    }

    public final ExitTransition t(ExitTransition exit) {
        Fade fade = exit.rl().getFade();
        if (fade == null) {
            fade = rl().getFade();
        }
        Slide slide = exit.rl().getSlide();
        if (slide == null) {
            slide = rl().getSlide();
        }
        ChangeSize changeSize = exit.rl().getChangeSize();
        if (changeSize == null) {
            changeSize = rl().getChangeSize();
        }
        Scale scale = exit.rl().getScale();
        if (scale == null) {
            scale = rl().getScale();
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, exit.rl().getHold() || rl().getHold(), MapsKt.plus(rl().getEffectsMap(), exit.rl().getEffectsMap())));
    }

    public String toString() {
        if (Intrinsics.areEqual(this, rl)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.areEqual(this, f15250t)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData transitionDataRl = rl();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        Fade fade = transitionDataRl.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = transitionDataRl.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = transitionDataRl.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = transitionDataRl.getScale();
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(transitionDataRl.getHold());
        return sb.toString();
    }

    public int hashCode() {
        return rl().hashCode();
    }
}
