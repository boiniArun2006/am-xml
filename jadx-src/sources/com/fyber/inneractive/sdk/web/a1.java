package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f57070a;

    public a1(b1 b1Var) {
        this.f57070a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f57070a.f57074a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
