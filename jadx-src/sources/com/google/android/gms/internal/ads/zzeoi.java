package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeoi implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeoi(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeoi zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeoi(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeoh zzb() {
        return new zzeoh((Context) this.zza.zzb(), (zzdue) this.zzb.zzb());
    }
}
