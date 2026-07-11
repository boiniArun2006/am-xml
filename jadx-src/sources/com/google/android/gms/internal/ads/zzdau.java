package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdau implements zzikg {
    private final zzdao zza;

    private zzdau(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdau zza(zzdao zzdaoVar) {
        return new zzdau(zzdaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Integer.valueOf(this.zza.zzh());
    }
}
