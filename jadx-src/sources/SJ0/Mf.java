package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Mf implements ViewBinding {
    public final FrameLayout J2;
    public final View KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final FrameLayout f9225O;
    public final ConstraintLayout Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9226n;
    public final AppCompatImageButton nr;
    public final AppCompatImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9227t;
    public final AppCompatImageButton xMQ;

    public static Mf t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9226n;
    }

    private Mf(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, TextView textView, AppCompatImageButton appCompatImageButton2, FrameLayout frameLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout2, View view, AppCompatImageButton appCompatImageButton3) {
        this.f9226n = constraintLayout;
        this.rl = appCompatImageButton;
        this.f9227t = textView;
        this.nr = appCompatImageButton2;
        this.f9225O = frameLayout;
        this.J2 = frameLayout2;
        this.Uo = constraintLayout2;
        this.KN = view;
        this.xMQ = appCompatImageButton3;
    }

    public static Mf n(View view) {
        int i2 = 2131362132;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362132);
        if (appCompatImageButton != null) {
            i2 = 2131362190;
            TextView textView = (TextView) ViewBindings.n(view, 2131362190);
            if (textView != null) {
                i2 = 2131362375;
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.n(view, 2131362375);
                if (appCompatImageButton2 != null) {
                    i2 = 2131362843;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131362843);
                    if (frameLayout != null) {
                        i2 = 2131362844;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.n(view, 2131362844);
                        if (frameLayout2 != null) {
                            i2 = 2131362907;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362907);
                            if (constraintLayout != null) {
                                i2 = 2131362911;
                                View viewN = ViewBindings.n(view, 2131362911);
                                if (viewN != null) {
                                    i2 = 2131363609;
                                    AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) ViewBindings.n(view, 2131363609);
                                    if (appCompatImageButton3 != null) {
                                        return new Mf((ConstraintLayout) view, appCompatImageButton, textView, appCompatImageButton2, frameLayout, frameLayout2, constraintLayout, viewN, appCompatImageButton3);
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

    public static Mf nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558539, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
