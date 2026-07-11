package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdtm implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;
    private final zzikp zzh;
    private final zzikp zzi;
    private final zzikp zzj;

    private zzdtm(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar7;
        this.zzg = zzikpVar8;
        this.zzh = zzikpVar9;
        this.zzi = zzikpVar10;
        this.zzj = zzikpVar11;
    }

    public static zzdtm zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11) {
        return new zzdtm(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10, zzikpVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdti(((zzcmj) this.zza).zza(), (Executor) this.zzb.zzb(), (zzazh) this.zzc.zzb(), ((zzcna) this.zzd).zza(), ((zzcoy) this.zze).zza(), zzcpr.zza(), (zzeiu) this.zzf.zzb(), (zzfqk) this.zzg.zzb(), (zzdxz) this.zzh.zzb(), (zzejf) this.zzi.zzb(), (zzfjo) this.zzj.zzb());
    }
}
