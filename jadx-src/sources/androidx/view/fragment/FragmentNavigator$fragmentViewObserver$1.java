package androidx.view.fragment;

import android.util.Log;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import androidx.view.NavBackStackEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/lifecycle/LifecycleEventObserver;", "rl", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/lifecycle/LifecycleEventObserver;"}, k = 3, mv = {1, 8, 0})
final class FragmentNavigator$fragmentViewObserver$1 extends Lambda implements Function1<NavBackStackEntry, LifecycleEventObserver> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ FragmentNavigator f40424n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FragmentNavigator$fragmentViewObserver$1(FragmentNavigator fragmentNavigator) {
        super(1);
        this.f40424n = fragmentNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(FragmentNavigator this$0, NavBackStackEntry entry, LifecycleOwner owner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entry, "$entry");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME && ((List) this$0.rl().getBackStack().getValue()).contains(entry)) {
            if (this$0.ViF(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
            }
            this$0.rl().O(entry);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (this$0.ViF(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
            }
            this$0.rl().O(entry);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final LifecycleEventObserver invoke(final NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        final FragmentNavigator fragmentNavigator = this.f40424n;
        return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.Ml
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator$fragmentViewObserver$1.t(fragmentNavigator, entry, lifecycleOwner, event);
            }
        };
    }
}
