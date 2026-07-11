package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdtp {
    private final zzdbd zza;
    private final zzdcm zzb;
    private final zzdcz zzc;
    private final zzddq zzd;
    private final zzdgj zze;
    private final zzdjk zzf;
    private final zzdxz zzg;
    private final zzfqk zzh;
    private final zzeiu zzi;
    private final zzcrv zzj;

    zzdtp(zzdbd zzdbdVar, zzdcm zzdcmVar, zzdcz zzdczVar, zzddq zzddqVar, zzdgj zzdgjVar, zzdjk zzdjkVar, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzcrv zzcrvVar) {
        this.zza = zzdbdVar;
        this.zzb = zzdcmVar;
        this.zzc = zzdczVar;
        this.zzd = zzddqVar;
        this.zze = zzdgjVar;
        this.zzf = zzdjkVar;
        this.zzg = zzdxzVar;
        this.zzh = zzfqkVar;
        this.zzi = zzeiuVar;
        this.zzj = zzcrvVar;
    }

    public final void zza(zzdtq zzdtqVar, zzcjl zzcjlVar) throws Throwable {
        zzdtn zzdtnVarZzb = zzdtqVar.zzb();
        final zzdcm zzdcmVar = this.zzb;
        Objects.requireNonNull(zzdcmVar);
        zzdtnVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdto
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdcmVar.zzb();
            }
        }, this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlE)).booleanValue() && zzcjlVar != null && zzcjlVar.zzP() != null) {
            zzclj zzcljVarZzP = zzcjlVar.zzP();
            zzcrv zzcrvVar = this.zzj;
            zzeiu zzeiuVar = this.zzi;
            zzcljVarZzP.zzd(zzcrvVar, zzeiuVar, this.zzh);
            zzcljVarZzP.zze(zzcrvVar, zzeiuVar, this.zzg);
        }
    }
}
