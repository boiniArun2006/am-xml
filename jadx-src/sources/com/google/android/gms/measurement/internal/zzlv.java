package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzlv implements Runnable {
    final /* synthetic */ zzlt zza;
    final /* synthetic */ zzlt zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzma zze;

    zzlv(zzma zzmaVar, zzlt zzltVar, zzlt zzltVar2, long j2, boolean z2) {
        this.zza = zzltVar;
        this.zzb = zzltVar2;
        this.zzc = j2;
        this.zzd = z2;
        Objects.requireNonNull(zzmaVar);
        this.zze = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
