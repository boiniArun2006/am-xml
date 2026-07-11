package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.webkit.WebViewRenderProcessClient f42568n;

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f42568n.n(webView, WebViewRenderProcessImpl.rl(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f42568n.rl(webView, WebViewRenderProcessImpl.rl(webViewRenderProcess));
    }
}
