package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class K implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinearLayout f9171n;
    public final SeekBar nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9172t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f9171n;
    }

    private K(LinearLayout linearLayout, TextView textView, TextView textView2, SeekBar seekBar) {
        this.f9171n = linearLayout;
        this.rl = textView;
        this.f9172t = textView2;
        this.nr = seekBar;
    }

    public static K n(View view) {
        int i2 = 2131363477;
        TextView textView = (TextView) ViewBindings.n(view, 2131363477);
        if (textView != null) {
            i2 = 2131363484;
            TextView textView2 = (TextView) ViewBindings.n(view, 2131363484);
            if (textView2 != null) {
                i2 = 2131363491;
                SeekBar seekBar = (SeekBar) ViewBindings.n(view, 2131363491);
                if (seekBar != null) {
                    return new K((LinearLayout) view, textView, textView2, seekBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static K t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558485, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
