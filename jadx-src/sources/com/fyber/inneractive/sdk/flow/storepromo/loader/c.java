package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f53846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f53847b;

    public c(d dVar, String str) {
        this.f53847b = dVar;
        this.f53846a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f53847b.f53848a;
        String str = this.f53846a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f53851a;
        if (aVar != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(aVar, null, str, "text/html", C.UTF8_NAME, null);
            } catch (Throwable th) {
                if (fVar.f53855e != null) {
                    fVar.f53855e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th.getMessage(), "");
                }
            }
        }
    }
}
