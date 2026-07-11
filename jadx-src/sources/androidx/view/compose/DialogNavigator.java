package androidx.view.compose;

import TFv.rv6;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.view.FloatingWindow;
import androidx.view.NavBackStackEntry;
import androidx.view.NavDestination;
import androidx.view.NavOptions;
import androidx.view.Navigator;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "", "az", "(Landroidx/navigation/NavBackStackEntry;)V", "", IV8ValueMap.FUNCTION_ENTRIES, "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "O", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "qie", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "popUpTo", "", "savedState", "mUb", "(Landroidx/navigation/NavBackStackEntry;Z)V", "entry", "ck", "LTFv/rv6;", "ty", "()LTFv/rv6;", "backStack", "", "HI", "transitionInProgress", "t", "Companion", "Destination", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n1864#2,3:92\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n55#1:90,2\n68#1:92,3\n*E\n"})
public final class DialogNavigator extends Navigator<Destination> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "<init>", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/window/DialogProperties;", "fD", "()Landroidx/compose/ui/window/DialogProperties;", "N", "Lkotlin/jvm/functions/Function3;", "iF", "()Lkotlin/jvm/functions/Function3;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @NavDestination.ClassType
    public static final class Destination extends NavDestination implements FloatingWindow {

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private final Function3 content;

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogNavigator, (i2 & 2) != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties, function3);
        }

        /* JADX INFO: renamed from: fD, reason: from getter */
        public final DialogProperties getDialogProperties() {
            return this.dialogProperties;
        }

        /* JADX INFO: renamed from: iF, reason: from getter */
        public final Function3 getContent() {
            return this.content;
        }

        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3 function3) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = function3;
        }
    }

    public final void az(NavBackStackEntry backStackEntry) {
        mUb(backStackEntry, false);
    }

    @Override // androidx.view.Navigator
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Destination n() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.f40193n.n(), 2, null);
    }

    public final rv6 HI() {
        return rl().getTransitionsInProgress();
    }

    @Override // androidx.view.Navigator
    public void O(List entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            rl().gh((NavBackStackEntry) it.next());
        }
    }

    public final void ck(NavBackStackEntry entry) {
        rl().O(entry);
    }

    @Override // androidx.view.Navigator
    public void mUb(NavBackStackEntry popUpTo, boolean savedState) {
        rl().xMQ(popUpTo, savedState);
        int iIndexOf = CollectionsKt.indexOf((Iterable<? extends NavBackStackEntry>) rl().getTransitionsInProgress().getValue(), popUpTo);
        int i2 = 0;
        for (Object obj : (Iterable) rl().getTransitionsInProgress().getValue()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (i2 > iIndexOf) {
                ck(navBackStackEntry);
            }
            i2 = i3;
        }
    }

    public final rv6 ty() {
        return rl().getBackStack();
    }
}
