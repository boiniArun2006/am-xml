package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class s extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f54309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f54310f;

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.f54286b = true;
        this.f54285a = null;
        this.f54310f.f54315a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final String b() {
        return this.f54310f.r();
    }

    public s(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.f54309e = inneractiveAdRequest;
        q0 q0Var = new q0(new q(this), inneractiveAdRequest, rVar);
        this.f54310f = q0Var;
        q0Var.f54318d = new r(this);
    }
}
