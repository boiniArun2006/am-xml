package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzezd implements zzikg {
    private final zzikp zza;

    private zzezd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzezd zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzezd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezb zzb() {
        return new zzezb(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}
