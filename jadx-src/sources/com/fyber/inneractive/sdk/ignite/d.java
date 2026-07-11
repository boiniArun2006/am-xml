package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f54005a;

    public d(h hVar) {
        this.f54005a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f54005a;
        IAlog.a("onInstallTimeout after %d msec", Long.valueOf(hVar.f54021k));
        for (r rVar : hVar.f54018h) {
            if (rVar != null) {
                rVar.a((String) null, j.INSTALL_TIMEOUT.a(), (String) null);
            }
        }
    }
}
