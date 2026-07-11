package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzgzy;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzj extends zzbpd {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;

    @Nullable
    private WebViewClient zzd;

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Nullable
    protected final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.f63168h, webView, str);
        safedk_zzj_onLoadResource_ca9807edc2fbbd9ff6e192a14e708c85(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(h.f63168h, webView, str);
        safedk_zzj_onPageStarted_7aa4b4a8dd756d499f8acedb1dc33264(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63168h, webView, i2, str, str2);
        safedk_zzj_onReceivedError_af4b1c9caa538bc04e44f9db773e8310(webView, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.f63168h, webView, webResourceRequest, webResourceError);
        safedk_zzj_onReceivedError_76e23bbdcab480e47076b253127e40e8(webView, webResourceRequest, webResourceError);
    }

    public void safedk_zzj_onReceivedError_af4b1c9caa538bc04e44f9db773e8310(WebView p0, int p1, String p2, String p3) {
        if (zzd()) {
            return;
        }
        super.onReceivedError(p0, p1, p2, p3);
    }

    @Nullable
    public WebResourceResponse safedk_zzj_shouldInterceptRequest_12c81a37b9918cf70f7df26bf8163489(WebView p0, WebResourceRequest p1) {
        if (zzd()) {
            return null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    @RequiresApi
    public boolean safedk_zzj_shouldOverrideUrlLoading_377a271d571acb8f17e04f7dd0f34a9e(WebView p0, WebResourceRequest p1) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(h.f63168h, webView, webResourceRequest, safedk_zzj_shouldInterceptRequest_12c81a37b9918cf70f7df26bf8163489(webView, webResourceRequest));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.f63168h, webView, str, safedk_zzj_shouldInterceptRequest_4dc56c2b7cc2c6adf0eac4378d6c353d(webView, str));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_zzj_shouldOverrideUrlLoading_377a271d571acb8f17e04f7dd0f34a9e = safedk_zzj_shouldOverrideUrlLoading_377a271d571acb8f17e04f7dd0f34a9e(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, webResourceRequest, zSafedk_zzj_shouldOverrideUrlLoading_377a271d571acb8f17e04f7dd0f34a9e);
        return zSafedk_zzj_shouldOverrideUrlLoading_377a271d571acb8f17e04f7dd0f34a9e;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zzj;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzj_shouldOverrideUrlLoading_fd07415c5d0a1f50abb7d3718f39dca2 = safedk_zzj_shouldOverrideUrlLoading_fd07415c5d0a1f50abb7d3718f39dca2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.f63168h, webView, str, zSafedk_zzj_shouldOverrideUrlLoading_fd07415c5d0a1f50abb7d3718f39dca2);
        return zSafedk_zzj_shouldOverrideUrlLoading_fd07415c5d0a1f50abb7d3718f39dca2;
    }

    private final boolean zzd() {
        if (!((Boolean) zzbjj.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z2 = false;
        boolean z3 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(zzj.class.getName())) {
                if (z2 && z3) {
                    return true;
                }
                z2 = true;
            } else if (z2) {
                z3 = true;
            }
        }
        return false;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    public zzj(WebView webView, zzf zzfVar, @UiThread zzgzy zzgzyVar) {
        this.zza = webView;
        this.zzb = zzfVar;
        this.zzc = zzgzyVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlk), this.zzb.zzb()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        if (zzd()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (zzd()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (zzd()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (zzd()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (zzd()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        if (zzd()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (zzd()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (zzd()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        if (zzd()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f3, float f4) {
        if (zzd()) {
            return;
        }
        super.onScaleChanged(webView, f3, f4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (zzd()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public void safedk_zzj_onLoadResource_ca9807edc2fbbd9ff6e192a14e708c85(WebView p0, String p1) {
        if (zzd()) {
            return;
        }
        super.onLoadResource(p0, p1);
    }

    public void safedk_zzj_onPageStarted_7aa4b4a8dd756d499f8acedb1dc33264(WebView p0, String p1, Bitmap p2) {
        if (zzd()) {
            return;
        }
        zzc();
        super.onPageStarted(p0, p1, p2);
    }

    public void safedk_zzj_onReceivedError_76e23bbdcab480e47076b253127e40e8(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        if (zzd()) {
            return;
        }
        super.onReceivedError(p0, p1, p2);
    }

    @Nullable
    public WebResourceResponse safedk_zzj_shouldInterceptRequest_4dc56c2b7cc2c6adf0eac4378d6c353d(WebView p0, String p1) {
        if (zzd()) {
            return null;
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public boolean safedk_zzj_shouldOverrideUrlLoading_fd07415c5d0a1f50abb7d3718f39dca2(WebView p0, String p1) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(p0, p1);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    final /* synthetic */ void zzb() {
        WebViewClient webViewClientMUb;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT >= 26) {
                webViewClientMUb = webView.getWebViewClient();
            } else {
                if (WebViewFeature.n("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClientMUb = WebViewCompat.mUb(webView);
                    } catch (RuntimeException e2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (webViewClientMUb != this) {
                if (webViewClientMUb != null) {
                    this.zzd = webViewClientMUb;
                }
                this.zza.setWebViewClient(this);
                zzc();
            }
        } catch (IllegalStateException unused) {
        }
    }
}
