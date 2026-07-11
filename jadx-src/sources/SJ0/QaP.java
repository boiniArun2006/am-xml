package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class QaP implements ViewBinding {
    public final ConstraintLayout J2;
    public final AppCompatImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9282O;
    public final AppCompatImageView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9283n;
    public final SimpleDraweeView nr;
    public final Space rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9284t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9283n;
    }

    private QaP(ConstraintLayout constraintLayout, Space space, AppCompatTextView appCompatTextView, SimpleDraweeView simpleDraweeView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f9283n = constraintLayout;
        this.rl = space;
        this.f9284t = appCompatTextView;
        this.nr = simpleDraweeView;
        this.f9282O = appCompatTextView2;
        this.J2 = constraintLayout2;
        this.Uo = appCompatImageView;
        this.KN = appCompatImageView2;
    }

    public static QaP n(View view) {
        int i2 = 2131362133;
        Space space = (Space) ViewBindings.n(view, 2131362133);
        if (space != null) {
            i2 = 2131362642;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362642);
            if (appCompatTextView != null) {
                i2 = 2131362647;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131362647);
                if (simpleDraweeView != null) {
                    i2 = 2131362698;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131362698);
                    if (appCompatTextView2 != null) {
                        i2 = 2131362926;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131362926);
                        if (constraintLayout != null) {
                            i2 = 2131363120;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363120);
                            if (appCompatImageView != null) {
                                i2 = 2131363191;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                                if (appCompatImageView2 != null) {
                                    return new QaP((ConstraintLayout) view, space, appCompatTextView, simpleDraweeView, appCompatTextView2, constraintLayout, appCompatImageView, appCompatImageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static QaP t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558544, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
