package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class psW implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9595n;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Switch f9596t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9595n;
    }

    private psW(LinearLayout linearLayout, TextView textView, Switch r3) {
        this.f9595n = linearLayout;
        this.rl = textView;
        this.f9596t = r3;
    }

    public static psW n(View view) {
        int i2 = 2131363477;
        TextView textView = (TextView) ViewBindings.n(view, 2131363477);
        if (textView != null) {
            i2 = 2131363482;
            Switch r2 = (Switch) ViewBindings.n(view, 2131363482);
            if (r2 != null) {
                return new psW((LinearLayout) view, textView, r2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static psW t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558486, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
