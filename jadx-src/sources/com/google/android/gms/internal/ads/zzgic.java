package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgic implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;

    private zzgic(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
    }

    public static zzgic zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        return new zzgic(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgmu zzgmuVar = (zzgmu) this.zza.zzb();
        zzgkg zzgkgVar = (zzgkg) this.zzb.zzb();
        zzgkx zzgkxVar = (zzgkx) this.zzc.zzb();
        zzgoe zzgoeVar = (zzgoe) this.zzd.zzb();
        zzgcl zzgclVar = (zzgcl) this.zze.zzb();
        zzgbf zzgbfVar = (zzgbf) this.zzf.zzb();
        return new zzgis(zzgmuVar, zzgkgVar, zzgkxVar, zzgoeVar, zzgclVar, zzgbfVar.zzi().zze(), zzgbfVar.zzi().zzg(), zzgbfVar.zzi().zzh());
    }
}
