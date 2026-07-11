package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzay {
    private static volatile Handler zzb;
    private final zzjf zza;
    private final Runnable zzc;
    private volatile long zzd;

    public abstract void zza();

    public final boolean zzc() {
        return this.zzd != 0;
    }

    final /* synthetic */ void zze(long j2) {
        this.zzd = 0L;
    }

    private final Handler zzf() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzay.class) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.measurement.zzcn(this.zza.zzaY().getMainLooper());
                }
                handler = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    zzay(zzjf zzjfVar) {
        Preconditions.checkNotNull(zzjfVar);
        this.zza = zzjfVar;
        this.zzc = new zzax(this, zzjfVar);
    }

    public final void zzb(long j2) {
        zzd();
        if (j2 >= 0) {
            zzjf zzjfVar = this.zza;
            this.zzd = zzjfVar.zzaZ().currentTimeMillis();
            if (!zzf().postDelayed(this.zzc, j2)) {
                zzjfVar.zzaV().zzb().zzb("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }
}
