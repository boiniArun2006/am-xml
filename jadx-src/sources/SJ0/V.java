package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class V implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9370n;
    public final TextView nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9371t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9370n;
    }

    private V(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, TextView textView) {
        this.f9370n = linearLayout;
        this.rl = imageButton;
        this.f9371t = imageButton2;
        this.nr = textView;
    }

    public static V n(View view) {
        int i2 = 2131363266;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363266);
        if (imageButton != null) {
            i2 = 2131363362;
            ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363362);
            if (imageButton2 != null) {
                i2 = 2131363655;
                TextView textView = (TextView) ViewBindings.n(view, 2131363655);
                if (textView != null) {
                    return new V((LinearLayout) view, imageButton, imageButton2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static V t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558606, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
