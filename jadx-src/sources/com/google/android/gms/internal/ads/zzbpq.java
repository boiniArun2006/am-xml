package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbpq extends zzbpd {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbpq;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.f63168h, webView, str);
        safedk_zzbpq_onLoadResource_bc3c34bebf5683e7553618f5cf63e4fa(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, view, url);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(h.f63168h, view, errorCode, description, failingUrl);
    }

    @RequiresApi
    public boolean safedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6(WebView p0, WebResourceRequest p1) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p1.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.f63168h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbpq;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6 = safedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, webResourceRequest, zSafedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6);
        return zSafedk_zzbpq_shouldOverrideUrlLoading_d13048726e82b8e1b2145930102420b6;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzbpq;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55 = safedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, str, zSafedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55);
        return zSafedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55;
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzf("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@Nullable WebViewClient webViewClient) {
        zzgrc.zzb(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public zzbpq(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzgrc.zzb(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbpp
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final /* synthetic */ void onH5AdsEvent(String str) {
                int i2 = zzbpq.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public void safedk_zzbpq_onLoadResource_bc3c34bebf5683e7553618f5cf63e4fa(WebView p0, String p1) {
        if (zzc(p0) && !this.zzc.handleH5AdsRequest(p1)) {
            super.onLoadResource(p0, p1);
        }
    }

    public boolean safedk_zzbpq_shouldOverrideUrlLoading_902a111a78cd21242fa7eae56ad2ce55(WebView p0, String p1) {
        if (!zzc(p0)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(p1)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }
}
