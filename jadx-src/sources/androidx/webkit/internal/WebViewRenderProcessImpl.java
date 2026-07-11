package androidx.webkit.internal;

import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final WeakHashMap f42569t = new WeakHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WebViewRendererBoundaryInterface f42570n;
    private WeakReference rl;

    public WebViewRenderProcessImpl(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f42570n = webViewRendererBoundaryInterface;
    }

    public static /* synthetic */ Object n(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        return new WebViewRenderProcessImpl(webViewRendererBoundaryInterface);
    }

    public static WebViewRenderProcessImpl rl(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = f42569t;
        WebViewRenderProcessImpl webViewRenderProcessImpl = (WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    public static WebViewRenderProcessImpl t(InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) SuF.j.n(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable() { // from class: androidx.webkit.internal.aC
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WebViewRenderProcessImpl.n(webViewRendererBoundaryInterface);
            }
        });
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.rl = new WeakReference(webViewRenderProcess);
    }
}
