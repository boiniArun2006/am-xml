package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdaq implements zzikg {
    private final zzdao zza;
    private final zzikp zzb;

    private zzdaq(zzdao zzdaoVar, zzikp zzikpVar) {
        this.zza = zzdaoVar;
        this.zzb = zzikpVar;
    }

    public static zzdaq zza(zzdao zzdaoVar, zzikp zzikpVar) {
        return new zzdaq(zzdaoVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzcmj) this.zzb).zza());
        zziko.zzb(contextZzf);
        return contextZzf;
    }
}
