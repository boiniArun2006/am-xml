package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class yg implements ViewBinding {
    public final ImageView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f9688O;
    public final TextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9689n;
    public final TextView nr;
    public final RecyclerView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9690t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9689n;
    }

    private yg(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        this.f9689n = linearLayout;
        this.rl = recyclerView;
        this.f9690t = linearLayout2;
        this.nr = textView;
        this.f9688O = imageView;
        this.J2 = imageView2;
        this.Uo = textView2;
    }

    public static yg n(View view) {
        int i2 = 2131362161;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131362161);
        if (recyclerView != null) {
            i2 = 2131362337;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131362337);
            if (linearLayout != null) {
                i2 = 2131362339;
                TextView textView = (TextView) ViewBindings.n(view, 2131362339);
                if (textView != null) {
                    i2 = 2131362361;
                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131362361);
                    if (imageView != null) {
                        i2 = 2131362758;
                        ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131362758);
                        if (imageView2 != null) {
                            i2 = 2131363640;
                            TextView textView2 = (TextView) ViewBindings.n(view, 2131363640);
                            if (textView2 != null) {
                                return new yg((LinearLayout) view, recyclerView, linearLayout, textView, imageView, imageView2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static yg t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558495, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
