package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class P implements ViewBinding {
    public final TextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final LinearLayout f9253O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9254n;
    public final TextView nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9255t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9254n;
    }

    private P(ConstraintLayout constraintLayout, ImageButton imageButton, AppCompatImageView appCompatImageView, TextView textView, LinearLayout linearLayout, TextView textView2) {
        this.f9254n = constraintLayout;
        this.rl = imageButton;
        this.f9255t = appCompatImageView;
        this.nr = textView;
        this.f9253O = linearLayout;
        this.J2 = textView2;
    }

    public static P n(View view) {
        int i2 = 2131362093;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131362093);
        if (imageButton != null) {
            i2 = 2131362981;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362981);
            if (appCompatImageView != null) {
                i2 = 2131363012;
                TextView textView = (TextView) ViewBindings.n(view, 2131363012);
                if (textView != null) {
                    i2 = 2131363866;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131363866);
                    if (linearLayout != null) {
                        i2 = 2131363910;
                        TextView textView2 = (TextView) ViewBindings.n(view, 2131363910);
                        if (textView2 != null) {
                            return new P((ConstraintLayout) view, imageButton, appCompatImageView, textView, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static P t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558491, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
