package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcyg implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcyg(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcyg zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyg(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyf((zzcyj) this.zza.zzb(), ((zzdaw) this.zzb).zza());
    }
}
