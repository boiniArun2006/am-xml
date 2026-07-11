package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q0 implements gm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f57191a;

    @Override // gm.j
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.f57191a;
        v0Var.f57212b.a(v0Var.f57213c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f57216f, v0Var.f57214d, v0Var.f57218h.f53930a));
        this.f57191a.d("onShowInstallStarted();");
    }

    public q0(v0 v0Var) {
        this.f57191a = v0Var;
    }

    @Override // gm.j
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
