package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdnf implements zzikg {
    private final zzdnd zza;

    private zzdnf(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    public static zzdnf zzc(zzdnd zzdndVar) {
        return new zzdnf(zzdndVar);
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static JSONObject zzd(zzdnd zzdndVar) {
        JSONObject jSONObjectZzc = zzdndVar.zzc();
        zziko.zzb(jSONObjectZzc);
        return jSONObjectZzc;
    }
}
