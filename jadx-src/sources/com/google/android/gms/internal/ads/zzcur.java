package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcur implements zzikg {
    private final zzikp zza;

    private zzcur(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcur zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcur(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdje((zzcvu) this.zza.zzb(), zzcei.zzg));
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
