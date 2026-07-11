package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f57172e;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f63176p, webView, str);
        safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f63176p, webView, str);
        safedk_k0_onPageStarted_55e13a21f09af3e6fa96da754e574b55(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f63176p, webView, i2, str, str2);
        safedk_k0_onReceivedError_b22b6879bfac1bb0412f4ab0db7dbb4c(webView, i2, str, str2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f63176p, webView, webResourceRequest, safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/k0;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2 = safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f63176p, webView, str, zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2);
        return zSafedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2;
    }

    public WebResourceResponse safedk_k0_shouldInterceptRequest_d2b0cda7f0212217cff9d9ea52019c55(WebView p0, WebResourceRequest p1) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f57168a && p1 != null) {
            IAlog.e("shouldInterceptRequest, method = %s", p1.getMethod());
            b1 b1Var = b1.f57073c;
            int i2 = this.f57169b;
            int i3 = this.f57170c;
            int i5 = this.f57171d;
            b1Var.getClass();
            WebResourceResponse webResourceResponse = null;
            if (p1.getUrl() != null && p1.getUrl().getScheme() != null && p1.getUrl().getScheme().startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e) && TextUtils.equals(p1.getMethod(), "GET")) {
                c1 c1Var = (c1) b1Var.f57074a.get(new d1(p1));
                if (c1Var != null) {
                    webResourceResponse = new WebResourceResponse(c1Var.f57080c, c1Var.f57081d, c1Var.f57082e, c1Var.f57083f, c1Var.f57079b, new ByteArrayInputStream(c1Var.f57078a));
                } else {
                    try {
                        url = new URL(p1.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer byteBufferAllocateDirect = (ByteBuffer) com.fyber.inneractive.sdk.util.f.f56996b.f56997a.poll();
                        if (byteBufferAllocateDirect == null) {
                            byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        }
                        try {
                            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                            try {
                                httpURLConnection.setRequestMethod(p1.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                b1.a(p1, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i3);
                            c1 c1VarA = null;
                            while (i5 > 0) {
                                try {
                                    c1VarA = b1.a(httpURLConnection, byteBufferAllocateDirect);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i5 = 0;
                                }
                                if (c1VarA != null) {
                                    break;
                                }
                                i5--;
                            }
                            if (c1VarA != null) {
                                try {
                                    if (c1VarA.a()) {
                                        b1Var.f57074a.put(new d1(p1), c1VarA);
                                    }
                                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(c1VarA.f57080c, c1VarA.f57081d, c1VarA.f57082e, c1VarA.f57083f, c1VarA.f57079b, new ByteArrayInputStream(c1VarA.f57078a));
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.f56996b.f56997a.offer(byteBufferAllocateDirect);
                                    webResourceResponse = webResourceResponse2;
                                } catch (Throwable unused6) {
                                    DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                    com.fyber.inneractive.sdk.util.f.f56996b.f56997a.offer(byteBufferAllocateDirect);
                                }
                            } else {
                                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            com.fyber.inneractive.sdk.util.f.f56996b.f56997a.offer(byteBufferAllocateDirect);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.e("shouldInterceptRequest did not intercept %s", p1.getUrl());
        }
        return super.shouldInterceptRequest(p0, p1);
    }

    public k0(j jVar, boolean z2, int i2, int i3, int i5) {
        this.f57172e = jVar;
        this.f57168a = z2;
        this.f57169b = i2;
        this.f57170c = i3;
        this.f57171d = i5;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.e("onPageFinished - url: %s", str);
        j jVar = this.f57172e;
        if (jVar != null) {
            jVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        j jVar = this.f57172e;
        if (jVar != null) {
            jVar.a();
            return true;
        }
        return true;
    }

    public void safedk_k0_onLoadResource_5e4c7aec67db305f1f538b12d57d1270(WebView p0, String p1) {
        super.onLoadResource(p0, p1);
        IAlog.e("Resources to load: %s", p1);
        IAlog.d("%s %s", "RESOURCES", p1);
        j jVar = this.f57172e;
        if (jVar != null) {
            i iVar = (i) jVar;
            if (!TextUtils.isEmpty(p1) && p1.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62221v) && !com.fyber.inneractive.sdk.util.s.a()) {
                IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(iVar), p1);
            }
        }
    }

    public void safedk_k0_onPageStarted_55e13a21f09af3e6fa96da754e574b55(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        IAlog.e("onPageStarted - url: %s", p1);
    }

    public void safedk_k0_onReceivedError_b22b6879bfac1bb0412f4ab0db7dbb4c(WebView p0, int p1, String p2, String p3) {
        IAlog.e("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(p1), p2, p0);
        super.onReceivedError(p0, p1, p2, p3);
        j jVar = this.f57172e;
        if (jVar != null) {
            jVar.d();
        }
    }

    public boolean safedk_k0_shouldOverrideUrlLoading_54382488ca1c63006c3b71a3450023e2(WebView p0, String p1) {
        super.shouldOverrideUrlLoading(p0, p1);
        j jVar = this.f57172e;
        if (jVar != null && jVar.a(p0, p1)) {
            return true;
        }
        return false;
    }
}
