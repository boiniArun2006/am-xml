package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgz implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzha zzb;

    zzgz(zzha zzhaVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzhaVar);
        this.zzb = zzhaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zzar(this.zza);
    }
}
