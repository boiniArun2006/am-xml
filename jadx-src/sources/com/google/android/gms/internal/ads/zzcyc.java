package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcyc implements zzikg {
    private final zzikp zza;

    private zzcyc(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzcyc zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyc(zzikpVar, zzikpVar2);
    }

    public static zzdje zzc(zzcsh zzcshVar, Executor executor) {
        return new zzdje(zzcshVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcsh) this.zza.zzb(), zzfmk.zzc());
    }
}
