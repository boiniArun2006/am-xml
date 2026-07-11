package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.ValueSpinner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class c7r implements ViewBinding {
    public final AppCompatTextView J2;
    public final ValueSpinner KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9418O;
    public final View Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9419n;
    public final AppCompatTextView nr;
    public final AppCompatTextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9420t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9419n;
    }

    private c7r(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, View view, ValueSpinner valueSpinner) {
        this.f9419n = constraintLayout;
        this.rl = appCompatTextView;
        this.f9420t = appCompatImageView;
        this.nr = appCompatTextView2;
        this.f9418O = appCompatTextView3;
        this.J2 = appCompatTextView4;
        this.Uo = view;
        this.KN = valueSpinner;
    }

    public static c7r n(View view) {
        int i2 = 2131362899;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362899);
        if (appCompatTextView != null) {
            i2 = 2131363060;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363060);
            if (appCompatImageView != null) {
                i2 = 2131363477;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363477);
                if (appCompatTextView2 != null) {
                    i2 = 2131363484;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131363484);
                    if (appCompatTextView3 != null) {
                        i2 = 2131363485;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.n(view, 2131363485);
                        if (appCompatTextView4 != null) {
                            i2 = 2131363487;
                            View viewN = ViewBindings.n(view, 2131363487);
                            if (viewN != null) {
                                i2 = 2131363492;
                                ValueSpinner valueSpinner = (ValueSpinner) ViewBindings.n(view, 2131363492);
                                if (valueSpinner != null) {
                                    return new c7r((ConstraintLayout) view, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatTextView3, appCompatTextView4, viewN, valueSpinner);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static c7r t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558559, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
