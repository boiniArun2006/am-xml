package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeiv implements zzikg {
    private final zzikp zza;

    private zzeiv(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzeiv zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeiv(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeiu(((zzcmj) this.zza).zza(), zzfmk.zzc());
    }
}
