package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdkx implements zzikg {
    private final zzikp zza;

    private zzdkx(zzdkr zzdkrVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdkx zza(zzdkr zzdkrVar, zzikp zzikpVar) {
        return new zzdkx(zzdkrVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdje((zzczw) this.zza.zzb(), zzcei.zzg));
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
