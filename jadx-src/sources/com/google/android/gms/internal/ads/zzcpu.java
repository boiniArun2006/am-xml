package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcpu implements zzikg {
    private final zzikp zza;

    private zzcpu(zzcpl zzcplVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcpu zzc(zzcpl zzcplVar, zzikp zzikpVar) {
        return new zzcpu(zzcplVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfkg zzb() {
        zzfkg zzfkgVarZza = zzfkg.zza(((zzcmj) this.zza).zza());
        zziko.zzb(zzfkgVarZza);
        return zzfkgVarZza;
    }
}
