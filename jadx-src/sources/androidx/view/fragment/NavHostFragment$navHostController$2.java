package androidx.view.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.view.NavHostController;
import androidx.view.SavedStateRegistry;
import androidx.view.ViewModelStore;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/NavHostController;", "t", "()Landroidx/navigation/NavHostController;"}, k = 3, mv = {1, 8, 0})
final class NavHostFragment$navHostController$2 extends Lambda implements Function0<NavHostController> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ NavHostFragment f40435n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostFragment$navHostController$2(NavHostFragment navHostFragment) {
        super(0);
        this.f40435n = navHostFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle O(NavHostFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.graphId != 0) {
            return BundleKt.n(TuplesKt.to("android-support-nav:fragment:graphId", Integer.valueOf(this$0.graphId)));
        }
        Bundle bundle = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle nr(NavHostController this_apply) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Bundle bundleXg = this_apply.xg();
        if (bundleXg != null) {
            return bundleXg;
        }
        Bundle EMPTY = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return EMPTY;
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final NavHostController invoke() {
        Context context = this.f40435n.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…s attached\"\n            }");
        final NavHostController navHostController = new NavHostController(context);
        final NavHostFragment navHostFragment = this.f40435n;
        navHostController.G7(navHostFragment);
        ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        navHostController.fcU(viewModelStore);
        navHostFragment.fD(navHostController);
        Bundle bundleN = navHostFragment.getSavedStateRegistry().n("android-support-nav:fragment:navControllerState");
        if (bundleN != null) {
            navHostController.m(bundleN);
        }
        navHostFragment.getSavedStateRegistry().t("android-support-nav:fragment:navControllerState", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.I28
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle n() {
                return NavHostFragment$navHostController$2.nr(navHostController);
            }
        });
        Bundle bundleN2 = navHostFragment.getSavedStateRegistry().n("android-support-nav:fragment:graphId");
        if (bundleN2 != null) {
            navHostFragment.graphId = bundleN2.getInt("android-support-nav:fragment:graphId");
        }
        navHostFragment.getSavedStateRegistry().t("android-support-nav:fragment:graphId", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.Wre
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle n() {
                return NavHostFragment$navHostController$2.O(navHostFragment);
            }
        });
        if (navHostFragment.graphId != 0) {
            navHostController.pJg(navHostFragment.graphId);
            return navHostController;
        }
        Bundle arguments = navHostFragment.getArguments();
        int i2 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
        Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
        if (i2 != 0) {
            navHostController.ofS(i2, bundle);
        }
        return navHostController;
    }
}
