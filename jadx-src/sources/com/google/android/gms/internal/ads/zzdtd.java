package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdtd implements zzgzl {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzcrv zzc;
    final /* synthetic */ zzdtk zzd;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    zzdtd(zzdtk zzdtkVar, zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar) {
        this.zza = zzfirVar;
        this.zzb = zzfiuVar;
        this.zzc = zzcrvVar;
        Objects.requireNonNull(zzdtkVar);
        this.zzd = zzdtkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcjl zzcjlVar = (zzcjl) obj;
        zzfir zzfirVar = this.zza;
        zzcjlVar.zzaD(zzfirVar, this.zzb);
        zzclj zzcljVarZzP = zzcjlVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlC)).booleanValue() && zzcljVarZzP != null) {
            zzcrv zzcrvVar = this.zzc;
            zzdtk zzdtkVar = this.zzd;
            zzcljVarZzP.zzd(zzcrvVar, zzdtkVar.zzm(), zzdtkVar.zzn());
            zzcljVarZzP.zze(zzcrvVar, zzdtkVar.zzm(), zzdtkVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoy)).booleanValue() || zzcljVarZzP == null) {
            return;
        }
        zzcljVarZzP.zzb(zzfirVar);
    }
}
