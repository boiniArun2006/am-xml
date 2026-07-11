package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class FP implements ViewBinding {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextView f9128O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CardView f9129n;
    public final SimpleDraweeView nr;
    public final AppCompatImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardView f9130t;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f9129n;
    }

    private FP(CardView cardView, AppCompatImageButton appCompatImageButton, CardView cardView2, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.f9129n = cardView;
        this.rl = appCompatImageButton;
        this.f9130t = cardView2;
        this.nr = simpleDraweeView;
        this.f9128O = textView;
    }

    public static FP n(View view) {
        int i2 = 2131363570;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.n(view, 2131363570);
        if (appCompatImageButton != null) {
            CardView cardView = (CardView) view;
            i2 = 2131363574;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.n(view, 2131363574);
            if (simpleDraweeView != null) {
                i2 = 2131363575;
                TextView textView = (TextView) ViewBindings.n(view, 2131363575);
                if (textView != null) {
                    return new FP(cardView, appCompatImageButton, cardView, simpleDraweeView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static FP t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558815, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
