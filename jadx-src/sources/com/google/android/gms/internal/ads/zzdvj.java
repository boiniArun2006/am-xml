package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvj {
    private final zzdxz zza;

    zzdvj(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final boolean zza(zzfyu zzfyuVar) {
        if (zzfyuVar.zzj()) {
            zzdxy zzdxyVarZza = this.zza.zza();
            zzdxyVarZza.zzc(FileUploadManager.f61572j, "aq_ad_closed");
            zzdxyVarZza.zzc("gqi", zzfyuVar.zza());
            zzdxyVarZza.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
            zzdxyVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
            zzdxyVarZza.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
            return zzdxyVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzdxy zzdxyVarZza2 = this.zza.zza();
        zzdxyVarZza2.zzc(FileUploadManager.f61572j, "aq_ad_kill");
        zzdxyVarZza2.zzc("gqi", zzfyuVar.zza());
        zzdxyVarZza2.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
        zzdxyVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
        zzdxyVarZza2.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
        zzdxyVarZza2.zzc("aq_is_os_kill", String.valueOf(zzfyuVar.zze()));
        return zzdxyVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
