package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DT implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9116n;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9117t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9116n;
    }

    private DT(ConstraintLayout constraintLayout, TextView textView, AppCompatTextView appCompatTextView) {
        this.f9116n = constraintLayout;
        this.rl = textView;
        this.f9117t = appCompatTextView;
    }

    public static DT n(View view) {
        int i2 = 2131363978;
        TextView textView = (TextView) ViewBindings.n(view, 2131363978);
        if (textView != null) {
            i2 = 2131363979;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363979);
            if (appCompatTextView != null) {
                return new DT((ConstraintLayout) view, textView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static DT t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558714, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
