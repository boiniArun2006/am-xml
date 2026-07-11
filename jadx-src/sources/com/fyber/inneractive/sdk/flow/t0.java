package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class t0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f53925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53926j;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f53980d;
        if (s0Var == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f53420f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.f53980d);
            return false;
        }
        UnitDisplayType unitDisplayType = t0Var.f53480j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        return this.f53925i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.f53957g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f53957g;
            v0Var.f57235y = true;
            v0Var.f57209D = false;
            v0Var.f57212b.f54018h.remove(v0Var);
            v0Var.f57219i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f53957g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.f53925i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f56397a;
            if (bVar != null && (nVar = bVar.f54376b) != null) {
                nVar.f56329i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar.f56387t.f53605b.a();
                if (bVarA != null) {
                    bVarA.destroy();
                }
                if (nVar.f56321a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", com.fyber.inneractive.sdk.player.f.class.getSimpleName());
                    nVar.f56321a.a();
                    nVar.f56321a = null;
                }
                nVar.f56332l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f56387t;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.f53605b;
                    Iterator it = mVar.f53640a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f53640a.clear();
                    mVar.f53641b.clear();
                    mVar.f53642c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.f56388u;
                if (gVar != null) {
                    gVar.f56502a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.f56389v;
                if (bVar2 != null) {
                    bVar2.f53815a.a();
                    bVar2.a();
                    bVar2.f53819e = null;
                    bVar2.f53822h.clear();
                }
            }
            this.f53925i = null;
        }
    }

    public t0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(s0Var, rVar);
        this.f53926j = false;
        this.f53978b = gVar;
        this.f53977a = inneractiveAdRequest;
    }
}
