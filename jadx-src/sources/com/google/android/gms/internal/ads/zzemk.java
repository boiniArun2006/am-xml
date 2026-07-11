package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzemk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzemk(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzemk zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzemk(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemj zzb() {
        return new zzemj((Context) this.zza.zzb(), (zzdlu) this.zzb.zzb());
    }
}
