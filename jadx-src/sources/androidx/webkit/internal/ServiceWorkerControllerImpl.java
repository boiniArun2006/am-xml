package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import androidx.webkit.internal.ApiFeature;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ServiceWorkerController f42520n;
    private ServiceWorkerControllerBoundaryInterface rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ServiceWorkerWebSettingsCompat f42521t;

    private ServiceWorkerController n() {
        if (this.f42520n == null) {
            this.f42520n = ApiHelperForN.rl();
        }
        return this.f42520n;
    }

    public ServiceWorkerControllerImpl() {
        ApiFeature.N n2 = WebViewFeatureInternal.gh;
        if (n2.rl()) {
            this.f42520n = ApiHelperForN.rl();
            this.rl = null;
            this.f42521t = ApiHelperForN.nr(n());
        } else {
            if (n2.t()) {
                this.f42520n = null;
                ServiceWorkerControllerBoundaryInterface serviceWorkerController = WebViewGlueCommunicator.nr().getServiceWorkerController();
                this.rl = serviceWorkerController;
                this.f42521t = new ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
                return;
            }
            throw WebViewFeatureInternal.n();
        }
    }
}
