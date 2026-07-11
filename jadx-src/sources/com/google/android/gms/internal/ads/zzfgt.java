package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfgt implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzdlu zzd;
    final /* synthetic */ zzfgv zze;

    zzfgt(zzfgv zzfgvVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdlu zzdluVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdluVar;
        Objects.requireNonNull(zzfgvVar);
        this.zze = zzfgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdlu zzdluVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdluVar.zzb().zzg(th);
        zzfgv zzfgvVar = this.zze;
        synchronized (zzfgvVar) {
            try {
                zzfgvVar.zzi(null);
                zzdluVar.zza().zzdI(zzeVarZzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjy)).booleanValue()) {
                    zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzdI(zzeVarZzg);
                        }
                    });
                    zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgr
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdI(zzeVarZzg);
                        }
                    });
                }
                zzfkh.zza(zzeVarZzg.zza, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzh = zzfgvVar.zzh();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzeVarZzg);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzforVarZzh.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzeVarZzg);
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
        zzfgv zzfgvVar = this.zze;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzfgvVar) {
            if (zzdknVar != null) {
                try {
                    zzdknVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfgvVar.zzi(null);
            zzbgv zzbgvVar = zzbhe.zzjy;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzdev zzdevVarZzq = zzdknVar.zzq();
                zzdevVarZzq.zza(zzfgvVar.zzf());
                zzdevVarZzq.zzd(zzfgvVar.zzg());
            }
            this.zza.zzb(zzdknVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzg();
                    }
                });
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzh = zzfgvVar.zzh();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzdknVar.zzr().zzb);
                zzfoeVar.zzi(zzdknVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzforVarZzh.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzdknVar.zzr().zzb);
                zzfooVar.zzg(zzdknVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
