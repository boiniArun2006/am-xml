package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcmk implements zzikg {
    private final zzcmc zza;

    private zzcmk(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmk zzc(zzcmc zzcmcVar) {
        return new zzcmk(zzcmcVar);
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }

    public static WeakReference zzd(zzcmc zzcmcVar) {
        WeakReference weakReferenceZzc = zzcmcVar.zzc();
        zziko.zzb(weakReferenceZzc);
        return weakReferenceZzc;
    }
}
