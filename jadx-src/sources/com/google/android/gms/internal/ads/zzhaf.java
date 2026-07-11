package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhaf {
    public static Executor zza() {
        return zzgzd.INSTANCE;
    }

    public static zzgzy zzb(ExecutorService executorService) {
        return executorService instanceof zzgzy ? (zzgzy) executorService : executorService instanceof ScheduledExecutorService ? new zzhae((ScheduledExecutorService) executorService) : new zzhaa(executorService);
    }

    public static zzgzz zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhae(scheduledExecutorService);
    }

    static Executor zzd(final Executor executor, final zzgyh zzgyhVar) {
        executor.getClass();
        if (executor == zzgzd.INSTANCE) {
            return executor;
        }
        return new Executor() { // from class: com.google.android.gms.internal.ads.zzhab
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzhaf.zzf(executor, zzgyhVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzgyh zzgyhVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            zzgyhVar.zzb(e2);
        }
    }
}
