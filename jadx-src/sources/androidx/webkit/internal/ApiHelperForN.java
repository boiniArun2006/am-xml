package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
public class ApiHelperForN {
    public static ServiceWorkerWebSettingsImpl nr(ServiceWorkerController serviceWorkerController) {
        return new ServiceWorkerWebSettingsImpl(t(serviceWorkerController));
    }

    public static File n(Context context) {
        return context.getDataDir();
    }

    public static ServiceWorkerController rl() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings t(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }
}
