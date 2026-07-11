package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdwp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdwp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdwp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdwp(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdwo((zzbgd) this.zza.zzb(), (zzfgn) this.zzb.zzb());
    }
}
