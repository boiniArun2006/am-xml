package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfdp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;

    private zzfdp(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar5;
        this.zzd = zzikpVar6;
        this.zze = zzikpVar7;
        this.zzf = zzikpVar8;
    }

    public static zzfdp zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8) {
        return new zzfdp(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8);
    }

    public static zzfdn zzc(zzcdu zzcduVar, boolean z2, zzcdk zzcdkVar, zzgzy zzgzyVar, String str, ScheduledExecutorService scheduledExecutorService, int i2, int i3) {
        return new zzfdn(zzcduVar, z2, zzcdkVar, zzgzyVar, str, scheduledExecutorService, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfdn((zzcdu) this.zza.zzb(), ((zzfdg) this.zzb).zzb().booleanValue(), zzcqg.zza(), zzfmk.zzc(), ((zzfdd) this.zzc).zza(), (ScheduledExecutorService) this.zzd.zzb(), ((zzfdi) this.zze).zzb().intValue(), ((zzfdj) this.zzf).zzb().intValue());
    }
}
