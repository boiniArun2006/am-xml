package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class M5 implements ViewBinding {
    public final ConstraintLayout HI;
    public final NestedScrollView Ik;
    public final LinearLayout J2;
    public final AppCompatTextView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageButton f9204O;
    public final ConstraintLayout Uo;
    public final AppCompatTextView az;
    public final View ck;
    public final AppCompatTextView gh;
    public final TextView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9205n;
    public final View nr;
    public final SimpleDraweeView qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RecyclerView f9206r;
    public final RecyclerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Barrier f9207t;
    public final AppCompatImageView ty;
    public final ConstraintLayout xMQ;

    public static M5 n(View view) {
        int i2 = 2131362008;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362008);
        if (recyclerView != null) {
            i2 = 2131362145;
            Barrier barrier = (Barrier) ViewBindings.n(view, 2131362145);
            if (barrier != null) {
                i2 = 2131362156;
                View viewN = ViewBindings.n(view, 2131362156);
                if (viewN != null) {
                    i2 = 2131362321;
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131362321);
                    if (appCompatImageButton != null) {
                        i2 = 2131362536;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362536);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i2 = 2131362636;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362636);
                            if (appCompatTextView != null) {
                                i2 = 2131362637;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.n(view, 2131362637);
                                if (constraintLayout2 != null) {
                                    i2 = 2131362638;
                                    TextView textView = (TextView) ViewBindings.n(view, 2131362638);
                                    if (textView != null) {
                                        i2 = 2131362641;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131362641);
                                        if (appCompatTextView2 != null) {
                                            i2 = 2131362647;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131362647);
                                            if (simpleDraweeView != null) {
                                                i2 = 2131362898;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.n(view, 2131362898);
                                                if (appCompatTextView3 != null) {
                                                    i2 = 2131363076;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363076);
                                                    if (appCompatImageView != null) {
                                                        i2 = 2131363368;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.n(view, 2131363368);
                                                        if (constraintLayout3 != null) {
                                                            i2 = 2131363511;
                                                            View viewN2 = ViewBindings.n(view, 2131363511);
                                                            if (viewN2 != null) {
                                                                i2 = 2131363606;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.n(view, 2131363606);
                                                                if (nestedScrollView != null) {
                                                                    i2 = 2131363831;
                                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.n(view, 2131363831);
                                                                    if (recyclerView2 != null) {
                                                                        return new M5(constraintLayout, recyclerView, barrier, viewN, appCompatImageButton, linearLayout, constraintLayout, appCompatTextView, constraintLayout2, textView, appCompatTextView2, simpleDraweeView, appCompatTextView3, appCompatImageView, constraintLayout3, viewN2, nestedScrollView, recyclerView2);
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
        return this.f9205n;
    }

    private M5(ConstraintLayout constraintLayout, RecyclerView recyclerView, Barrier barrier, View view, AppCompatImageButton appCompatImageButton, LinearLayout linearLayout, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout3, TextView textView, AppCompatTextView appCompatTextView2, SimpleDraweeView simpleDraweeView, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout4, View view2, NestedScrollView nestedScrollView, RecyclerView recyclerView2) {
        this.f9205n = constraintLayout;
        this.rl = recyclerView;
        this.f9207t = barrier;
        this.nr = view;
        this.f9204O = appCompatImageButton;
        this.J2 = linearLayout;
        this.Uo = constraintLayout2;
        this.KN = appCompatTextView;
        this.xMQ = constraintLayout3;
        this.mUb = textView;
        this.gh = appCompatTextView2;
        this.qie = simpleDraweeView;
        this.az = appCompatTextView3;
        this.ty = appCompatImageView;
        this.HI = constraintLayout4;
        this.ck = view2;
        this.Ik = nestedScrollView;
        this.f9206r = recyclerView2;
    }

    public static M5 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558542, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
