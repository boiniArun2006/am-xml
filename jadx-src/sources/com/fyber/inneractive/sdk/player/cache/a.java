package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f54378a;

    public a(g gVar) {
        this.f54378a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f54378a) {
            try {
                g gVar = this.f54378a;
                if (gVar.f54399i == null) {
                    return null;
                }
                gVar.d();
                g gVar2 = this.f54378a;
                int i2 = gVar2.f54401k;
                if (i2 >= 2000 && i2 >= gVar2.f54400j.size()) {
                    this.f54378a.c();
                    this.f54378a.f54401k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
