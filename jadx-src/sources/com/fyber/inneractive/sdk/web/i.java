package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class i implements j, com.fyber.inneractive.sdk.util.m0, l, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f57113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f57114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f57115d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f57117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j1 f57118g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f57122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f57123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f57124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f57125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f57126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f57127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f57128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InneractiveAdRequest f57129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.x f57130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f57131t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57112a = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f57119h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f57120i = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57116e = false;

    @Override // com.fyber.inneractive.sdk.web.j
    public void a(WebView webView) {
    }

    public abstract boolean a(String str, com.fyber.inneractive.sdk.util.g1 g1Var);

    @Override // com.fyber.inneractive.sdk.web.j
    public void d() {
    }

    public void e() {
        b(false);
    }

    public abstract com.fyber.inneractive.sdk.measurement.tracker.e f();

    public final void i() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        c cVar = this.f57125n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(cVar);
        }
        d dVar = this.f57124m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar);
        }
        this.f57121j = false;
    }

    public final m a(com.fyber.inneractive.sdk.config.global.r rVar) {
        int i2;
        int i3;
        m mVar = new m();
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.f fVar = (com.fyber.inneractive.sdk.config.global.features.f) rVar.a(com.fyber.inneractive.sdk.config.global.features.f.class);
            Boolean boolC = fVar.c("agg_res");
            zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            Integer numA = fVar.a("agg_res_ct");
            int iMax = Math.max(numA != null ? numA.intValue() : 500, 50);
            Integer numA2 = fVar.a("agg_res_rt");
            int iMax2 = Math.max(numA2 != null ? numA2.intValue() : 500, 50);
            Integer numA3 = fVar.a("agg_res_retries");
            iMax = Math.max(numA3 != null ? numA3.intValue() : 2, 1);
            i3 = iMax2;
            i2 = iMax;
        } else {
            i2 = 500;
            i3 = 500;
        }
        k0 k0Var = new k0(this, zBooleanValue, i2, i3, iMax);
        this.f57115d = k0Var;
        mVar.setWebViewClient(k0Var);
        return mVar;
    }

    public com.fyber.inneractive.sdk.util.g1 g() {
        m mVar = this.f57113b;
        return mVar != null ? mVar.getLastClickedLocation() : new com.fyber.inneractive.sdk.util.g1();
    }

    public void h() {
        m mVar = this.f57113b;
        if (mVar == null) {
            return;
        }
        WebSettings settings = mVar.getSettings();
        boolean z2 = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.f53260M.f53291q && com.fyber.inneractive.sdk.util.s.a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f57116e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        m mVar2 = this.f57113b;
        mVar2.setHorizontalScrollBarEnabled(false);
        mVar2.setHorizontalScrollbarOverlay(false);
        mVar2.setVerticalScrollBarEnabled(false);
        mVar2.setVerticalScrollbarOverlay(false);
        mVar2.getSettings().setSupportZoom(false);
        this.f57113b.setFocusable(true);
        this.f57113b.setBackgroundColor(0);
        j0 j0Var = new j0();
        this.f57114c = j0Var;
        this.f57113b.setWebChromeClient(j0Var);
        try {
            Context context = this.f57113b.getContext();
            ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z2 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z2);
        } catch (Exception unused) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f57113b.setListener(this);
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.x xVar) {
        this.f57130s = xVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f57129r = inneractiveAdRequest;
    }

    public void setAdResponse(com.fyber.inneractive.sdk.response.e eVar) {
        this.f57131t = eVar;
    }

    public void setListener(j1 j1Var) {
        this.f57118g = j1Var;
    }

    public i(boolean z2, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f57122k = z2;
        this.f57113b = a(rVar);
        i1 i1Var = (i1) this;
        this.f57125n = new c(i1Var);
        this.f57124m = new d(i1Var);
    }

    public void b(boolean z2) {
        int i2;
        IAlog.a("%s destroy is fatal: %b", IAlog.a(this), Boolean.valueOf(z2));
        e eVar = this.f57126o;
        if (eVar != null && !eVar.f57088a.isTerminated() && !eVar.f57088a.isShutdown()) {
            e eVar2 = this.f57126o;
            eVar2.f57093f = true;
            eVar2.f57088a.shutdownNow();
            Handler handler = eVar2.f57089b;
            if (handler != null) {
                com.fyber.inneractive.sdk.util.d dVar = eVar2.f57091d;
                if (dVar != null) {
                    handler.removeCallbacks(dVar);
                }
                com.fyber.inneractive.sdk.util.e eVar3 = eVar2.f57090c;
                if (eVar3 != null) {
                    eVar2.f57089b.removeCallbacks(eVar3);
                }
                eVar2.f57089b = null;
            }
            this.f57126o = null;
        }
        m mVar = this.f57113b;
        if (mVar != null) {
            com.fyber.inneractive.sdk.util.l0.f57009a.a(mVar);
            com.fyber.inneractive.sdk.util.v.a(this.f57113b);
            this.f57113b.setWebChromeClient(null);
            if (f() == null) {
                this.f57113b.destroy();
            } else {
                com.fyber.inneractive.sdk.measurement.tracker.e eVarF = f();
                a88.n nVar = eVarF.f54062a;
                if (nVar != null) {
                    try {
                        nVar.t();
                    } catch (Throwable unused) {
                    }
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 1000;
                    }
                    com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVarF), i2);
                    eVarF.f54062a = null;
                    eVarF.f54063b = null;
                }
            }
        }
        k0 k0Var = this.f57115d;
        if (k0Var != null) {
            k0Var.f57172e = null;
        }
        c cVar = this.f57125n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(cVar);
        }
        d dVar2 = this.f57124m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar2);
        }
        this.f57118g = null;
        if (!z2) {
            this.f57117f = null;
        }
        this.f57113b = null;
        this.f57114c = null;
        this.f57115d = null;
        this.f57130s = null;
        this.f57129r = null;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        g gVar = this.f57117f;
        if (gVar != null) {
            gVar.a(this, inneractiveInfrastructureError);
        }
        b(true);
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f3, Rect rect) {
        if (f3 == this.f57119h && rect.equals(this.f57120i)) {
            return;
        }
        this.f57119h = f3;
        this.f57120i.set(rect);
        m mVar = this.f57113b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.f57113b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            DTExchangeNetworkBridge.webviewLoadUrl(this.f57113b, "chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        com.fyber.inneractive.sdk.util.g1 g1VarG = g();
        if (a(str, g1VarG)) {
            return true;
        }
        a(new h(this, str, g1VarG));
        return true;
    }

    public void a(boolean z2) {
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z2));
        j1 j1Var = this.f57118g;
        if (j1Var != null) {
            j1Var.a(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a() {
        j1 j1Var = this.f57118g;
        if (j1Var != null) {
            j1Var.a();
        }
        b(true);
    }

    public final void a(f fVar) {
        IAlog.e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f57121j) {
            IAlog.e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            fVar.d();
            i();
            return;
        }
        if (this.f57122k) {
            IAlog.e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            d dVar = this.f57124m;
            if (dVar != null) {
                com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar);
            }
            this.f57123l = fVar;
            if (this.f57124m != null) {
                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(this.f57124m, IAConfigManager.f53260M.f53294t.f53466b.a("click_timeout", 1000, 1000));
                return;
            }
            return;
        }
        d dVar2 = this.f57124m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar2);
        }
        this.f57123l = null;
        fVar.d();
    }
}
