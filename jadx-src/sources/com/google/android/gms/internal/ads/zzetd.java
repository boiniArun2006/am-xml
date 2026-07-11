package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzetd implements zzfax {
    private final com.google.common.util.concurrent.Xo zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzetd(com.google.common.util.concurrent.Xo xo, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = xo;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        com.google.common.util.concurrent.Xo xo = this.zza;
        zzetc zzetcVar = zzetc.zza;
        Executor executor = this.zzb;
        com.google.common.util.concurrent.Xo xoZzj = zzgzo.zzj(xo, zzetcVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznV)).intValue() > 0) {
            xoZzj = zzgzo.zzi(xoZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(xoZzj, Throwable.class, zzetb.zza, executor);
    }
}
