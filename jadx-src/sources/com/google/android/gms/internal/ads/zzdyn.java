package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdyn implements zzikg {
    private final zzikp zza;

    private zzdyn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdyn zza(zzikp zzikpVar) {
        return new zzdyn(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdym((Clock) this.zza.zzb());
    }
}
