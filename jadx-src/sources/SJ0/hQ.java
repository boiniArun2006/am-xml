package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.HueDiscView;
import com.alightcreative.widget.YBiasView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class hQ implements ViewBinding {
    public final YBiasView HI;
    public final AppCompatImageView J2;
    public final AppCompatTextView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageView f9479O;
    public final AppCompatTextView Uo;
    public final AppCompatTextView az;
    public final AppCompatTextView gh;
    public final AppCompatTextView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9480n;
    public final AppCompatImageView nr;
    public final AppCompatTextView qie;
    public final HueDiscView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9481t;
    public final AppCompatTextView ty;
    public final AppCompatTextView xMQ;

    public static hQ n(View view) {
        int i2 = 2131362935;
        HueDiscView hueDiscView = (HueDiscView) ViewBindings.n(view, 2131362935);
        if (hueDiscView != null) {
            i2 = 2131363060;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363060);
            if (appCompatImageView != null) {
                i2 = 2131363061;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363061);
                if (appCompatImageView2 != null) {
                    i2 = 2131363062;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.n(view, 2131363062);
                    if (appCompatImageView3 != null) {
                        i2 = 2131363063;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.n(view, 2131363063);
                        if (appCompatImageView4 != null) {
                            i2 = 2131363477;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363477);
                            if (appCompatTextView != null) {
                                i2 = 2131363478;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363478);
                                if (appCompatTextView2 != null) {
                                    i2 = 2131363479;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131363479);
                                    if (appCompatTextView3 != null) {
                                        i2 = 2131363480;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.n(view, 2131363480);
                                        if (appCompatTextView4 != null) {
                                            i2 = 2131363484;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.n(view, 2131363484);
                                            if (appCompatTextView5 != null) {
                                                i2 = 2131363486;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.n(view, 2131363486);
                                                if (appCompatTextView6 != null) {
                                                    i2 = 2131363488;
                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.n(view, 2131363488);
                                                    if (appCompatTextView7 != null) {
                                                        i2 = 2131363489;
                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.n(view, 2131363489);
                                                        if (appCompatTextView8 != null) {
                                                            i2 = 2131364088;
                                                            YBiasView yBiasView = (YBiasView) ViewBindings.n(view, 2131364088);
                                                            if (yBiasView != null) {
                                                                return new hQ((ConstraintLayout) view, hueDiscView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, yBiasView);
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
        return this.f9480n;
    }

    private hQ(ConstraintLayout constraintLayout, HueDiscView hueDiscView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, YBiasView yBiasView) {
        this.f9480n = constraintLayout;
        this.rl = hueDiscView;
        this.f9481t = appCompatImageView;
        this.nr = appCompatImageView2;
        this.f9479O = appCompatImageView3;
        this.J2 = appCompatImageView4;
        this.Uo = appCompatTextView;
        this.KN = appCompatTextView2;
        this.xMQ = appCompatTextView3;
        this.mUb = appCompatTextView4;
        this.gh = appCompatTextView5;
        this.qie = appCompatTextView6;
        this.az = appCompatTextView7;
        this.ty = appCompatTextView8;
        this.HI = yBiasView;
    }

    public static hQ t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558554, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
