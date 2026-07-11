package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdsj implements zzikg {
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

    private zzdsj(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
        this.zzg = zzikpVar7;
        this.zzh = zzikpVar8;
        this.zzi = zzikpVar9;
        this.zzj = zzikpVar10;
    }

    public static zzdsj zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10) {
        return new zzdsj(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsh(((zzdaw) this.zza).zza(), (Executor) this.zzb.zzb(), (zzduv) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdxz) this.zze.zzb(), (zzfqk) this.zzf.zzb(), (zzeiu) this.zzg.zzb(), (zzdtq) this.zzh.zzb(), (zzdxt) this.zzi.zzb(), (zzdzc) this.zzj.zzb());
    }
}
