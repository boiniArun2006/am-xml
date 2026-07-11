package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f57173a;

    public l0(m0 m0Var) {
        this.f57173a = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0 v0Var = this.f57173a.f57181a;
        if (v0Var.f57235y) {
            return;
        }
        v0Var.e(v0Var.f57221k);
    }
}
