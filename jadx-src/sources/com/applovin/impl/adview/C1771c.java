package com.applovin.impl.adview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a8;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.k7;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdSize;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.adview.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1771c extends t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f48032c;

    @Override // com.applovin.impl.t4
    protected Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "AdWebViewClient");
        mapHashMap.putAll(f2.a((AppLovinAdImpl) this.f48032c.g()));
        return mapHashMap;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f63161a, webView, str);
        safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(webView, str);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f63161a, view, url);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f63161a, webView, i2, str, str2);
        safedk_c_onReceivedError_8e544adb9beea31f39e1655c605c306d(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f63161a, webView, webResourceRequest, webResourceError);
        safedk_c_onReceivedError_3e062ec97139c0570b7d2cb7765ff835(webView, webResourceRequest, webResourceError);
    }

    public void safedk_c_onReceivedError_3e062ec97139c0570b7d2cb7765ff835(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        onReceivedError(p0, p2.getErrorCode(), p2.getDescription().toString(), p1.getUrl().toString());
    }

    public boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(WebView p0, WebResourceRequest p1) {
        Uri url = p1.getUrl();
        if (url != null) {
            return a(p0, url.toString());
        }
        if (!C1804o.a()) {
            return false;
        }
        this.f48031b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f63161a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba = safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f63161a, webView, webResourceRequest, zSafedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba);
        return zSafedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10 = safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f63161a, webView, str, zSafedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10);
        return zSafedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10;
    }

    private void b() {
        this.f48032c.z();
    }

    private void c() {
        this.f48032c.a();
    }

    protected a d() {
        return this.f48032c;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f48032c.g();
        C1804o.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f48030a.a(x4.f50789R5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    public C1771c(a aVar, C1802k c1802k) {
        this.f48030a = c1802k;
        this.f48031b = c1802k.O();
        this.f48032c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (C1804o.a()) {
            this.f48031b.d("AdWebView", "Loaded URL: " + str);
        }
        this.f48032c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f48032c.g();
        if (C1804o.a()) {
            this.f48031b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (n7.a(webResourceRequest.getUrl().toString(), this.f48030a)) {
            this.f48030a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f48032c.g();
        String str = "Received SSL error: " + sslError;
        if (C1804o.a()) {
            this.f48031b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    public void safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(WebView p0, String p1) {
        super.onLoadResource(p0, p1);
        if (C1804o.a()) {
            this.f48031b.d("AdWebView", "Loaded resource: " + p1);
        }
    }

    public void safedk_c_onReceivedError_8e544adb9beea31f39e1655c605c306d(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        com.applovin.impl.sdk.ad.b bVarG = this.f48032c.g();
        String str = "Received error with error code: " + p1 + " with description \\'" + p2 + "\\' for URL: " + p3;
        if (C1804o.a()) {
            this.f48031b.b("AdWebView", str + " for ad: " + bVarG);
        }
        if (n7.a(p3, this.f48030a)) {
            this.f48030a.D().a("adWebViewReceivedError", p3, p1, p2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean a(WebView webView, String str) {
        boolean z2;
        if (this.f48032c == null) {
            return true;
        }
        if (C1804o.a()) {
            this.f48031b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri uri = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            com.applovin.impl.sdk.ad.b bVarG = this.f48032c.g();
            if (bVarG == null) {
                if (C1804o.a()) {
                    this.f48031b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean zA = bVar.a();
            if ("applovin".equals(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/vibrate".equals(path)) {
                    long j2 = StringUtils.parseLong(uri.getQueryParameter("duration_ms"), 0L);
                    if (j2 > 0) {
                        n7.a(StringUtils.parseFloat(uri.getQueryParameter("intensity"), 0.5f), j2, this.f48030a);
                    }
                } else if ("/adservice/close_ad".equals(path)) {
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (a(zA, bVarG, uri)) {
                        if (C1804o.a()) {
                            this.f48031b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (C1804o.a()) {
                                this.f48031b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        k7.a(uri, this.f48032c, this.f48030a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (C1804o.a()) {
                                this.f48031b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (bVarG instanceof o7) {
                            a((o7) bVarG, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(zA, bVarG, uri)) {
                            if (C1804o.a()) {
                                this.f48031b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (bVarG instanceof o7) {
                            o7 o7Var = (o7) bVarG;
                            if (o7Var.w1()) {
                                a(o7Var, bVar);
                            } else {
                                a(bVar, uri);
                            }
                        }
                    } else if ("/adservice/postback".equals(path)) {
                        k7.a(uri, bVarG, this.f48030a);
                    } else if ("/ga_init".equals(path)) {
                        this.f48032c.b(uri);
                    } else if ("/ga_event".equals(path)) {
                        this.f48032c.a(uri);
                    } else if ("/playable_event".equals(path)) {
                        a(uri);
                    } else if ("/save_template_state".equals(path)) {
                        bVarG.b(uri.getQueryParameter("state"));
                    } else if ("/template_error".equals(path)) {
                        k7.c(uri, bVarG, this.f48030a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f48032c.A();
                    } else if ("/adservice/preload".equals(path)) {
                        k7.b(uri, bVarG, this.f48030a);
                    } else if ("/adservice/custom_intent".equals(path)) {
                        k7.a(uri, bVarG, this.f48032c.i(), this.f48030a);
                    } else {
                        if (C1804o.a()) {
                            this.f48031b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (C1804o.a()) {
                            this.f48031b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else {
                Iterator it = bVarG.V().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z2 = false;
                        break;
                    }
                }
                if (!zA) {
                    boolean zX0 = bVarG.X0();
                    boolean z3 = zX0 ? false : z2;
                    a(uri, zX0, bVarG, this.f48030a);
                    z2 = z3;
                }
                if (z2) {
                    List listP0 = bVarG.p0();
                    List listO0 = bVarG.o0();
                    if ((!listP0.isEmpty() && !listP0.contains(scheme)) || (!listO0.isEmpty() && !listO0.contains(host))) {
                        if (C1804o.a()) {
                            this.f48031b.b("AdWebView", "URL is not whitelisted - bypassing click");
                        }
                    } else if (bVarG instanceof o7) {
                        o7 o7Var2 = (o7) bVarG;
                        if (o7Var2.w1()) {
                            a(o7Var2, bVar);
                        } else {
                            a(bVar, uri);
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(WebView p0, String p1) {
        return a(p0, p1);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f48030a.a(x4.Y5)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : V8ValueNull.NULL));
        }
        if (webView == null || !webView.equals(this.f48032c.f())) {
            return;
        }
        this.f48032c.b();
        AppLovinAdSize appLovinAdSizeK = this.f48032c.k();
        if (n7.a(appLovinAdSizeK)) {
            this.f48032c.a(appLovinAdSizeK);
            this.f48032c.F();
        }
    }

    private boolean a(boolean z2, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z2) {
            return false;
        }
        boolean zY0 = bVar.Y0();
        a(uri, zY0, bVar, this.f48030a);
        return zY0;
    }

    private static void a(Uri uri, boolean z2, com.applovin.impl.sdk.ad.b bVar, C1802k c1802k) {
        if (c1802k.c(x4.R6).contains(uri.getScheme())) {
            return;
        }
        c1802k.D().d(d2.J0, a(bVar, uri, z2));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z2) {
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z2), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f48032c.a(motionEvent);
    }

    private void a(o7 o7Var, b bVar) {
        r7 r7VarG1 = o7Var.g1();
        if (r7VarG1 != null) {
            a8.a(r7VarG1.b(), this.f48032c.j());
            a(bVar, r7VarG1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f48032c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof o7) {
                ((o7) currentAd).getAdEventTracker().v();
            }
            this.f48032c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent());
        } else if (C1804o.a()) {
            this.f48031b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        n7.a(str, C1802k.o());
    }
}
