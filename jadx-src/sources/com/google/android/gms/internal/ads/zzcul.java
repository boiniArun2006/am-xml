package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcul implements zzikg {
    private final zzikp zza;

    private zzcul(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcul zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcul(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje(((zzcva) this.zza).zzb(), zzcei.zza);
    }
}
