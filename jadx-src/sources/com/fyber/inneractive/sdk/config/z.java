package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f53498a;

    public z(a0 a0Var) {
        this.f53498a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53498a.f53301a.f53271I = new com.fyber.inneractive.sdk.measurement.e();
        a0 a0Var = this.f53498a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.f53301a.f53271I;
        Context context = a0Var.f53302b;
        if (eVar.f54037a) {
            return;
        }
        eVar.f54037a = true;
        com.fyber.inneractive.sdk.util.r.f57026b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
