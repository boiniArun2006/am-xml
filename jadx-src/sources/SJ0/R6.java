package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class R6 implements ViewBinding {
    public final TextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageView f9289O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9290n;
    public final AppCompatImageView nr;
    public final Space rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SimpleDraweeView f9291t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9290n;
    }

    private R6(ConstraintLayout constraintLayout, Space space, SimpleDraweeView simpleDraweeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        this.f9290n = constraintLayout;
        this.rl = space;
        this.f9291t = simpleDraweeView;
        this.nr = appCompatImageView;
        this.f9289O = appCompatImageView2;
        this.J2 = textView;
    }

    public static R6 n(View view) {
        int i2 = 2131362133;
        Space space = (Space) ViewBindings.n(view, 2131362133);
        if (space != null) {
            i2 = 2131362647;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131362647);
            if (simpleDraweeView != null) {
                i2 = 2131363517;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363517);
                if (appCompatImageView != null) {
                    i2 = 2131363518;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363518);
                    if (appCompatImageView2 != null) {
                        i2 = 2131363520;
                        TextView textView = (TextView) ViewBindings.n(view, 2131363520);
                        if (textView != null) {
                            return new R6((ConstraintLayout) view, space, simpleDraweeView, appCompatImageView, appCompatImageView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static R6 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558550, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
