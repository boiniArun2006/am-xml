package SJ0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Qik implements ViewBinding {
    public final FrameLayout HI;
    public final FrameLayout Ik;
    public final Guideline J2;
    public final ImageButton KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Guideline f9286O;
    public final ListView Uo;
    public final ImageButton az;
    public final FrameLayout ck;
    public final ImageButton gh;
    public final ImageButton mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9287n;
    public final ImageButton nr;
    public final ImageButton qie;
    public final FrameLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9288t;
    public final ListView ty;
    public final ImageButton xMQ;

    public static Qik n(View view) {
        int i2 = 2131362063;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131362063);
        if (frameLayout != null) {
            i2 = 2131362132;
            ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362132);
            if (imageButton != null) {
                i2 = 2131362590;
                ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362590);
                if (imageButton2 != null) {
                    i2 = 2131362902;
                    Guideline guideline = (Guideline) ViewBindings.n(view, 2131362902);
                    if (guideline != null) {
                        i2 = 2131362903;
                        Guideline guideline2 = (Guideline) ViewBindings.n(view, 2131362903);
                        if (guideline2 != null) {
                            i2 = 2131363254;
                            ListView listView = (ListView) ViewBindings.n(view, 2131363254);
                            if (listView != null) {
                                i2 = 2131363362;
                                ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363362);
                                if (imageButton3 != null) {
                                    i2 = 2131363661;
                                    ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131363661);
                                    if (imageButton4 != null) {
                                        i2 = 2131363662;
                                        ImageButton imageButton5 = (ImageButton) ViewBindings.n(view, 2131363662);
                                        if (imageButton5 != null) {
                                            i2 = 2131363663;
                                            ImageButton imageButton6 = (ImageButton) ViewBindings.n(view, 2131363663);
                                            if (imageButton6 != null) {
                                                i2 = 2131363664;
                                                ImageButton imageButton7 = (ImageButton) ViewBindings.n(view, 2131363664);
                                                if (imageButton7 != null) {
                                                    i2 = 2131363665;
                                                    ImageButton imageButton8 = (ImageButton) ViewBindings.n(view, 2131363665);
                                                    if (imageButton8 != null) {
                                                        i2 = 2131363694;
                                                        ListView listView2 = (ListView) ViewBindings.n(view, 2131363694);
                                                        if (listView2 != null) {
                                                            i2 = 2131363695;
                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.n(view, 2131363695);
                                                            if (frameLayout2 != null) {
                                                                i2 = 2131363696;
                                                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.n(view, 2131363696);
                                                                if (frameLayout3 != null) {
                                                                    i2 = 2131363799;
                                                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.n(view, 2131363799);
                                                                    if (frameLayout4 != null) {
                                                                        return new Qik((ConstraintLayout) view, frameLayout, imageButton, imageButton2, guideline, guideline2, listView, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, imageButton8, listView2, frameLayout2, frameLayout3, frameLayout4);
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
        return this.f9287n;
    }

    private Qik(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageButton imageButton, ImageButton imageButton2, Guideline guideline, Guideline guideline2, ListView listView, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, ImageButton imageButton7, ImageButton imageButton8, ListView listView2, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.f9287n = constraintLayout;
        this.rl = frameLayout;
        this.f9288t = imageButton;
        this.nr = imageButton2;
        this.f9286O = guideline;
        this.J2 = guideline2;
        this.Uo = listView;
        this.KN = imageButton3;
        this.xMQ = imageButton4;
        this.mUb = imageButton5;
        this.gh = imageButton6;
        this.qie = imageButton7;
        this.az = imageButton8;
        this.ty = listView2;
        this.HI = frameLayout2;
        this.ck = frameLayout3;
        this.Ik = frameLayout4;
    }
}
