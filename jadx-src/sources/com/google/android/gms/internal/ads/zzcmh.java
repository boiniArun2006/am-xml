package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmh implements zzikg {
    private final zzcmc zza;

    private zzcmh(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmh zzc(zzcmc zzcmcVar) {
        return new zzcmh(zzcmcVar);
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static Context zzd(zzcmc zzcmcVar) {
        Context contextZzb = zzcmcVar.zzb();
        zziko.zzb(contextZzb);
        return contextZzb;
    }
}
