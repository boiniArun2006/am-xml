package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzecu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzecu(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzecu zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzecu(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzect(((zzcmj) this.zza).zza(), (zzdxz) this.zzb.zzb());
    }
}
