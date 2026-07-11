package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzfss extends TimerTask {
    final /* synthetic */ zzfsu zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfsv zzc;

    zzfss(zzfsv zzfsvVar, zzfsu zzfsuVar, Timer timer) {
        this.zza = zzfsuVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfsvVar);
        this.zzc = zzfsvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
