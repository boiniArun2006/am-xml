package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IOException f55920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f55921b;

    public l(p pVar, IOException iOException) {
        this.f55921b = pVar;
        this.f55920a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f55921b.f55948e;
        IOException iOException = this.f55920a;
        if (((com.fyber.inneractive.sdk.player.controller.f) b0Var.f54426a.get()) != null) {
            iOException.getCause();
        }
    }
}
