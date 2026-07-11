package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdlp implements zzikg {
    private final zzdkr zza;

    private zzdlp(zzdkr zzdkrVar) {
        this.zza = zzdkrVar;
    }

    public static zzdlp zzc(zzdkr zzdkrVar) {
        return new zzdlp(zzdkrVar);
    }

    @Nullable
    public final zzcjl zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
