package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcck implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcck(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcck zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcck(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzccj zzb() {
        return new zzccj((Clock) this.zza.zzb(), (zzcch) this.zzb.zzb());
    }
}
