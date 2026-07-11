package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.click.r;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class g extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f53097a;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f63176p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/g;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f63176p, webView, str);
        safedk_g_onPageStarted_6f4bde0f592d705cc09717aa4cb3a4f9(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/g;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f63176p, webView, i2, str, str2);
        safedk_g_onReceivedError_0751a83671dcbca1316d18b13b6c24f7(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f63176p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/g;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_g_shouldOverrideUrlLoading_9fab89862e2e2551a127a889d71b97a7 = safedk_g_shouldOverrideUrlLoading_9fab89862e2e2551a127a889d71b97a7(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f63176p, webView, str, zSafedk_g_shouldOverrideUrlLoading_9fab89862e2e2551a127a889d71b97a7);
        return zSafedk_g_shouldOverrideUrlLoading_9fab89862e2e2551a127a889d71b97a7;
    }

    public g(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f53097a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f53097a;
        if (inneractiveInternalBrowserActivity.f53080e == webView) {
            inneractiveInternalBrowserActivity.f53080e = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.f53097a.finish();
        return true;
    }

    public boolean safedk_g_shouldOverrideUrlLoading_9fab89862e2e2551a127a889d71b97a7(WebView p0, String p1) {
        if (TextUtils.isEmpty(p1)) {
            return false;
        }
        if (j1.a(p1)) {
            WebView webView = this.f53097a.f53080e;
            if (webView != null) {
                DTExchangeNetworkBridge.webviewLoadUrl(webView, "chrome://crash");
            }
            return true;
        }
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f53097a;
        String str = InneractiveInternalBrowserActivity.URL_EXTRA;
        inneractiveInternalBrowserActivity.getClass();
        com.fyber.inneractive.sdk.click.g gVar = new com.fyber.inneractive.sdk.click.g(new h(inneractiveInternalBrowserActivity), null, com.fyber.inneractive.sdk.util.g.VIDEO_CTA);
        r rVar = new r(false, inneractiveInternalBrowserActivity.f53077b);
        rVar.f53255j.addAll(Arrays.asList(gVar, new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l(), new com.fyber.inneractive.sdk.click.i(false, TextUtils.isEmpty(p1) ? null : Uri.parse(p1).getScheme())));
        rVar.a(inneractiveInternalBrowserActivity.getApplicationContext(), p1, new i(inneractiveInternalBrowserActivity), null, false, com.fyber.inneractive.sdk.ignite.m.NONE, "");
        return true ^ p1.startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Drawable drawableD;
        Drawable drawableD2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            drawableD = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow);
        } else {
            drawableD = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unleft_arrow);
        }
        this.f53097a.f53081f.setImageDrawable(drawableD);
        if (webView.canGoForward()) {
            drawableD2 = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow);
        } else {
            drawableD2 = com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unright_arrow);
        }
        this.f53097a.f53082g.setImageDrawable(drawableD2);
    }

    public void safedk_g_onPageStarted_6f4bde0f592d705cc09717aa4cb3a4f9(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        this.f53097a.f53082g.setImageDrawable(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unright_arrow));
    }

    public void safedk_g_onReceivedError_0751a83671dcbca1316d18b13b6c24f7(WebView p0, int p1, String p2, String p3) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(p1), p2, p3);
    }
}
