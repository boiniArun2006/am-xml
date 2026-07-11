package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcwu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.Xo zzc;
    private volatile boolean zzd = true;

    public zzcwu(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.Xo xo) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = xo;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zza(zzgzl zzgzlVar) {
        zzgzo.zzr(this.zzc, new zzcwo(this, zzgzlVar), this.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(zzgzl zzgzlVar, com.google.common.util.concurrent.Xo xo, zzcwf zzcwfVar) {
        if (zzcwfVar != null) {
            zzgzlVar.zzb(zzcwfVar);
        }
        return zzgzo.zzi(xo, ((Long) zzbjs.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zze(List list, final zzgzl zzgzlVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgzlVar.zza(new zzecr(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.Xo xoZza = zzgzo.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.Xo xo = (com.google.common.util.concurrent.Xo) it.next();
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwq
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                    zzgzlVar.zza((Throwable) obj);
                    return zzgzo.zza(null);
                }
            };
            Executor executor = this.zza;
            xoZza = zzgzo.zzj(zzgzo.zzh(xoZza, Throwable.class, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwr
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                    return this.zza.zzc(zzgzlVar, xo, (zzcwf) obj);
                }
            }, executor);
        }
        zzgzo.zzr(xoZza, new zzcwp(this, zzgzlVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
