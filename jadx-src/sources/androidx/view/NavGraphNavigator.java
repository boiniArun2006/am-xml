package androidx.view;

import android.os.Bundle;
import androidx.view.NavDestination;
import androidx.view.Navigator;
import com.caoccao.javet.values.reference.IV8ValueMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Navigator.Name("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "az", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "qie", "()Landroidx/navigation/NavGraph;", "", IV8ValueMap.FUNCTION_ENTRIES, "O", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "t", "Landroidx/navigation/NavigatorProvider;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public class NavGraphNavigator extends Navigator<NavGraph> {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @Override // androidx.view.Navigator
    public void O(List entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            az((NavBackStackEntry) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // androidx.view.Navigator
    /* JADX INFO: renamed from: qie */
    public NavGraph n() {
        return new NavGraph(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.Bundle] */
    private final void az(NavBackStackEntry entry, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavDestination navDestinationX;
        Bundle matchingArgs;
        NavDestination destination = entry.getDestination();
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = entry.t();
        int startDestId = navGraph.getStartDestId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.qie()).toString());
        }
        if (startDestinationRoute != null) {
            navDestinationX = navGraph.X(startDestinationRoute, false);
        } else {
            navDestinationX = (NavDestination) navGraph.getNodes().O(startDestId);
        }
        if (navDestinationX != null) {
            if (startDestinationRoute != null) {
                if (!Intrinsics.areEqual(startDestinationRoute, navDestinationX.getRoute())) {
                    NavDestination.DeepLinkMatch deepLinkMatchXQ = navDestinationX.XQ(startDestinationRoute);
                    if (deepLinkMatchXQ != null) {
                        matchingArgs = deepLinkMatchXQ.getMatchingArgs();
                    } else {
                        matchingArgs = null;
                    }
                    if (matchingArgs != null && !matchingArgs.isEmpty()) {
                        ?? bundle = new Bundle();
                        bundle.putAll(matchingArgs);
                        T t3 = objectRef.element;
                        if (((Bundle) t3) != null) {
                            bundle.putAll((Bundle) t3);
                        }
                        objectRef.element = bundle;
                    }
                }
                if (!navDestinationX.gh().isEmpty()) {
                    List listN = NavArgumentKt.n(navDestinationX.gh(), new Function1<String, Boolean>() { // from class: androidx.navigation.NavGraphNavigator$navigate$missingRequiredArgs$1
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(String key) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            T t4 = objectRef.element;
                            boolean z2 = true;
                            if (t4 != 0 && ((Bundle) t4).containsKey(key)) {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                    });
                    if (!listN.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestinationX + ". Missing required arguments [" + listN + ']').toString());
                    }
                }
            }
            this.navigatorProvider.O(navDestinationX.getNavigatorName()).O(CollectionsKt.listOf(rl().n(navDestinationX, navDestinationX.Uo((Bundle) objectRef.element))), navOptions, navigatorExtras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.s7N() + " is not a direct child of this NavGraph");
    }
}
