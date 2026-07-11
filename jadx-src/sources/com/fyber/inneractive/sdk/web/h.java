package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f57109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f57110c;

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.f57110c = iVar;
        this.f57109b = g1Var;
        this.f57108a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.f57110c;
        String str = this.f57108a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.f57109b;
        j1 j1Var = iVar.f57118g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).f56991a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f57108a;
    }
}
