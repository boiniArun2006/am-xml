package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f53583a;

    public e0(h0 h0Var) {
        this.f53583a = h0Var;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f53583a.f53690n.get()) {
            IAlog.a("%s : onAdRequestFailed: spot is already destroyed", h0.a(this.f53583a));
            h0 h0Var = this.f53583a;
            p pVar = h0Var.f53688l;
            h0Var.a(h0Var.f53681e);
            return;
        }
        if (this.f53583a.f53678b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f53583a.a(inneractiveAdRequest, eVar);
            }
            h0 h0Var2 = this.f53583a;
            if (!h0Var2.f53686j) {
                g0 g0Var = h0Var2.f53685i;
                if (g0Var != null) {
                    g0Var.onAdRefreshFailed(h0Var2, inneractiveInfrastructureError.getErrorCode());
                    return;
                }
                return;
            }
            m mVar = h0Var2.f53684h;
            p pVar2 = h0Var2.f53688l;
            JSONArray jSONArrayB = null;
            com.fyber.inneractive.sdk.config.global.r rVar2 = pVar2 != null ? pVar2.f53790c : null;
            if (mVar != null && (rVar = mVar.f53790c) != null) {
                jSONArrayB = rVar.b();
            } else if (rVar2 != null) {
                jSONArrayB = rVar2.b();
            }
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, h0Var2.f53681e, eVar, jSONArrayB);
            h0 h0Var3 = this.f53583a;
            InneractiveAdSpot.RequestListener requestListener = h0Var3.f53678b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(h0Var3, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
