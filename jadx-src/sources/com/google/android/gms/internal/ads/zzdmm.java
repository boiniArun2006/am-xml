package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdmm implements zzikg {
    private final zzdml zza;

    private zzdmm(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    public static zzdmm zzc(zzdml zzdmlVar) {
        return new zzdmm(zzdmlVar);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbk zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
