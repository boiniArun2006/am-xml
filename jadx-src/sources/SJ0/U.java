package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class U implements ViewBinding {
    public final ImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View f9355O;
    public final CardView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9356n;
    public final TextView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9357t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9356n;
    }

    private U(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, View view2, ImageView imageView, CardView cardView) {
        this.f9356n = constraintLayout;
        this.rl = view;
        this.f9357t = textView;
        this.nr = textView2;
        this.f9355O = view2;
        this.J2 = imageView;
        this.Uo = cardView;
    }

    public static U n(View view) {
        int i2 = 2131362167;
        View viewN = ViewBindings.n(view, 2131362167);
        if (viewN != null) {
            i2 = 2131363103;
            TextView textView = (TextView) ViewBindings.n(view, 2131363103);
            if (textView != null) {
                i2 = 2131363104;
                TextView textView2 = (TextView) ViewBindings.n(view, 2131363104);
                if (textView2 != null) {
                    i2 = 2131363105;
                    View viewN2 = ViewBindings.n(view, 2131363105);
                    if (viewN2 != null) {
                        i2 = 2131363886;
                        ImageView imageView = (ImageView) ViewBindings.n(view, 2131363886);
                        if (imageView != null) {
                            i2 = 2131363888;
                            CardView cardView = (CardView) ViewBindings.n(view, 2131363888);
                            if (cardView != null) {
                                return new U((ConstraintLayout) view, viewN, textView, textView2, viewN2, imageView, cardView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static U t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558667, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
