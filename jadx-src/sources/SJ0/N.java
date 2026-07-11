package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.widgets.OutlineScrollerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class N implements ViewBinding {
    public final View HI;
    public final ImageButton Ik;
    public final TextView J2;
    public final ImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9238O;
    public final ImageView Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final TextView f9239Z;
    public final Guideline az;
    public final AppCompatImageButton ck;
    public final ImageButton gh;
    public final ImageView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9240n;
    public final ImageButton nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AppCompatImageButton f9241o;
    public final Guideline qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OutlineScrollerView f9242r;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9243t;
    public final ImageButton ty;
    public final ImageView xMQ;

    public static N n(View view) {
        int i2 = 2131362022;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362022);
        if (imageButton != null) {
            i2 = 2131362132;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362132);
            if (imageButton2 != null) {
                i2 = 2131362214;
                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131362214);
                if (imageButton3 != null) {
                    i2 = 2131362239;
                    ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131362239);
                    if (imageButton4 != null) {
                        i2 = 2131362447;
                        TextView textView = (TextView) ViewBindings.n(view, 2131362447);
                        if (textView != null) {
                            i2 = 2131362458;
                            ImageView imageView = (ImageView) ViewBindings.n(view, 2131362458);
                            if (imageView != null) {
                                i2 = 2131362459;
                                ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362459);
                                if (imageView2 != null) {
                                    i2 = 2131362460;
                                    ImageView imageView3 = (ImageView) ViewBindings.n(view, 2131362460);
                                    if (imageView3 != null) {
                                        i2 = 2131362461;
                                        ImageView imageView4 = (ImageView) ViewBindings.n(view, 2131362461);
                                        if (imageView4 != null) {
                                            i2 = 2131362604;
                                            ImageButton imageButton5 = (ImageButton) ViewBindings.n(view, 2131362604);
                                            if (imageButton5 != null) {
                                                i2 = 2131362902;
                                                Guideline guideline = (Guideline) ViewBindings.n(view, 2131362902);
                                                if (guideline != null) {
                                                    i2 = 2131362903;
                                                    Guideline guideline2 = (Guideline) ViewBindings.n(view, 2131362903);
                                                    if (guideline2 != null) {
                                                        i2 = 2131363064;
                                                        ImageButton imageButton6 = (ImageButton) ViewBindings.n(view, 2131363064);
                                                        if (imageButton6 != null) {
                                                            i2 = 2131363219;
                                                            View viewN = ViewBindings.n(view, 2131363219);
                                                            if (viewN != null) {
                                                                i2 = 2131363303;
                                                                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131363303);
                                                                if (appCompatImageButton != null) {
                                                                    i2 = 2131363339;
                                                                    ImageButton imageButton7 = (ImageButton) ViewBindings.n(view, 2131363339);
                                                                    if (imageButton7 != null) {
                                                                        i2 = 2131363360;
                                                                        OutlineScrollerView outlineScrollerView = (OutlineScrollerView) ViewBindings.n(view, 2131363360);
                                                                        if (outlineScrollerView != null) {
                                                                            i2 = 2131363429;
                                                                            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.n(view, 2131363429);
                                                                            if (appCompatImageButton2 != null) {
                                                                                i2 = 2131363937;
                                                                                TextView textView2 = (TextView) ViewBindings.n(view, 2131363937);
                                                                                if (textView2 != null) {
                                                                                    return new N((ConstraintLayout) view, imageButton, imageButton2, imageButton3, imageButton4, textView, imageView, imageView2, imageView3, imageView4, imageButton5, guideline, guideline2, imageButton6, viewN, appCompatImageButton, imageButton7, outlineScrollerView, appCompatImageButton2, textView2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9240n;
    }

    private N(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageButton imageButton5, Guideline guideline, Guideline guideline2, ImageButton imageButton6, View view, AppCompatImageButton appCompatImageButton, ImageButton imageButton7, OutlineScrollerView outlineScrollerView, AppCompatImageButton appCompatImageButton2, TextView textView2) {
        this.f9240n = constraintLayout;
        this.rl = imageButton;
        this.f9243t = imageButton2;
        this.nr = imageButton3;
        this.f9238O = imageButton4;
        this.J2 = textView;
        this.Uo = imageView;
        this.KN = imageView2;
        this.xMQ = imageView3;
        this.mUb = imageView4;
        this.gh = imageButton5;
        this.qie = guideline;
        this.az = guideline2;
        this.ty = imageButton6;
        this.HI = view;
        this.ck = appCompatImageButton;
        this.Ik = imageButton7;
        this.f9242r = outlineScrollerView;
        this.f9241o = appCompatImageButton2;
        this.f9239Z = textView2;
    }

    public static N t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558595, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
