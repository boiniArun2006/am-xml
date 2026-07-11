package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class z extends a {
    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f56754b == null) {
            this.f56754b = new com.fyber.inneractive.sdk.player.ui.t(context, new com.fyber.inneractive.sdk.player.ui.h(), rVar);
        }
        return this.f56754b;
    }

    public z(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f56753a;
        if (zVar != null) {
            return zVar;
        }
        this.f56753a = new com.fyber.inneractive.sdk.player.controller.c0(this.f56755c, (com.fyber.inneractive.sdk.player.ui.t) this.f56754b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().f53978b.f56861m), t0Var.f53979c);
        return super.a(inneractiveAdSpot, t0Var);
    }
}
