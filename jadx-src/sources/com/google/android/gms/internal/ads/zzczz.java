package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzczz {
    private final AtomicLong zza;

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j2) {
        this.zza.set(j2);
    }

    zzczz(zzfjc zzfjcVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfjcVar.zza.zza.zzu.get());
    }
}
