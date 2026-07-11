package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcoy implements zzikg {
    private final zzcox zza;

    private zzcoy(zzcox zzcoxVar) {
        this.zza = zzcoxVar;
    }

    public static zzcoy zzc(zzcox zzcoxVar) {
        return new zzcoy(zzcoxVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcox zzcoxVar) {
        return new com.google.android.gms.ads.internal.zza(new zzchb(), new zzcfw());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
