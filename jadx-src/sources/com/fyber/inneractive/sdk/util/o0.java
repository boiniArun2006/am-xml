package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f57019a;

    public o0(WebView webView) {
        this.f57019a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f57019a.getSettings().setDisplayZoomControls(false);
    }
}
