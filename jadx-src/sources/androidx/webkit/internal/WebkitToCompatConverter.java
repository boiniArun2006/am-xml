package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class WebkitToCompatConverter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f42571n;

    public InvocationHandler O(WebResourceError webResourceError) {
        return this.f42571n.convertWebResourceError(webResourceError);
    }

    public SafeBrowsingResponse n(InvocationHandler invocationHandler) {
        return C.n(this.f42571n.convertSafeBrowsingResponse(invocationHandler));
    }

    public WebResourceError nr(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f42571n.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler rl(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f42571n.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public InvocationHandler t(WebMessagePort webMessagePort) {
        return this.f42571n.convertWebMessagePort(webMessagePort);
    }

    public WebkitToCompatConverter(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f42571n = webkitToCompatConverterBoundaryInterface;
    }
}
