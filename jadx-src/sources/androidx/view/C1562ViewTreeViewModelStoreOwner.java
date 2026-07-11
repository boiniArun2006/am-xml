package androidx.view;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import androidx.view.viewmodel.R;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.ViewTreeViewModelStoreOwner, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "", "rl", "(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V", c.f62177j, "(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "ViewTreeViewModelStoreOwner")
public final class C1562ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner n(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.f39072n);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            Object objN = ViewTree.n(view);
            view = objN instanceof View ? (View) objN : null;
        }
        return null;
    }

    public static final void rl(View view, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.f39072n, viewModelStoreOwner);
    }
}
