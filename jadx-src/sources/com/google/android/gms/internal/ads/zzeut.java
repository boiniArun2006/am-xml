package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeut implements zzikg {
    private final zzikp zza;

    private zzeut(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzeut zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeut(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeur zzb() {
        return new zzeur(((zzcna) this.zza).zza(), zzfmk.zzc());
    }
}
