package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdas implements zzikg {
    private final zzdao zza;

    private zzdas(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdas zzc(zzdao zzdaoVar) {
        return new zzdas(zzdaoVar);
    }

    @Nullable
    public final zzdag zza() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zze();
    }
}
