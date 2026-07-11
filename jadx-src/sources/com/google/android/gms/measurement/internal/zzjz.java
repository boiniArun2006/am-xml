package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzjz implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzli zzb;

    zzjz(zzli zzliVar, long j2) {
        this.zza = j2;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzib zzibVar = this.zzb.zzu;
        zzhd zzhdVar = zzibVar.zzd().zzf;
        long j2 = this.zza;
        zzhdVar.zzb(j2);
        zzibVar.zzaV().zzj().zzb("Session timeout duration set", Long.valueOf(j2));
    }
}
