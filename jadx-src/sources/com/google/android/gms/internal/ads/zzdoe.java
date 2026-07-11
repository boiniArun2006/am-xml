package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdoe {

    @Nullable
    private zzbkp zza;

    public zzdoe(zzdnp zzdnpVar) {
        this.zza = zzdnpVar;
    }

    @Nullable
    public final synchronized zzbkp zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbkp zzbkpVar) {
        this.zza = zzbkpVar;
    }
}
