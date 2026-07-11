package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdmo implements zzikg {
    private final zzdml zza;

    private zzdmo(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    public static zzdmo zzc(zzdml zzdmlVar) {
        return new zzdmo(zzdmlVar);
    }

    public final zzdor zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static zzdor zzd(zzdml zzdmlVar) {
        zzdor zzdorVarZza = zzdmlVar.zza();
        zziko.zzb(zzdorVarZza);
        return zzdorVarZza;
    }
}
