package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdar implements zzikg {
    private final zzdao zza;

    private zzdar(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdar zzc(zzdao zzdaoVar) {
        return new zzdar(zzdaoVar);
    }

    @Nullable
    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
