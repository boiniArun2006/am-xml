package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.ServiceWorkerControllerImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@AnyThread
public abstract class ServiceWorkerControllerCompat {

    private static class LAZY_HOLDER {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final ServiceWorkerControllerCompat f42481n = new ServiceWorkerControllerImpl();
    }
}
