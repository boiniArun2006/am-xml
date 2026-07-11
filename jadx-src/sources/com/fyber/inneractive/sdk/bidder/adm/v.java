package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class v implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f53115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e f53116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f53117c;

    public v(y yVar, c0 c0Var, com.fyber.inneractive.sdk.response.e eVar) {
        this.f53117c = yVar;
        this.f53115a = c0Var;
        this.f53116b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (eVar == null || exc != null) {
            String message = exc != null ? exc.getMessage() : "empty";
            com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f54080d.b(this.f53117c.f53123d);
            iVarB.f54094a.put(new com.fyber.inneractive.sdk.metrics.h(message), Long.valueOf(System.currentTimeMillis() - iVarB.f54096c));
            if (this.f53115a != null) {
                Exception exc2 = exc != null ? exc : new Exception("adm markup network result is empty");
                c0 c0Var = this.f53115a;
                this.f53117c.getClass();
                c0Var.a(exc2, (exc == null || !(exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a)) ? ((exc instanceof k1) && ((k1) exc).f54269a == 404) ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, this.f53116b);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f54080d;
        com.fyber.inneractive.sdk.metrics.i iVarB2 = dVar.b(this.f53117c.f53123d);
        iVarB2.f54094a.put(new com.fyber.inneractive.sdk.metrics.h("success"), Long.valueOf(System.currentTimeMillis() - iVarB2.f54096c));
        c0 c0Var2 = this.f53115a;
        if (c0Var2 != null) {
            IAlog.a("%s : InneractiveAdSpotImpl data available", h0.a(c0Var2.f53575d));
            h0 h0Var = c0Var2.f53575d;
            com.fyber.inneractive.sdk.config.global.r rVar = c0Var2.f53573b;
            e0 e0Var = h0Var.f53680d;
            if (h0Var.f53690n.get()) {
                IAlog.a("%s: loadAdWithRetries: spot is already destroyed won't continue", IAlog.a(h0Var));
                h0Var.a(h0Var.f53681e);
                return;
            }
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.f53688l;
            if (pVar != null) {
                pVar.f53789b = e0Var;
                dVar.b(h0Var.f53677a).f54097d = System.currentTimeMillis();
                pVar.f53795g = eVar;
                if (!IAConfigManager.d()) {
                    IAConfigManager.addListener(pVar);
                    IAConfigManager.a();
                } else {
                    pVar.f53790c = rVar;
                    com.fyber.inneractive.sdk.network.p pVar2 = new com.fyber.inneractive.sdk.network.p(rVar, eVar, h0Var.f53677a, pVar);
                    pVar.f53791d = pVar2;
                    pVar2.c();
                }
            }
        }
    }
}
