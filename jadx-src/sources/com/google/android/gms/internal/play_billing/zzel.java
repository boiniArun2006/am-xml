package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzel extends zzen {
    public static zzeu zza(Object obj) {
        return new zzeo(obj);
    }

    public static void zzc(zzeu zzeuVar, zzej zzejVar, Executor executor) {
        zzeuVar.zzb(new zzek(zzeuVar, zzejVar), executor);
    }

    public static zzeu zzb(zzeu zzeuVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzeuVar.isDone()) {
            return zzeuVar;
        }
        return zzff.zzs(zzeuVar, 28500L, timeUnit, scheduledExecutorService);
    }
}
