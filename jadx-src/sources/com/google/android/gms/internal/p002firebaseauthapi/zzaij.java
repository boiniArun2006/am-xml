package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class zzaij implements zzaer<zzaij> {
    private static final String zza = "zzaij";

    @Nullable
    public String zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzaij zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzain) ((zzaij) new zzain().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzaip) ((zzaij) new zzaip().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e2) {
            e = e2;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e3) {
            e = e3;
            throw zzajc.zza(e, zza, str);
        }
    }
}
