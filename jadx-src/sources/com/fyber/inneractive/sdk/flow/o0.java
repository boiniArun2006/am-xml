package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f53794a;

    public o0(p0 p0Var) {
        this.f53794a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        Runnable runnable = this.f53794a.f53799n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.post(runnable);
        }
        p0 p0Var = this.f53794a;
        v1 v1Var = p0Var.f53800o;
        if (v1Var != null) {
            v1Var.f57050e = null;
            p0Var.f53800o = null;
        }
    }
}
