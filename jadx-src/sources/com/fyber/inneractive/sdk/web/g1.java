package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f57107a;

    public g1(i1 i1Var) {
        this.f57107a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        i1 i1Var = this.f57107a;
        if (i1Var.f57155H == null || (eVar = i1Var.f57156I) == null) {
            return;
        }
        eVar.c();
    }
}
