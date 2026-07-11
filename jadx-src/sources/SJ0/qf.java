package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qf implements ViewBinding {
    public final AppCompatTextView J2;
    public final AppCompatImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9600O;
    public final AppCompatImageView Uo;
    public final AppCompatTextView gh;
    public final View mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9601n;
    public final View nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Barrier f9602t;
    public final CardView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9601n;
    }

    private qf(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, Barrier barrier, View view, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, CardView cardView, View view2, AppCompatTextView appCompatTextView2) {
        this.f9601n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9602t = barrier;
        this.nr = view;
        this.f9600O = imageView;
        this.J2 = appCompatTextView;
        this.Uo = appCompatImageView2;
        this.KN = appCompatImageView3;
        this.xMQ = cardView;
        this.mUb = view2;
        this.gh = appCompatTextView2;
    }

    public static qf n(View view) {
        int i2 = 2131362093;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362093);
        if (appCompatImageView != null) {
            i2 = 2131362145;
            Barrier barrier = (Barrier) ViewBindings.n(view, 2131362145);
            if (barrier != null) {
                i2 = 2131362560;
                View viewN = ViewBindings.n(view, 2131362560);
                if (viewN != null) {
                    i2 = 2131362984;
                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131362984);
                    if (imageView != null) {
                        i2 = 2131363065;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363065);
                        if (appCompatTextView != null) {
                            i2 = 2131363191;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                            if (appCompatImageView2 != null) {
                                i2 = 2131363192;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.n(view, 2131363192);
                                if (appCompatImageView3 != null) {
                                    i2 = 2131363405;
                                    CardView cardView = (CardView) ViewBindings.n(view, 2131363405);
                                    if (cardView != null) {
                                        i2 = 2131363643;
                                        View viewN2 = ViewBindings.n(view, 2131363643);
                                        if (viewN2 != null) {
                                            i2 = 2131363780;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131363780);
                                            if (appCompatTextView2 != null) {
                                                return new qf((ConstraintLayout) view, appCompatImageView, barrier, viewN, imageView, appCompatTextView, appCompatImageView2, appCompatImageView3, cardView, viewN2, appCompatTextView2);
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

    public static qf t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558473, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
