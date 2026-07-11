package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfst implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfsv zza;

    zzfst(zzfsv zzfsvVar) {
        Objects.requireNonNull(zzfsvVar);
        this.zza = zzfsvVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.t());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfsg.zza.getClass();
                    return;
                } else {
                    this.zza.zzg(string2);
                    return;
                }
            }
            this.zza.zzf(string2);
        } catch (JSONException e2) {
            zzfue.zza("Error parsing JS message in JavaScriptSessionService.", e2);
        }
    }
}
