package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class oXP implements ViewBinding {
    public final TextView J2;
    public final SimpleDraweeView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9581O;
    public final TextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9582n;
    public final ImageButton nr;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9583t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9582n;
    }

    private oXP(ConstraintLayout constraintLayout, ImageView imageView, ImageButton imageButton, ImageButton imageButton2, ImageView imageView2, TextView textView, TextView textView2, SimpleDraweeView simpleDraweeView) {
        this.f9582n = constraintLayout;
        this.rl = imageView;
        this.f9583t = imageButton;
        this.nr = imageButton2;
        this.f9581O = imageView2;
        this.J2 = textView;
        this.Uo = textView2;
        this.KN = simpleDraweeView;
    }

    public static oXP n(View view) {
        int i2 = 2131362777;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362777);
        if (imageView != null) {
            i2 = 2131362780;
            ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362780);
            if (imageButton != null) {
                i2 = 2131363009;
                ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363009);
                if (imageButton2 != null) {
                    i2 = 2131363310;
                    ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131363310);
                    if (imageView2 != null) {
                        i2 = 2131363978;
                        TextView textView = (TextView) ViewBindings.n(view, 2131363978);
                        if (textView != null) {
                            i2 = 2131363979;
                            TextView textView2 = (TextView) ViewBindings.n(view, 2131363979);
                            if (textView2 != null) {
                                i2 = 2131363980;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363980);
                                if (simpleDraweeView != null) {
                                    return new oXP((ConstraintLayout) view, imageView, imageButton, imageButton2, imageView2, textView, textView2, simpleDraweeView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static oXP t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558585, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
