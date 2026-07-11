package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f56987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f56988b;

    public c(com.fyber.inneractive.sdk.web.e eVar) {
        this.f56988b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f56988b.getClass();
        com.fyber.inneractive.sdk.web.e eVar = this.f56988b;
        boolean z2 = eVar.f57093f;
        if (z2) {
            return;
        }
        d dVar = new d(eVar);
        eVar.f57091d = dVar;
        if (z2) {
            return;
        }
        try {
            eVar.f57088a.execute(dVar);
        } catch (NullPointerException e2) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e2.getMessage());
        } catch (RejectedExecutionException e3) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e3.getMessage());
        }
    }
}
