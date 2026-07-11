package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class zzckz extends zzcky {
    @Override // com.google.android.gms.internal.ads.zzcky, com.google.android.gms.internal.ads.zzcjw, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, view, url);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzckz;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.f63168h, webView, webResourceRequest, safedk_zzckz_shouldInterceptRequest_15f0f72bf8645553a805431fb0ff8893(webView, webResourceRequest));
    }

    @Nullable
    public WebResourceResponse safedk_zzckz_shouldInterceptRequest_15f0f72bf8645553a805431fb0ff8893(WebView p0, WebResourceRequest p1) {
        if (p1 == null || p1.getUrl() == null) {
            return null;
        }
        return zzac(p0, p1.getUrl().toString(), p1.getRequestHeaders());
    }

    public zzckz(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z2, @Nullable zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z2, zzejfVar);
    }
}
