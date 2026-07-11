package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class UGc implements ViewBinding {
    public final FrameLayout HI;
    public final FrameLayout Ik;
    public final ComposeView J2;
    public final FrameLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9361O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final View f9362S;
    public final FrameLayout Uo;
    public final SimpleDraweeView WPU;
    public final ConstraintLayout XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Space f9363Z;
    public final RelativeLayout az;
    public final FrameLayout ck;
    public final NavigationView gh;
    public final FrameLayout mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DrawerLayout f9364n;
    public final ImageButton nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FrameLayout f9365o;
    public final FrameLayout qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FrameLayout f9366r;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f9367t;
    public final LottieAnimationView ty;
    public final DrawerLayout xMQ;

    private UGc(DrawerLayout drawerLayout, ImageView imageView, View view, ImageButton imageButton, ImageButton imageButton2, ComposeView composeView, FrameLayout frameLayout, FrameLayout frameLayout2, DrawerLayout drawerLayout2, FrameLayout frameLayout3, NavigationView navigationView, FrameLayout frameLayout4, RelativeLayout relativeLayout, LottieAnimationView lottieAnimationView, FrameLayout frameLayout5, FrameLayout frameLayout6, FrameLayout frameLayout7, FrameLayout frameLayout8, FrameLayout frameLayout9, Space space, ConstraintLayout constraintLayout, View view2, SimpleDraweeView simpleDraweeView) {
        this.f9364n = drawerLayout;
        this.rl = imageView;
        this.f9367t = view;
        this.nr = imageButton;
        this.f9361O = imageButton2;
        this.J2 = composeView;
        this.Uo = frameLayout;
        this.KN = frameLayout2;
        this.xMQ = drawerLayout2;
        this.mUb = frameLayout3;
        this.gh = navigationView;
        this.qie = frameLayout4;
        this.az = relativeLayout;
        this.ty = lottieAnimationView;
        this.HI = frameLayout5;
        this.ck = frameLayout6;
        this.Ik = frameLayout7;
        this.f9366r = frameLayout8;
        this.f9365o = frameLayout9;
        this.f9363Z = space;
        this.XQ = constraintLayout;
        this.f9362S = view2;
        this.WPU = simpleDraweeView;
    }

    public static UGc t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static UGc n(View view) {
        int i2 = 2131362069;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362069);
        if (imageView != null) {
            i2 = 2131362210;
            View viewN = ViewBindings.n(view, 2131362210);
            if (viewN != null) {
                i2 = 2131362285;
                ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362285);
                if (imageButton != null) {
                    i2 = 2131362299;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131362299);
                    if (imageButton2 != null) {
                        i2 = 2131362427;
                        ComposeView composeView = (ComposeView) ViewBindings.n(view, 2131362427);
                        if (composeView != null) {
                            i2 = 2131362468;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.n(view, 2131362468);
                            if (frameLayout != null) {
                                i2 = 2131362470;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.n(view, 2131362470);
                                if (frameLayout2 != null) {
                                    DrawerLayout drawerLayout = (DrawerLayout) view;
                                    i2 = 2131362764;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.n(view, 2131362764);
                                    if (frameLayout3 != null) {
                                        i2 = 2131363273;
                                        NavigationView navigationView = (NavigationView) ViewBindings.n(view, 2131363273);
                                        if (navigationView != null) {
                                            i2 = 2131363290;
                                            FrameLayout frameLayout4 = (FrameLayout) ViewBindings.n(view, 2131363290);
                                            if (frameLayout4 != null) {
                                                i2 = 2131363667;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.n(view, 2131363667);
                                                if (relativeLayout != null) {
                                                    i2 = 2131363668;
                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.n(view, 2131363668);
                                                    if (lottieAnimationView != null) {
                                                        i2 = 2131363816;
                                                        FrameLayout frameLayout5 = (FrameLayout) ViewBindings.n(view, 2131363816);
                                                        if (frameLayout5 != null) {
                                                            i2 = 2131363820;
                                                            FrameLayout frameLayout6 = (FrameLayout) ViewBindings.n(view, 2131363820);
                                                            if (frameLayout6 != null) {
                                                                i2 = 2131363821;
                                                                FrameLayout frameLayout7 = (FrameLayout) ViewBindings.n(view, 2131363821);
                                                                if (frameLayout7 != null) {
                                                                    i2 = 2131363827;
                                                                    FrameLayout frameLayout8 = (FrameLayout) ViewBindings.n(view, 2131363827);
                                                                    if (frameLayout8 != null) {
                                                                        i2 = 2131363828;
                                                                        FrameLayout frameLayout9 = (FrameLayout) ViewBindings.n(view, 2131363828);
                                                                        if (frameLayout9 != null) {
                                                                            i2 = 2131363829;
                                                                            Space space = (Space) ViewBindings.n(view, 2131363829);
                                                                            if (space != null) {
                                                                                i2 = 2131363924;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131363924);
                                                                                if (constraintLayout != null) {
                                                                                    i2 = 2131363925;
                                                                                    View viewN2 = ViewBindings.n(view, 2131363925);
                                                                                    if (viewN2 != null) {
                                                                                        i2 = 2131364009;
                                                                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131364009);
                                                                                        if (simpleDraweeView != null) {
                                                                                            return new UGc(drawerLayout, imageView, viewN, imageButton, imageButton2, composeView, frameLayout, frameLayout2, drawerLayout, frameLayout3, navigationView, frameLayout4, relativeLayout, lottieAnimationView, frameLayout5, frameLayout6, frameLayout7, frameLayout8, frameLayout9, space, constraintLayout, viewN2, simpleDraweeView);
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
    public DrawerLayout getRoot() {
        return this.f9364n;
    }

    public static UGc nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558451, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
