package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class D implements ViewBinding {
    public final ConstraintLayout HI;
    public final RecyclerView Ik;
    public final AppCompatImageButton J2;
    public final LinearLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageButton f9109O;
    public final AppCompatImageButton Uo;
    public final AppCompatButton az;
    public final AppCompatTextView ck;
    public final AppCompatImageButton gh;
    public final AppCompatImageButton mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9110n;
    public final AppCompatImageButton nr;
    public final AppCompatImageButton qie;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageButton f9111t;
    public final AppCompatButton ty;
    public final LinearLayout xMQ;

    public static D t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static D n(View view) {
        int i2 = 2131362132;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362132);
        if (imageButton != null) {
            i2 = 2131362223;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362223);
            if (appCompatImageButton != null) {
                i2 = 2131362225;
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.n(view, 2131362225);
                if (appCompatImageButton2 != null) {
                    i2 = 2131362234;
                    AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) ViewBindings.n(view, 2131362234);
                    if (appCompatImageButton3 != null) {
                        i2 = 2131362251;
                        AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) ViewBindings.n(view, 2131362251);
                        if (appCompatImageButton4 != null) {
                            i2 = 2131362252;
                            AppCompatImageButton appCompatImageButton5 = (AppCompatImageButton) ViewBindings.n(view, 2131362252);
                            if (appCompatImageButton5 != null) {
                                i2 = 2131362258;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362258);
                                if (linearLayout != null) {
                                    i2 = 2131362259;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131362259);
                                    if (linearLayout2 != null) {
                                        i2 = 2131362262;
                                        AppCompatImageButton appCompatImageButton6 = (AppCompatImageButton) ViewBindings.n(view, 2131362262);
                                        if (appCompatImageButton6 != null) {
                                            i2 = 2131362290;
                                            AppCompatImageButton appCompatImageButton7 = (AppCompatImageButton) ViewBindings.n(view, 2131362290);
                                            if (appCompatImageButton7 != null) {
                                                i2 = 2131362301;
                                                AppCompatImageButton appCompatImageButton8 = (AppCompatImageButton) ViewBindings.n(view, 2131362301);
                                                if (appCompatImageButton8 != null) {
                                                    i2 = 2131362321;
                                                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.n(view, 2131362321);
                                                    if (appCompatButton != null) {
                                                        i2 = 2131363379;
                                                        AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.n(view, 2131363379);
                                                        if (appCompatButton2 != null) {
                                                            i2 = 2131363380;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131363380);
                                                            if (constraintLayout != null) {
                                                                i2 = 2131363381;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363381);
                                                                if (appCompatTextView != null) {
                                                                    i2 = 2131363524;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363524);
                                                                    if (recyclerView != null) {
                                                                        return new D((ConstraintLayout) view, imageButton, appCompatImageButton, appCompatImageButton2, appCompatImageButton3, appCompatImageButton4, appCompatImageButton5, linearLayout, linearLayout2, appCompatImageButton6, appCompatImageButton7, appCompatImageButton8, appCompatButton, appCompatButton2, constraintLayout, appCompatTextView, recyclerView);
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
    public ConstraintLayout getRoot() {
        return this.f9110n;
    }

    private D(ConstraintLayout constraintLayout, ImageButton imageButton, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, AppCompatImageButton appCompatImageButton3, AppCompatImageButton appCompatImageButton4, AppCompatImageButton appCompatImageButton5, LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageButton appCompatImageButton6, AppCompatImageButton appCompatImageButton7, AppCompatImageButton appCompatImageButton8, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, RecyclerView recyclerView) {
        this.f9110n = constraintLayout;
        this.rl = imageButton;
        this.f9111t = appCompatImageButton;
        this.nr = appCompatImageButton2;
        this.f9109O = appCompatImageButton3;
        this.J2 = appCompatImageButton4;
        this.Uo = appCompatImageButton5;
        this.KN = linearLayout;
        this.xMQ = linearLayout2;
        this.mUb = appCompatImageButton6;
        this.gh = appCompatImageButton7;
        this.qie = appCompatImageButton8;
        this.az = appCompatButton;
        this.ty = appCompatButton2;
        this.HI = constraintLayout2;
        this.ck = appCompatTextView;
        this.Ik = recyclerView;
    }

    public static D nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558661, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
