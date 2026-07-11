package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzenz implements zzikg {
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
    private final zzikp zzk;
    private final zzikp zzl;

    private zzenz(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11, zzikp zzikpVar12, zzikp zzikpVar13) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
        this.zzg = zzikpVar7;
        this.zzh = zzikpVar9;
        this.zzi = zzikpVar10;
        this.zzj = zzikpVar11;
        this.zzk = zzikpVar12;
        this.zzl = zzikpVar13;
    }

    public static zzenz zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11, zzikp zzikpVar12, zzikp zzikpVar13) {
        return new zzenz(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10, zzikpVar11, zzikpVar12, zzikpVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeny zzb() {
        return new zzeny(((zzcmj) this.zza).zza(), (zzfnu) this.zzb.zzb(), (zzenr) this.zzc.zzb(), (zzdbh) this.zzd.zzb(), (zzfqg) this.zze.zzb(), (zzfqk) this.zzf.zzb(), (zzcwi) this.zzg.zzb(), zzfmk.zzc(), (ScheduledExecutorService) this.zzh.zzb(), (zzekl) this.zzi.zzb(), (zzfoo) this.zzj.zzb(), ((zzend) this.zzk).zzb(), (zzdxt) this.zzl.zzb());
    }
}
