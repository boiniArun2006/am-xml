package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Fl implements ViewBinding {
    public final AppCompatImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatImageView f9134O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9135n;
    public final ImageView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9136t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9135n;
    }

    private Fl(LinearLayout linearLayout, TextView textView, ImageView imageView, ImageView imageView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f9135n = linearLayout;
        this.rl = textView;
        this.f9136t = imageView;
        this.nr = imageView2;
        this.f9134O = appCompatImageView;
        this.J2 = appCompatImageView2;
    }

    public static Fl n(View view) {
        int i2 = 2131362642;
        TextView textView = (TextView) ViewBindings.n(view, 2131362642);
        if (textView != null) {
            i2 = 2131362648;
            ImageView imageView = (ImageView) ViewBindings.n(view, 2131362648);
            if (imageView != null) {
                i2 = 2131362879;
                ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362879);
                if (imageView2 != null) {
                    i2 = 2131363418;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363418);
                    if (appCompatImageView != null) {
                        i2 = 2131363419;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363419);
                        if (appCompatImageView2 != null) {
                            return new Fl((LinearLayout) view, textView, imageView, imageView2, appCompatImageView, appCompatImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Fl t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558546, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
