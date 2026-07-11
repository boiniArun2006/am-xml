package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeue implements zzfax {
    private final Executor zza;
    private final zzcdu zzb;

    zzeue(Executor executor, zzcdu zzcduVar) {
        this.zza = executor;
        this.zzb = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdJ)).booleanValue()) {
            return zzgzo.zza(new zzeuf(null));
        }
        zzcdu zzcduVar = this.zzb;
        return zzgzo.zzk(zzcduVar.zzq(), zzeud.zza, this.zza);
    }
}
