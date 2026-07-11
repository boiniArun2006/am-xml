package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class g9 implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9448n;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Switch f9449t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9448n;
    }

    private g9(LinearLayout linearLayout, TextView textView, Switch r3) {
        this.f9448n = linearLayout;
        this.rl = textView;
        this.f9449t = r3;
    }

    public static g9 n(View view) {
        int i2 = 2131363477;
        TextView textView = (TextView) ViewBindings.n(view, 2131363477);
        if (textView != null) {
            i2 = 2131363482;
            Switch r2 = (Switch) ViewBindings.n(view, 2131363482);
            if (r2 != null) {
                return new g9((LinearLayout) view, textView, r2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static g9 t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558562, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
