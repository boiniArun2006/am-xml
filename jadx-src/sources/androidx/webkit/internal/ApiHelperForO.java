package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
public class ApiHelperForO {
    public static PackageInfo n() {
        return WebView.getCurrentWebViewPackage();
    }

    public static WebViewClient rl(WebView webView) {
        return webView.getWebViewClient();
    }
}
