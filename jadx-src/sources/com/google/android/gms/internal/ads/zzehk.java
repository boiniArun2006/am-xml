package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzehk implements zzikg {
    private final zzikp zza;

    private zzehk(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzehk zzc(zzikp zzikpVar) {
        return new zzehk(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehj zzb() {
        return new zzehj(((zzcmj) this.zza).zza());
    }
}
