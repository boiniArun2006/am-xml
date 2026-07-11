package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f56781a;

    public p(r rVar) {
        this.f56781a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f56781a;
        if (rVar.f56791t != null) {
            IAlog.a("%sIdle state reached!", IAlog.a(rVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56781a.f56750k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.f56781a.f56791t = null;
        }
    }
}
