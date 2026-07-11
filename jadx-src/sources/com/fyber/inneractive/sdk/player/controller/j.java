package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f54462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f54463b;

    public j(q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.f54463b = qVar;
        this.f54462a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f54463b;
        if (qVar.f54477g) {
            return;
        }
        try {
            Iterator it = qVar.f54472b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f54462a);
            }
        } catch (Exception e2) {
            if (IAlog.f56974a <= 3) {
                q qVar2 = this.f54463b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e2, IAlog.a(qVar2));
            }
        }
    }
}
