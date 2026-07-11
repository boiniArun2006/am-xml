package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdkw implements zzikg {
    private final zzdkr zza;

    private zzdkw(zzdkr zzdkrVar) {
        this.zza = zzdkrVar;
    }

    public static zzdkw zzc(zzdkr zzdkrVar) {
        return new zzdkw(zzdkrVar);
    }

    @Nullable
    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
