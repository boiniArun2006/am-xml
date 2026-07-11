package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class lej implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9521n;
    public final AppCompatTextView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9522t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9521n;
    }

    private lej(ConstraintLayout constraintLayout, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f9521n = constraintLayout;
        this.rl = view;
        this.f9522t = appCompatTextView;
        this.nr = appCompatTextView2;
    }

    public static lej n(View view) {
        int i2 = 2131362560;
        View viewN = ViewBindings.n(view, 2131362560);
        if (viewN != null) {
            i2 = 2131362580;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362580);
            if (appCompatTextView != null) {
                i2 = 2131362581;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131362581);
                if (appCompatTextView2 != null) {
                    return new lej((ConstraintLayout) view, viewN, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static lej t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558475, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
