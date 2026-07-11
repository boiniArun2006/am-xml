package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Xo implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9391n;
    public final ConstraintLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9392t;

    public static Xo n(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363460);
        if (appCompatImageView != null) {
            return new Xo(constraintLayout, constraintLayout, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363460)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9391n;
    }

    private Xo(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView) {
        this.f9391n = constraintLayout;
        this.rl = constraintLayout2;
        this.f9392t = appCompatImageView;
    }

    public static Xo t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558444, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
