package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgcu implements zzikg {
    private final zzikp zza;

    private zzgcu(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgcu zza(zzikp zzikpVar) {
        return new zzgcu(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgdc((ExecutorService) this.zza.zzb());
    }
}
