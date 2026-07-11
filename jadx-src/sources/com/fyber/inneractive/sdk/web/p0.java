package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p0 implements gm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f57188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f57189c;

    @Override // gm.j
    public final void a() {
        v0 v0Var = this.f57189c;
        v0Var.f57212b.a(v0Var.f57213c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f57216f, v0Var.f57214d, v0Var.f57218h.f53930a));
        this.f57189c.d("onShowInstallStarted();");
    }

    public p0(v0 v0Var, String str, String str2) {
        this.f57189c = v0Var;
        this.f57187a = str;
        this.f57188b = str2;
    }

    @Override // gm.j
    public final void a(String str) {
        v0 v0Var = this.f57189c;
        v0Var.f57212b.m();
        v0Var.d("onInstallationFailed();");
        v0 v0Var2 = this.f57189c;
        v0Var2.f57218h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f57187a, this.f57188b, v0Var2.f57214d);
    }
}
