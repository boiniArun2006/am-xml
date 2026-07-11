package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f54467b;

    public l(q qVar, int i2) {
        this.f54467b = qVar;
        this.f54466a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f54467b.f54473c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.f54466a);
            }
        } catch (Exception e2) {
            if (IAlog.f56974a <= 3) {
                q qVar = this.f54467b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e2, IAlog.a(qVar));
            }
        }
    }
}
