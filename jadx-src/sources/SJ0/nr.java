package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class nr implements ViewBinding {
    public final TextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageView f9570O;
    public final SimpleDraweeView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9571n;
    public final AppCompatImageView nr;
    public final Space rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9572t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9571n;
    }

    private nr(ConstraintLayout constraintLayout, Space space, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView, SimpleDraweeView simpleDraweeView) {
        this.f9571n = constraintLayout;
        this.rl = space;
        this.f9572t = appCompatTextView;
        this.nr = appCompatImageView;
        this.f9570O = appCompatImageView2;
        this.J2 = textView;
        this.Uo = simpleDraweeView;
    }

    public static nr n(View view) {
        int i2 = 2131362133;
        Space space = (Space) ViewBindings.n(view, 2131362133);
        if (space != null) {
            i2 = 2131362642;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362642);
            if (appCompatTextView != null) {
                i2 = 2131363120;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363120);
                if (appCompatImageView != null) {
                    i2 = 2131363191;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                    if (appCompatImageView2 != null) {
                        i2 = 2131363422;
                        TextView textView = (TextView) ViewBindings.n(view, 2131363422);
                        if (textView != null) {
                            i2 = 2131363887;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                            if (simpleDraweeView != null) {
                                return new nr((ConstraintLayout) view, space, appCompatTextView, appCompatImageView, appCompatImageView2, textView, simpleDraweeView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static nr t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558812, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
