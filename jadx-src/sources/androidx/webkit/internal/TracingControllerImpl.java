package androidx.webkit.internal;

import androidx.webkit.TracingController;
import androidx.webkit.internal.ApiFeature;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class TracingControllerImpl extends TracingController {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private android.webkit.TracingController f42525n;
    private TracingControllerBoundaryInterface rl;

    public TracingControllerImpl() {
        ApiFeature.P p2 = WebViewFeatureInternal.wTp;
        if (p2.rl()) {
            this.f42525n = ApiHelperForP.n();
            this.rl = null;
        } else {
            if (p2.t()) {
                this.f42525n = null;
                this.rl = WebViewGlueCommunicator.nr().getTracingController();
                return;
            }
            throw WebViewFeatureInternal.n();
        }
    }
}
