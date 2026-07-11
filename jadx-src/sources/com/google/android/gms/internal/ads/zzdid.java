package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdid implements zzikg {
    private final zzdhf zza;

    private zzdid(zzdhf zzdhfVar) {
        this.zza = zzdhfVar;
    }

    public static zzdid zzc(zzdhf zzdhfVar) {
        return new zzdid(zzdhfVar);
    }

    @Nullable
    public final zzfgg zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzo();
    }
}
