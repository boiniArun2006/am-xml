package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdak implements zzikg {
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

    private zzdak(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11, zzikp zzikpVar12, zzikp zzikpVar13) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar6;
        this.zzf = zzikpVar7;
        this.zzg = zzikpVar8;
        this.zzh = zzikpVar9;
        this.zzi = zzikpVar10;
        this.zzj = zzikpVar11;
        this.zzk = zzikpVar12;
        this.zzl = zzikpVar13;
    }

    public static zzdak zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9, zzikp zzikpVar10, zzikp zzikpVar11, zzikp zzikpVar12, zzikp zzikpVar13) {
        return new zzdak(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9, zzikpVar10, zzikpVar11, zzikpVar12, zzikpVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdaj zzb() {
        return new zzdaj((zzfnu) this.zza.zzb(), ((zzcna) this.zzb).zza(), (ApplicationInfo) this.zzc.zzb(), ((zzedm) this.zzd).zzb(), zzewe.zzc(), (PackageInfo) this.zze.zzb(), zzikf.zzc(this.zzf), ((zzcmd) this.zzg).zzb(), (String) this.zzh.zzb(), ((zzfbb) this.zzi).zzb(), ((zzdaw) this.zzj).zza(), (zzdgy) this.zzk.zzb(), ((Integer) this.zzl.zzb()).intValue());
    }
}
