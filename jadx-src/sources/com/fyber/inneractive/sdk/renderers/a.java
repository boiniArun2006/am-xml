package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class a extends f0 {
    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f56754b;
        return sVar == null ? new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.h(), this.f56755c, rVar, a()) : sVar;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void b() {
        this.f56755c.getClass();
    }

    public a(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f56753a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f56753a = new com.fyber.inneractive.sdk.player.controller.s(this.f56755c, (com.fyber.inneractive.sdk.player.ui.o) this.f56754b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().f53978b.f56861m), t0Var.f53979c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, a());
        }
        return this.f56753a;
    }
}
