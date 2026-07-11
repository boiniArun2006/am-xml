package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcmj;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zze implements zzikg {
    private final zzikp zza;

    private zze(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zze zza(zzikp zzikpVar) {
        return new zze(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzd(((zzcmj) this.zza).zza());
    }
}
