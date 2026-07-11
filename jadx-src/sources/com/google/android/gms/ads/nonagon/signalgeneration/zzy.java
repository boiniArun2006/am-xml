package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzy implements zzikg {
    private final zzikp zza;

    private zzy(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzy zza(zzikp zzikpVar) {
        return new zzy(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzv((zzdye) this.zza.zzb());
    }
}
