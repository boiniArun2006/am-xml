package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f56352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f56353b;

    public f(p pVar, Surface surface) {
        this.f56353b = pVar;
        this.f56352a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f56353b, this.f56352a);
    }
}
