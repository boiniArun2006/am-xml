package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "toolingState", "Landroidx/compose/animation/core/InfiniteTransition;", "animationObject", "<init>", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/InfiniteTransition;)V", c.f62177j, "Landroidx/compose/ui/tooling/animation/ToolingState;", "rl", "Landroidx/compose/animation/core/InfiniteTransition;", "()Landroidx/compose/animation/core/InfiniteTransition;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "t", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "", "nr", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "O", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "J2", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInfiniteTransitionComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,65:1\n12474#2,2:66\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n*L\n49#1:66,2\n*E\n"})
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    private static boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ToolingState toolingState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Set states;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final InfiniteTransition animationObject;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ComposeAnimationType type;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int Uo = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "rl", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;)Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "", "<set-?>", "apiAvailable", "Z", c.f62177j, "()Z", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean n() {
            return InfiniteTransitionComposeAnimation.KN;
        }

        public final InfiniteTransitionComposeAnimation rl(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!n()) {
                return null;
            }
            return new InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo.getToolingState(), infiniteTransitionSearchInfo.getInfiniteTransition(), defaultConstructorMarker);
        }
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(ToolingState toolingState, InfiniteTransition infiniteTransition, DefaultConstructorMarker defaultConstructorMarker) {
        this(toolingState, infiniteTransition);
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (Intrinsics.areEqual(composeAnimationTypeArrValues[i2].name(), "INFINITE_TRANSITION")) {
                z2 = true;
                break;
            }
            i2++;
        }
        KN = z2;
    }

    private InfiniteTransitionComposeAnimation(ToolingState toolingState, InfiniteTransition infiniteTransition) {
        this.toolingState = toolingState;
        this.animationObject = infiniteTransition;
        this.type = ComposeAnimationType.INFINITE_TRANSITION;
        this.states = SetsKt.setOf(0);
        this.label = getAnimationObject().getLabel();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public InfiniteTransition getAnimationObject() {
        return this.animationObject;
    }
}
