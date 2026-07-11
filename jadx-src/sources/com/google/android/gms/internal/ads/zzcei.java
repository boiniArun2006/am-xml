package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcei {
    public static final zzgzy zza;
    public static final zzgzy zzb;
    public static final zzgzy zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgzz zze;
    public static final zzgzy zzf;
    public static final zzgzy zzg;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceZza;
        ExecutorService executorServiceZzc;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfym.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcef("Default")));
        } else {
            zzbgv zzbgvVar = zzbhe.zzmK;
            if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar)).booleanValue()) {
                zzbgv zzbgvVar2 = zzbhe.zzmL;
                if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar2) != null) {
                    zzbgv zzbgvVar3 = zzbhe.zzmM;
                    if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcef("Default"));
            }
        }
        zza = new zzceh(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZza = zzfym.zza().zza(5, new zzcef("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZza = threadPoolExecutor3;
        }
        zzb = new zzceh(executorServiceZza, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfym.zza().zzc(new zzcef("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor4;
        }
        zzc = new zzceh(executorServiceZzc, null);
        zzcee zzceeVar = new zzcee(3, new zzcef("Schedule"));
        zzd = zzceeVar;
        zze = zzhaf.zzc(zzceeVar);
        zzf = new zzceh(new zzceg(), null);
        zzg = new zzceh(zzhaf.zza(), null);
    }
}
