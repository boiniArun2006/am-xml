package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbti {
    private final zzbsl zza;
    private com.google.common.util.concurrent.Xo zzb;

    zzbti(zzbsl zzbslVar) {
        this.zza = zzbslVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcen zzcenVar = new zzcen();
            this.zzb = zzcenVar;
            this.zza.zzb(null).zze(new zzcer() { // from class: com.google.android.gms.internal.ads.zzbth
                @Override // com.google.android.gms.internal.ads.zzcer
                public final /* synthetic */ void zza(Object obj) {
                    zzcenVar.zzc((zzbsm) obj);
                }
            }, new zzcep() { // from class: com.google.android.gms.internal.ads.zzbte
                @Override // com.google.android.gms.internal.ads.zzcep
                public final /* synthetic */ void zza() {
                    zzcenVar.zzd(new zzbso("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final void zzc(final String str, final zzboh zzbohVar) {
        this.zzb = zzgzo.zzk(this.zzb, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbtg
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzbsm zzbsmVar = (zzbsm) obj;
                zzbsmVar.zzn(str, zzbohVar);
                return zzbsmVar;
            }
        }, zzcei.zzg);
    }

    public final zzbtl zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        zzd();
        return new zzbtl(this.zzb, "google.afma.activeView.handleUpdate", zzbssVar, zzbsrVar);
    }

    public final void zzb(final String str, final zzboh zzbohVar) {
        zzd();
        this.zzb = zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzbtf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                zzbsm zzbsmVar = (zzbsm) obj;
                zzbsmVar.zzm(str, zzbohVar);
                return zzgzo.zza(zzbsmVar);
            }
        }, zzcei.zzg);
    }
}
