package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class t implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f53654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f53655b;

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        this.f53655b.f53661h.set(false);
        this.f53655b.f53662i.a(iVar);
        this.f53654a.a();
    }

    public t(u uVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f53655b = uVar;
        this.f53654a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f53655b.f53661h.set(false);
        this.f53655b.f53662i.a(iVar, inneractiveInfrastructureError);
        this.f53654a.a(inneractiveInfrastructureError.description());
    }
}
