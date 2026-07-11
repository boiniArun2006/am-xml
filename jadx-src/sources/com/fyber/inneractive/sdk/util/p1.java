package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f57022a;

    public p1(s1 s1Var) {
        this.f57022a = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1 s1Var = this.f57022a;
        s1Var.getClass();
        r.f57025a.execute(new r1(s1Var));
    }
}
