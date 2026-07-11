package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WebResourceError f42535n;
    private WebResourceErrorBoundaryInterface rl;

    public WebResourceErrorImpl(InvocationHandler invocationHandler) {
        this.rl = (WebResourceErrorBoundaryInterface) SuF.j.n(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceError nr() {
        if (this.f42535n == null) {
            this.f42535n = WebViewGlueCommunicator.t().nr(Proxy.getInvocationHandler(this.rl));
        }
        return this.f42535n;
    }

    private WebResourceErrorBoundaryInterface t() {
        if (this.rl == null) {
            this.rl = (WebResourceErrorBoundaryInterface) SuF.j.n(WebResourceErrorBoundaryInterface.class, WebViewGlueCommunicator.t().O(this.f42535n));
        }
        return this.rl;
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public CharSequence n() {
        ApiFeature.M m2 = WebViewFeatureInternal.f42546S;
        if (m2.rl()) {
            return ApiHelperForM.rl(nr());
        }
        if (m2.t()) {
            return t().getDescription();
        }
        throw WebViewFeatureInternal.n();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int rl() {
        ApiFeature.M m2 = WebViewFeatureInternal.WPU;
        if (m2.rl()) {
            return ApiHelperForM.t(nr());
        }
        if (m2.t()) {
            return t().getErrorCode();
        }
        throw WebViewFeatureInternal.n();
    }

    public WebResourceErrorImpl(WebResourceError webResourceError) {
        this.f42535n = webResourceError;
    }
}
