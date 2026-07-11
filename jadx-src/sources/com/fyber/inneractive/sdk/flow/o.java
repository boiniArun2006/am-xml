package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f53788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f53789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f53790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.m f53791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53793f = false;

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public void b(InneractiveAdRequest inneractiveAdRequest) {
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.f56974a <= 3) {
            Thread.dumpStack();
        }
        IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.f53789b != null) {
            if (eVar != null && eVar.f56857i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f56857i + ": " + eVar.f56858j));
            }
            ((e0) this.f53789b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f53788a;
        if (cVar == null) {
            return null;
        }
        k kVar = (k) cVar;
        x xVar = kVar.f53695c;
        return xVar != null ? xVar.f53978b : kVar.f53694b;
    }

    public o(String str) {
        this.f53792e = str;
    }

    public String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        s0 s0Var;
        IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f53788a;
        if (cVar != null) {
            n nVar = this.f53789b;
            if (nVar != null && (xVar = ((k) cVar).f53695c) != null) {
                e0 e0Var = (e0) nVar;
                if (e0Var.f53583a.f53690n.get()) {
                    IAlog.a("%s: onAdLoaded: spot is already destroyed", h0.a(e0Var.f53583a));
                    h0 h0Var = e0Var.f53583a;
                    p pVar = h0Var.f53688l;
                    h0Var.a(xVar);
                } else {
                    h0 h0Var2 = e0Var.f53583a;
                    if (!h0Var2.f53686j && (s0Var = h0Var2.f53682f) != null && s0Var.supportsRefresh()) {
                        if (e0Var.f53583a.f53682f.canRefreshAd()) {
                            h0 h0Var3 = e0Var.f53583a;
                            h0Var3.f53681e = xVar;
                            xVar.f53977a = inneractiveAdRequest;
                            g0 g0Var = h0Var3.f53685i;
                            if (g0Var != null) {
                                g0Var.onAdRefreshed(h0Var3);
                            } else {
                                s0 s0Var2 = h0Var3.f53682f;
                                if (s0Var2 instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) s0Var2).onAdRefreshed(h0Var3);
                                }
                            }
                        } else {
                            IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", h0.a(e0Var.f53583a));
                            h0 h0Var4 = e0Var.f53583a;
                            h0Var4.f53685i.onAdRefreshFailed(h0Var4, InneractiveErrorCode.CANCELLED);
                        }
                    } else {
                        h0 h0Var5 = e0Var.f53583a;
                        h0Var5.f53681e = xVar;
                        xVar.f53977a = inneractiveAdRequest;
                        for (s0 s0Var3 : h0Var5.f53683g) {
                            if (s0Var3.supports(h0Var5)) {
                                h0Var5.f53682f = s0Var3;
                                h0 h0Var6 = e0Var.f53583a;
                                InneractiveAdSpot.RequestListener requestListener = h0Var6.f53678b;
                                if (requestListener != null) {
                                    if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                        InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                        s0 s0Var4 = h0Var6.f53682f;
                                        if ((xVar instanceof w0) && (s0Var4 instanceof NativeAdUnitController)) {
                                            w0 w0Var = (w0) xVar;
                                            w0Var.f53974v = (NativeAdUnitController) s0Var4;
                                            nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var6, w0Var);
                                        } else {
                                            IAlog.b("%s: Invalid native response: controller or/and content mismatch", IAlog.a(h0Var6));
                                            nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var6, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                        }
                                    } else {
                                        requestListener.onInneractiveSuccessfulAdRequest(h0Var6);
                                    }
                                }
                                e0Var.f53583a.f53686j = false;
                            }
                        }
                        e0Var.f53583a.f53681e.destroy();
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", h0.a(e0Var.f53583a), e0Var.f53583a.f53681e.f53980d);
                        m mVar = e0Var.f53583a.f53684h;
                        com.fyber.inneractive.sdk.response.e eVarC = mVar != null ? mVar.c() : null;
                        e0Var.a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + e0Var.f53583a.f53681e.f53980d)));
                        h0 h0Var7 = e0Var.f53583a;
                        h0Var7.f53681e = null;
                        h0Var7.f53686j = false;
                    }
                    String str = e0Var.f53583a.f53677a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f54080d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    h0 h0Var8 = e0Var.f53583a;
                    x xVar2 = h0Var8.f53681e;
                    if (xVar2 != null && (eVar = xVar2.f53978b) != null && eVar.f56862n != null) {
                        x xVar3 = h0Var8.f53681e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.f53978b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.f53679c, h0Var8.f53677a, eVar2.f56862n, xVar3.f53979c.b()).a();
                    }
                }
            } else {
                IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            }
            this.f53788a = null;
        }
        b(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        x xVar;
        IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f53788a;
        InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((k) cVar).f53695c) == null) ? null : xVar.f53977a;
        com.fyber.inneractive.sdk.response.e eVarC = c();
        IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        n nVar = this.f53789b;
        if (nVar != null) {
            ((e0) nVar).a(inneractiveAdRequest, eVarC, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, eVarC);
        }
    }

    public void a(boolean z2) {
        this.f53793f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f53788a;
        if (cVar == null || !z2) {
            return;
        }
        cVar.cancel();
        x xVar = ((k) this.f53788a).f53695c;
        if (xVar != null) {
            xVar.destroy();
        }
        this.f53788a = null;
    }
}
