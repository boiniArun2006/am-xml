package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzenb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcwi zzc;
    private final zzenr zzd;
    private final zzfqg zze;
    private final zzhah zzf = zzhah.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzenc zzh;
    private zzfjc zzi;

    private final synchronized com.google.common.util.concurrent.Xo zzd(zzfir zzfirVar) {
        Iterator it = zzfirVar.zza.iterator();
        while (it.hasNext()) {
            zzekg zzekgVarZza = this.zzc.zza(zzfirVar.zzb, (String) it.next());
            if (zzekgVarZza != null && zzekgVarZza.zza(this.zzi, zzfirVar)) {
                return zzgzo.zzi(zzekgVarZza.zzb(this.zzi, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgzo.zzc(new zzecr(3));
    }

    public final synchronized com.google.common.util.concurrent.Xo zza(zzfjc zzfjcVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                List list = zzfjcVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzf.zzb(new zzenv(3, zzeny.zzb(zzfjcVar)));
                } else {
                    this.zzi = zzfjcVar;
                    zzenr zzenrVar = this.zzd;
                    this.zzh = new zzenc(zzfjcVar, zzenrVar, this.zzf);
                    zzenrVar.zzc(list);
                    zzfir zzfirVarZza = this.zzh.zza();
                    while (zzfirVarZza != null) {
                        zzb(zzfirVarZza);
                        zzfirVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }

    final /* synthetic */ zzenc zzc() {
        return this.zzh;
    }

    zzenb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcwi zzcwiVar, zzenr zzenrVar, zzfqg zzfqgVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcwiVar;
        this.zzd = zzenrVar;
        this.zze = zzfqgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(@Nullable zzfir zzfirVar) {
        com.google.common.util.concurrent.Xo xoZzd = zzd(zzfirVar);
        this.zzd.zze(this.zzi, zzfirVar, xoZzd, this.zze);
        zzgzo.zzr(xoZzd, new zzena(this, zzfirVar), this.zza);
    }
}
