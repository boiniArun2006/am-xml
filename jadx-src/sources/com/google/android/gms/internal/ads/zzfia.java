package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfia implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzfid zzd;
    final /* synthetic */ zzfie zze;

    zzfia(zzfie zzfieVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfid zzfidVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfidVar;
        Objects.requireNonNull(zzfieVar);
        this.zze = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfie zzfieVar = this.zze;
        zzdue zzdueVar = (zzdue) zzfieVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdueVar == null ? zzfkm.zzb(th, null) : zzdueVar.zza().zzg(th);
        synchronized (zzfieVar) {
            try {
                if (zzdueVar != null) {
                    zzdueVar.zze().zzdI(zzeVarZzb);
                    zzfieVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdI(zzeVarZzb);
                        }
                    });
                } else {
                    zzfieVar.zzg().zzdI(zzeVarZzb);
                    zzfieVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfkh.zza(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzi = zzfieVar.zzi();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzeVarZzb);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzforVarZzi.zzb(zzfoeVar.zzm());
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
        zzfie zzfieVar = this.zze;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfieVar) {
            if (zzdtzVar != null) {
                try {
                    zzdtzVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdtzVar.zzq().zzd(zzfieVar.zzg());
            this.zza.zzb(zzdtzVar);
            Executor executorZzf = zzfieVar.zzf();
            final zzfhv zzfhvVarZzg = zzfieVar.zzg();
            Objects.requireNonNull(zzfhvVarZzg);
            executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfhvVarZzg.zzg();
                }
            });
            zzfieVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzi = zzfieVar.zzi();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzdtzVar.zzr().zzb);
                zzfoeVar.zzi(zzdtzVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzforVarZzi.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzdtzVar.zzr().zzb);
                zzfooVar.zzg(zzdtzVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
