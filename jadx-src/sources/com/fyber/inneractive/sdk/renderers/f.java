package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f extends f0 {
    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f56754b == null) {
            this.f56754b = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.f56755c, rVar, a());
        }
        return this.f56754b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void b() {
        this.f56755c.getClass();
    }

    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f56753a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f56753a = new com.fyber.inneractive.sdk.player.controller.g(this.f56755c, this.f56754b, inneractiveAdSpot.getAdContent().f53980d, t0Var.f53979c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.f53260M.f53285k || t0Var.f53982f, a());
        }
        return this.f56753a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.f56755c.getClass();
        eVar.a();
    }
}
