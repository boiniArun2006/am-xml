package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzof {
    private final Clock zza;
    private long zzb;

    public final void zzb() {
        this.zzb = 0L;
    }

    public final void zza() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zzc(long j2) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb >= 3600000;
    }

    public zzof(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }
}
