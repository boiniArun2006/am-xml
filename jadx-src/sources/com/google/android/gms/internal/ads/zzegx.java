package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzegx implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzegx(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar4;
        this.zzc = zzikpVar5;
        this.zzd = zzikpVar6;
        this.zze = zzikpVar8;
    }

    public static zzegx zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8) {
        return new zzegx(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegw(((zzcmj) this.zza).zza(), zzfmk.zzc(), zzcnk.zza(), ((zzcmx) this.zzb).zzb(), ((zzehf) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcnh.zza(), (zzfor) this.zze.zzb());
    }
}
