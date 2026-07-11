package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f54460a;

    public h(i iVar) {
        this.f54460a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f54460a.f54461a.f54474d;
        if (xVar != null) {
            z zVar = xVar.f54498a;
            zVar.getClass();
            IAlog.a("%s onTextureViewDestroyed", IAlog.a(zVar));
        }
    }
}
