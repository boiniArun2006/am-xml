package com.fyber.inneractive.sdk.player.controller;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f54437a;

    public e(f fVar) {
        this.f54437a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f54437a.f54447s;
        if (gVar != null) {
            gVar.a(gVar.a(), -9223372036854775807L);
            this.f54437a.f54447s.f55692d.f55745f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f54437a.f54447s;
            gVar2.f55692d.d();
            gVar2.f55691c.removeCallbacksAndMessages(null);
            this.f54437a.f54447s = null;
        }
    }
}
