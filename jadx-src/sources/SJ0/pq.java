package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class pq implements ViewBinding {
    public final ImageView J2;
    public final AppCompatImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9592O;
    public final AppCompatImageView Uo;
    public final SimpleDraweeView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9593n;
    public final TextView nr;
    public final Space rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f9594t;
    public final Space xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9593n;
    }

    private pq(ConstraintLayout constraintLayout, Space space, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, Space space2, SimpleDraweeView simpleDraweeView) {
        this.f9593n = constraintLayout;
        this.rl = space;
        this.f9594t = appCompatTextView;
        this.nr = textView;
        this.f9592O = appCompatTextView2;
        this.J2 = imageView;
        this.Uo = appCompatImageView;
        this.KN = appCompatImageView2;
        this.xMQ = space2;
        this.mUb = simpleDraweeView;
    }

    public static pq n(View view) {
        int i2 = 2131362133;
        Space space = (Space) ViewBindings.n(view, 2131362133);
        if (space != null) {
            i2 = 2131362636;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131362636);
            if (appCompatTextView != null) {
                i2 = 2131362639;
                TextView textView = (TextView) ViewBindings.n(view, 2131362639);
                if (textView != null) {
                    i2 = 2131362642;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.n(view, 2131362642);
                    if (appCompatTextView2 != null) {
                        i2 = 2131362761;
                        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362761);
                        if (imageView != null) {
                            i2 = 2131363191;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363191);
                            if (appCompatImageView != null) {
                                i2 = 2131363192;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363192);
                                if (appCompatImageView2 != null) {
                                    i2 = 2131363258;
                                    Space space2 = (Space) ViewBindings.n(view, 2131363258);
                                    if (space2 != null) {
                                        i2 = 2131363887;
                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                                        if (simpleDraweeView != null) {
                                            return new pq((ConstraintLayout) view, space, appCompatTextView, textView, appCompatTextView2, imageView, appCompatImageView, appCompatImageView2, space2, simpleDraweeView);
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

    public static pq t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558552, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
