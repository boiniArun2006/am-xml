package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Sw implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9331n;
    public final AppCompatTextView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9332t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9331n;
    }

    private Sw(ConstraintLayout constraintLayout, View view, TextView textView, AppCompatTextView appCompatTextView) {
        this.f9331n = constraintLayout;
        this.rl = view;
        this.f9332t = textView;
        this.nr = appCompatTextView;
    }

    public static Sw n(View view) {
        int i2 = 2131363050;
        View viewN = ViewBindings.n(view, 2131363050);
        if (viewN != null) {
            i2 = 2131363978;
            TextView textView = (TextView) ViewBindings.n(view, 2131363978);
            if (textView != null) {
                i2 = 2131363979;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363979);
                if (appCompatTextView != null) {
                    return new Sw((ConstraintLayout) view, viewN, textView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Sw t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558715, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
