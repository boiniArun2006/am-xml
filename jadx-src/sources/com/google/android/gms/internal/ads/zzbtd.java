package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbtd implements zzbsp {
    private final zzbsr zza;
    private final zzbss zzb;
    private final zzbsl zzc;
    private final String zzd;

    zzbtd(zzbsl zzbslVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzc = zzbslVar;
        this.zzd = str;
        this.zzb = zzbssVar;
        this.zza = zzbsrVar;
    }

    final /* synthetic */ zzbsr zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final com.google.common.util.concurrent.Xo zzb(Object obj) {
        zzcen zzcenVar = new zzcen();
        zzbsf zzbsfVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbsfVarZzb.zze(new zzbta(this, zzbsfVarZzb, obj, zzcenVar), new zzbtb(this, zzcenVar, zzbsfVarZzb));
        return zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final com.google.common.util.concurrent.Xo zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    final /* synthetic */ void zzc(zzbsf zzbsfVar, zzbsm zzbsmVar, Object obj, zzcen zzcenVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbog.zzo.zzb(string, new zzbtc(this, zzbsfVar, zzcenVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbsmVar.zzb(this.zzd, jSONObject);
        } catch (Exception e2) {
            try {
                zzcenVar.zzd(e2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e2);
            } finally {
                zzbsfVar.zza();
            }
        }
    }
}
