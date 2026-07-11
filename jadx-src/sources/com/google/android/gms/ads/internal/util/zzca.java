package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcmj;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzca implements zzikg {
    private final zzikp zza;

    private zzca(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzca zza(zzikp zzikpVar) {
        return new zzca(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz(((zzcmj) this.zza).zza());
    }
}
