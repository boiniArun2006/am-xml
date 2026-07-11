package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f56348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f56349b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f56349b = pVar;
        this.f56348a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f56349b.f56370i;
        if (nVar != null) {
            ((q) nVar).a(this.f56348a);
        }
    }
}
