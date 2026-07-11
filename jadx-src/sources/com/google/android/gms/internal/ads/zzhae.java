package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhae extends zzhaa implements zzgzz {
    final ScheduledExecutorService zza;

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd */
    public final zzgzx schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhan zzhanVarZze = zzhan.zze(runnable, null);
        return new zzhac(zzhanVarZze, scheduledExecutorService.schedule(zzhanVarZze, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze */
    public final zzgzx schedule(Callable callable, long j2, TimeUnit timeUnit) {
        zzhan zzhanVar = new zzhan(callable);
        return new zzhac(zzhanVar, this.zza.schedule(zzhanVar, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf */
    public final zzgzx scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleAtFixedRate(zzhadVar, j2, j3, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg */
    public final zzgzx scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleWithFixedDelay(zzhadVar, j2, j3, timeUnit));
    }

    zzhae(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }
}
