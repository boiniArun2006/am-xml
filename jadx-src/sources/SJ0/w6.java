package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.app.motion.activities.edit.GradientSlider;
import com.alightcreative.widget.HueRingView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements ViewBinding {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final GradientSlider f9661E;
    public final LinearLayout E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public final TextView f9662FX;
    public final TextView HI;
    public final TextView Ik;
    public final ImageButton J2;
    public final LinearLayout KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ConstraintLayout f9663M;
    public final RelativeLayout M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final TextView f9664N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9665O;
    public final Guideline P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final RelativeLayout f9666S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final TextView f9667T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Guideline f9668U;
    public final RelativeLayout Uo;
    public final GradientSlider ViF;
    public final ConstraintLayout WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final TextView f9669X;
    public final ImageView XQ;
    public final LinearLayout Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final RelativeLayout f9670Z;
    public final HueRingView aYN;
    public final ImageView az;
    public final TextView bzg;
    public final TextView ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f9671e;
    public final View eF;
    public final GradientSlider fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GradientSlider f9672g;
    public final Guideline gh;
    public final GradientSlider iF;
    public final View jB;
    public final Guideline mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RelativeLayout f9673n;
    public final TextView nHg;
    public final GradientSlider nY;
    public final ImageButton nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RecyclerView f9674o;
    public final ImageView p5;
    public final ImageView qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f9675r;
    public final CardView rV9;
    public final ImageButton rl;
    public final TextView s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardView f9676t;
    public final GradientSlider te;
    public final ImageView ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f9677v;
    public final TextView wTp;
    public final View xMQ;

    private w6(RelativeLayout relativeLayout, ImageButton imageButton, CardView cardView, ImageButton imageButton2, TextView textView, ImageButton imageButton3, RelativeLayout relativeLayout2, LinearLayout linearLayout, View view, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView2, TextView textView3, TextView textView4, View view2, RecyclerView recyclerView, RelativeLayout relativeLayout3, ImageView imageView4, RelativeLayout relativeLayout4, ConstraintLayout constraintLayout, HueRingView hueRingView, GradientSlider gradientSlider, GradientSlider gradientSlider2, GradientSlider gradientSlider3, GradientSlider gradientSlider4, GradientSlider gradientSlider5, GradientSlider gradientSlider6, LinearLayout linearLayout2, ImageView imageView5, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, ImageView imageView6, CardView cardView2, TextView textView11, LinearLayout linearLayout3, View view3, Guideline guideline3, Guideline guideline4, RelativeLayout relativeLayout5, ImageView imageView7, View view4, GradientSlider gradientSlider7, ConstraintLayout constraintLayout2, TextView textView12) {
        this.f9673n = relativeLayout;
        this.rl = imageButton;
        this.f9676t = cardView;
        this.nr = imageButton2;
        this.f9665O = textView;
        this.J2 = imageButton3;
        this.Uo = relativeLayout2;
        this.KN = linearLayout;
        this.xMQ = view;
        this.mUb = guideline;
        this.gh = guideline2;
        this.qie = imageView;
        this.az = imageView2;
        this.ty = imageView3;
        this.HI = textView2;
        this.ck = textView3;
        this.Ik = textView4;
        this.f9675r = view2;
        this.f9674o = recyclerView;
        this.f9670Z = relativeLayout3;
        this.XQ = imageView4;
        this.f9666S = relativeLayout4;
        this.WPU = constraintLayout;
        this.aYN = hueRingView;
        this.ViF = gradientSlider;
        this.nY = gradientSlider2;
        this.f9672g = gradientSlider3;
        this.te = gradientSlider4;
        this.iF = gradientSlider5;
        this.fD = gradientSlider6;
        this.E2 = linearLayout2;
        this.f9671e = imageView5;
        this.f9669X = textView5;
        this.f9667T = textView6;
        this.f9664N = textView7;
        this.nHg = textView8;
        this.s7N = textView9;
        this.wTp = textView10;
        this.f9677v = imageView6;
        this.rV9 = cardView2;
        this.bzg = textView11;
        this.Xw = linearLayout3;
        this.jB = view3;
        this.f9668U = guideline3;
        this.P5 = guideline4;
        this.M7 = relativeLayout5;
        this.p5 = imageView7;
        this.eF = view4;
        this.f9661E = gradientSlider7;
        this.f9663M = constraintLayout2;
        this.f9662FX = textView12;
    }

    public static w6 t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static w6 n(View view) {
        int i2 = 2131362374;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362374);
        if (imageButton != null) {
            i2 = 2131362392;
            CardView cardView = (CardView) ViewBindings.n(view, 2131362392);
            if (cardView != null) {
                i2 = 2131362400;
                ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362400);
                if (imageButton2 != null) {
                    i2 = 2131362403;
                    TextView textView = (TextView) ViewBindings.n(view, 2131362403);
                    if (textView != null) {
                        i2 = 2131362408;
                        ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131362408);
                        if (imageButton3 != null) {
                            i2 = 2131362409;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.n(view, 2131362409);
                            if (relativeLayout != null) {
                                i2 = 2131362410;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362410);
                                if (linearLayout != null) {
                                    i2 = 2131362486;
                                    View viewN = ViewBindings.n(view, 2131362486);
                                    if (viewN != null) {
                                        i2 = 2131362904;
                                        Guideline guideline = (Guideline) ViewBindings.n(view, 2131362904);
                                        if (guideline != null) {
                                            i2 = 2131362905;
                                            Guideline guideline2 = (Guideline) ViewBindings.n(view, 2131362905);
                                            if (guideline2 != null) {
                                                i2 = 2131362979;
                                                ImageView imageView = (ImageView) ViewBindings.n(view, 2131362979);
                                                if (imageView != null) {
                                                    i2 = 2131362980;
                                                    ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362980);
                                                    if (imageView2 != null) {
                                                        i2 = 2131363066;
                                                        ImageView imageView3 = (ImageView) ViewBindings.n(view, 2131363066);
                                                        if (imageView3 != null) {
                                                            i2 = 2131363067;
                                                            TextView textView2 = (TextView) ViewBindings.n(view, 2131363067);
                                                            if (textView2 != null) {
                                                                i2 = 2131363068;
                                                                TextView textView3 = (TextView) ViewBindings.n(view, 2131363068);
                                                                if (textView3 != null) {
                                                                    i2 = 2131363070;
                                                                    TextView textView4 = (TextView) ViewBindings.n(view, 2131363070);
                                                                    if (textView4 != null) {
                                                                        i2 = 2131363300;
                                                                        View viewN2 = ViewBindings.n(view, 2131363300);
                                                                        if (viewN2 != null) {
                                                                            i2 = 2131363524;
                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363524);
                                                                            if (recyclerView != null) {
                                                                                i2 = 2131363525;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.n(view, 2131363525);
                                                                                if (relativeLayout2 != null) {
                                                                                    i2 = 2131363554;
                                                                                    ImageView imageView4 = (ImageView) ViewBindings.n(view, 2131363554);
                                                                                    if (imageView4 != null) {
                                                                                        i2 = 2131363555;
                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.n(view, 2131363555);
                                                                                        if (relativeLayout3 != null) {
                                                                                            i2 = 2131363556;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131363556);
                                                                                            if (constraintLayout != null) {
                                                                                                i2 = 2131363566;
                                                                                                HueRingView hueRingView = (HueRingView) ViewBindings.n(view, 2131363566);
                                                                                                if (hueRingView != null) {
                                                                                                    i2 = 2131363716;
                                                                                                    GradientSlider gradientSlider = (GradientSlider) ViewBindings.n(view, 2131363716);
                                                                                                    if (gradientSlider != null) {
                                                                                                        i2 = 2131363717;
                                                                                                        GradientSlider gradientSlider2 = (GradientSlider) ViewBindings.n(view, 2131363717);
                                                                                                        if (gradientSlider2 != null) {
                                                                                                            i2 = 2131363718;
                                                                                                            GradientSlider gradientSlider3 = (GradientSlider) ViewBindings.n(view, 2131363718);
                                                                                                            if (gradientSlider3 != null) {
                                                                                                                i2 = 2131363719;
                                                                                                                GradientSlider gradientSlider4 = (GradientSlider) ViewBindings.n(view, 2131363719);
                                                                                                                if (gradientSlider4 != null) {
                                                                                                                    i2 = 2131363720;
                                                                                                                    GradientSlider gradientSlider5 = (GradientSlider) ViewBindings.n(view, 2131363720);
                                                                                                                    if (gradientSlider5 != null) {
                                                                                                                        i2 = 2131363721;
                                                                                                                        GradientSlider gradientSlider6 = (GradientSlider) ViewBindings.n(view, 2131363721);
                                                                                                                        if (gradientSlider6 != null) {
                                                                                                                            i2 = 2131363815;
                                                                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131363815);
                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                i2 = 2131363951;
                                                                                                                                ImageView imageView5 = (ImageView) ViewBindings.n(view, 2131363951);
                                                                                                                                if (imageView5 != null) {
                                                                                                                                    i2 = 2131364010;
                                                                                                                                    TextView textView5 = (TextView) ViewBindings.n(view, 2131364010);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        i2 = 2131364011;
                                                                                                                                        TextView textView6 = (TextView) ViewBindings.n(view, 2131364011);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            i2 = 2131364012;
                                                                                                                                            TextView textView7 = (TextView) ViewBindings.n(view, 2131364012);
                                                                                                                                            if (textView7 != null) {
                                                                                                                                                i2 = 2131364013;
                                                                                                                                                TextView textView8 = (TextView) ViewBindings.n(view, 2131364013);
                                                                                                                                                if (textView8 != null) {
                                                                                                                                                    i2 = 2131364015;
                                                                                                                                                    TextView textView9 = (TextView) ViewBindings.n(view, 2131364015);
                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                        i2 = 2131364016;
                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.n(view, 2131364016);
                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                            i2 = 2131364056;
                                                                                                                                                            ImageView imageView6 = (ImageView) ViewBindings.n(view, 2131364056);
                                                                                                                                                            if (imageView6 != null) {
                                                                                                                                                                i2 = 2131364057;
                                                                                                                                                                CardView cardView2 = (CardView) ViewBindings.n(view, 2131364057);
                                                                                                                                                                if (cardView2 != null) {
                                                                                                                                                                    i2 = 2131364058;
                                                                                                                                                                    TextView textView11 = (TextView) ViewBindings.n(view, 2131364058);
                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                        i2 = 2131364059;
                                                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.n(view, 2131364059);
                                                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                                                            i2 = 2131364060;
                                                                                                                                                                            View viewN3 = ViewBindings.n(view, 2131364060);
                                                                                                                                                                            if (viewN3 != null) {
                                                                                                                                                                                i2 = 2131364061;
                                                                                                                                                                                Guideline guideline3 = (Guideline) ViewBindings.n(view, 2131364061);
                                                                                                                                                                                if (guideline3 != null) {
                                                                                                                                                                                    i2 = 2131364062;
                                                                                                                                                                                    Guideline guideline4 = (Guideline) ViewBindings.n(view, 2131364062);
                                                                                                                                                                                    if (guideline4 != null) {
                                                                                                                                                                                        i2 = 2131364063;
                                                                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.n(view, 2131364063);
                                                                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                                                                            i2 = 2131364064;
                                                                                                                                                                                            ImageView imageView7 = (ImageView) ViewBindings.n(view, 2131364064);
                                                                                                                                                                                            if (imageView7 != null) {
                                                                                                                                                                                                i2 = 2131364065;
                                                                                                                                                                                                View viewN4 = ViewBindings.n(view, 2131364065);
                                                                                                                                                                                                if (viewN4 != null) {
                                                                                                                                                                                                    i2 = 2131364066;
                                                                                                                                                                                                    GradientSlider gradientSlider7 = (GradientSlider) ViewBindings.n(view, 2131364066);
                                                                                                                                                                                                    if (gradientSlider7 != null) {
                                                                                                                                                                                                        i2 = 2131364067;
                                                                                                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.n(view, 2131364067);
                                                                                                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                                                                                                            i2 = 2131364068;
                                                                                                                                                                                                            TextView textView12 = (TextView) ViewBindings.n(view, 2131364068);
                                                                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                                                                return new w6((RelativeLayout) view, imageButton, cardView, imageButton2, textView, imageButton3, relativeLayout, linearLayout, viewN, guideline, guideline2, imageView, imageView2, imageView3, textView2, textView3, textView4, viewN2, recyclerView, relativeLayout2, imageView4, relativeLayout3, constraintLayout, hueRingView, gradientSlider, gradientSlider2, gradientSlider3, gradientSlider4, gradientSlider5, gradientSlider6, linearLayout2, imageView5, textView5, textView6, textView7, textView8, textView9, textView10, imageView6, cardView2, textView11, linearLayout3, viewN3, guideline3, guideline4, relativeLayout4, imageView7, viewN4, gradientSlider7, constraintLayout2, textView12);
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
    public RelativeLayout getRoot() {
        return this.f9673n;
    }

    public static w6 nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558430, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
