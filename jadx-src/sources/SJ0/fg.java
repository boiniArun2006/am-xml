package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fg implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayout f9436O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9437n;
    public final AppCompatImageView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9438t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9437n;
    }

    private fg(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout2) {
        this.f9437n = linearLayout;
        this.rl = appCompatImageView;
        this.f9438t = appCompatTextView;
        this.nr = appCompatImageView2;
        this.f9436O = linearLayout2;
    }

    public static fg n(View view) {
        int i2 = 2131362483;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362483);
        if (appCompatImageView != null) {
            i2 = 2131362890;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362890);
            if (appCompatTextView != null) {
                i2 = 2131363090;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363090);
                if (appCompatImageView2 != null) {
                    i2 = 2131363914;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131363914);
                    if (linearLayout != null) {
                        return new fg((LinearLayout) view, appCompatImageView, appCompatTextView, appCompatImageView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static fg t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558536, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
