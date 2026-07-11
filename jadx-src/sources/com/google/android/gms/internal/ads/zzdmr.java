package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdmr implements zzikg {
    private final zzikp zza;

    private zzdmr(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdmr zza(zzikp zzikpVar) {
        return new zzdmr(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdmo) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
