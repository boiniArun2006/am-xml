package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfto {
    private static final zzfto zza = new zzfto();

    private zzfto() {
    }

    public static final zzfto zza() {
        return zza;
    }

    public static final boolean zzk(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("javascript: ");
                    sb.append(str);
                    AdMobNetworkBridge.webviewLoadUrl(webView, sb.toString());
                    return true;
                }
            } catch (Exception e2) {
                e2.getMessage();
                zzfsg.zza.getClass();
            }
        }
        return false;
    }

    @VisibleForTesting
    final void zzj(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            zzfsg.zza.getClass();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append(V8ValueNull.NULL);
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb.append(string);
                } else {
                    sb.append(Typography.quote);
                    sb.append(string);
                    sb.append(Typography.quote);
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            zzk(webView, string2);
        } else {
            handler.post(new zzftn(this, webView, string2));
        }
    }

    public final void zzb(WebView webView, String str, JSONObject jSONObject) {
        zzj(webView, "init", jSONObject, str);
    }

    public final void zzc(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzj(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void zzd(WebView webView, String str) {
        zzj(webView, "finishSession", str);
    }

    public final void zze(WebView webView, String str, String str2) {
        zzj(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzf(WebView webView, String str, String str2) {
        zzj(webView, "setState", str2, str);
    }

    public final void zzg(WebView webView, String str, String str2) {
        zzj(webView, "setDeviceLockState", str2);
    }

    public final void zzh(WebView webView, String str, float f3) {
        zzj(webView, "setDeviceVolume", Float.valueOf(f3), str);
    }

    public final void zzi(WebView webView, @NonNull JSONObject jSONObject) {
        zzj(webView, "setLastActivity", jSONObject);
    }
}
