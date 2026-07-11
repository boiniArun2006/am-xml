package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcqk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcqk(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcqk zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcqk(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcqj zzb() {
        return new zzcqj(((zzikk) this.zza).zzb(), ((zzikk) this.zzb).zzb());
    }
}
