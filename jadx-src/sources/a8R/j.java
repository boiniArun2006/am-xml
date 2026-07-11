package a8R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import wB8.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f12732n;
    public final WebView nr;
    public final ImageButton rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f12733t;

    public static j t(LayoutInflater layoutInflater) {
        return nr(layoutInflater, null, false);
    }

    public static j n(View view) {
        int i2 = wB8.j.f74808n;
        ImageButton imageButton = (ImageButton) ViewBindings.n(view, i2);
        if (imageButton != null) {
            i2 = wB8.j.rl;
            TextView textView = (TextView) ViewBindings.n(view, i2);
            if (textView != null) {
                i2 = wB8.j.f74809t;
                WebView webView = (WebView) ViewBindings.n(view, i2);
                if (webView != null) {
                    return new j((ConstraintLayout) view, imageButton, textView, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static j nr(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(n.f74810n, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f12732n;
    }

    private j(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, WebView webView) {
        this.f12732n = constraintLayout;
        this.rl = imageButton;
        this.f12733t = textView;
        this.nr = webView;
    }
}
