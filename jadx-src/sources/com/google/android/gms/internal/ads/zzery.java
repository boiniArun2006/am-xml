package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzery implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;
    private final zzikp zzh;
    private final zzikp zzi;

    private zzery(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
        this.zzg = zzikpVar7;
        this.zzh = zzikpVar8;
        this.zzi = zzikpVar9;
    }

    public static zzery zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        return new zzery(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzerx((Context) this.zza.zzb(), (com.google.android.gms.ads.internal.client.zzr) this.zzb.zzb(), (String) this.zzc.zzb(), (zzfgv) this.zzd.zzb(), (zzerp) this.zze.zzb(), (zzfhv) this.zzf.zzb(), ((zzcna) this.zzg).zza(), (zzazh) this.zzh.zzb(), (zzdxz) this.zzi.zzb());
    }
}
