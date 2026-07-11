package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfnz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzfnz(zzfny zzfnyVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzfnz zza(zzfny zzfnyVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfnz(zzfnyVar, zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbsz zzbszVarZzb = new zzbsq().zzb(((zzcmj) this.zza).zza(), ((zzcna) this.zzb).zza(), (zzfor) this.zzc.zzb());
        zziko.zzb(zzbszVarZzb);
        return zzbszVarZzb;
    }
}
