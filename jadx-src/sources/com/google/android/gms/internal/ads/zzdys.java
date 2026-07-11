package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdys implements zzikg {
    private final zzdyo zza;
    private final zzikp zzb;

    private zzdys(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzdyoVar;
        this.zzb = zzikpVar;
    }

    public static zzdys zza(zzdyo zzdyoVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdys(zzdyoVar, zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdyy) this.zzb.zzb(), zzfmk.zzc());
    }

    public static Set zzc(zzdyo zzdyoVar, zzdyy zzdyyVar, Executor executor) {
        Set setZzd = zzdyo.zzd(zzdyyVar, executor);
        zziko.zzb(setZzd);
        return setZzd;
    }
}
