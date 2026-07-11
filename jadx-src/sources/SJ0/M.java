package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class M implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9202n;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9203t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9202n;
    }

    private M(ConstraintLayout constraintLayout, ImageView imageView, View view) {
        this.f9202n = constraintLayout;
        this.rl = imageView;
        this.f9203t = view;
    }

    public static M n(View view) {
        int i2 = 2131363034;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131363034);
        if (imageView != null) {
            i2 = 2131363641;
            View viewN = ViewBindings.n(view, 2131363641);
            if (viewN != null) {
                return new M((ConstraintLayout) view, imageView, viewN);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static M t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558478, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
