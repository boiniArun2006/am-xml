package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.android.billingclient.api.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class CallableC1769z implements Callable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f47657n;
    final /* synthetic */ OS.eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ n f47658t;

    CallableC1769z(n nVar, String str, OS.eO eOVar) {
        this.f47657n = str;
        this.rl = eOVar;
        this.f47658t = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        UGc uGcXg = this.f47658t.xg(this.f47657n);
        this.rl.n(uGcXg.n(), uGcXg.rl());
        return null;
    }
}
