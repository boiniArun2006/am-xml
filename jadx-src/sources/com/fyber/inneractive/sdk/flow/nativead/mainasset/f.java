package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.alightcreative.gl.egl.il.inFlMLxL;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.player.s;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class f implements d, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f53758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f53759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f53760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InneractiveAdRequest f53761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f53762e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f53764g = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f53763f = new u();

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(inneractiveInfrastructureError.getErrorCode(), i.NATIVE_AD_VIDEO_LOAD_FAILED);
        this.f53764g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f53762e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError2, "onAdFailedToLoad");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.f fVar;
        com.fyber.inneractive.sdk.response.nativead.e eVar;
        String str;
        g gVar;
        if (this.f53763f != null && (fVar = this.f53759b) != null && (eVar = fVar.f56892c) != null && (str = eVar.f56889a) != null && !str.trim().isEmpty() && (gVar = this.f53760c) != null) {
            this.f53764g = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            this.f53763f.a(this.f53758a, gVar, this.f53761d, this);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VIDEO_ERROR_NULL);
        this.f53764g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f53762e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, inFlMLxL.cnocjUVNe);
        }
        IAlog.b(YjqZUJsVmhcjko.mzSOFhnRvMCMR, IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void c() throws Throwable {
        u uVar;
        this.f53764g = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar = this.f53762e;
        if (cVar == null || (uVar = this.f53763f) == null) {
            IAlog.b("%sCan't notify success, required member is null in onAdLoaded. Is null: mLoadListener: %s, mVideoContentLoader: %s", IAlog.a(this), Boolean.valueOf(this.f53762e == null), Boolean.valueOf(this.f53763f == null));
            return;
        }
        t0 t0Var = (t0) uVar.f53695c;
        com.fyber.inneractive.sdk.flow.nativead.f fVar = (com.fyber.inneractive.sdk.flow.nativead.f) cVar;
        if (t0Var == null) {
            fVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, i.NATIVE_AD_EMPTY_CONTENT), "Undetectable main media");
        } else {
            fVar.f53722e = t0Var;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u uVar = this.f53763f;
        if (uVar != null) {
            x xVar = uVar.f53695c;
            if (xVar != null) {
                ((t0) xVar).destroy();
            }
            u uVar2 = this.f53763f;
            uVar2.getClass();
            IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(uVar2));
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(uVar2.f53704l);
            uVar2.f53703k.a();
            this.f53763f = null;
        }
        this.f53762e = null;
        this.f53761d = null;
        this.f53760c = null;
        this.f53764g = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    public f(com.fyber.inneractive.sdk.response.nativead.f fVar, r rVar, g gVar, InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.flow.nativead.f fVar2) {
        this.f53759b = fVar;
        this.f53758a = rVar;
        this.f53760c = gVar;
        this.f53761d = inneractiveAdRequest;
        this.f53762e = fVar2;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f53764g == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
