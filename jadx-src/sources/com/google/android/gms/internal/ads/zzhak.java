package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzhak extends zzgzf {
    private com.google.common.util.concurrent.Xo zza;
    private ScheduledFuture zzb;

    final /* synthetic */ com.google.common.util.concurrent.Xo zzf() {
        return this.zza;
    }

    final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }

    static com.google.common.util.concurrent.Xo zze(com.google.common.util.concurrent.Xo xo, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhak zzhakVar = new zzhak(xo);
        zzhai zzhaiVar = new zzhai(zzhakVar);
        zzhakVar.zzb = scheduledExecutorService.schedule(zzhaiVar, j2, timeUnit);
        xo.addListener(zzhaiVar, zzgzd.INSTANCE);
        return zzhakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        com.google.common.util.concurrent.Xo xo = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (xo == null) {
            return null;
        }
        String string = xo.toString();
        StringBuilder sb = new StringBuilder(string.length() + 14);
        sb.append("inputFuture=[");
        sb.append(string);
        sb.append("]");
        String string2 = sb.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb2 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb2.append(string2);
        sb2.append(dpcnwfoVOnrtRA.ebm);
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    private zzhak(com.google.common.util.concurrent.Xo xo) {
        xo.getClass();
        this.zza = xo;
    }
}
