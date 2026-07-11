package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzgzb extends zzgzv {
    private final Executor zza;
    final /* synthetic */ zzgzc zzb;

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgzv
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e2) {
            this.zzb.zzb(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzg(Throwable th) {
        zzgzc zzgzcVar = this.zzb;
        zzgzcVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzgzcVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgzcVar.cancel(false);
        } else {
            zzgzcVar.zzb(th);
        }
    }

    zzgzb(zzgzc zzgzcVar, Executor executor) {
        Objects.requireNonNull(zzgzcVar);
        this.zzb = zzgzcVar;
        executor.getClass();
        this.zza = executor;
    }
}
