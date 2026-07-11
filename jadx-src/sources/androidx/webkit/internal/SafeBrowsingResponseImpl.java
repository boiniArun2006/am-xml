package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SafeBrowsingResponse f42517n;
    private SafeBrowsingResponseBoundaryInterface rl;

    public SafeBrowsingResponseImpl(InvocationHandler invocationHandler) {
        this.rl = (SafeBrowsingResponseBoundaryInterface) SuF.j.n(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface rl() {
        if (this.rl == null) {
            this.rl = (SafeBrowsingResponseBoundaryInterface) SuF.j.n(SafeBrowsingResponseBoundaryInterface.class, WebViewGlueCommunicator.t().rl(this.f42517n));
        }
        return this.rl;
    }

    private SafeBrowsingResponse t() {
        if (this.f42517n == null) {
            this.f42517n = WebViewGlueCommunicator.t().n(Proxy.getInvocationHandler(this.rl));
        }
        return this.f42517n;
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void n(boolean z2) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.nY;
        if (o_mr1.rl()) {
            ApiHelperForOMR1.n(t(), z2);
        } else {
            if (!o_mr1.t()) {
                throw WebViewFeatureInternal.n();
            }
            rl().showInterstitial(z2);
        }
    }

    public SafeBrowsingResponseImpl(SafeBrowsingResponse safeBrowsingResponse) {
        this.f42517n = safeBrowsingResponse;
    }
}
