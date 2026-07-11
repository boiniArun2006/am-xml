package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzevi {
    public final com.google.common.util.concurrent.Xo zza;
    private final long zzb;
    private final Clock zzc;

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }

    public zzevi(com.google.common.util.concurrent.Xo xo, long j2, Clock clock) {
        this.zza = xo;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j2;
    }
}
