package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmr implements zzikg {
    private final zzikp zza;

    private zzcmr(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzcmr zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcmr(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcj)).booleanValue() ? Collections.singleton(new zzdje((zzeam) this.zza.zzb(), zzfmk.zzc())) : Collections.EMPTY_SET;
        zziko.zzb(setSingleton);
        return setSingleton;
    }
}
