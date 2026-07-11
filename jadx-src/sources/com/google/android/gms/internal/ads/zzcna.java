package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcna implements zzikg {
    private final zzcmc zza;

    private zzcna(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcna zzc(zzcmc zzcmcVar) {
        return new zzcna(zzcmcVar);
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static VersionInfoParcel zzd(zzcmc zzcmcVar) {
        VersionInfoParcel versionInfoParcelZzd = zzcmcVar.zzd();
        zziko.zzb(versionInfoParcelZzd);
        return versionInfoParcelZzd;
    }
}
