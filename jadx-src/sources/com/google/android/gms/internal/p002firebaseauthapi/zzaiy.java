package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzaiy implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaiy() {
    }

    public static zzaiy zza(String str, String str2, boolean z2) {
        zzaiy zzaiyVar = new zzaiy();
        zzaiyVar.zzb = Preconditions.checkNotEmpty(str);
        zzaiyVar.zzc = Preconditions.checkNotEmpty(str2);
        zzaiyVar.zzf = z2;
        return zzaiyVar;
    }

    public static zzaiy zzb(String str, String str2, boolean z2) {
        zzaiy zzaiyVar = new zzaiy();
        zzaiyVar.zza = Preconditions.checkNotEmpty(str);
        zzaiyVar.zzd = Preconditions.checkNotEmpty(str2);
        zzaiyVar.zzf = z2;
        return zzaiyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
