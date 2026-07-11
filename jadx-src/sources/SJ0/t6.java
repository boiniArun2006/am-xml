package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class t6 implements ViewBinding {
    public final RecyclerView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final AppCompatTextView f9640O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CardView f9641n;
    public final ImageView nr;
    public final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f9642t;

    public static t6 t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f9641n;
    }

    private t6(CardView cardView, View view, LinearLayout linearLayout, ImageView imageView, AppCompatTextView appCompatTextView, RecyclerView recyclerView) {
        this.f9641n = cardView;
        this.rl = view;
        this.f9642t = linearLayout;
        this.nr = imageView;
        this.f9640O = appCompatTextView;
        this.J2 = recyclerView;
    }

    public static t6 n(View view) {
        int i2 = 2131362564;
        View viewN = ViewBindings.n(view, 2131362564);
        if (viewN != null) {
            i2 = 2131363315;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.n(view, 2131363315);
            if (linearLayout != null) {
                i2 = 2131363316;
                ImageView imageView = (ImageView) ViewBindings.n(view, 2131363316);
                if (imageView != null) {
                    i2 = 2131363317;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.n(view, 2131363317);
                    if (appCompatTextView != null) {
                        i2 = 2131363524;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.n(view, 2131363524);
                        if (recyclerView != null) {
                            return new t6((CardView) view, viewN, linearLayout, imageView, appCompatTextView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static t6 nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558663, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
