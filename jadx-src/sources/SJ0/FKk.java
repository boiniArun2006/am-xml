package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class FKk implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9126n;
    public final TextView nr;
    public final LinearLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f9127t;

    public static FKk n(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i2 = 2131363402;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131363402);
        if (imageView != null) {
            i2 = 2131363910;
            TextView textView = (TextView) ViewBindings.n(view, 2131363910);
            if (textView != null) {
                return new FKk(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9126n;
    }

    private FKk(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView) {
        this.f9126n = linearLayout;
        this.rl = linearLayout2;
        this.f9127t = imageView;
        this.nr = textView;
    }

    public static FKk t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558545, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
