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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class gnv implements ViewBinding {
    public final ImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9461O;
    public final ImageView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f9462n;
    public final LinearLayout nr;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardView f9463t;

    public static gnv rl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(2131558534, viewGroup);
        return n(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f9462n;
    }

    private gnv(View view, ImageView imageView, CardView cardView, LinearLayout linearLayout, TextView textView, ImageView imageView2, ImageView imageView3) {
        this.f9462n = view;
        this.rl = imageView;
        this.f9463t = cardView;
        this.nr = linearLayout;
        this.f9461O = textView;
        this.J2 = imageView2;
        this.Uo = imageView3;
    }

    public static gnv n(View view) {
        int i2 = 2131362092;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362092);
        if (imageView != null) {
            i2 = 2131362333;
            CardView cardView = (CardView) ViewBindings.n(view, 2131362333);
            if (cardView != null) {
                i2 = 2131362581;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362581);
                if (linearLayout != null) {
                    i2 = 2131362582;
                    TextView textView = (TextView) ViewBindings.n(view, 2131362582);
                    if (textView != null) {
                        i2 = 2131362981;
                        ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362981);
                        if (imageView2 != null) {
                            i2 = 2131363417;
                            ImageView imageView3 = (ImageView) ViewBindings.n(view, 2131363417);
                            if (imageView3 != null) {
                                return new gnv(view, imageView, cardView, linearLayout, textView, imageView2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
