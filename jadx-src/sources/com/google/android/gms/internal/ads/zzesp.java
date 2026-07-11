package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzesp implements zzikg {
    private final zzikp zza;

    private zzesp(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzesp zzc(zzikp zzikpVar) {
        return new zzesp(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesn zzb() {
        return new zzesn(((zzcmj) this.zza).zza());
    }
}
