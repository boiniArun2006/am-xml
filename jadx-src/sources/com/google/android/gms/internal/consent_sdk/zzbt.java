package com.google.android.gms.internal.consent_sdk;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbt extends WebViewClient {
    final /* synthetic */ zzbv zza;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.f63168h, webView, str);
        safedk_zzbt_onLoadResource_2660ffb8318e14997e294194bcd8a464(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63168h, webView, i2, str, str2);
        safedk_zzbt_onReceivedError_ed2b794167b61b684900cc78ce332689(webView, i2, str, str2);
    }

    public boolean safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6(WebView p0, WebResourceRequest p1) {
        String string = p1.getUrl().toString();
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, string)) {
            return false;
        }
        zzbvVar.zzb.zze(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.f63168h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6 = safedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, webResourceRequest, zSafedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6);
        return zSafedk_zzbt_shouldOverrideUrlLoading_667720b988ad36c39b06c77707db52b6;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/consent_sdk/zzbt;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad = safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, str, zSafedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad);
        return zSafedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad;
    }

    /* synthetic */ zzbt(zzbv zzbvVar, zzbu zzbuVar) {
        this.zza = zzbvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzbv zzbvVar = this.zza;
        if (zzbvVar.zzc) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbvVar.zzc = true;
    }

    public void safedk_zzbt_onLoadResource_2660ffb8318e14997e294194bcd8a464(WebView p0, String p1) {
        zzbv zzbvVar = this.zza;
        if (zzbv.zzf(zzbvVar, p1)) {
            zzbvVar.zzb.zze(p1);
        }
    }

    public void safedk_zzbt_onReceivedError_ed2b794167b61b684900cc78ce332689(WebView p0, int p1, String p2, String p3) {
        this.zza.zzb.zzf(p1, p2, p3);
    }

    public boolean safedk_zzbt_shouldOverrideUrlLoading_446fae08627b6c35cf0bc859c42067ad(WebView p0, String p1) {
        zzbv zzbvVar = this.zza;
        if (!zzbv.zzf(zzbvVar, p1)) {
            return false;
        }
        zzbvVar.zzb.zze(p1);
        return true;
    }
}
