package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class iF implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9484n;
    public final ImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9485t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9484n;
    }

    private iF(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f9484n = linearLayout;
        this.rl = imageView;
        this.f9485t = textView;
    }

    public static iF n(View view) {
        int i2 = 2131362160;
        ImageView imageView = (ImageView) ViewBindings.n(view, 2131362160);
        if (imageView != null) {
            i2 = 2131362162;
            TextView textView = (TextView) ViewBindings.n(view, 2131362162);
            if (textView != null) {
                return new iF((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static iF t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558494, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
