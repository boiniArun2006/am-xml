package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class afx implements ViewBinding {
    public final AppCompatImageView HI;
    public final AppCompatTextView J2;
    public final ContentLoadingProgressBar KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9410O;
    public final AppCompatTextView Uo;
    public final AppCompatTextView az;
    public final AppCompatTextView ck;
    public final ImageView gh;
    public final View mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9411n;
    public final AppCompatButton nr;
    public final LinearLayoutCompat qie;
    public final AppCompatButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9412t;
    public final LinearLayoutCompat ty;
    public final FrameLayout xMQ;

    public static afx t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static afx n(View view) {
        int i2 = 2131362321;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.n(view, 2131362321);
        if (appCompatButton != null) {
            i2 = 2131362515;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362515);
            if (appCompatTextView != null) {
                i2 = 2131362516;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.n(view, 2131362516);
                if (appCompatButton2 != null) {
                    i2 = 2131362517;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131362517);
                    if (appCompatTextView2 != null) {
                        i2 = 2131362518;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131362518);
                        if (appCompatTextView3 != null) {
                            i2 = 2131362519;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.n(view, 2131362519);
                            if (appCompatTextView4 != null) {
                                i2 = 2131363448;
                                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) ViewBindings.n(view, 2131363448);
                                if (contentLoadingProgressBar != null) {
                                    i2 = 2131363452;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131363452);
                                    if (frameLayout != null) {
                                        i2 = 2131363912;
                                        View viewN = ViewBindings.n(view, 2131363912);
                                        if (viewN != null) {
                                            i2 = 2131364073;
                                            ImageView imageView = (ImageView) ViewBindings.n(view, 2131364073);
                                            if (imageView != null) {
                                                i2 = 2131364074;
                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.n(view, 2131364074);
                                                if (linearLayoutCompat != null) {
                                                    i2 = 2131364075;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.n(view, 2131364075);
                                                    if (appCompatTextView5 != null) {
                                                        i2 = 2131364076;
                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.n(view, 2131364076);
                                                        if (linearLayoutCompat2 != null) {
                                                            i2 = 2131364077;
                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131364077);
                                                            if (appCompatImageView != null) {
                                                                i2 = 2131364078;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.n(view, 2131364078);
                                                                if (appCompatTextView6 != null) {
                                                                    return new afx((ConstraintLayout) view, appCompatButton, appCompatTextView, appCompatButton2, appCompatTextView2, appCompatTextView3, appCompatTextView4, contentLoadingProgressBar, frameLayout, viewN, imageView, linearLayoutCompat, appCompatTextView5, linearLayoutCompat2, appCompatImageView, appCompatTextView6);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9411n;
    }

    private afx(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ContentLoadingProgressBar contentLoadingProgressBar, FrameLayout frameLayout, View view, ImageView imageView, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView5, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView6) {
        this.f9411n = constraintLayout;
        this.rl = appCompatButton;
        this.f9412t = appCompatTextView;
        this.nr = appCompatButton2;
        this.f9410O = appCompatTextView2;
        this.J2 = appCompatTextView3;
        this.Uo = appCompatTextView4;
        this.KN = contentLoadingProgressBar;
        this.xMQ = frameLayout;
        this.mUb = view;
        this.gh = imageView;
        this.qie = linearLayoutCompat;
        this.az = appCompatTextView5;
        this.ty = linearLayoutCompat2;
        this.HI = appCompatImageView;
        this.ck = appCompatTextView6;
    }

    public static afx nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558465, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
