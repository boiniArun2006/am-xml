package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class V1 implements ViewBinding {
    public final ProgressBar J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9372O;
    public final AppCompatTextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RelativeLayout f9373n;
    public final AppCompatTextView nr;
    public final AppCompatButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9374t;

    public static V1 t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f9373n;
    }

    private V1(RelativeLayout relativeLayout, AppCompatButton appCompatButton, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ProgressBar progressBar, AppCompatTextView appCompatTextView3) {
        this.f9373n = relativeLayout;
        this.rl = appCompatButton;
        this.f9374t = linearLayout;
        this.nr = appCompatTextView;
        this.f9372O = appCompatTextView2;
        this.J2 = progressBar;
        this.Uo = appCompatTextView3;
    }

    public static V1 n(View view) {
        int i2 = 2131362321;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.n(view, 2131362321);
        if (appCompatButton != null) {
            i2 = 2131362826;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362826);
            if (linearLayout != null) {
                i2 = 2131363092;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363092);
                if (appCompatTextView != null) {
                    i2 = 2131363388;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363388);
                    if (appCompatTextView2 != null) {
                        i2 = 2131363448;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.n(view, 2131363448);
                        if (progressBar != null) {
                            i2 = 2131363453;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131363453);
                            if (appCompatTextView3 != null) {
                                return new V1((RelativeLayout) view, appCompatButton, linearLayout, appCompatTextView, appCompatTextView2, progressBar, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static V1 nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558584, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
