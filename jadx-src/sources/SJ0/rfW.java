package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class rfW implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9624n;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9625t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9624n;
    }

    private rfW(LinearLayout linearLayout, View view, LinearLayout linearLayout2) {
        this.f9624n = linearLayout;
        this.rl = view;
        this.f9625t = linearLayout2;
    }

    public static rfW n(View view) {
        int i2 = 2131362675;
        View viewN = ViewBindings.n(view, 2131362675);
        if (viewN != null) {
            i2 = 2131362925;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362925);
            if (linearLayout != null) {
                return new rfW((LinearLayout) view, viewN, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static rfW t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558717, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
