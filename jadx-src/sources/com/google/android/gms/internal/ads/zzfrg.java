package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfrg implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfrg(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzfrg zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfrg(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfrf zzb() {
        return new zzfrf((zzdxz) this.zza.zzb(), ((zzcmj) this.zzb).zza());
    }
}
