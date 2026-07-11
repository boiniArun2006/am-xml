package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f54232c;

    public c(f fVar, int i2, long j2) {
        this.f54232c = fVar;
        this.f54230a = i2;
        this.f54231b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54232c.f54249d.sendEmptyMessageDelayed(this.f54230a, this.f54231b);
    }
}
