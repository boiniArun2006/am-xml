package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zznt implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzob zzb;

    zznt(zzob zzobVar, long j2) {
        this.zza = j2;
        Objects.requireNonNull(zzobVar);
        this.zzb = zzobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk(this.zza);
    }
}
