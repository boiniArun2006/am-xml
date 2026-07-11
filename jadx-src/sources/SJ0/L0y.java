package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class L0y implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9192n;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EditText f9193t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9192n;
    }

    private L0y(LinearLayout linearLayout, TextView textView, EditText editText) {
        this.f9192n = linearLayout;
        this.rl = textView;
        this.f9193t = editText;
    }

    public static L0y n(View view) {
        int i2 = 2131363477;
        TextView textView = (TextView) ViewBindings.n(view, 2131363477);
        if (textView != null) {
            i2 = 2131363868;
            EditText editText = (EditText) ViewBindings.n(view, 2131363868);
            if (editText != null) {
                return new L0y((LinearLayout) view, textView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static L0y t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558563, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
