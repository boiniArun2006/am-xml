package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f56994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f56995b;

    public e(com.fyber.inneractive.sdk.web.e eVar, String str) {
        this.f56995b = eVar;
        this.f56994a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.f56995b;
        Object obj = this.f56994a;
        eVar.getClass();
        String str = (String) obj;
        String str2 = s.a() ? com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62221v : com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u;
        if (!TextUtils.isEmpty(str) && !eVar.f57088a.isTerminated() && !eVar.f57088a.isShutdown()) {
            if (TextUtils.isEmpty(eVar.f57098k)) {
                eVar.f57099l.f57127p = str2.concat("wv.inner-active.mobi/");
            } else {
                eVar.f57099l.f57127p = str2 + eVar.f57098k;
            }
            if (eVar.f57093f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar = eVar.f57099l;
            com.fyber.inneractive.sdk.web.m mVar = iVar.f57113b;
            if (mVar != null) {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(mVar, iVar.f57127p, str, "text/html", "utf-8", null);
                eVar.f57099l.f57128q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar.f57117f;
                if (gVar != null) {
                    gVar.a(iVar, inneractiveInfrastructureError);
                }
                iVar.b(true);
            }
        } else if (!eVar.f57088a.isTerminated() && !eVar.f57088a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.f57099l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar2.f57117f;
            if (gVar2 != null) {
                gVar2.a(iVar2, inneractiveInfrastructureError2);
            }
            iVar2.b(true);
        }
        eVar.f57093f = true;
        eVar.f57088a.shutdownNow();
        Handler handler = eVar.f57089b;
        if (handler != null) {
            d dVar = eVar.f57091d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            e eVar2 = eVar.f57090c;
            if (eVar2 != null) {
                eVar.f57089b.removeCallbacks(eVar2);
            }
            eVar.f57089b = null;
        }
        eVar.f57099l.f57126o = null;
    }
}
