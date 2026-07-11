package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcuf implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;

    private zzcuf(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
    }

    public static zzcuf zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuf(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zziks) this.zzb).zzb());
    }
}
