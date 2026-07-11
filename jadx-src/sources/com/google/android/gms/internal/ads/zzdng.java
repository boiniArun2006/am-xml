package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdng implements zzikg {
    private final zzikp zza;

    private zzdng(zzdnd zzdndVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdng zzc(zzdnd zzdndVar, zzikp zzikpVar) {
        return new zzdng(zzdndVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdom zzb() {
        zzdol zzdolVar = (zzdol) this.zza.zzb();
        zziko.zzb(zzdolVar);
        return zzdolVar;
    }
}
