package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzenh extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzdhf zzc;
    private final zzenr zzd;
    private final zzekl zze;

    zzenh(zzcma zzcmaVar, zzdan zzdanVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzdhfVar;
        this.zzd = zzenrVar;
        this.zze = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    protected final com.google.common.util.concurrent.Xo zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zze);
        }
        zzctk zzctkVarZzk = this.zza.zzk();
        zzctkVarZzk.zzd(zzdanVar.zze());
        zzctkVarZzk.zze(this.zzc);
        zzcxj zzcxjVarZza = zzctkVarZzk.zzh().zza();
        return zzcxjVarZza.zzc(zzcxjVarZza.zzb());
    }
}
