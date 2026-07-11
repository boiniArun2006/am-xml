package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f53712a;

    public n0(p0 p0Var) {
        this.f53712a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.f57026b.post(this.f53712a.f53797l);
        p0 p0Var = this.f53712a;
        v1 v1Var = p0Var.f53798m;
        if (v1Var != null) {
            v1Var.f57050e = null;
            p0Var.f53798m = null;
        }
        p0Var.f53802q = false;
    }
}
