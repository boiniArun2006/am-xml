package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfdx implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzfdy zzd;
    final /* synthetic */ zzfeb zze;

    zzfdx(zzfeb zzfebVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfdy zzfdyVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfdyVar;
        Objects.requireNonNull(zzfebVar);
        this.zze = zzfebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzfeb zzfebVar = this.zze;
        zzcth zzcthVar = (zzcth) zzfebVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcthVar == null ? zzfkm.zzb(th, null) : zzcthVar.zza().zzg(th);
        synchronized (zzfebVar) {
            try {
                zzfebVar.zzl(null);
                if (zzcthVar != null) {
                    zzcthVar.zze().zzdI(zzeVarZzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                        zzfebVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze.zzi().zzdI(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    zzfebVar.zzi().zzdI(zzeVarZzb);
                    ((zzcth) zzfebVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfkh.zza(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzk = zzfebVar.zzk();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzeVarZzb);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzforVarZzk.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzeVarZzb);
                    zzfoe zzfoeVar2 = this.zzc;
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
        zzfeb zzfebVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzfebVar) {
            if (zzcwfVar != null) {
                try {
                    zzcwfVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfebVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                zzcwfVar.zzq().zzc(zzfebVar.zzi());
            }
            this.zza.zzb(zzcwfVar);
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzk = zzfebVar.zzk();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                zzfoeVar.zzi(zzcwfVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzforVarZzk.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzcwfVar.zzr().zzb);
                zzfooVar.zzg(zzcwfVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
