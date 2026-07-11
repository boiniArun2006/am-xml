package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcmj;
import com.google.android.gms.internal.ads.zzcna;
import com.google.android.gms.internal.ads.zzcpt;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzg implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzg(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar4;
    }

    public static zzg zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzg(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzf(((zzcmj) this.zza).zza(), zzcpt.zza(), zzewe.zzc(), ((zzcna) this.zzb).zza());
    }
}
