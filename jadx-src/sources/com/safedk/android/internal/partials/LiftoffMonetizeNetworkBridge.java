package com.safedk.android.internal.partials;

import WJ.phkN.HFAkacKHsU;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: LiftoffMonetizeSourceFile */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class LiftoffMonetizeNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.f63164d);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            } else {
                NetworkBridge.logWebviewLoadURLRequest(h.f63164d, targetInstance, url);
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.f63164d);
                if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                    CreativeInfoManager.a(url, (String) null, targetInstance, h.f63164d);
                }
                SafeDKWebAppInterface.a(h.f63164d, targetInstance, url, true);
            }
        }
        targetInstance.loadUrl(url);
    }

    public static ResponseBody okhttp3Response_body(Response targetInstance) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
        ResponseBody responseBodyBody = targetInstance.body();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int iIdentityHashCode = System.identityHashCode(targetInstance);
                NetworkBridge.RequestInfo requestInfoRemove = NetworkBridge.f63089d.remove(Integer.valueOf(iIdentityHashCode));
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body response id ", Integer.valueOf(iIdentityHashCode), ", info ", requestInfoRemove, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (requestInfoRemove == null) {
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, skipping response Id:", Integer.valueOf(iIdentityHashCode));
                } else {
                    int iIdentityHashCode2 = System.identityHashCode(responseBodyBody);
                    NetworkBridge.f63089d.put(Integer.valueOf(iIdentityHashCode2), requestInfoRemove);
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, removing response Id:", Integer.valueOf(iIdentityHashCode), ", adding  responseBodyId:", Integer.valueOf(iIdentityHashCode2), ", RequestInfo:", requestInfoRemove);
                }
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body error ", th.getMessage());
            }
        }
        return responseBodyBody;
    }

    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody targetInstance) {
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
        String str = HFAkacKHsU.PGcuwxbw;
        BufferedSource source = targetInstance.getSource();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int iIdentityHashCode = System.identityHashCode(targetInstance);
                Logger.d(str, "retrofit|retrofitExceptionCatchingRequestBody_source bodyId ", Integer.valueOf(iIdentityHashCode), " retroReq ", NetworkBridge.f63089d, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.f63089d.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo != null) {
                    source = CreativeInfoManager.a(requestInfo.a(), requestInfo.b(), source, iIdentityHashCode);
                    Logger.d(str, "retrofit|retrofitExceptionCatchingRequestBody_source found responseBodyId:", Integer.valueOf(iIdentityHashCode), ", RequestInfo:", requestInfo, ", returning Source: ", source);
                    return source;
                }
                return source;
            } catch (Throwable th) {
                Logger.d(str, "retrofit|retrofitExceptionCatchingRequestBody_source error ", th.getMessage());
                return source;
            }
        }
        return source;
    }

    public static void webViewEvaluateJavaScript(WebView webView, String script, ValueCallback<String> resultCallback) {
        String strV;
        Logger.d("LiftoffMonetizeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/LiftoffMonetizeNetworkBridge;->webViewEvaluateJavaScript(Landroid/webkit/WebView;Ljava/lang/String;Landroid/webkit/ValueCallback;)V");
        webView.evaluateJavascript(script, resultCallback);
        try {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(h.f63164d);
            Logger.printFullVerboseLog("SafeDKNetwork", "on evaluate javascript with package name: ", mainSdkPackage, " view: ", webView, " and script: \n", script);
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
            if (adNetworkDiscoveryJ != null && (strV = adNetworkDiscoveryJ.v(script)) != null) {
                Logger.d("SafeDKNetwork", "evaluate JS - the ad id found is: ", strV);
                adNetworkDiscoveryJ.a(webView, strV);
            }
        } catch (Throwable th) {
            Logger.d("SafeDKNetwork", "exception in evaluate JS: ", th);
        }
    }
}
