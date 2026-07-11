package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcuo implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;

    private zzcuo(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
    }

    public static zzcuo zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuo(zzcueVar, zzikpVar);
    }

    public static Set zzc(zzcue zzcueVar, zzcvu zzcvuVar) {
        Set setSingleton = Collections.singleton(new zzdje(zzcvuVar, zzcei.zzg));
        zziko.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcvu) this.zzb.zzb());
    }
}
