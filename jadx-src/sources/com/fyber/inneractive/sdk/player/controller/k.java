package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f54464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f54465b;

    public k(f fVar, boolean z2) {
        this.f54465b = fVar;
        this.f54464a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f54465b;
        if (qVar.f54477g) {
            return;
        }
        try {
            Iterator it = qVar.f54472b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).c(this.f54464a);
            }
        } catch (Exception e2) {
            if (IAlog.f56974a <= 3) {
                q qVar2 = this.f54465b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e2, IAlog.a(qVar2));
            }
        }
    }
}
