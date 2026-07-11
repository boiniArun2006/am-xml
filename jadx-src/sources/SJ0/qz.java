package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qz implements ViewBinding {
    public final ImageButton J2;
    public final SwipeRefreshLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageButton f9605O;
    public final TextView Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9606n;
    public final ProgressBar nr;
    public final ConstraintLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WebView f9607t;

    public static qz t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9606n;
    }

    private qz(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, WebView webView, ProgressBar progressBar, ImageButton imageButton, ImageButton imageButton2, TextView textView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f9606n = constraintLayout;
        this.rl = constraintLayout2;
        this.f9607t = webView;
        this.nr = progressBar;
        this.f9605O = imageButton;
        this.J2 = imageButton2;
        this.Uo = textView;
        this.KN = swipeRefreshLayout;
    }

    public static qz n(View view) {
        int i2 = 2131361845;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.n(view, 2131361845);
        if (constraintLayout != null) {
            i2 = 2131362567;
            WebView webView = (WebView) ViewBindings.n(view, 2131362567);
            if (webView != null) {
                i2 = 2131363110;
                ProgressBar progressBar = (ProgressBar) ViewBindings.n(view, 2131363110);
                if (progressBar != null) {
                    i2 = 2131363266;
                    ImageButton imageButton = (ImageButton) ViewBindings.n(view, 2131363266);
                    if (imageButton != null) {
                        i2 = 2131363362;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.n(view, 2131363362);
                        if (imageButton2 != null) {
                            i2 = 2131363367;
                            TextView textView = (TextView) ViewBindings.n(view, 2131363367);
                            if (textView != null) {
                                i2 = 2131363788;
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.n(view, 2131363788);
                                if (swipeRefreshLayout != null) {
                                    return new qz((ConstraintLayout) view, constraintLayout, webView, progressBar, imageButton, imageButton2, textView, swipeRefreshLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static qz nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558442, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
