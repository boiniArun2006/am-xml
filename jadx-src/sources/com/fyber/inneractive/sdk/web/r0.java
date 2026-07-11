package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f57193a;

    public r0(v0 v0Var) {
        this.f57193a = v0Var;
    }

    public final void a(boolean z2) {
        if (this.f57193a.f57231u.compareAndSet(false, true)) {
            this.f57193a.d("onCancelResult(" + z2 + ");");
            this.f57193a.f57232v.set(false);
        }
    }
}
