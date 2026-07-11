package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeux implements zzikg {
    private final zzikp zza;

    private zzeux(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeux zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeux(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuv zzb() {
        return new zzeuv(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}
