package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzffb implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ zzcvc zzc;
    final /* synthetic */ zzfff zzd;

    zzffb(zzfff zzfffVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzcvc zzcvcVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = zzcvcVar;
        Objects.requireNonNull(zzfffVar);
        this.zzd = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzfff zzfffVar = this.zzd;
        synchronized (zzfffVar) {
            try {
                zzcvc zzcvcVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcvcVar.zzc().zzg(th);
                zzfffVar.zzs(zzeVarZzg);
                zzcvcVar.zzb().zzdI(zzeVarZzg);
                zzfkh.zza(zzeVarZzg.zza, th, "BannerAdLoader.onFailure");
                if (zzfffVar.zzr()) {
                    zzfffVar.zzn();
                    zzfffVar.zzo().zzd(zzfffVar.zzq().zzc());
                }
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                    zzfor zzforVarZzp = zzfffVar.zzp();
                    zzfoe zzfoeVar = this.zzb;
                    zzfoeVar.zzh(zzeVarZzg);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzforVarZzp.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzeVarZzg);
                    zzfoe zzfoeVar2 = this.zzb;
                    zzfoeVar2.zzj(th);
                    zzfoeVar2.zzd(false);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzfff zzfffVar = this.zzd;
        zzctx zzctxVar = (zzctx) obj;
        synchronized (zzfffVar) {
            if (zzctxVar != null) {
                try {
                    zzctxVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfffVar.zzr()) {
                zzfffVar.zzc();
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                zzfor zzforVarZzp = zzfffVar.zzp();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzg(zzctxVar.zzr().zzb);
                zzfoeVar.zzi(zzctxVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzforVarZzp.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzctxVar.zzr().zzb);
                zzfooVar.zzg(zzctxVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzb;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
