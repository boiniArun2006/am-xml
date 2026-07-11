package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzfaf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;
    private final zzikp zzh;
    private final zzikp zzi;

    private zzfaf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
        this.zzd = zzikpVar5;
        this.zze = zzikpVar6;
        this.zzf = zzikpVar7;
        this.zzg = zzikpVar8;
        this.zzh = zzikpVar9;
        this.zzi = zzikpVar10;
    }

    public static zzfaf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10) {
        return new zzfaf(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfad(zzfmk.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzeqk) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzdaw) this.zze).zza(), (zzeqf) this.zzf.zzb(), (zzdvp) this.zzg.zzb(), (zzeam) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
