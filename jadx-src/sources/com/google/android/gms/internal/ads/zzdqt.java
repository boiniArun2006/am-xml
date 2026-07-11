package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdqt implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdqt(zzdql zzdqlVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdqt zza(zzdql zzdqlVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdqt(zzdqlVar, zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje(((zzdtv) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
