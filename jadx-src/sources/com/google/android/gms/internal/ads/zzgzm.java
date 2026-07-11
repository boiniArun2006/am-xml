package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgzm implements Runnable {
    final Future zza;
    final zzgzl zzb;

    zzgzm(Future future, zzgzl zzgzlVar) {
        this.zza = future;
        this.zzb = zzgzlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzhaq) && (thZza = zzhar.zza((zzhaq) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgzo.zzs(future));
        } catch (ExecutionException e2) {
            this.zzb.zza(e2.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgqy zzgqyVarZzb = zzgqz.zzb(this);
        zzgqyVarZzb.zza(this.zzb);
        return zzgqyVarZzb.toString();
    }
}
