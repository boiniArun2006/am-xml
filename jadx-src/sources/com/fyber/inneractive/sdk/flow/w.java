package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.v0 f53957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f53958h;

    @Override // com.fyber.inneractive.sdk.flow.x
    public final com.fyber.inneractive.sdk.web.v0 a() {
        return this.f53957g;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void a(String str) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        com.fyber.inneractive.sdk.response.e eVar2 = this.f53978b;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.ignite.m mVar3 = eVar2.f56843E;
            mVar3.getClass();
            mVar = com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
            if (mVar3 != mVar) {
                com.fyber.inneractive.sdk.ignite.m mVar4 = this.f53978b.f56843E;
                mVar4.getClass();
                if (mVar4 != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP || isVideoAd()) {
                    mVar = this.f53978b.f56843E;
                } else {
                    this.f53958h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                }
            }
        } else {
            mVar = mVar2;
        }
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.f53260M.f53266D;
        if (!hVar.f54016f || (eVar = this.f53978b) == null || !eVar.a() || !hVar.n()) {
            com.fyber.inneractive.sdk.response.e eVar3 = this.f53978b;
            if (eVar3 != null) {
                eVar3.f56843E = mVar2;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar4 = this.f53978b;
        String str2 = eVar4 != null ? eVar4.f56872x : null;
        com.fyber.inneractive.sdk.web.w0 w0Var = new com.fyber.inneractive.sdk.web.w0();
        w0Var.f57238a = str2;
        w0Var.f57239b = mVar;
        w0Var.f57240c = str;
        w0Var.f57241d = this.f53979c;
        w0Var.f57242e = eVar4 != null ? eVar4.f56842D : null;
        w0Var.f57243f = eVar4 != null ? eVar4.f56844F : null;
        w0Var.f57244g = this.f53958h;
        com.fyber.inneractive.sdk.web.v0 v0Var = new com.fyber.inneractive.sdk.web.v0(w0Var);
        this.f53957g = v0Var;
        com.fyber.inneractive.sdk.config.global.features.r rVar = (com.fyber.inneractive.sdk.config.global.features.r) this.f53979c.a(com.fyber.inneractive.sdk.config.global.features.r.class);
        if (rVar == null || str2 == null) {
            return;
        }
        String strA = rVar.a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
        v0Var.e(strA == null ? "" : strA.replace("[BUNDLE_ID]", str2));
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f53957g;
        return v0Var != null && v0Var.f57222l;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void e() {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.f53260M.f53266D;
        if (!hVar.f54016f || (eVar = this.f53978b) == null || !eVar.a() || !hVar.n() || c() || (eVar2 = this.f53978b) == null) {
            return;
        }
        com.fyber.inneractive.sdk.ignite.m mVar = eVar2.f56843E;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (mVar != mVar2) {
            IAlog.a("ignite webpage was not loaded yet, stopping the loading process", new Object[0]);
            com.fyber.inneractive.sdk.response.e eVar3 = this.f53978b;
            if (mVar2 == null) {
                eVar3.getClass();
            }
            eVar3.f56843E = mVar2;
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f53957g;
            if (v0Var != null) {
                com.fyber.inneractive.sdk.web.n0 n0Var = v0Var.f57226p;
                if (n0Var != null) {
                    com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(n0Var);
                    v0Var.f57226p = null;
                }
                if (!v0Var.f57235y) {
                    v0Var.f57211a.stopLoading();
                }
                this.f53958h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, this.f53957g.f57221k, com.fyber.inneractive.sdk.ignite.j.WEBPAGE_NOT_LOADED_BEFORE_SHOW.a(), this.f53978b.f56843E);
            }
        }
    }

    public w(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f53958h = new v(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean a(boolean z2, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar = this.f53978b;
        if (eVar != null) {
            mVar = eVar.f56843E;
        } else {
            mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
        }
        if (z2 || mVar == null || mVar != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
            return false;
        }
        return gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA || gVar == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD;
    }
}
