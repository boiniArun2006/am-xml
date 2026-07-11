package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzclu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzclu(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzclu zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzclu(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzclt((zzclk) this.zza.zzb(), (zzdxz) this.zzb.zzb());
    }
}
