package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Z5b implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9400O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9401n;
    public final SimpleDraweeView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageButton f9402t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9401n;
    }

    private Z5b(LinearLayout linearLayout, TextView textView, ImageButton imageButton, SimpleDraweeView simpleDraweeView, TextView textView2) {
        this.f9401n = linearLayout;
        this.rl = textView;
        this.f9402t = imageButton;
        this.nr = simpleDraweeView;
        this.f9400O = textView2;
    }

    public static Z5b n(View view) {
        int i2 = 2131363963;
        TextView textView = (TextView) ViewBindings.n(view, 2131363963);
        if (textView != null) {
            i2 = 2131363964;
            ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363964);
            if (imageButton != null) {
                i2 = 2131363967;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363967);
                if (simpleDraweeView != null) {
                    i2 = 2131363968;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363968);
                    if (textView2 != null) {
                        return new Z5b((LinearLayout) view, textView, imageButton, simpleDraweeView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Z5b t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558838, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
