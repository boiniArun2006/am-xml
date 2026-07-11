package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfnx implements zzikg {
    private final zzikp zza;

    private zzfnx(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzfnx zzc(zzikp zzikpVar) {
        return new zzfnx(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfnt zzb() {
        return new zzfnt(((zziks) this.zza).zzb());
    }
}
