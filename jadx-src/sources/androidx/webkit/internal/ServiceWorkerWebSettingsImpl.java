package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ServiceWorkerWebSettings f42522n;
    private ServiceWorkerWebSettingsBoundaryInterface rl;

    public ServiceWorkerWebSettingsImpl(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f42522n = serviceWorkerWebSettings;
    }

    public ServiceWorkerWebSettingsImpl(InvocationHandler invocationHandler) {
        this.rl = (ServiceWorkerWebSettingsBoundaryInterface) SuF.j.n(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
