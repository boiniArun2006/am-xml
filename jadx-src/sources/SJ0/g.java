package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayoutCompat f9444O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9445n;
    public final AppCompatTextView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9446t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9445n;
    }

    private g(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, LinearLayoutCompat linearLayoutCompat) {
        this.f9445n = constraintLayout;
        this.rl = view;
        this.f9446t = appCompatImageView;
        this.nr = appCompatTextView;
        this.f9444O = linearLayoutCompat;
    }

    public static g n(View view) {
        int i2 = 2131362564;
        View viewN = ViewBindings.n(view, 2131362564);
        if (viewN != null) {
            i2 = 2131362981;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362981);
            if (appCompatImageView != null) {
                i2 = 2131363685;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363685);
                if (appCompatTextView != null) {
                    i2 = 2131363985;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.n(view, 2131363985);
                    if (linearLayoutCompat != null) {
                        return new g((ConstraintLayout) view, viewN, appCompatImageView, appCompatTextView, linearLayoutCompat);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static g t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558824, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
