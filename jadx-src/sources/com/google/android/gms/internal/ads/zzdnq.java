package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdnq implements zzikg {
    private final zzikp zza;

    private zzdnq(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdnq zzc(zzikp zzikpVar) {
        return new zzdnq(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdnp zzb() {
        return new zzdnp(((zzdoz) this.zza).zza());
    }
}
