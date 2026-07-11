package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
public class ApiHelperForP {
    public static TracingController n() {
        return TracingController.getInstance();
    }

    public static ClassLoader rl() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper t(WebView webView) {
        return webView.getWebViewLooper();
    }
}
