package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AZy implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9081O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9082n;
    public final ImageButton nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9083t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9082n;
    }

    private AZy(LinearLayout linearLayout, ImageButton imageButton, TextView textView, ImageButton imageButton2, ImageButton imageButton3) {
        this.f9082n = linearLayout;
        this.rl = imageButton;
        this.f9083t = textView;
        this.nr = imageButton2;
        this.f9081O = imageButton3;
    }

    public static AZy n(View view) {
        int i2 = 2131363266;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363266);
        if (imageButton != null) {
            i2 = 2131363655;
            TextView textView = (TextView) ViewBindings.n(view, 2131363655);
            if (textView != null) {
                i2 = 2131363697;
                ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363697);
                if (imageButton2 != null) {
                    i2 = 2131363699;
                    ImageButton imageButton3 = (ImageButton) ViewBindings.n(view, 2131363699);
                    if (imageButton3 != null) {
                        return new AZy((LinearLayout) view, imageButton, textView, imageButton2, imageButton3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static AZy t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558603, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
