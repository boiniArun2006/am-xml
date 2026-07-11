package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class cA implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9421n;
    public final ImageView nr;
    public final TextView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9422t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9421n;
    }

    private cA(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.f9421n = constraintLayout;
        this.rl = textView;
        this.f9422t = textView2;
        this.nr = imageView;
    }

    public static cA n(View view) {
        int i2 = 2131363477;
        TextView textView = (TextView) ViewBindings.n(view, 2131363477);
        if (textView != null) {
            i2 = 2131363481;
            TextView textView2 = (TextView) ViewBindings.n(view, 2131363481);
            if (textView2 != null) {
                i2 = 2131363483;
                ImageView imageView = (ImageView) ViewBindings.n(view, 2131363483);
                if (imageView != null) {
                    return new cA((ConstraintLayout) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static cA t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558561, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
