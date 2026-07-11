package com.fyber.inneractive.sdk.measurement.tracker;

import a88.C;
import a88.Dsr;
import a88.Wre;
import a88.o;
import a88.w6;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b extends e {
    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(m mVar) {
        super.a(mVar);
        DTExchangeNetworkBridge.webviewLoadUrl(mVar, "javascript:FyberMraidVideoTracker.initOmid(\"" + this.f54065d.rl() + "\",\"" + this.f54065d.t() + "\");");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final w6 b() {
        try {
            Wre wre = Wre.DEFINED_BY_JAVASCRIPT;
            Dsr dsr = Dsr.DEFINED_BY_JAVASCRIPT;
            C c2 = C.JAVASCRIPT;
            return w6.n(wre, dsr, c2, c2, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        WebView webView;
        if (this.f54064c || this.f54062a == null || (webView = this.f54066e) == null) {
            return;
        }
        this.f54064c = true;
        q0.a(webView, "FyberMraidVideoTracker.impression();");
    }

    public b(o oVar, m mVar) {
        super(oVar, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        WebView webView = this.f54066e;
        if (webView != null) {
            q0.a(webView, "FyberMraidVideoTracker.adUserInteraction();");
        }
    }
}
