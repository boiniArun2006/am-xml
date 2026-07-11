package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhac extends zzgzj implements zzgzx {
    private final ScheduledFuture zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }

    zzhac(com.google.common.util.concurrent.Xo xo, ScheduledFuture scheduledFuture) {
        super(xo);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean zCancel = zza().cancel(z2);
        if (zCancel) {
            this.zza.cancel(z2);
        }
        return zCancel;
    }
}
