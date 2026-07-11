package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.C1808t;
import com.applovin.impl.f2;
import com.applovin.impl.j0;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.o8;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.w7;
import com.applovin.impl.x4;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class b extends j0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f48020j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f48021k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1804o f48022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1802k f48023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f48024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f48025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f48026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f48027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f48028i;

    class a extends t4 {
        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f63161a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f63161a, view, url);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f63161a, view, errorCode, description, failingUrl);
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f63161a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f63161a, view, url, zShouldOverrideUrlLoading);
            return zShouldOverrideUrlLoading;
        }

        a() {
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "AdWebView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f48025f = true;
        this.f48026g = false;
        super.destroy();
    }

    @Override // com.applovin.impl.j0, com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.j0, com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i2, int i3, int i5, int i7) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    private void b() {
        synchronized (this.f48028i) {
            try {
                Iterator it = this.f48027h.iterator();
                while (it.hasNext()) {
                    o8.a(this, (String) it.next(), "AdWebView", this.f48023d);
                }
                this.f48027h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f48024e;
    }

    public void setAdHtmlLoaded(boolean z2) {
        this.f48026g = z2;
        if (z2 && ((Boolean) this.f48023d.a(x4.y6)).booleanValue()) {
            b();
        }
    }

    public b(C1771c c1771c, C1802k c1802k, Context context) {
        WebViewClient aVar;
        com.applovin.impl.adview.a aVarD;
        super(context);
        this.f48027h = new ArrayList();
        this.f48028i = new Object();
        if (c1802k != null) {
            this.f48023d = c1802k;
            this.f48022c = c1802k.O();
            Integer num = (Integer) c1802k.a(x4.G6);
            if (num.intValue() > 0) {
                synchronized (f48021k) {
                    Set set = f48020j;
                    set.add(this);
                    n7.a("AdWebView", set.size(), num.intValue(), c1802k.D());
                }
            }
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            if (c1771c != null) {
                aVar = c1771c;
            } else {
                aVar = new a();
            }
            setWebViewClient(aVar);
            if (c1771c != null) {
                aVarD = c1771c.d();
            } else {
                aVarD = null;
            }
            setWebChromeClient(new C1808t(aVarD, c1802k));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (o0.i() && ((Boolean) c1802k.a(x4.Z5)).booleanValue()) {
                setWebViewRenderProcessClient(new d(c1802k).a());
            }
            setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.QJ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return b.a(view, motionEvent);
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.l3D
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f48067n.a(view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!C1804o.a()) {
            return true;
        }
        this.f48022c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f48025f) {
            this.f48024e = bVar;
            try {
                applySettings(bVar);
                if (n7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                try {
                    if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                        try {
                            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", null, "");
                            if (C1804o.a()) {
                                this.f48022c.a("AdWebView", "AppLovinAd rendered");
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } else {
                        if (bVar instanceof o7) {
                            o7 o7Var = (o7) bVar;
                            r7 r7VarG1 = o7Var.g1();
                            if (r7VarG1 != null) {
                                w7 w7VarE = r7VarG1.e();
                                Uri uriC = w7VarE.c();
                                if (uriC != null) {
                                    string = uriC.toString();
                                } else {
                                    string = "";
                                }
                                String str = string;
                                String strB = w7VarE.b();
                                String strI1 = o7Var.i1();
                                if (!StringUtils.isValidString(str) && !StringUtils.isValidString(strB)) {
                                    if (C1804o.a()) {
                                        this.f48022c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                        return;
                                    }
                                    return;
                                }
                                if (w7VarE.d() == w7.a.STATIC) {
                                    if (C1804o.a()) {
                                        this.f48022c.a("AdWebView", "Rendering WebView for static VAST ad");
                                    }
                                    String strA = a((String) this.f48023d.a(x4.N4), str);
                                    if (o7Var.x1() && o7Var.isOpenMeasurementEnabled() && o7Var.y1()) {
                                        strA = this.f48023d.e0().a(strA, f2.a((AppLovinAdImpl) bVar));
                                    }
                                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), strA, "text/html", null, "");
                                    return;
                                }
                                if (w7VarE.d() == w7.a.HTML) {
                                    if (StringUtils.isValidString(strB)) {
                                        String strA2 = a(strI1, strB);
                                        String str2 = StringUtils.isValidString(strA2) ? strA2 : strB;
                                        if (C1804o.a()) {
                                            this.f48022c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str2);
                                        }
                                        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), str2, "text/html", null, "");
                                        return;
                                    }
                                    if (StringUtils.isValidString(str)) {
                                        if (C1804o.a()) {
                                            this.f48022c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                        }
                                        a(str, bVar.k(), strI1, this.f48023d, o7Var);
                                        return;
                                    }
                                    return;
                                }
                                if (w7VarE.d() == w7.a.IFRAME) {
                                    if (StringUtils.isValidString(str)) {
                                        if (C1804o.a()) {
                                            this.f48022c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                        }
                                        a(str, bVar.k(), strI1, this.f48023d, o7Var);
                                        return;
                                    } else {
                                        if (StringUtils.isValidString(strB)) {
                                            String strA3 = a(strI1, strB);
                                            String str3 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                            if (C1804o.a()) {
                                                this.f48022c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                            }
                                            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.k(), str3, "text/html", null, "");
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (C1804o.a()) {
                                    this.f48022c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                                    return;
                                }
                                return;
                            }
                            if (C1804o.a()) {
                                this.f48022c.a("AdWebView", "No companion ad provided.");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : V8ValueNull.NULL) + ") - " + th);
        }
        C1804o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f48023d.a(x4.y6)).booleanValue()) {
            if (this.f48026g) {
                o8.a(this, str, "AdWebView", this.f48023d);
                return;
            }
            synchronized (this.f48027h) {
                this.f48027h.add(str);
            }
            return;
        }
        o8.a(this, str, "AdWebView", this.f48023d);
    }

    private void a(String str, String str2, String str3, C1802k c1802k, o7 o7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (C1804o.a()) {
                this.f48022c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) c1802k.a(x4.O4), str);
        if (StringUtils.isValidString(strA2)) {
            if (o7Var.x1() && o7Var.isOpenMeasurementEnabled()) {
                strA2 = c1802k.e0().a(strA2, f2.a((AppLovinAdImpl) o7Var));
            }
            if (C1804o.a()) {
                this.f48022c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA2);
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, strA2, "text/html", null, "");
            return;
        }
        if (C1804o.a()) {
            this.f48022c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        AppLovinNetworkBridge.webviewLoadUrl(this, str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
