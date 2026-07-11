package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdzn implements zzikg {
    private final zzikp zza;

    private zzdzn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdzn zzc(zzikp zzikpVar) {
        return new zzdzn(zzikpVar);
    }

    public static zzdzm zzd(zzbph zzbphVar) {
        return new zzdzm(zzbphVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzm zzb() {
        return new zzdzm((zzbph) this.zza.zzb());
    }
}
