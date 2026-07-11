package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Sis implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CardView f9321n;
    public final CardView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AppCompatImageView f9322t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f9321n;
    }

    private Sis(CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, CardView cardView2) {
        this.f9321n = cardView;
        this.rl = appCompatImageView;
        this.f9322t = appCompatImageView2;
        this.nr = cardView2;
    }

    public static Sis n(View view) {
        int i2 = 2131362394;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362394);
        if (appCompatImageView != null) {
            i2 = 2131362406;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131362406);
            if (appCompatImageView2 != null) {
                CardView cardView = (CardView) view;
                return new Sis(cardView, appCompatImageView, appCompatImageView2, cardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static Sis t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558500, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
