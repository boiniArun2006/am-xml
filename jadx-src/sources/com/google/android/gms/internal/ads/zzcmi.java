package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmi implements zzikg {
    private final zzikp zza;

    private zzcmi(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmi zza(zzikp zzikpVar) {
        return new zzcmi(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcmj) this.zza).zza().getApplicationInfo();
        zziko.zzb(applicationInfo);
        return applicationInfo;
    }
}
