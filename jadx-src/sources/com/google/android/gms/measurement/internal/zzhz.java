package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhz implements Runnable {
    final /* synthetic */ zzjr zza;
    final /* synthetic */ zzib zzb;

    zzhz(zzib zzibVar, zzjr zzjrVar) {
        this.zza = zzjrVar;
        Objects.requireNonNull(zzibVar);
        this.zzb = zzibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzib zzibVar = this.zzb;
        zzjr zzjrVar = this.zza;
        zzibVar.zzK(zzjrVar);
        zzibVar.zza(zzjrVar.zzd);
    }
}
