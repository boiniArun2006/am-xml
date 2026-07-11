package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdmw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;

    private zzdmw(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
    }

    public static zzdmw zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        return new zzdmw(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcma zzcmaVar = (zzcma) this.zza.zzb();
        zzdan zzdanVarZza = ((zzdax) this.zzb).zza();
        zzdhf zzdhfVarZza = ((zzdia) this.zzc).zza();
        zzdml zzdmlVarZza = ((zzdmn) this.zzd).zza();
        zzdeg zzdegVarZzb = ((zzctw) this.zze).zzb();
        zzenr zzenrVar = (zzenr) this.zzf.zzb();
        zzcvb zzcvbVarZzi = zzcmaVar.zzi();
        zzcvbVarZzi.zzl(zzdanVarZza.zze());
        zzcvbVarZzi.zzm(zzdhfVarZza);
        zzcvbVarZzi.zzd(zzdmlVarZza);
        zzcvbVarZzi.zzk(new zzepw(null));
        zzcvbVarZzi.zzg(new zzcvx(zzdegVarZzb, null));
        zzcvbVarZzi.zze(new zzctu(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzey)).booleanValue()) {
            zzcvbVarZzi.zzf(zzeoa.zza(zzenrVar));
        }
        zzcwi zzcwiVarZzd = zzcvbVarZzi.zzh().zzd();
        zziko.zzb(zzcwiVarZzd);
        return zzcwiVarZzd;
    }
}
