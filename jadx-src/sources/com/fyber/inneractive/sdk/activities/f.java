package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class f extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f53096a;

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f53096a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        this.f53096a.setTitle("Page is Loading...");
        this.f53096a.setProgress(i2 * 100);
        if (i2 == 100) {
            this.f53096a.setTitle(webView.getUrl());
        }
    }
}
