package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f57024b;

    public q1(s1 s1Var, String str) {
        this.f57024b = s1Var;
        this.f57023a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f57024b.f57035c.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.f57023a).apply();
    }
}
