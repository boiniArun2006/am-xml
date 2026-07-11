package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcvf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcvf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
    }

    public static zzcvf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcvf(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        boolean zBooleanValue = Boolean.valueOf(zzcvd.zza()).booleanValue();
        zzenj zzenjVarZzb = ((zzenk) this.zza).zzb();
        zzepi zzepiVarZzb = ((zzepj) this.zzb).zzb();
        if (true == zBooleanValue) {
            return zzenjVarZzb;
        }
        return zzepiVarZzb;
    }
}
