package androidx.view.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.NavGraph;
import androidx.view.NavGraphNavigator;
import androidx.view.Navigator;
import androidx.view.NavigatorProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Navigator.Name("navigation")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator;", "Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "Landroidx/navigation/NavGraph;", "qie", "()Landroidx/navigation/NavGraph;", "ComposeNavGraph", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    @StabilityInferred
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005RB\u0010\u0012\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RB\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011RB\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011RB\u0010\u001f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011RB\u0010$\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u0006%"}, d2 = {"Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "U", "Lkotlin/jvm/functions/Function1;", "E", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "P5", "B", "setExitTransition$navigation_compose_release", "exitTransition", "M7", "J", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "p5", "D", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Landroidx/compose/animation/SizeTransform;", "eF", "I", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ComposeNavGraph extends NavGraph {

        /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
        private Function1 popEnterTransition;

        /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
        private Function1 exitTransition;

        /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
        private Function1 enterTransition;

        /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
        private Function1 sizeTransform;

        /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
        private Function1 popExitTransition;

        /* JADX INFO: renamed from: B, reason: from getter */
        public final Function1 getExitTransition() {
            return this.exitTransition;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final Function1 getPopExitTransition() {
            return this.popExitTransition;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final Function1 getEnterTransition() {
            return this.enterTransition;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final Function1 getSizeTransform() {
            return this.sizeTransform;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final Function1 getPopEnterTransition() {
            return this.popEnterTransition;
        }

        public ComposeNavGraph(Navigator navigator) {
            super(navigator);
        }
    }

    @Override // androidx.view.NavGraphNavigator, androidx.view.Navigator
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public NavGraph n() {
        return new ComposeNavGraph(this);
    }

    public ComposeNavGraphNavigator(NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }
}
