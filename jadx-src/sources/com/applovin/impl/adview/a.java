package com.applovin.impl.adview;

import ScC.FuwU.XIvb;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC1779g;
import com.applovin.impl.AbstractC1798s;
import com.applovin.impl.C1797r6;
import com.applovin.impl.adview.k;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f47964A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f47965B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private volatile AppLovinAdViewEventListener f47966C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile AppLovinAdClickListener f47967D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f47968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f47969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1802k f47970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f47971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1804o f47972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f47973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f47974g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f47976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f47977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CustomTabsSession f47978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C1771c f47979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f47980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f47981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WebView f47982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f47983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f47984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f47985r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f47975h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f47986s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f47987t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f47988u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f47989v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f47990w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f47991x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f47992y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f47993z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class C0694a extends t4 {
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

        C0694a() {
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "AdViewController:GAWebView");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private class c implements Runnable {
        private c() {
        }

        /* synthetic */ c(a aVar, C0694a c0694a) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f47981n != null) {
                a.this.f47981n.setVisibility(8);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        class C0695a implements k.a {
            C0695a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f47981n.addView(a.this.f47983p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                C1804o unused = a.this.f47972e;
                if (C1804o.a()) {
                    a.this.f47972e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        /* synthetic */ d(a aVar, C0694a c0694a) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f47986s != null) {
                if (a.this.f47981n == null) {
                    C1804o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f47986s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.f47966C, a.this.f47986s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f47970c.g().a(d2.f48251F, a.this.f47986s, mapHashMap);
                    return;
                }
                a.this.v();
                C1804o unused = a.this.f47972e;
                if (C1804o.a()) {
                    a.this.f47972e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f47986s.getAdIdNumber() + "...");
                }
                a.b(a.this.f47981n, a.this.f47986s.getSize());
                if (a.this.f47983p != null) {
                    e8.c(a.this.f47983p);
                    a.this.f47983p = null;
                }
                c2 c2Var = new c2(a.this.f47975h, a.this.f47970c);
                if (c2Var.c()) {
                    a.this.f47983p = new k(c2Var, a.this.f47968a);
                    a.this.f47983p.a(new C0695a());
                }
                a.this.f47981n.setAdHtmlLoaded(false);
                a.this.f47981n.a(a.this.f47986s);
                if (a.this.f47986s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f47993z) {
                    return;
                }
                a.this.f47986s.setHasShown(true);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f47998a;

        private a a() {
            return this.f47998a;
        }

        e(a aVar, C1802k c1802k) {
            if (aVar != null) {
                if (c1802k != null) {
                    this.f47998a = aVar;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No view specified");
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                C1804o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i2);
            }
        }
    }

    private void E() {
        if (this.f47972e != null && C1804o.a() && C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "Destroying...");
        }
        o8.b(this.f47981n);
        this.f47981n = null;
        o8.b(this.f47982o);
        this.f47982o = null;
        this.f47978k = null;
        this.f47964A = null;
        this.f47965B = null;
        this.f47967D = null;
        this.f47966C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f47993z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                this.f47955n.r();
            }
        });
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.I28
            @Override // java.lang.Runnable
            public final void run() {
                this.f47956n.s();
            }
        });
    }

    private void n() {
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f47981n, "/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f47981n != null && this.f47988u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f47988u != null) {
            if (C1804o.a()) {
                this.f47972e.a("AppLovinAdView", "Detaching expanded ad: " + this.f47988u.b());
            }
            this.f47989v = this.f47988u;
            this.f47988u = null;
            a(this.f47976i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f47989v;
        if (fVar == null && this.f47988u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f47989v.dismiss();
            this.f47989v = null;
        } else {
            aVarB = this.f47988u.b();
            this.f47988u.dismiss();
            this.f47988u = null;
        }
        t2.a(this.f47966C, aVarB, (AppLovinAdView) this.f47969b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        AppLovinNetworkBridge.webviewLoadUrl(f(), "chrome://crash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f47986s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!n7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f47970c);
        v2Var.a();
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f47986s.P0()) {
            int iC = this.f47970c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f47981n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f47981n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (n7.a(this.f47976i)) {
            if (((Boolean) this.f47970c.a(x4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f47970c.a(x4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f47970c.a(x4.G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f47970c.a(x4.H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void C() {
        if (this.f47992y) {
            if (this.f47986s == null || !this.f47986s.Z0()) {
                t2.b(this.f47965B, this.f47986s);
            }
            if (this.f47986s != null && this.f47986s.isOpenMeasurementEnabled() && n7.a(this.f47986s.getSize())) {
                this.f47986s.getAdEventTracker().f();
            }
            if (this.f47981n != null && this.f47988u != null) {
                if (C1804o.a()) {
                    this.f47972e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (C1804o.a()) {
                this.f47972e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f47992y || this.f47993z) {
            return;
        }
        this.f47993z = true;
    }

    public void F() {
        if (this.f47992y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f47990w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f47993z = false;
        }
    }

    public AppLovinAdViewEventListener e() {
        return this.f47966C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f47981n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f47986s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    public CustomTabsSession h() {
        return this.f47978k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f47969b;
    }

    public C1802k j() {
        return this.f47970c;
    }

    public AppLovinAdSize k() {
        return this.f47976i;
    }

    public String l() {
        return this.f47977j;
    }

    public void u() {
        if (this.f47970c == null || this.f47980m == null || this.f47968a == null || !this.f47992y) {
            C1804o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f47971d.loadNextAd(this.f47977j, this.f47976i, this.f47980m);
        }
    }

    public void w() {
        if ((this.f47968a instanceof n1) && this.f47986s != null && this.f47986s.K() == b.EnumC0709b.DISMISS) {
            ((n1) this.f47968a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f47988u != null || this.f47989v != null) {
            a();
            return;
        }
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "Ad: " + this.f47986s + " closed.");
        }
        a(this.f47985r);
        t2.b(this.f47965B, this.f47986s);
        this.f47986s = null;
    }

    private void d(String str, Map map) {
        a(o8.d(str, map));
    }

    private void m() {
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f47969b != null && (bVar = this.f47981n) != null && bVar.getParent() == null) {
            this.f47969b.addView(this.f47981n);
            b(this.f47981n, this.f47986s.getSize());
            if (this.f47986s.isOpenMeasurementEnabled()) {
                this.f47986s.getAdEventTracker().a((View) this.f47981n);
            }
        }
    }

    public void A() {
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f47974g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f47986s != null && this.f47986s.r0()) {
            AbstractC1779g.a(this.f47981n, this.f47970c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void c(int i2) {
        String strA = e8.a(i2);
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + strA + " );");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48072n.t();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action != null) {
            switch (action) {
                case "com.applovin.custom_intent_launch_failure":
                case "com.applovin.custom_intent_launch_success":
                    a(action, map);
                    break;
                case "com.applovin.external_redirect_success":
                case "com.applovin.external_redirect_failure":
                    c(action, map);
                    break;
                case "com.applovin.custom_tabs_failure":
                case "com.applovin.custom_tabs_hidden":
                case "com.applovin.custom_tabs_shown":
                    b(action, map);
                    break;
                case "com.applovin.application_paused":
                    m();
                    break;
                case "com.applovin.application_resumed":
                    n();
                    break;
                case "com.applovin.preload_success":
                case "com.applovin.preload_failure":
                    d(action, map);
                    break;
            }
        }
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f47964A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f47965B = appLovinAdDisplayListener;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f47966C = appLovinAdViewEventListener;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(o8.c(str, map));
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f47967D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, C1802k c1802k, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException(XIvb.lrxSmk);
        }
        if (appLovinAdSize != null) {
            this.f47970c = c1802k;
            this.f47971d = c1802k.k();
            this.f47972e = c1802k.O();
            this.f47973f = AppLovinCommunicator.getInstance(context);
            this.f47976i = appLovinAdSize;
            this.f47977j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f47968a = context;
            this.f47969b = appLovinAdView;
            this.f47979l = new C1771c(this, c1802k);
            C0694a c0694a = null;
            this.f47985r = new c(this, c0694a);
            this.f47984q = new d(this, c0694a);
            this.f47980m = new e(this, c1802k);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.adview.aC
            @Override // java.lang.Runnable
            public final void run() {
                this.f47999n.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f47986s.getAdEventTracker().c(webView);
        k kVar = this.f47983p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.f47986s.getAdEventTracker();
            k kVar2 = this.f47983p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f47986s.getAdEventTracker().a((View) webView);
        }
        this.f47986s.getAdEventTracker().h();
        this.f47986s.getAdEventTracker().g();
    }

    protected void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f47979l, this.f47970c, this.f47968a);
            this.f47981n = bVar;
            bVar.setBackgroundColor(0);
            this.f47981n.setWillNotCacheDrawing(false);
            this.f47969b.setBackgroundColor(0);
            this.f47969b.addView(this.f47981n);
            b(this.f47981n, appLovinAdSize);
            if (!this.f47992y) {
                a(this.f47985r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.Xo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47963n.o();
                }
            });
            this.f47992y = true;
        } catch (Throwable th) {
            C1804o.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f47970c.D().a("AppLovinAdView", "initAdWebView", th);
            this.f47991x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f47988u == null && (this.f47986s instanceof com.applovin.impl.sdk.ad.a) && this.f47981n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f47986s;
            Context context = this.f47968a;
            Activity activityB = context instanceof Activity ? (Activity) context : e8.b(this.f47981n, this.f47970c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f47969b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f47981n);
                }
                f fVar = new f(aVar2, this.f47981n, activityB, this.f47970c);
                this.f47988u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.Pl
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f47958n.a(dialogInterface);
                    }
                });
                this.f47988u.show();
                t2.c(this.f47966C, this.f47986s, (AppLovinAdView) this.f47969b);
                if (this.f47986s.isOpenMeasurementEnabled()) {
                    this.f47986s.getAdEventTracker().a((View) this.f47988u.c());
                    return;
                }
                return;
            }
            C1804o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriE1 = aVar2.e1();
            if (uriE1 != null) {
                aVar = this;
                this.f47971d.trackAndLaunchClick(aVar2, i(), aVar, uriE1, motionEvent);
            } else {
                aVar = this;
            }
            aVar.f47981n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            C1804o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = AbstractC1798s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (AbstractC1798s.b(attributeSet)) {
                u();
            }
        }
    }

    public void a(String str, Object obj) {
        this.f47975h.put(str, obj);
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f47993z) {
                c(appLovinAd);
            } else {
                this.f47990w.set(appLovinAd);
                if (C1804o.a()) {
                    this.f47972e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.eO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48044n.a(appLovinAd);
                }
            });
            return;
        }
        if (C1804o.a()) {
            this.f47972e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(boolean z2) {
        if (C1804o.a()) {
            this.f47972e.a("AppLovinAdView", "onWindowFocusChanged( " + z2 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z2 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            n7.b(appLovinAd, this.f47970c);
            if (this.f47992y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f47970c.g().d(d2.f48248C, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) n7.a(appLovinAd, this.f47970c);
                if (bVar == null) {
                    C1804o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.f47965B, "Unable to retrieve the loaded ad");
                    Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f47970c.g().d(d2.f48251F, mapA2);
                    return;
                }
                if (bVar == this.f47986s) {
                    C1804o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f47970c.a(x4.I1)).booleanValue()) {
                        if (this.f47965B instanceof l2) {
                            t2.a(this.f47965B, "Attempting to show ad again");
                        } else if (!n7.c(this.f47970c)) {
                            this.f47970c.g().a(d2.S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f47970c.g().a(d2.f48251F, bVar, mapHashMap);
                    return;
                }
                if (C1804o.a()) {
                    this.f47972e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.f47965B, this.f47986s);
                if (this.f47986s != null && this.f47986s.isOpenMeasurementEnabled()) {
                    this.f47986s.getAdEventTracker().f();
                }
                this.f47990w.set(null);
                this.f47987t = null;
                this.f47986s = bVar;
                if (this.f47986s.isCustomTabsEnabled()) {
                    this.f47978k = this.f47970c.z().a(this);
                    this.f47970c.z().b(this.f47986s.getCustomTabsWarmupUrls(), this.f47978k);
                }
                if (!this.f47993z && n7.a(this.f47976i)) {
                    this.f47970c.k().trackImpression(bVar);
                }
                if (this.f47988u != null) {
                    c();
                }
                a(this.f47984q);
                return;
            }
            C1804o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i2) {
        if (!this.f47993z) {
            a(this.f47985r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f47951n.a(i2);
            }
        });
    }

    private void b(String str) {
        if (((Boolean) this.f47970c.a(x4.E1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(o8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f47986s != null && this.f47986s.w0() && this.f47982o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f47970c.O();
                if (C1804o.a()) {
                    this.f47970c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f47968a);
            this.f47982o = webView;
            webView.setWebViewClient(new C0694a());
            this.f47982o.getSettings().setJavaScriptEnabled(true);
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f47982o, (String) this.f47970c.a(x4.i7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", com.google.android.exoplayer2.C.UTF8_NAME, null);
        }
    }

    public void a(final WebView webView, String str) {
        if (this.f47986s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.Ml
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f47970c.a(x4.y6)).booleanValue() || (str != null && str.startsWith(this.f47986s.k()))) {
            try {
                if (this.f47986s != this.f47987t) {
                    this.f47987t = this.f47986s;
                    x();
                    this.f47981n.setAdHtmlLoaded(true);
                    if (this.f47965B != null) {
                        this.f47970c.y().d(this.f47986s);
                        if (this.f47986s.s0()) {
                            this.f47970c.g().a(d2.f48250E, this.f47986s, CollectionUtils.hashMap("details", f2.b(this.f47986s)));
                        } else {
                            this.f47970c.g().a(d2.f48249D, this.f47986s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f47986s.z())));
                            t2.a(this.f47965B, this.f47986s);
                        }
                        if (this.f47986s.Q0()) {
                            String str2 = (String) this.f47970c.p0().a(z4.f50999T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f47981n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f47981n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f47986s.s0()) {
                            this.f47981n.a("javascript:al_onAdRestored( '" + this.f47986s.X() + "' );");
                        }
                    }
                    if ((this.f47986s instanceof com.applovin.impl.sdk.ad.a) && this.f47986s.isOpenMeasurementEnabled()) {
                        this.f47970c.q0().a(new C1797r6(this.f47970c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.fuX
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f48054n.b(webView);
                            }
                        }), d6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                C1804o.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                C1802k c1802k = this.f47970c;
                if (c1802k != null) {
                    c1802k.D().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.CN3
            @Override // java.lang.Runnable
            public final void run() {
                this.f47953n.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.Wre
            @Override // java.lang.Runnable
            public final void run() {
                this.f47962n.p();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f47971d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (C1804o.a()) {
                aVar.f47972e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        t2.a(aVar.f47967D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f47991x.compareAndSet(true, false)) {
            a(this.f47976i);
        }
        try {
            if (this.f47964A != null) {
                this.f47964A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            C1804o.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            C1802k c1802k = this.f47970c;
            if (c1802k != null) {
                c1802k.D().a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i2) {
        try {
            if (this.f47964A != null) {
                this.f47964A.failedToReceiveAd(i2);
            }
        } catch (Throwable th) {
            C1804o.c("AppLovinAdView", "Exception while running app load callback", th);
            C1802k c1802k = this.f47970c;
            if (c1802k != null) {
                c1802k.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f47974g = bVar;
    }

    private void a(String str, Map map) {
        a(o8.a(str, map));
    }

    private void a(String str) {
        if (this.f47986s == null || this.f47981n == null || !n7.a(this.f47986s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f47981n.a(str);
    }

    public void a(Uri uri) {
        if (this.f47986s == null || !this.f47986s.w0()) {
            return;
        }
        if (this.f47982o == null) {
            this.f47970c.O();
            if (C1804o.a()) {
                this.f47970c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter("event_name");
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f47970c.O();
            if (C1804o.a()) {
                this.f47970c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.qz
            @Override // java.lang.Runnable
            public final void run() {
                this.f48074n.a(queryParameter2, queryParameter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f47970c.a(x4.Q2)).booleanValue()) {
            o8.a(this.f47982o, str3, this.f47970c);
        } else {
            o8.a(this.f47982o, str3);
        }
    }
}
