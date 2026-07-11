package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzccl {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzccq zzd;

    private zzccl() {
        throw null;
    }

    /* synthetic */ zzccl(byte[] bArr) {
    }

    public final zzccl zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzccl zzd(zzccq zzccqVar) {
        this.zzd = zzccqVar;
        return this;
    }

    public final zzccr zze() {
        zziko.zzc(this.zza, Context.class);
        zziko.zzc(this.zzb, Clock.class);
        zziko.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zziko.zzc(this.zzd, zzccq.class);
        return new zzccm(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzccl zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzccl zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }
}
