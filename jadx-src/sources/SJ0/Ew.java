package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ew implements ViewBinding {
    public final CardView J2;
    public final View KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View f9123O;
    public final AppCompatImageView Uo;
    public final SimpleDraweeView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f9124n;
    public final TextView nr;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9125t;
    public final ImageView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f9124n;
    }

    private Ew(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, View view, CardView cardView, AppCompatImageView appCompatImageView, View view2, ImageView imageView2, SimpleDraweeView simpleDraweeView) {
        this.f9124n = frameLayout;
        this.rl = imageView;
        this.f9125t = textView;
        this.nr = textView2;
        this.f9123O = view;
        this.J2 = cardView;
        this.Uo = appCompatImageView;
        this.KN = view2;
        this.xMQ = imageView2;
        this.mUb = simpleDraweeView;
    }

    public static Ew n(View view) {
        int i2 = 2131362212;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362212);
        if (imageView != null) {
            i2 = 2131362558;
            TextView textView = (TextView) ViewBindings.n(view, 2131362558);
            if (textView != null) {
                i2 = 2131362584;
                TextView textView2 = (TextView) ViewBindings.n(view, 2131362584);
                if (textView2 != null) {
                    i2 = 2131362675;
                    View viewN = ViewBindings.n(view, 2131362675);
                    if (viewN != null) {
                        i2 = 2131362925;
                        CardView cardView = (CardView) ViewBindings.n(view, 2131362925);
                        if (cardView != null) {
                            i2 = 2131363396;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363396);
                            if (appCompatImageView != null) {
                                i2 = 2131363400;
                                View viewN2 = ViewBindings.n(view, 2131363400);
                                if (viewN2 != null) {
                                    i2 = 2131363401;
                                    ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131363401);
                                    if (imageView2 != null) {
                                        i2 = 2131363886;
                                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363886);
                                        if (simpleDraweeView != null) {
                                            return new Ew((FrameLayout) view, imageView, textView, textView2, viewN, cardView, appCompatImageView, viewN2, imageView2, simpleDraweeView);
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

    public static Ew t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558467, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
