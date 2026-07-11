package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I implements ViewBinding {
    public final TextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9143O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9144n;
    public final TextView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9145t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9144n;
    }

    private I(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4) {
        this.f9144n = linearLayout;
        this.rl = textView;
        this.f9145t = linearLayout2;
        this.nr = textView2;
        this.f9143O = textView3;
        this.J2 = textView4;
    }

    public static I n(View view) {
        int i2 = 2131362183;
        TextView textView = (TextView) ViewBindings.n(view, 2131362183);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i2 = 2131363527;
            TextView textView2 = (TextView) ViewBindings.n(view, 2131363527);
            if (textView2 != null) {
                i2 = 2131363915;
                TextView textView3 = (TextView) ViewBindings.n(view, 2131363915);
                if (textView3 != null) {
                    i2 = 2131363929;
                    TextView textView4 = (TextView) ViewBindings.n(view, 2131363929);
                    if (textView4 != null) {
                        return new I(linearLayout, textView, linearLayout, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static I t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558841, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
