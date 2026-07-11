package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdpn implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdpn(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdpn zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdpn(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpm(((zzdni) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
