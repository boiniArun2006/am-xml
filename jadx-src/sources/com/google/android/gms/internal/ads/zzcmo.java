package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmo implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcmo(zzcmc zzcmcVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcmo zza(zzcmc zzcmcVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcmo(zzcmcVar, zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdD)).booleanValue() ? new zzazh((zzazc) this.zzb.zzb()) : new zzazh((zzazc) this.zza.zzb());
    }
}
