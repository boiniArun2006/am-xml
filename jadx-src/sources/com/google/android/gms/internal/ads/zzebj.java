package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzebj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzebj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzebj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzebj(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebq(((zzcmj) this.zza).zza(), ((zzcna) this.zzb).zza());
    }
}
