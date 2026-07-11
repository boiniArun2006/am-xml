package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IAmraidWebViewController f53810i;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f53980d;
        if (s0Var == null || (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f53417c) == null || (unitDisplayType = l0Var.f53402b) == null) {
            return false;
        }
        return unitDisplayType.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        IAmraidWebViewController iAmraidWebViewController = this.f53810i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.f57113b == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        a88.n nVar;
        if (this.f53957g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f53957g;
            v0Var.f57235y = true;
            v0Var.f57209D = false;
            v0Var.f57212b.f54018h.remove(v0Var);
            v0Var.f57219i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f53957g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.f53810i;
        if (iAmraidWebViewController != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.f57156I;
            if (eVar != null && (nVar = eVar.f54062a) != null) {
                try {
                    nVar.t();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f54062a = null;
                eVar.f54063b = null;
            }
            this.f53810i.e();
            this.f53810i = null;
        }
    }

    public q0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
    }
}
