package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgco implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgco(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgco zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgco(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgcn((Executor) this.zza.zzb(), (zzgao) this.zzb.zzb());
    }
}
