package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdtx implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdtx(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdtx zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdtx(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdtw((zzdcm) this.zza.zzb(), ((zzcww) this.zzb).zza());
    }
}
