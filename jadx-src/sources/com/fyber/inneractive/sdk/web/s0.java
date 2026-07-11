package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f57201a;

    public s0(v0 v0Var) {
        this.f57201a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f57201a.f57231u.compareAndSet(false, true)) {
            this.f57201a.d("onCancelResult(true);");
            this.f57201a.f57232v.set(false);
        }
    }
}
