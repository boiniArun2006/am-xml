package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f53301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f53302b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.f53301a = iAConfigManager;
        this.f53302b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = ixS.j.rl;
            com.fyber.inneractive.sdk.util.r.f57026b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
