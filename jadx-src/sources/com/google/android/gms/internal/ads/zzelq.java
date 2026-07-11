package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzelq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzelq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzelq zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzelq(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzelp zzb() {
        return new zzelp((Context) this.zza.zzb(), (zzcvc) this.zzb.zzb());
    }
}
