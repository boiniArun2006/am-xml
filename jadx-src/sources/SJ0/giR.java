package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class giR implements ViewBinding {
    public final CardView J2;
    public final View KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View f9458O;
    public final ImageView Uo;
    public final SimpleDraweeView gh;
    public final ImageView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9459n;
    public final TextView nr;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9460t;
    public final ImageView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9459n;
    }

    private giR(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, View view, CardView cardView, ImageView imageView2, View view2, ImageView imageView3, ImageView imageView4, SimpleDraweeView simpleDraweeView) {
        this.f9459n = linearLayout;
        this.rl = imageView;
        this.f9460t = textView;
        this.nr = textView2;
        this.f9458O = view;
        this.J2 = cardView;
        this.Uo = imageView2;
        this.KN = view2;
        this.xMQ = imageView3;
        this.mUb = imageView4;
        this.gh = simpleDraweeView;
    }

    public static giR n(View view) {
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
                            ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131363396);
                            if (imageView2 != null) {
                                i2 = 2131363400;
                                View viewN2 = ViewBindings.n(view, 2131363400);
                                if (viewN2 != null) {
                                    i2 = 2131363401;
                                    ImageView imageView3 = (ImageView) ViewBindings.n(view, 2131363401);
                                    if (imageView3 != null) {
                                        i2 = 2131363516;
                                        ImageView imageView4 = (ImageView) ViewBindings.n(view, 2131363516);
                                        if (imageView4 != null) {
                                            i2 = 2131363886;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363886);
                                            if (simpleDraweeView != null) {
                                                return new giR((LinearLayout) view, imageView, textView, textView2, viewN, cardView, imageView2, viewN2, imageView3, imageView4, simpleDraweeView);
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

    public static giR t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558814, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
