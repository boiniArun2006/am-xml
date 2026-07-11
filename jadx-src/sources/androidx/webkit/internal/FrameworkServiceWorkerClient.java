package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
public class FrameworkServiceWorkerClient extends ServiceWorkerClient {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ServiceWorkerClientCompat f42512n;

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f42512n.n(webResourceRequest);
    }
}
