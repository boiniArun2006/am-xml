package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeeh implements zzikg {
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

    private zzeeh(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11, zzikp zzikpVar12, zzikp zzikpVar13) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar6;
        this.zzf = zzikpVar7;
        this.zzg = zzikpVar8;
        this.zzh = zzikpVar11;
        this.zzi = zzikpVar12;
        this.zzj = zzikpVar13;
    }

    public static zzeeh zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11, zzikp zzikpVar12, zzikp zzikpVar13) {
        return new zzeeh(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10, zzikpVar11, zzikpVar12, zzikpVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeeg zzb() {
        return new zzeeg((zzcma) this.zza.zzb(), ((zzcmj) this.zzb).zza(), ((zzcna) this.zzc).zza(), ((zzdaw) this.zzd).zza(), zzfmk.zzc(), (String) this.zze.zzb(), (zzfoo) this.zzf.zzb(), (zzdxt) this.zzg.zzb(), zzcnk.zza(), zzcnh.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfqk) this.zzi.zzb(), ((zzdek) this.zzj).zzb());
    }
}
