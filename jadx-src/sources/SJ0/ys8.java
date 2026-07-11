package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ys8 implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9693n;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9694t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9693n;
    }

    private ys8(LinearLayout linearLayout, View view, LinearLayout linearLayout2) {
        this.f9693n = linearLayout;
        this.rl = view;
        this.f9694t = linearLayout2;
    }

    public static ys8 n(View view) {
        int i2 = 2131362675;
        View viewN = ViewBindings.n(view, 2131362675);
        if (viewN != null) {
            i2 = 2131362925;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362925);
            if (linearLayout != null) {
                return new ys8((LinearLayout) view, viewN, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static ys8 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558722, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
