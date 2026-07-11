package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f53842c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a f53843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f53844b;

    public final void a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String strValueOf;
        strValueOf = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            strValueOf = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", strValueOf, str);
        } else {
            IAlog.a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        String str2 = "Webview did crash: " + strValueOf + " on webview: " + str;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f53844b;
        if (aVar != null) {
            aVar.a(bVar, str2, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(h.f63176p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63176p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/storepromo/controller/webview/b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63176p, webView, i2, str, str2);
        safedk_b_onReceivedError_a18dc1f4ba42489cfda0260d5062d592(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d(inFlMLxL.rnkS);
        BrandSafetyUtils.onWebViewReceivedError(h.f63176p, webView, webResourceRequest, webResourceError);
        safedk_b_onReceivedError_5add5806d70aa336d58203a5285b9aeb(webView, webResourceRequest, webResourceError);
    }

    public void safedk_b_onReceivedError_a18dc1f4ba42489cfda0260d5062d592(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", p2, Integer.valueOf(p1), p3);
        if (a(p3)) {
            return;
        }
        String str = p2 + " errCode: " + p1;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(p3)) {
            p3 = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f53844b;
        if (aVar != null) {
            aVar.a(bVar, str, p3);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.f63176p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/storepromo/controller/webview/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453 = safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63176p, webView, str, zSafedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453);
        return zSafedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_db35551867e853a1fc9641a759277453(WebView p0, String p1) {
        IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", p1);
        Uri uri = Uri.parse(p1);
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getAuthority()) || TextUtils.isEmpty(uri.getHost()) || !"FyRemote://".toLowerCase().contains(uri.getScheme())) {
            return true;
        }
        HashMap mapA = h0.a(uri);
        String host = uri.getHost();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.f53843a;
        if (aVar == null) {
            return true;
        }
        aVar.a(host, mapA);
        return true;
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.f53843a = aVar;
        this.f53844b = aVar2;
    }

    public static boolean a(String str) {
        s sVar;
        if (str == null || (sVar = IAConfigManager.f53260M.f53294t) == null) {
            return false;
        }
        o oVar = sVar.f53466b;
        String[] strArr = f53842c;
        String strA = oVar.a("font_urls", (String) null);
        if (strA != null) {
            try {
                JSONArray jSONArray = new JSONArray(strA);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr2[i2] = jSONArray.getString(i2);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    public void safedk_b_onReceivedError_5add5806d70aa336d58203a5285b9aeb(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        int errorCode;
        String string;
        super.onReceivedError(p0, p1, p2);
        String string2 = "";
        if (p2 != null) {
            if (p2.getDescription() != null) {
                string2 = p2.getDescription().toString();
            }
            errorCode = p2.getErrorCode();
        } else {
            errorCode = -999;
        }
        if (p1 != null && p1.getUrl() != null) {
            string = p1.getUrl().toString();
        } else {
            string = "unknown";
        }
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", string2, Integer.valueOf(errorCode), string);
        if (a(string)) {
            return;
        }
        String str = string2 + " errCode: " + errorCode;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(string)) {
            string = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f53844b;
        if (aVar != null) {
            aVar.a(bVar, str, string);
        }
    }
}
