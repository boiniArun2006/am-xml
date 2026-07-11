package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f56345c;

    public a(p pVar, int i2, int i3) {
        this.f56345c = pVar;
        this.f56343a = i2;
        this.f56344b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f56345c.f56370i != null) {
            Locale locale = Locale.ENGLISH;
            String str = "Player Error: " + this.f56343a + ", " + this.f56344b;
            n nVar = this.f56345c.f56370i;
            o oVar = new o(str);
            q qVar = (q) nVar;
            qVar.a(com.fyber.inneractive.sdk.player.enums.b.Error);
            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(qVar), oVar);
            qVar.f54479i.post(new com.fyber.inneractive.sdk.player.controller.j(qVar, oVar));
            qVar.k();
        }
    }
}
