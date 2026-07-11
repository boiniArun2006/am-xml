package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzcly implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcly(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcly zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcly(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzclx((zzclk) this.zza.zzb(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
