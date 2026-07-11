package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcsp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcsp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcsp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcsp(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcso(((zzcmj) this.zza).zza(), (zzbdb) this.zzb.zzb());
    }
}
