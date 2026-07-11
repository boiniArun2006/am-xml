package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzekf implements zzikg {
    private final zzikp zza;

    private zzekf(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzekf zzc(zzikp zzikpVar) {
        return new zzekf(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeke zzb() {
        return new zzeke(((zzcmj) this.zza).zza());
    }
}
