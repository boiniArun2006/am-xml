package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class NetworkBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63086a = "javascript:";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap<HttpURLConnection, f> f63087b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final ExecutorService f63088c = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, RequestInfo> f63089d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63090e = "SafeDKNetwork";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63091f = "";

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class RequestInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f63095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f63096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f63097c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ByteArrayOutputStream f63098d = new ByteArrayOutputStream();

        public RequestInfo(String sdkPackageName, String url) {
            this.f63095a = null;
            this.f63096b = null;
            this.f63095a = sdkPackageName;
            this.f63096b = url;
        }

        public String a() {
            return this.f63095a;
        }

        public String b() {
            return this.f63096b;
        }

        public String c() {
            if (this.f63097c == null) {
                this.f63097c = this.f63098d.toString();
            }
            return this.f63097c;
        }

        public boolean d() {
            return (TextUtils.isEmpty(this.f63095a) || TextUtils.isEmpty(this.f63096b)) ? false : true;
        }

        public void a(byte[] bArr, long j2) {
            this.f63098d.write(bArr, 0, (int) j2);
        }

        public String toString() {
            return "Info{" + this.f63095a + " " + this.f63096b + "}";
        }

        public void a(String str) {
            this.f63096b = str;
        }
    }

    public static void disposeOfConnectionToStreamMapping(HttpURLConnection connection) {
        try {
            f63087b.remove(connection);
        } catch (Throwable th) {
            Logger.e(f63090e, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public static void logWebviewLoadURLRequest(final String sdk, final WebView webview, final String url) {
        if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
            Logger.d(f63090e, "logWebviewLoadURLRequest loadUrl url is null or a javascript command : ", url);
            return;
        }
        Logger.d("logWebviewLoadURLRequest webview", "loadUrl ", Integer.valueOf(webview.getId()), ", webview class name=", webview.getClass().getCanonicalName(), ", WebView address : ", webview.toString(), PtsLKY.JWTzUFUrf, Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", "");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (n.c()) {
                f63088c.submit(new Runnable() { // from class: com.safedk.android.internal.partials.NetworkBridge.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkBridge.b(sdk, webview, url);
                    }
                });
            } else {
                b(sdk, webview, url);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2) {
        try {
            Logger.d("logWebviewLoadURLRequestImpl webview", "loadUrl ", Integer.valueOf(webView.getId()), ", webview class name=", webView.getClass().getCanonicalName(), ", WebView address : ", webView.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", "");
            Logger.d(f63090e, "logWebviewLoadURLRequest: ", str2);
            if (str2 != null) {
                BrandSafetyUtils.a(str, str2, webView);
            }
        } catch (Throwable th) {
            Logger.e(f63090e, "caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public static Object invokeMethod(String className, String methodName, Object targetInstance, Class[] parametersTypes, Object[] paramaterValues) throws IOException {
        try {
            Method declaredMethod = Class.forName(className).getDeclaredMethod(methodName, parametersTypes);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(targetInstance, paramaterValues);
        } catch (ClassNotFoundException e2) {
            throw new IOException("Network access denied", e2.getCause());
        } catch (IllegalAccessException e3) {
            throw new IOException("Network access denied", e3.getCause());
        } catch (NoSuchMethodException e4) {
            throw new IOException("Network access denied", e4.getCause());
        } catch (InvocationTargetException e5) {
            throw new IOException("Network access denied", e5.getCause());
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            throw new IOException("error occurred while trying to access network");
        }
    }
}
