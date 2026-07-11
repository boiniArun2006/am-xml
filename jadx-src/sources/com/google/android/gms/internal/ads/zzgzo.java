package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgzo extends zzgzq {
    public static com.google.common.util.concurrent.Xo zze(Runnable runnable, Executor executor) {
        zzhan zzhanVarZze = zzhan.zze(runnable, null);
        executor.execute(zzhanVarZze);
        return zzhanVarZze;
    }

    public static com.google.common.util.concurrent.Xo zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static com.google.common.util.concurrent.Xo zzb() {
        return zzgzs.zza;
    }

    public static com.google.common.util.concurrent.Xo zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static com.google.common.util.concurrent.Xo zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static com.google.common.util.concurrent.Xo zzg(com.google.common.util.concurrent.Xo xo, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i2 = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(xo, cls, zzgqtVar);
        xo.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static com.google.common.util.concurrent.Xo zzh(com.google.common.util.concurrent.Xo xo, Class cls, zzgyw zzgywVar, Executor executor) {
        int i2 = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(xo, cls, zzgywVar);
        xo.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static com.google.common.util.concurrent.Xo zzj(com.google.common.util.concurrent.Xo xo, zzgyw zzgywVar, Executor executor) {
        int i2 = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(xo, zzgywVar);
        xo.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static com.google.common.util.concurrent.Xo zzk(com.google.common.util.concurrent.Xo xo, zzgqt zzgqtVar, Executor executor) {
        int i2 = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(xo, zzgqtVar);
        xo.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.Xo zzl(com.google.common.util.concurrent.Xo... xoArr) {
        return new zzgyx(zzguf.zzr(xoArr), true);
    }

    public static com.google.common.util.concurrent.Xo zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(com.google.common.util.concurrent.Xo... xoArr) {
        return new zzgzn(true, zzguf.zzr(xoArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.Xo zzq(com.google.common.util.concurrent.Xo... xoArr) {
        return new zzgyx(zzguf.zzr(xoArr), false);
    }

    public static com.google.common.util.concurrent.Xo zzc(Throwable th) {
        th.getClass();
        return new zzgzr(th);
    }

    public static com.google.common.util.concurrent.Xo zzi(com.google.common.util.concurrent.Xo xo, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (xo.isDone()) {
            return xo;
        }
        return zzhak.zze(xo, j2, timeUnit, scheduledExecutorService);
    }

    public static void zzr(com.google.common.util.concurrent.Xo xo, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        xo.addListener(new zzgzm(xo, zzgzlVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof Error) {
                throw new zzgze((Error) e2.getCause());
            }
            throw new zzhao(e2.getCause());
        }
    }
}
