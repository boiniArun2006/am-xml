package SJ0;

import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1465u implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CardView f9658n;
    public final AppCompatImageView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ListView f9659t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f9658n;
    }

    private C1465u(CardView cardView, AppCompatImageView appCompatImageView, ListView listView, AppCompatImageView appCompatImageView2) {
        this.f9658n = cardView;
        this.rl = appCompatImageView;
        this.f9659t = listView;
        this.nr = appCompatImageView2;
    }

    public static C1465u n(View view) {
        int i2 = 2131362179;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362179);
        if (appCompatImageView != null) {
            i2 = 2131363107;
            ListView listView = (ListView) ViewBindings.n(view, 2131363107);
            if (listView != null) {
                i2 = 2131363927;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363927);
                if (appCompatImageView2 != null) {
                    return new C1465u((CardView) view, appCompatImageView, listView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
