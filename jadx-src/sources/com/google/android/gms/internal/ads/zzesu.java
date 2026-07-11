package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzesu implements zzfax {
    private final Clock zza;
    private final zzfjk zzb;
    private final long zzc;

    zzesu(Clock clock, zzfjk zzfjkVar, long j2) {
        this.zza = clock;
        this.zzb = zzfjkVar;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zza(new zzesv(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }
}
