package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcuk implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;

    private zzcuk(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
    }

    public static zzcuk zzc(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuk(zzcueVar, zzikpVar);
    }

    public static zzctx zzd(zzcue zzcueVar, Object obj) {
        return (zzcua) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzctx zzb() {
        return ((zzcub) this.zzb).zzb();
    }
}
