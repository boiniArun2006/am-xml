package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdav implements zzikg {
    private final zzdao zza;

    private zzdav(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdav zzc(zzdao zzdaoVar) {
        return new zzdav(zzdaoVar);
    }

    @Nullable
    public final zzfjd zza() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzc();
    }
}
