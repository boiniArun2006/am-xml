package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmx implements zzikg {
    private final zzikp zza;

    private zzcmx(zzcmc zzcmcVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmx zzc(zzcmc zzcmcVar, zzikp zzikpVar) {
        return new zzcmx(zzcmcVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcqi zzb() {
        zzcma zzcmaVar = (zzcma) this.zza.zzb();
        zziko.zzb(zzcmaVar);
        return zzcmaVar;
    }
}
