package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcvq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcvq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcvq zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcvq(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcvp zzb() {
        return new zzcvp(((zzcuv) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
