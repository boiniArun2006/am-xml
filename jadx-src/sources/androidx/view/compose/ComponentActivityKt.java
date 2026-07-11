package androidx.view.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.C1561ViewTreeLifecycleOwner;
import androidx.view.C1562ViewTreeViewModelStoreOwner;
import androidx.view.C1639ViewTreeSavedStateRegistryOwner;
import androidx.view.ComponentActivity;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "t", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComponentActivityKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f13279n = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void rl(ComponentActivity componentActivity, CompositionContext compositionContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            compositionContext = null;
        }
        n(componentActivity, compositionContext, function2);
    }

    public static final void n(ComponentActivity componentActivity, CompositionContext compositionContext, Function2 function2) {
        ComposeView composeView;
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(function2);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(function2);
        t(componentActivity);
        componentActivity.setContentView(composeView2, f13279n);
    }

    private static final void t(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (C1561ViewTreeLifecycleOwner.n(decorView) == null) {
            C1561ViewTreeLifecycleOwner.rl(decorView, componentActivity);
        }
        if (C1562ViewTreeViewModelStoreOwner.n(decorView) == null) {
            C1562ViewTreeViewModelStoreOwner.rl(decorView, componentActivity);
        }
        if (C1639ViewTreeSavedStateRegistryOwner.n(decorView) == null) {
            C1639ViewTreeSavedStateRegistryOwner.rl(decorView, componentActivity);
        }
    }
}
