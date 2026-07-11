package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgll implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzgll(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzgll zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzgll(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzikp zzikpVar = this.zzc;
        zzikp zzikpVar2 = this.zzb;
        zzika zzikaVarZzc = zzikf.zzc(this.zza);
        zzika zzikaVarZzc2 = zzikf.zzc(zzikpVar2);
        if (true == ((zzgbf) zzikpVar.zzb()).zzs()) {
            zzikaVarZzc = zzikaVarZzc2;
        }
        zzgky zzgkyVar = (zzgky) zzikaVarZzc.zzb();
        zziko.zzb(zzgkyVar);
        return zzgkyVar;
    }
}
