package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeez implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeez(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeez zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeez(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeey zzb() {
        return new zzeey(((zzcmj) this.zza).zza(), (zzccq) this.zzb.zzb());
    }
}
