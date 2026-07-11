package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeun implements zzfax {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcxv zze;
    private final zzfks zzf;
    private final zzfjk zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzo();
    private final zzdxt zzi;
    private final zzcyj zzj;

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        Bundle bundle = new Bundle();
        zzdxt zzdxtVar = this.zzi;
        Map mapZzc = zzdxtVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            zzdxtVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdxtVar.zzd("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zza) ? "1" : "0");
        }
        zzcxv zzcxvVar = this.zze;
        zzfjk zzfjkVar = this.zzg;
        zzcxvVar.zzi(zzfjkVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzgzo.zza(new zzeuo(this.zza, bundle, str, this.zzc, this.zzh, zzfjkVar.zzg, this.zzj));
    }

    public zzeun(Context context, String str, String str2, zzcxv zzcxvVar, zzfks zzfksVar, zzfjk zzfjkVar, zzdxt zzdxtVar, zzcyj zzcyjVar, long j2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcxvVar;
        this.zzf = zzfksVar;
        this.zzg = zzfjkVar;
        this.zzi = zzdxtVar;
        this.zzj = zzcyjVar;
        this.zzd = j2;
    }
}
