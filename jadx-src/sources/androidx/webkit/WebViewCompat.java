package androidx.webkit;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class WebViewCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Uri f42500n = Uri.parse("*");
    private static final Uri rl = Uri.parse("");

    public interface VisualStateCallback {
        void onComplete(long j2);
    }

    public interface WebMessageListener {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    private static WebViewProviderAdapter KN(WebView webView) {
        return new WebViewProviderAdapter(nr(webView));
    }

    public static PackageInfo O() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ApiHelperForO.n();
        }
        try {
            return Uo();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static PackageInfo Uo() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static void az(WebView webView, boolean z2) {
        if (!WebViewFeatureInternal.Nxk.t()) {
            throw WebViewFeatureInternal.n();
        }
        KN(webView).O(z2);
    }

    public static boolean gh() {
        if (WebViewFeatureInternal.f42548U.t()) {
            return J2().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.n();
    }

    public static WebViewClient mUb(WebView webView) {
        ApiFeature.O o2 = WebViewFeatureInternal.f42547T;
        if (o2.rl()) {
            return ApiHelperForO.rl(webView);
        }
        if (!o2.t()) {
            throw WebViewFeatureInternal.n();
        }
        t(webView);
        return KN(webView).t();
    }

    public static ScriptHandler n(WebView webView, String str, Set set) {
        if (WebViewFeatureInternal.eF.t()) {
            return KN(webView).n(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.n();
    }

    public static void qie(WebView webView, String str) {
        if (!WebViewFeatureInternal.p5.t()) {
            throw WebViewFeatureInternal.n();
        }
        KN(webView).nr(str);
    }

    public static void rl(WebView webView, String str, Set set, WebMessageListener webMessageListener) {
        if (!WebViewFeatureInternal.p5.t()) {
            throw WebViewFeatureInternal.n();
        }
        KN(webView).rl(str, (String[]) set.toArray(new String[0]), webMessageListener);
    }

    private static void t(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        Looper looperT = ApiHelperForP.t(webView);
        if (looperT == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperT + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static void ty(WebView webView, String str) {
        if (!WebViewFeatureInternal.f42552a.t()) {
            throw WebViewFeatureInternal.n();
        }
        KN(webView).J2(str);
    }

    public static String xMQ() {
        if (WebViewFeatureInternal.f42543M.t()) {
            return J2().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.n();
    }

    private static WebViewProviderFactory J2() {
        return WebViewGlueCommunicator.nr();
    }

    private static WebViewProviderBoundaryInterface nr(WebView webView) {
        return J2().createWebView(webView);
    }
}
