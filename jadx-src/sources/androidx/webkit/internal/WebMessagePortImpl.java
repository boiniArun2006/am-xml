package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WebMessagePort f42534n;
    private WebMessagePortBoundaryInterface rl;

    public WebMessagePortImpl(WebMessagePort webMessagePort) {
        this.f42534n = webMessagePort;
    }

    public static WebMessagePortCompat[] nr(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[webMessagePortArr.length];
        for (int i2 = 0; i2 < webMessagePortArr.length; i2++) {
            webMessagePortCompatArr[i2] = new WebMessagePortImpl(webMessagePortArr[i2]);
        }
        return webMessagePortCompatArr;
    }

    private WebMessagePortBoundaryInterface t() {
        if (this.rl == null) {
            this.rl = (WebMessagePortBoundaryInterface) SuF.j.n(WebMessagePortBoundaryInterface.class, WebViewGlueCommunicator.t().t(this.f42534n));
        }
        return this.rl;
    }

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.rl = (WebMessagePortBoundaryInterface) SuF.j.n(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static WebMessageCompat rl(WebMessage webMessage) {
        return ApiHelperForM.n(webMessage);
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public InvocationHandler n() {
        return Proxy.getInvocationHandler(t());
    }
}
