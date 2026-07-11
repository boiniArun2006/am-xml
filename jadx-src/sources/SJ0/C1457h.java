package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1457h implements ViewBinding {
    public final AppCompatButton HI;
    public final AppCompatButton Ik;
    public final LinearLayout J2;
    public final AppCompatButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatEditText f9464O;
    public final AppCompatTextView Uo;
    public final View az;
    public final AppCompatButton ck;
    public final AppCompatTextView gh;
    public final AppCompatButton mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayoutCompat f9465n;
    public final View nr;
    public final View qie;
    public final LinearLayoutCompat rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9466t;
    public final LinearLayout ty;
    public final AppCompatButton xMQ;

    public static C1457h t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static C1457h n(View view) {
        int i2 = 2131362025;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.n(view, 2131362025);
        if (linearLayoutCompat != null) {
            i2 = 2131362243;
            View viewN = ViewBindings.n(view, 2131362243);
            if (viewN != null) {
                i2 = 2131362244;
                View viewN2 = ViewBindings.n(view, 2131362244);
                if (viewN2 != null) {
                    i2 = 2131362608;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.n(view, 2131362608);
                    if (appCompatEditText != null) {
                        i2 = 2131362931;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362931);
                        if (linearLayout != null) {
                            i2 = 2131363196;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363196);
                            if (appCompatTextView != null) {
                                i2 = 2131363281;
                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.n(view, 2131363281);
                                if (appCompatButton != null) {
                                    i2 = 2131363284;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.n(view, 2131363284);
                                    if (appCompatButton2 != null) {
                                        i2 = 2131363408;
                                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.n(view, 2131363408);
                                        if (appCompatButton3 != null) {
                                            i2 = 2131363910;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363910);
                                            if (appCompatTextView2 != null) {
                                                i2 = 2131364020;
                                                View viewN3 = ViewBindings.n(view, 2131364020);
                                                if (viewN3 != null) {
                                                    i2 = 2131364021;
                                                    View viewN4 = ViewBindings.n(view, 2131364021);
                                                    if (viewN4 != null) {
                                                        i2 = 2131364022;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131364022);
                                                        if (linearLayout2 != null) {
                                                            i2 = 2131364023;
                                                            AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.n(view, 2131364023);
                                                            if (appCompatButton4 != null) {
                                                                i2 = 2131364024;
                                                                AppCompatButton appCompatButton5 = (AppCompatButton) ViewBindings.n(view, 2131364024);
                                                                if (appCompatButton5 != null) {
                                                                    i2 = 2131364025;
                                                                    AppCompatButton appCompatButton6 = (AppCompatButton) ViewBindings.n(view, 2131364025);
                                                                    if (appCompatButton6 != null) {
                                                                        return new C1457h((LinearLayoutCompat) view, linearLayoutCompat, viewN, viewN2, appCompatEditText, linearLayout, appCompatTextView, appCompatButton, appCompatButton2, appCompatButton3, appCompatTextView2, viewN3, viewN4, linearLayout2, appCompatButton4, appCompatButton5, appCompatButton6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f9465n;
    }

    private C1457h(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, View view, View view2, AppCompatEditText appCompatEditText, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatTextView appCompatTextView2, View view3, View view4, LinearLayout linearLayout2, AppCompatButton appCompatButton4, AppCompatButton appCompatButton5, AppCompatButton appCompatButton6) {
        this.f9465n = linearLayoutCompat;
        this.rl = linearLayoutCompat2;
        this.f9466t = view;
        this.nr = view2;
        this.f9464O = appCompatEditText;
        this.J2 = linearLayout;
        this.Uo = appCompatTextView;
        this.KN = appCompatButton;
        this.xMQ = appCompatButton2;
        this.mUb = appCompatButton3;
        this.gh = appCompatTextView2;
        this.qie = view3;
        this.az = view4;
        this.ty = linearLayout2;
        this.HI = appCompatButton4;
        this.ck = appCompatButton5;
        this.Ik = appCompatButton6;
    }

    public static C1457h nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558482, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
