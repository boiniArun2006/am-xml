package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String[] f42565O = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f42566n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WebViewRenderProcessClient f42567t;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f42565O;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(final WebView webView, InvocationHandler invocationHandler) {
        final WebViewRenderProcessImpl webViewRenderProcessImplT = WebViewRenderProcessImpl.t(invocationHandler);
        final WebViewRenderProcessClient webViewRenderProcessClient = this.f42567t;
        Executor executor = this.f42566n;
        if (executor == null) {
            webViewRenderProcessClient.n(webView, webViewRenderProcessImplT);
        } else {
            executor.execute(new Runnable() { // from class: androidx.webkit.internal.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    webViewRenderProcessClient.n(webView, webViewRenderProcessImplT);
                }
            });
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(final WebView webView, InvocationHandler invocationHandler) {
        final WebViewRenderProcessImpl webViewRenderProcessImplT = WebViewRenderProcessImpl.t(invocationHandler);
        final WebViewRenderProcessClient webViewRenderProcessClient = this.f42567t;
        Executor executor = this.f42566n;
        if (executor == null) {
            webViewRenderProcessClient.rl(webView, webViewRenderProcessImplT);
        } else {
            executor.execute(new Runnable() { // from class: androidx.webkit.internal.Dsr
                @Override // java.lang.Runnable
                public final void run() {
                    webViewRenderProcessClient.rl(webView, webViewRenderProcessImplT);
                }
            });
        }
    }
}
