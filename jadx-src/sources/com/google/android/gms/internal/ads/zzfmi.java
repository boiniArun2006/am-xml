package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfmi implements zzikg {
    public static zzfmi zza() {
        return zzfmh.zza;
    }

    public static zzgzy zzc() {
        zzgzy zzgzyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgJ)).booleanValue()) {
            zzgzyVar = zzcei.zzc;
        } else {
            zzgzyVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgI)).booleanValue() ? zzcei.zza : zzcei.zzf;
        }
        zziko.zzb(zzgzyVar);
        return zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
