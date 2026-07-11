package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzfau implements zzikg {
    private final zzikp zza;

    private zzfau(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzfau zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfau(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfat zzb() {
        return new zzfat(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}
