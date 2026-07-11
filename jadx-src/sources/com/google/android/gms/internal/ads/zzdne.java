package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdne implements zzikg {
    private final zzikp zza;

    private zzdne(zzdnd zzdndVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdne zza(zzdnd zzdndVar, zzikp zzikpVar) {
        return new zzdne(zzdndVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdng) this.zza).zzb().zza();
    }
}
