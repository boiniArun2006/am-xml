package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcuu implements zzikg {
    private final zzikp zza;

    private zzcuu(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcuu zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuu(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzdeg zzdegVarZza = ((zzcwa) this.zza).zza();
        return new zzdje(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzcuc
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final /* synthetic */ void zza() {
                zzdegVarZza.zzc();
            }
        }, zzcei.zzg);
    }
}
