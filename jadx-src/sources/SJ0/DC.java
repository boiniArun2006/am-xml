package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.ResolutionDropdown;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DC implements ViewBinding {
    public final View HI;
    public final ImageView J2;
    public final AppCompatImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9113O;
    public final AppCompatImageView Uo;
    public final ConstraintLayout az;
    public final ResolutionDropdown gh;
    public final ConstraintLayout mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9114n;
    public final ImageView nr;
    public final ImageView qie;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9115t;
    public final LinearLayout ty;
    public final TextView xMQ;

    public static DC n(View view) {
        int i2 = 2131362563;
        View viewN = ViewBindings.n(view, 2131362563);
        if (viewN != null) {
            i2 = 2131362772;
            TextView textView = (TextView) ViewBindings.n(view, 2131362772);
            if (textView != null) {
                i2 = 2131362773;
                ImageView imageView = (ImageView) ViewBindings.n(view, 2131362773);
                if (imageView != null) {
                    i2 = 2131362774;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131362774);
                    if (textView2 != null) {
                        i2 = 2131362981;
                        ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362981);
                        if (imageView2 != null) {
                            i2 = 2131363191;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                            if (appCompatImageView != null) {
                                i2 = 2131363192;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363192);
                                if (appCompatImageView2 != null) {
                                    i2 = 2131363289;
                                    TextView textView3 = (TextView) ViewBindings.n(view, 2131363289);
                                    if (textView3 != null) {
                                        i2 = 2131363508;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131363508);
                                        if (constraintLayout != null) {
                                            i2 = 2131363540;
                                            ResolutionDropdown resolutionDropdown = (ResolutionDropdown) ViewBindings.n(view, 2131363540);
                                            if (resolutionDropdown != null) {
                                                i2 = 2131363558;
                                                ImageView imageView3 = (ImageView) ViewBindings.n(view, 2131363558);
                                                if (imageView3 != null) {
                                                    i2 = 2131363637;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.n(view, 2131363637);
                                                    if (constraintLayout2 != null) {
                                                        i2 = 2131363866;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131363866);
                                                        if (linearLayout != null) {
                                                            i2 = 2131364035;
                                                            View viewN2 = ViewBindings.n(view, 2131364035);
                                                            if (viewN2 != null) {
                                                                return new DC((ConstraintLayout) view, viewN, textView, imageView, textView2, imageView2, appCompatImageView, appCompatImageView2, textView3, constraintLayout, resolutionDropdown, imageView3, constraintLayout2, linearLayout, viewN2);
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
        return this.f9114n;
    }

    private DC(ConstraintLayout constraintLayout, View view, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView3, ConstraintLayout constraintLayout2, ResolutionDropdown resolutionDropdown, ImageView imageView3, ConstraintLayout constraintLayout3, LinearLayout linearLayout, View view2) {
        this.f9114n = constraintLayout;
        this.rl = view;
        this.f9115t = textView;
        this.nr = imageView;
        this.f9113O = textView2;
        this.J2 = imageView2;
        this.Uo = appCompatImageView;
        this.KN = appCompatImageView2;
        this.xMQ = textView3;
        this.mUb = constraintLayout2;
        this.gh = resolutionDropdown;
        this.qie = imageView3;
        this.az = constraintLayout3;
        this.ty = linearLayout;
        this.HI = view2;
    }

    public static DC t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558581, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
