package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f56440a;

    public k(l lVar) {
        this.f56440a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f56440a;
        int i2 = lVar.f56504k;
        if (i2 != 0) {
            int i3 = (lVar.f56503j / i2) + lVar.f56447F;
            lVar.f56447F = i3;
            lVar.a(i3);
        }
        l lVar2 = this.f56440a;
        if (lVar2.f56447F < lVar2.f56448G) {
            lVar2.postDelayed(lVar2.f56446E, lVar2.f56505l);
            return;
        }
        lVar2.f56446E = null;
        lVar2.f56447F = 0;
        lVar2.f56448G = 0;
    }
}
