package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzenj extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzepw zzc;
    private final zzdhf zzd;
    private final zzdml zze;
    private final zzdeg zzf;

    @Nullable
    private final ViewGroup zzg;

    @Nullable
    private final zzdgl zzh;
    private final zzenr zzi;
    private final zzekl zzj;

    public zzenj(zzcma zzcmaVar, zzdan zzdanVar, zzepw zzepwVar, zzdhf zzdhfVar, zzdml zzdmlVar, zzdeg zzdegVar, @Nullable ViewGroup viewGroup, @Nullable zzdgl zzdglVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzepwVar;
        this.zzd = zzdhfVar;
        this.zze = zzdmlVar;
        this.zzf = zzdegVar;
        this.zzg = viewGroup;
        this.zzh = zzdglVar;
        this.zzi = zzenrVar;
        this.zzj = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    protected final com.google.common.util.concurrent.Xo zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzj);
        }
        zzcvb zzcvbVarZzi = this.zza.zzi();
        zzcvbVarZzi.zzl(zzdanVar.zze());
        zzcvbVarZzi.zzm(this.zzd);
        zzcvbVarZzi.zzk(this.zzc);
        zzcvbVarZzi.zzd(this.zze);
        zzcvbVarZzi.zzg(new zzcvx(this.zzf, this.zzh));
        zzcvbVarZzi.zze(new zzctu(this.zzg));
        zzcxj zzcxjVarZzc = zzcvbVarZzi.zzh().zzc();
        return zzcxjVarZzc.zzc(zzcxjVarZzc.zzb());
    }
}
