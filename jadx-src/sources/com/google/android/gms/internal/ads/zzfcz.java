package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfcz implements zzfax {
    final ScheduledExecutorService zza;

    public zzfcz(zzbxw zzbxwVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zzk(zzgzo.zzi(zzgzo.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfd)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfcy.zza, zzcei.zza);
    }
}
