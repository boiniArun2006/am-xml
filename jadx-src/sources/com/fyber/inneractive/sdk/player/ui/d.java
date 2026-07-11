package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f56424b;

    public d(e eVar, boolean z2) {
        this.f56424b = eVar;
        this.f56423a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f56423a == this.f56424b.hasWindowFocus()) {
            this.f56424b.f();
        }
    }
}
