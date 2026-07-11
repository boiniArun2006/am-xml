package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebViewCompat.WebMessageListener f42530n;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z2, InvocationHandler invocationHandler2) {
        WebMessageCompat webMessageCompatRl = WebMessageAdapter.rl((WebMessageBoundaryInterface) SuF.j.n(WebMessageBoundaryInterface.class, invocationHandler));
        if (webMessageCompatRl != null) {
            this.f42530n.onPostMessage(webView, webMessageCompatRl, uri, z2, JavaScriptReplyProxyImpl.rl(invocationHandler2));
        }
    }

    public WebMessageListenerAdapter(WebViewCompat.WebMessageListener webMessageListener) {
        this.f42530n = webMessageListener;
    }
}
