package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l implements ViewBinding {
    public final TextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9511O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9512n;
    public final View nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Button f9513t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9512n;
    }

    private l(ConstraintLayout constraintLayout, TextView textView, Button button, View view, TextView textView2, TextView textView3) {
        this.f9512n = constraintLayout;
        this.rl = textView;
        this.f9513t = button;
        this.nr = view;
        this.f9511O = textView2;
        this.J2 = textView3;
    }

    public static l n(View view) {
        int i2 = 2131362150;
        TextView textView = (TextView) ViewBindings.n(view, 2131362150);
        if (textView != null) {
            i2 = 2131362261;
            Button button = (Button) ViewBindings.n(view, 2131362261);
            if (button != null) {
                i2 = 2131362332;
                View viewN = ViewBindings.n(view, 2131362332);
                if (viewN != null) {
                    i2 = 2131363098;
                    TextView textView2 = (TextView) ViewBindings.n(view, 2131363098);
                    if (textView2 != null) {
                        i2 = 2131363529;
                        TextView textView3 = (TextView) ViewBindings.n(view, 2131363529);
                        if (textView3 != null) {
                            return new l((ConstraintLayout) view, textView, button, viewN, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static l t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558757, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
