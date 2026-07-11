package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f57103a;

    public e1(i1 i1Var) {
        this.f57103a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f57103a.f57113b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f57103a.f57158K);
        }
    }
}
