package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzccj {
    private final Clock zza;
    private final zzcch zzb;

    zzccj(Clock clock, zzcch zzcchVar) {
        this.zza = clock;
        this.zzb = zzcchVar;
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i2, long j2) {
        this.zzb.zza(i2, j2);
    }

    public static zzccj zza(Context context) {
        return zzccr.zzb(context).zza();
    }
}
