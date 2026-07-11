package SJ0;

import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: renamed from: SJ0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1463p implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CardView f9587n;
    public final AppCompatImageView nr;
    public final AppCompatImageView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ListView f9588t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f9587n;
    }

    private C1463p(CardView cardView, AppCompatImageView appCompatImageView, ListView listView, AppCompatImageView appCompatImageView2) {
        this.f9587n = cardView;
        this.rl = appCompatImageView;
        this.f9588t = listView;
        this.nr = appCompatImageView2;
    }

    public static C1463p n(View view) {
        int i2 = 2131362179;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.n(view, 2131362179);
        if (appCompatImageView != null) {
            i2 = 2131363107;
            ListView listView = (ListView) ViewBindings.n(view, 2131363107);
            if (listView != null) {
                i2 = 2131363927;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.n(view, 2131363927);
                if (appCompatImageView2 != null) {
                    return new C1463p((CardView) view, appCompatImageView, listView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
