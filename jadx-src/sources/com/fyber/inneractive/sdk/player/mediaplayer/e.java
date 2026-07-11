package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolder f56350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f56351b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.f56351b = pVar;
        this.f56350a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f56351b, this.f56350a);
    }
}
