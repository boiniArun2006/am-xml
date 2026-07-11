package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdim implements zzikg {
    private final zzikp zza;

    private zzdim(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdim zzc(zzikp zzikpVar) {
        return new zzdim(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdil zzb() {
        return new zzdil(((zziks) this.zza).zzb());
    }
}
