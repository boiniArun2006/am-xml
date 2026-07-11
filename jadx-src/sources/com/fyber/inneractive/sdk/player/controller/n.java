package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f54470a;

    public n(q qVar) {
        this.f54470a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f54470a.f54472b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).d();
            }
        } catch (Exception e2) {
            if (IAlog.f56974a <= 3) {
                q qVar = this.f54470a;
                qVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e2, IAlog.a(qVar));
            }
        }
    }
}
