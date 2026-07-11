package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f55917a;

    public j(p pVar) {
        this.f55917a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f55917a;
        if (pVar.f55943G) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f55959p;
        lVar.getClass();
        lVar.f55745f.obtainMessage(9, pVar).sendToTarget();
    }
}
