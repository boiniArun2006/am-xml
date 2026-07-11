package com.google.android.recaptcha.internal;

import androidx.annotation.OpenForTesting;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@OpenForTesting
public final class zzbn {
    private final long zza = System.currentTimeMillis();
    private final zzjh zzb = zzjh.zzb();

    public final long zzb() {
        return this.zza;
    }

    public final long zza(TimeUnit timeUnit) {
        return this.zzb.zza(timeUnit);
    }

    public final void zzc() {
        this.zzb.zzf();
    }
}
