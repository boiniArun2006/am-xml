package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f53321a;

    public d0(IAConfigManager iAConfigManager) {
        this.f53321a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.f53321a;
        if (iAConfigManager.f53290p == null) {
            iAConfigManager.f53290p = j.a(iAConfigManager.f53280f);
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new c0(this));
    }
}
