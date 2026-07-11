package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class W implements ViewBinding {
    public final AppCompatTextView J2;
    public final AppCompatImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9377O;
    public final AppCompatImageView Uo;
    public final View gh;
    public final AppCompatTextView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9378n;
    public final ImageView nr;
    public final Barrier rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9379t;
    public final View xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9378n;
    }

    private W(ConstraintLayout constraintLayout, Barrier barrier, View view, ImageView imageView, ImageView imageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, AppCompatTextView appCompatTextView2, View view3) {
        this.f9378n = constraintLayout;
        this.rl = barrier;
        this.f9379t = view;
        this.nr = imageView;
        this.f9377O = imageView2;
        this.J2 = appCompatTextView;
        this.Uo = appCompatImageView;
        this.KN = appCompatImageView2;
        this.xMQ = view2;
        this.mUb = appCompatTextView2;
        this.gh = view3;
    }

    public static W n(View view) {
        int i2 = 2131362145;
        Barrier barrier = (Barrier) ViewBindings.n(view, 2131362145);
        if (barrier != null) {
            i2 = 2131362554;
            View viewN = ViewBindings.n(view, 2131362554);
            if (viewN != null) {
                i2 = 2131362687;
                ImageView imageView = (ImageView) ViewBindings.n(view, 2131362687);
                if (imageView != null) {
                    i2 = 2131362984;
                    ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362984);
                    if (imageView2 != null) {
                        i2 = 2131363065;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363065);
                        if (appCompatTextView != null) {
                            i2 = 2131363191;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                            if (appCompatImageView != null) {
                                i2 = 2131363192;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363192);
                                if (appCompatImageView2 != null) {
                                    i2 = 2131363635;
                                    View viewN2 = ViewBindings.n(view, 2131363635);
                                    if (viewN2 != null) {
                                        i2 = 2131363780;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363780);
                                        if (appCompatTextView2 != null) {
                                            i2 = 2131363830;
                                            View viewN3 = ViewBindings.n(view, 2131363830);
                                            if (viewN3 != null) {
                                                return new W((ConstraintLayout) view, barrier, viewN, imageView, imageView2, appCompatTextView, appCompatImageView, appCompatImageView2, viewN2, appCompatTextView2, viewN3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static W t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558662, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
