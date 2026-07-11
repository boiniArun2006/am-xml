package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgav implements zzikg {
    private final zzikp zza;

    private zzgav(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgav zza(zzikp zzikpVar) {
        return new zzgav(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgzy zzgzyVarZzb = zzhaf.zzb((ExecutorService) this.zza.zzb());
        zziko.zzb(zzgzyVarZzb);
        return zzgzyVarZzb;
    }
}
