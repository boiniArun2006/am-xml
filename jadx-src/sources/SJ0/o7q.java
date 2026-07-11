package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o7q implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9578n;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9579t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9578n;
    }

    private o7q(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.f9578n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9579t = textView;
    }

    public static o7q n(View view) {
        int i2 = 2131362335;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362335);
        if (appCompatImageView != null) {
            i2 = 2131362336;
            TextView textView = (TextView) ViewBindings.n(view, 2131362336);
            if (textView != null) {
                return new o7q((ConstraintLayout) view, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static o7q t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558540, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
