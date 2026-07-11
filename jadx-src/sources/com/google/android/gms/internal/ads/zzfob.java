package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfob implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfob(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzfob zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfob(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfoa(((zzcmj) this.zza).zza(), (zzfoo) this.zzb.zzb());
    }
}
