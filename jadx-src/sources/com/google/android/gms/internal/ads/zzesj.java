package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzesj implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzdmq zzd;
    final /* synthetic */ zzesm zze;

    zzesj(zzesm zzesmVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdmq zzdmqVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdmqVar;
        Objects.requireNonNull(zzesmVar);
        this.zze = zzesmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdmq zzdmqVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdmqVar.zza().zzg(th);
        zzdmqVar.zzb().zzdI(zzeVarZzg);
        zzesm zzesmVar = this.zze;
        zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdI(zzeVarZzg);
            }
        });
        zzfkh.zza(zzeVarZzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
            zzfor zzforVarZzg = zzesmVar.zzg();
            zzfoe zzfoeVar = this.zzc;
            zzfoeVar.zzh(zzeVarZzg);
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzforVarZzg.zzb(zzfoeVar.zzm());
            return;
        }
        zzfooVar.zzf(zzeVarZzg);
        zzfoe zzfoeVar2 = this.zzc;
        zzfoeVar2.zzj(th);
        zzfoeVar2.zzd(false);
        zzfooVar.zza(zzfoeVar2);
        zzfooVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzesm zzesmVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzesmVar) {
            if (zzcwfVar != null) {
                try {
                    zzcwfVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcwfVar.zzq().zza(zzesmVar.zzf().zzc());
            this.zza.zzb(zzcwfVar);
            zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzg = zzesmVar.zzg();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                zzfoeVar.zzi(zzcwfVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzforVarZzg.zzb(zzfoeVar.zzm());
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
