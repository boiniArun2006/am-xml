package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgix implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgix(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgix zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgix(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbch zzbchVarZzb = zzfwe.zzb((Context) this.zza.zzb(), (zzfvh) this.zzb.zzb());
        zziko.zzb(zzbchVarZzb);
        return zzbchVarZzb;
    }
}
