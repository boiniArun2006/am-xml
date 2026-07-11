package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfmx {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfmy zzd;

    zzfmx(zzfmy zzfmyVar, Runnable runnable, long j2) {
        Objects.requireNonNull(zzfmyVar);
        this.zzd = zzfmyVar;
        this.zza = runnable;
        this.zzb = j2;
    }
}
