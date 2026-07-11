package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class jL implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayout f9505O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9506n;
    public final RelativeLayout nr;
    public final AppCompatTextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9507t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9506n;
    }

    private jL(LinearLayout linearLayout, AppCompatTextView appCompatTextView, View view, RelativeLayout relativeLayout, LinearLayout linearLayout2) {
        this.f9506n = linearLayout;
        this.rl = appCompatTextView;
        this.f9507t = view;
        this.nr = relativeLayout;
        this.f9505O = linearLayout2;
    }

    public static jL n(View view) {
        int i2 = 2131362033;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362033);
        if (appCompatTextView != null) {
            i2 = 2131362675;
            View viewN = ViewBindings.n(view, 2131362675);
            if (viewN != null) {
                i2 = 2131364036;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.n(view, 2131364036);
                if (relativeLayout != null) {
                    i2 = 2131364037;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131364037);
                    if (linearLayout != null) {
                        return new jL((LinearLayout) view, appCompatTextView, viewN, relativeLayout, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static jL t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558723, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
