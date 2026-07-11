package SJ0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class O implements ViewBinding {
    public final ImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9244O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9245n;
    public final TextView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9246t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9245n;
    }

    private O(ConstraintLayout constraintLayout, View view, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3) {
        this.f9245n = constraintLayout;
        this.rl = view;
        this.f9246t = imageView;
        this.nr = textView;
        this.f9244O = imageView2;
        this.J2 = imageView3;
    }

    public static O n(View view) {
        int i2 = 2131362560;
        View viewN = ViewBindings.n(view, 2131362560);
        if (viewN != null) {
            i2 = 2131362981;
            ImageView imageView = (ImageView) ViewBindings.n(view, 2131362981);
            if (imageView != null) {
                i2 = 2131363065;
                TextView textView = (TextView) ViewBindings.n(view, 2131363065);
                if (textView != null) {
                    i2 = 2131363191;
                    ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131363191);
                    if (imageView2 != null) {
                        i2 = 2131363192;
                        ImageView imageView3 = (ImageView) ViewBindings.n(view, 2131363192);
                        if (imageView3 != null) {
                            return new O((ConstraintLayout) view, viewN, imageView, textView, imageView2, imageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
