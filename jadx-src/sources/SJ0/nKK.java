package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class nKK implements ViewBinding {
    public final SimpleDraweeView J2;
    public final ImageView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9554O;
    public final AppCompatImageView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f9555n;
    public final TextView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9556t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f9555n;
    }

    private nKK(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, SimpleDraweeView simpleDraweeView, AppCompatImageView appCompatImageView, ImageView imageView2) {
        this.f9555n = frameLayout;
        this.rl = textView;
        this.f9556t = textView2;
        this.nr = textView3;
        this.f9554O = imageView;
        this.J2 = simpleDraweeView;
        this.Uo = appCompatImageView;
        this.KN = imageView2;
    }

    public static nKK n(View view) {
        int i2 = 2131362507;
        TextView textView = (TextView) ViewBindings.n(view, 2131362507);
        if (textView != null) {
            i2 = 2131362522;
            TextView textView2 = (TextView) ViewBindings.n(view, 2131362522);
            if (textView2 != null) {
                i2 = 2131362584;
                TextView textView3 = (TextView) ViewBindings.n(view, 2131362584);
                if (textView3 != null) {
                    i2 = 2131363516;
                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131363516);
                    if (imageView != null) {
                        i2 = 2131363887;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363887);
                        if (simpleDraweeView != null) {
                            i2 = 2131363889;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131363889);
                            if (appCompatImageView != null) {
                                i2 = 2131364029;
                                ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131364029);
                                if (imageView2 != null) {
                                    return new nKK((FrameLayout) view, textView, textView2, textView3, imageView, simpleDraweeView, appCompatImageView, imageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static nKK t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558468, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
