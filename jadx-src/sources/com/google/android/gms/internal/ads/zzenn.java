package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzenn extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzdhf zzc;
    private final zzenr zzd;
    private final zzfjd zze;
    private final zzekl zzf;

    public zzenn(zzcma zzcmaVar, zzdan zzdanVar, zzdhf zzdhfVar, zzfjd zzfjdVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzdhfVar;
        this.zze = zzfjdVar;
        this.zzd = zzenrVar;
        this.zzf = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    protected final com.google.common.util.concurrent.Xo zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzfjd zzfjdVar;
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeu)).booleanValue() && (zzfjdVar = this.zze) != null) {
            zzdanVar.zzf(zzfjdVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdud zzdudVarZzp = this.zza.zzp();
        zzdudVarZzp.zzd(zzdanVar.zze());
        zzdudVarZzp.zze(this.zzc);
        zzcxj zzcxjVarZza = zzdudVarZzp.zzh().zza();
        return zzcxjVarZza.zzc(zzcxjVarZza.zzb());
    }
}
