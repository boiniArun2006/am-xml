package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzlx implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzma zzb;

    zzlx(zzma zzmaVar, long j2) {
        this.zza = j2;
        Objects.requireNonNull(zzmaVar);
        this.zzb = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzma zzmaVar = this.zzb;
        zzmaVar.zzu.zzw().zzc(this.zza);
        zzmaVar.zza = null;
    }
}
