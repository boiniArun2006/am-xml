package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcuq implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;

    private zzcuq(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
    }

    public static zzcuq zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuq(zzcueVar, zzikpVar);
    }

    public static zzdje zzc(zzcue zzcueVar, zzcvs zzcvsVar) {
        return new zzdje(zzcvsVar, zzcei.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcvs) this.zzb.zzb());
    }
}
