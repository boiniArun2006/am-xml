package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzaib implements zzaes {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    @Nullable
    private final String zzg;

    @Nullable
    private final String zzh;
    private final boolean zzi;

    @Nullable
    private zzage zzj;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzage zzageVar = this.zzj;
        if (zzageVar != null) {
            jSONObject.put("autoRetrievalInfo", zzageVar.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        String str4 = this.zzh;
        if (str4 != null) {
            zzajc.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public zzaib(String str, long j2, boolean z2, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z3) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = j2;
        this.zzc = z2;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = z3;
    }

    public final void zza(zzage zzageVar) {
        this.zzj = zzageVar;
    }
}
