package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfby implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzfby(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar5;
        this.zzd = zzikpVar6;
        this.zze = zzikpVar7;
    }

    public static zzfby zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7) {
        return new zzfby(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7);
    }

    public static zzfbw zzc(zzcdm zzcdmVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, boolean z2, boolean z3) {
        return new zzfbw(zzcdmVar, context, scheduledExecutorService, executor, i2, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbw(zzcqe.zza(), ((zzcmj) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfmk.zzc(), ((zzfde) this.zzc).zzb().intValue(), ((zzfdf) this.zzd).zzb().booleanValue(), ((zzfdg) this.zze).zzb().booleanValue());
    }
}
