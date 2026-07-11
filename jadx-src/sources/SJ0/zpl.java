package SJ0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zpl implements ViewBinding {
    public final AppCompatImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final CardView f9700O;
    public final ImageView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9701n;
    public final SimpleDraweeView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9702t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9701n;
    }

    private zpl(ConstraintLayout constraintLayout, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView, CardView cardView, AppCompatImageView appCompatImageView, ImageView imageView) {
        this.f9701n = constraintLayout;
        this.rl = textView;
        this.f9702t = textView2;
        this.nr = simpleDraweeView;
        this.f9700O = cardView;
        this.J2 = appCompatImageView;
        this.Uo = imageView;
    }

    public static zpl n(View view) {
        int i2 = 2131362032;
        TextView textView = (TextView) ViewBindings.n(view, 2131362032);
        if (textView != null) {
            i2 = 2131362033;
            TextView textView2 = (TextView) ViewBindings.n(view, 2131362033);
            if (textView2 != null) {
                i2 = 2131363887;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                if (simpleDraweeView != null) {
                    i2 = 2131363888;
                    CardView cardView = (CardView) ViewBindings.n(view, 2131363888);
                    if (cardView != null) {
                        i2 = 2131363889;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363889);
                        if (appCompatImageView != null) {
                            i2 = 2131364029;
                            ImageView imageView = (ImageView) ViewBindings.n(view, 2131364029);
                            if (imageView != null) {
                                return new zpl((ConstraintLayout) view, textView, textView2, simpleDraweeView, cardView, appCompatImageView, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
