package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.flow.c0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f53110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f53111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f53112c;

    public t(y yVar, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f53112c = yVar;
        this.f53110a = c0Var;
        this.f53111b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53112c.a(this.f53110a, this.f53111b);
    }
}
