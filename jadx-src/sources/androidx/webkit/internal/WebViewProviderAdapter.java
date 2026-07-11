package androidx.webkit.internal;

import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class WebViewProviderAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f42563n;

    public void J2(String str) {
        this.f42563n.setProfile(str);
    }

    public void O(boolean z2) {
        this.f42563n.setAudioMuted(z2);
    }

    public ScriptHandlerImpl n(String str, String[] strArr) {
        return ScriptHandlerImpl.n(this.f42563n.addDocumentStartJavaScript(str, strArr));
    }

    public void nr(String str) {
        this.f42563n.removeWebMessageListener(str);
    }

    public void rl(String str, String[] strArr, WebViewCompat.WebMessageListener webMessageListener) {
        this.f42563n.addWebMessageListener(str, strArr, SuF.j.t(new WebMessageListenerAdapter(webMessageListener)));
    }

    public WebViewClient t() {
        return this.f42563n.getWebViewClient();
    }

    public WebViewProviderAdapter(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f42563n = webViewProviderBoundaryInterface;
    }
}
