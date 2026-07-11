package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmz implements zzikg {
    private final zzcmc zza;

    private zzcmz(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmz zza(zzcmc zzcmcVar) {
        return new zzcmz(zzcmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zziko.zzb(strZze);
        return strZze;
    }
}
