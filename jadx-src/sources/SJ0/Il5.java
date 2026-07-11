package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Il5 implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9156n;
    public final TextView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SimpleDraweeView f9157t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9156n;
    }

    private Il5(LinearLayout linearLayout, TextView textView, SimpleDraweeView simpleDraweeView, TextView textView2) {
        this.f9156n = linearLayout;
        this.rl = textView;
        this.f9157t = simpleDraweeView;
        this.nr = textView2;
    }

    public static Il5 n(View view) {
        int i2 = 2131363903;
        TextView textView = (TextView) ViewBindings.n(view, 2131363903);
        if (textView != null) {
            i2 = 2131363904;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363904);
            if (simpleDraweeView != null) {
                i2 = 2131363905;
                TextView textView2 = (TextView) ViewBindings.n(view, 2131363905);
                if (textView2 != null) {
                    return new Il5((LinearLayout) view, textView, simpleDraweeView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Il5 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558833, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
