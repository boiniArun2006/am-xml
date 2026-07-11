package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f53412a;

    public q(s sVar) {
        this.f53412a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f53412a;
        Iterator it = sVar.f53467c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.f53466b);
        }
    }
}
