package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Lc implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9195O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9196n;
    public final AppCompatImageView nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9197t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9196n;
    }

    private Lc(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, AppCompatImageView appCompatImageView, ImageButton imageButton3) {
        this.f9196n = constraintLayout;
        this.rl = imageButton;
        this.f9197t = imageButton2;
        this.nr = appCompatImageView;
        this.f9195O = imageButton3;
    }

    public static Lc n(View view) {
        int i2 = 2131362453;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362453);
        if (imageButton != null) {
            i2 = 2131362566;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362566);
            if (imageButton2 != null) {
                i2 = 2131363463;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363463);
                if (appCompatImageView != null) {
                    i2 = 2131363673;
                    ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363673);
                    if (imageButton3 != null) {
                        return new Lc((ConstraintLayout) view, imageButton, imageButton2, appCompatImageView, imageButton3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Lc t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558806, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
