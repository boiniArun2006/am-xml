package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzey extends zzeh implements ScheduledFuture, zzeu {
    private final ScheduledFuture zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }

    public zzey(zzeu zzeuVar, ScheduledFuture scheduledFuture) {
        super(zzeuVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean zCancel = zzc().cancel(z2);
        if (zCancel) {
            this.zza.cancel(z2);
        }
        return zCancel;
    }
}
