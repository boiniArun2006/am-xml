package androidx.view.compose;

import TFv.rv6;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.NavBackStackEntry;
import androidx.view.NavDestination;
import androidx.view.NavOptions;
import androidx.view.Navigator;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Navigator.Name("composable")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "<init>", "()V", "", "Landroidx/navigation/NavBackStackEntry;", IV8ValueMap.FUNCTION_ENTRIES, "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "O", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "qie", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "popUpTo", "", "savedState", "mUb", "(Landroidx/navigation/NavBackStackEntry;Z)V", "entry", "ck", "(Landroidx/navigation/NavBackStackEntry;)V", "HI", "Landroidx/compose/runtime/MutableState;", "t", "Landroidx/compose/runtime/MutableState;", "ty", "()Landroidx/compose/runtime/MutableState;", "isPop", "LTFv/rv6;", "az", "()LTFv/rv6;", "backStack", "nr", "Companion", "Destination", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1855#2,2:141\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n55#1:141,2\n*E\n"})
public final class ComposeNavigator extends Navigator<Destination> {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState isPop = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    @StabilityInferred
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR;\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0002\b\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011RB\u0010\u001b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRB\u0010 \u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aRB\u0010$\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aRB\u0010(\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aRB\u0010,\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b\u000e\u0010\u0018\"\u0004\b+\u0010\u001a¨\u0006-"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/compose/ComposeNavigator;", "navigator", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function4;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/jvm/functions/Function4;", "iF", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "N", "Lkotlin/jvm/functions/Function1;", "fD", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition$navigation_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "v", "E2", "setExitTransition$navigation_compose_release", "exitTransition", "Xw", "e", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "jB", "X", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Landroidx/compose/animation/SizeTransform;", "U", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @NavDestination.ClassType
    public static final class Destination extends NavDestination {

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private Function1 enterTransition;

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private final Function4 content;

        /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
        private Function1 sizeTransform;

        /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
        private Function1 popEnterTransition;

        /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
        private Function1 popExitTransition;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private Function1 exitTransition;

        /* JADX INFO: renamed from: androidx.navigation.compose.ComposeNavigator$Destination$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lkotlin/jvm/JvmSuppressWildcards;", "entry", "", c.f62177j, "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
        final class AnonymousClass1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function3 f40201n;

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                n(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
                if (ComposerKt.v()) {
                    ComposerKt.p5(1587956030, i2, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:107)");
                }
                this.f40201n.invoke(navBackStackEntry, composer, Integer.valueOf((i2 >> 3) & 14));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: renamed from: E2, reason: from getter */
        public final Function1 getExitTransition() {
            return this.exitTransition;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final Function1 getSizeTransform() {
            return this.sizeTransform;
        }

        /* JADX INFO: renamed from: X, reason: from getter */
        public final Function1 getPopExitTransition() {
            return this.popExitTransition;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Function1 getPopEnterTransition() {
            return this.popEnterTransition;
        }

        /* JADX INFO: renamed from: fD, reason: from getter */
        public final Function1 getEnterTransition() {
            return this.enterTransition;
        }

        /* JADX INFO: renamed from: iF, reason: from getter */
        public final Function4 getContent() {
            return this.content;
        }

        public Destination(ComposeNavigator composeNavigator, Function4 function4) {
            super(composeNavigator);
            this.content = function4;
        }
    }

    @Override // androidx.view.Navigator
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Destination n() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.f40191n.n());
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final MutableState getIsPop() {
        return this.isPop;
    }

    public final void HI(NavBackStackEntry entry) {
        rl().O(entry);
    }

    @Override // androidx.view.Navigator
    public void O(List entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            rl().qie((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    public final rv6 az() {
        return rl().getBackStack();
    }

    public final void ck(NavBackStackEntry entry) {
        rl().mUb(entry);
    }

    @Override // androidx.view.Navigator
    public void mUb(NavBackStackEntry popUpTo, boolean savedState) {
        rl().xMQ(popUpTo, savedState);
        this.isPop.setValue(Boolean.TRUE);
    }
}
