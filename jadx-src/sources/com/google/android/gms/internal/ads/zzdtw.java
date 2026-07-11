package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdtw implements zzboz {
    private final zzdcm zza;

    @Nullable
    private final zzcas zzb;
    private final String zzc;
    private final String zzd;

    public zzdtw(zzdcm zzdcmVar, zzfir zzfirVar) {
        this.zza = zzdcmVar;
        this.zzb = zzfirVar.zzl;
        this.zzc = zzfirVar.zzj;
        this.zzd = zzfirVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(@Nullable zzcas zzcasVar) {
        int i2;
        String str;
        zzcas zzcasVar2 = this.zzb;
        if (zzcasVar2 != null) {
            zzcasVar = zzcasVar2;
        }
        if (zzcasVar != null) {
            str = zzcasVar.zza;
            i2 = zzcasVar.zzb;
        } else {
            i2 = 1;
            str = "";
        }
        this.zza.zze(new zzcad(str, i2), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzc() {
        this.zza.zzf();
    }
}
