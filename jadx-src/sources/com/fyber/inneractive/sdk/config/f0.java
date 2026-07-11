package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f53331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53332b;

    public f0(String str, String str2) {
        this.f53331a = str;
        this.f53332b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        if (iAConfigManager.f53272J == null && (context = iAConfigManager.f53280f) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new y());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.f53272J = webView;
        }
        WebView webView2 = iAConfigManager.f53272J;
        String str = this.f53331a;
        String str2 = this.f53332b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(webView2, str, str2, "text/html", "utf-8", null);
        }
        com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(IAConfigManager.f53262O, TimeUnit.SECONDS.toMillis(10L));
    }
}
