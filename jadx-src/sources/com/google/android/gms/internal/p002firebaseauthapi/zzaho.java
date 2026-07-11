package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.safedk.android.analytics.brandsafety.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzaho {
    private Long zza;
    private Long zzb;

    public static zzaho zza(String str) throws UnsupportedEncodingException {
        try {
            zzaho zzahoVar = new zzaho();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzahoVar.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzahoVar.zzb = Long.valueOf(jSONObject.optLong(l.f62670y));
            jSONObject.optBoolean("is_anonymous");
            return zzahoVar;
        } catch (JSONException e2) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e2));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e2));
        }
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
