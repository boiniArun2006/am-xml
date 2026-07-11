package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ibE implements ViewBinding {
    public final AppCompatImageView J2;
    public final AppCompatImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final SimpleDraweeView f9486O;
    public final AppCompatImageView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9487n;
    public final TextView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9488t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9487n;
    }

    private ibE(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, TextView textView, SimpleDraweeView simpleDraweeView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4) {
        this.f9487n = constraintLayout;
        this.rl = appCompatImageView;
        this.f9488t = appCompatTextView;
        this.nr = textView;
        this.f9486O = simpleDraweeView;
        this.J2 = appCompatImageView2;
        this.Uo = appCompatImageView3;
        this.KN = appCompatImageView4;
    }

    public static ibE n(View view) {
        int i2 = 2131362349;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362349);
        if (appCompatImageView != null) {
            i2 = 2131362463;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362463);
            if (appCompatTextView != null) {
                i2 = 2131362584;
                TextView textView = (TextView) ViewBindings.n(view, 2131362584);
                if (textView != null) {
                    i2 = 2131363887;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                    if (simpleDraweeView != null) {
                        i2 = 2131363889;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363889);
                        if (appCompatImageView2 != null) {
                            i2 = 2131363986;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.n(view, 2131363986);
                            if (appCompatImageView3 != null) {
                                i2 = 2131364031;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.n(view, 2131364031);
                                if (appCompatImageView4 != null) {
                                    return new ibE((ConstraintLayout) view, appCompatImageView, appCompatTextView, textView, simpleDraweeView, appCompatImageView2, appCompatImageView3, appCompatImageView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static ibE t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558706, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
