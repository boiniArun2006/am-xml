package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl implements ViewBinding {
    public final TextView E2;
    public final ConstraintLayout HI;
    public final ImageButton Ik;
    public final PlayerView J2;
    public final LinearLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Button f9256O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final ConstraintLayout f9257S;
    public final ConstraintLayout Uo;
    public final LinearLayout ViF;
    public final RecyclerView WPU;
    public final LinearLayout XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final ImageButton f9258Z;
    public final RecyclerView aYN;
    public final TextView az;
    public final ImageButton ck;
    public final LinearLayout fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f9259g;
    public final ConstraintLayout gh;
    public final AppCompatSeekBar iF;
    public final SimpleDraweeView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9260n;
    public final AppCompatImageView nY;
    public final Barrier nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageButton f9261o;
    public final ImageView qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageButton f9262r;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9263t;
    public final TextView te;
    public final ContentLoadingProgressBar ty;
    public final TextView xMQ;

    public static Pl t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static Pl n(View view) {
        int i2 = 2131362072;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362072);
        if (appCompatImageView != null) {
            i2 = 2131362090;
            TextView textView = (TextView) ViewBindings.n(view, 2131362090);
            if (textView != null) {
                i2 = 2131362145;
                Barrier barrier = (Barrier) ViewBindings.n(view, 2131362145);
                if (barrier != null) {
                    i2 = 2131362565;
                    Button button = (Button) ViewBindings.n(view, 2131362565);
                    if (button != null) {
                        i2 = 2131362766;
                        PlayerView playerView = (PlayerView) ViewBindings.n(view, 2131362766);
                        if (playerView != null) {
                            i2 = 2131362767;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362767);
                            if (constraintLayout != null) {
                                i2 = 2131362768;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362768);
                                if (linearLayout != null) {
                                    i2 = 2131362769;
                                    TextView textView2 = (TextView) ViewBindings.n(view, 2131362769);
                                    if (textView2 != null) {
                                        i2 = 2131362865;
                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131362865);
                                        if (simpleDraweeView != null) {
                                            i2 = 2131362997;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.n(view, 2131362997);
                                            if (constraintLayout2 != null) {
                                                i2 = 2131362998;
                                                ImageView imageView = (ImageView) ViewBindings.n(view, 2131362998);
                                                if (imageView != null) {
                                                    i2 = 2131363003;
                                                    TextView textView3 = (TextView) ViewBindings.n(view, 2131363003);
                                                    if (textView3 != null) {
                                                        i2 = 2131363110;
                                                        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) ViewBindings.n(view, 2131363110);
                                                        if (contentLoadingProgressBar != null) {
                                                            i2 = 2131363111;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.n(view, 2131363111);
                                                            if (constraintLayout3 != null) {
                                                                i2 = 2131363301;
                                                                ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363301);
                                                                if (imageButton != null) {
                                                                    i2 = 2131363304;
                                                                    ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363304);
                                                                    if (imageButton2 != null) {
                                                                        i2 = 2131363398;
                                                                        ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363398);
                                                                        if (imageButton3 != null) {
                                                                            i2 = 2131363427;
                                                                            ImageButton imageButton4 = (ImageButton) ViewBindings.n(view, 2131363427);
                                                                            if (imageButton4 != null) {
                                                                                i2 = 2131363430;
                                                                                ImageButton imageButton5 = (ImageButton) ViewBindings.n(view, 2131363430);
                                                                                if (imageButton5 != null) {
                                                                                    i2 = 2131363432;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.n(view, 2131363432);
                                                                                    if (linearLayout2 != null) {
                                                                                        i2 = 2131363435;
                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.n(view, 2131363435);
                                                                                        if (constraintLayout4 != null) {
                                                                                            i2 = 2131363436;
                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363436);
                                                                                            if (recyclerView != null) {
                                                                                                i2 = 2131363437;
                                                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.n(view, 2131363437);
                                                                                                if (recyclerView2 != null) {
                                                                                                    i2 = 2131363579;
                                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.n(view, 2131363579);
                                                                                                    if (linearLayout3 != null) {
                                                                                                        i2 = 2131363580;
                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363580);
                                                                                                        if (appCompatImageView2 != null) {
                                                                                                            i2 = 2131363581;
                                                                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.n(view, 2131363581);
                                                                                                            if (progressBar != null) {
                                                                                                                i2 = 2131363582;
                                                                                                                TextView textView4 = (TextView) ViewBindings.n(view, 2131363582);
                                                                                                                if (textView4 != null) {
                                                                                                                    i2 = 2131363629;
                                                                                                                    AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ViewBindings.n(view, 2131363629);
                                                                                                                    if (appCompatSeekBar != null) {
                                                                                                                        i2 = 2131363673;
                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.n(view, 2131363673);
                                                                                                                        if (linearLayout4 != null) {
                                                                                                                            i2 = 2131363674;
                                                                                                                            TextView textView5 = (TextView) ViewBindings.n(view, 2131363674);
                                                                                                                            if (textView5 != null) {
                                                                                                                                return new Pl((ConstraintLayout) view, appCompatImageView, textView, barrier, button, playerView, constraintLayout, linearLayout, textView2, simpleDraweeView, constraintLayout2, imageView, textView3, contentLoadingProgressBar, constraintLayout3, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, linearLayout2, constraintLayout4, recyclerView, recyclerView2, linearLayout3, appCompatImageView2, progressBar, textView4, appCompatSeekBar, linearLayout4, textView5);
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
    public ConstraintLayout getRoot() {
        return this.f9260n;
    }

    private Pl(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, Barrier barrier, Button button, PlayerView playerView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, TextView textView2, SimpleDraweeView simpleDraweeView, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView3, ContentLoadingProgressBar contentLoadingProgressBar, ConstraintLayout constraintLayout4, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, LinearLayout linearLayout2, ConstraintLayout constraintLayout5, RecyclerView recyclerView, RecyclerView recyclerView2, LinearLayout linearLayout3, AppCompatImageView appCompatImageView2, ProgressBar progressBar, TextView textView4, AppCompatSeekBar appCompatSeekBar, LinearLayout linearLayout4, TextView textView5) {
        this.f9260n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9263t = textView;
        this.nr = barrier;
        this.f9256O = button;
        this.J2 = playerView;
        this.Uo = constraintLayout2;
        this.KN = linearLayout;
        this.xMQ = textView2;
        this.mUb = simpleDraweeView;
        this.gh = constraintLayout3;
        this.qie = imageView;
        this.az = textView3;
        this.ty = contentLoadingProgressBar;
        this.HI = constraintLayout4;
        this.ck = imageButton;
        this.Ik = imageButton2;
        this.f9262r = imageButton3;
        this.f9261o = imageButton4;
        this.f9258Z = imageButton5;
        this.XQ = linearLayout2;
        this.f9257S = constraintLayout5;
        this.WPU = recyclerView;
        this.aYN = recyclerView2;
        this.ViF = linearLayout3;
        this.nY = appCompatImageView2;
        this.f9259g = progressBar;
        this.te = textView4;
        this.iF = appCompatSeekBar;
        this.fD = linearLayout4;
        this.E2 = textView5;
    }

    public static Pl nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558443, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
