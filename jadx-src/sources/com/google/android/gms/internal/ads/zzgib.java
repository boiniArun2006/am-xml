package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgib implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzgib(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzgib zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzgib(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzikp zzikpVar = this.zzd;
        zzikp zzikpVar2 = this.zzc;
        zzikp zzikpVar3 = this.zzb;
        zzika zzikaVarZzc = zzikf.zzc(this.zza);
        zzika zzikaVarZzc2 = zzikf.zzc(zzikpVar3);
        zzika zzikaVarZzc3 = zzikf.zzc(zzikpVar2);
        zzgbf zzgbfVar = (zzgbf) zzikpVar.zzb();
        return new zzgia(zzikaVarZzc, zzikaVarZzc2, zzikaVarZzc3, zzgbfVar.zzi().zza(), zzgbfVar.zzi().zzd());
    }
}
