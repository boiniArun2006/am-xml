package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzduv {
    private final Context zza;
    private final zzazh zzb;
    private final zzbil zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbgd zzf;
    private final zzdeg zzg;
    private final zzejf zzh;
    private final zzfjo zzi;
    private final zzdxz zzj;
    private final zzclk zzk;

    public zzduv(zzckb zzckbVar, Context context, zzazh zzazhVar, zzbil zzbilVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, zzdeg zzdegVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxz zzdxzVar, zzclk zzclkVar) {
        this.zza = context;
        this.zzb = zzazhVar;
        this.zzc = zzbilVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbgdVar;
        this.zzg = zzdegVar;
        this.zzh = zzejfVar;
        this.zzi = zzfjoVar;
        this.zzj = zzdxzVar;
        this.zzk = zzclkVar;
    }

    final /* synthetic */ zzdeg zzb() {
        return this.zzg;
    }

    public final zzcjl zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfir zzfirVar, zzfiu zzfiuVar) throws zzcka {
        zzclv zzclvVarZza = zzclv.zza(zzrVar);
        String str = zzrVar.zza;
        zzduk zzdukVar = new zzduk(this);
        zzazh zzazhVar = this.zzb;
        zzejf zzejfVar = this.zzh;
        zzcjl zzcjlVarZza = zzckb.zza(this.zza, zzclvVarZza, str, false, false, zzazhVar, this.zzc, this.zzd, null, zzdukVar, this.zze, this.zzf, zzfirVar, zzfiuVar, zzejfVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpy)).booleanValue()) {
            this.zzk.zza(zzcjlVarZza.zzD());
        }
        return zzcjlVarZza;
    }
}
