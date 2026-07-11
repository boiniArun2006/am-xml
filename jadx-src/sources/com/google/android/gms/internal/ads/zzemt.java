package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzemt implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;

    private zzemt(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
        this.zzd = zzikpVar5;
        this.zze = zzikpVar6;
        this.zzf = zzikpVar7;
        this.zzg = zzikpVar8;
    }

    public static zzemt zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        return new zzemt(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzems((zzdmq) this.zza.zzb(), zzfmk.zzc(), ((zzdrb) this.zzb).zzb(), (zzfkj) this.zzc.zzb(), (zzdtq) this.zzd.zzb(), (zzdxt) this.zze.zzb(), ((zzcna) this.zzf).zza(), (Context) this.zzg.zzb(), zzcpb.zzc());
    }
}
