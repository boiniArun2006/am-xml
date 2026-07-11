package g4f;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.caoccao.javet.values.primitive.V8ValueNull;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static fuX f67048n = new fuX();

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ WebView f67050n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f67051t;

        j(WebView webView, String str) {
            this.f67050n = webView;
            this.f67051t = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            fuX.this.ck(this.f67050n, this.f67051t);
        }
    }

    public static final fuX n() {
        return f67048n;
    }

    public void Ik(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        ck(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    void KN(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            K7m.Ml.n("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        gh(sb, objArr);
        sb.append(")}");
        xMQ(webView, sb);
    }

    public boolean ck(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }

    void gh(StringBuilder sb, Object[] objArr) {
        String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                string = V8ValueNull.NULL;
            } else {
                if (obj instanceof String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append(Typography.quote);
                        sb.append(string);
                        sb.append(Typography.quote);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    private fuX() {
    }

    public void HI(WebView webView, String str, String str2) {
        KN(webView, "setState", str2, str);
    }

    public void J2(WebView webView, String str, JSONObject jSONObject) {
        KN(webView, "init", jSONObject, str);
    }

    public void O(WebView webView, String str, String str2, JSONObject jSONObject) {
        KN(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void Uo(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        KN(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public void az(WebView webView, String str, String str2) {
        KN(webView, "setNativeViewHierarchy", str2, str);
    }

    public void mUb(WebView webView, JSONObject jSONObject) {
        KN(webView, "setLastActivity", jSONObject);
    }

    public void nr(WebView webView, String str, String str2) {
        KN(webView, "setDeviceLockState", str2);
    }

    public void qie(WebView webView, String str) {
        KN(webView, "publishImpressionEvent", str);
    }

    public void rl(WebView webView, String str) {
        KN(webView, "finishSession", str);
    }

    public void t(WebView webView, String str, float f3) {
        KN(webView, "setDeviceVolume", Float.valueOf(f3), str);
    }

    public void ty(WebView webView, String str, JSONObject jSONObject) {
        KN(webView, "publishLoadedEvent", jSONObject, str);
    }

    void xMQ(WebView webView, StringBuilder sb) {
        String string = sb.toString();
        Handler handler = webView.getHandler();
        if (handler != null && Looper.myLooper() != handler.getLooper()) {
            handler.post(new j(webView, string));
        } else {
            ck(webView, string);
        }
    }
}
