package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzly implements Runnable {
    final /* synthetic */ zzlt zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzma zzc;

    zzly(zzma zzmaVar, zzlt zzltVar, long j2) {
        this.zza = zzltVar;
        this.zzb = j2;
        Objects.requireNonNull(zzmaVar);
        this.zzc = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzma zzmaVar = this.zzc;
        zzmaVar.zzv(this.zza, false, this.zzb);
        zzmaVar.zza = null;
        zzmaVar.zzu.zzt().zzG(null);
    }
}
