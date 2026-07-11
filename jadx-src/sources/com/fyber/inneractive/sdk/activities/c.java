package com.fyber.inneractive.sdk.activities;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f53093a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f53093a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f53093a.isFinishing()) {
            return;
        }
        this.f53093a.hideNavigationBar();
    }
}
