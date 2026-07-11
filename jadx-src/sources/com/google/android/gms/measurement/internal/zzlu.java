package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzlu implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlt zzb;
    final /* synthetic */ zzlt zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzma zze;

    zzlu(zzma zzmaVar, Bundle bundle, zzlt zzltVar, zzlt zzltVar2, long j2) {
        this.zza = bundle;
        this.zzb = zzltVar;
        this.zzc = zzltVar2;
        this.zzd = j2;
        Objects.requireNonNull(zzmaVar);
        this.zze = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzt(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
