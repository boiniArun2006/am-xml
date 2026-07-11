package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgcq implements zzgcl {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j2) {
        this.zza.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    zzgcq() {
    }
}
