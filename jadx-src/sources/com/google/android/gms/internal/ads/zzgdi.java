package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgdi implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzgdi(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
    }

    public static zzgdi zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzgdi(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgcl zzgclVar = (zzgcl) this.zzb.zzb();
        ExecutorService executorService = (ExecutorService) this.zzc.zzb();
        zzgce zzgceVar = (zzgce) this.zzd.zzb();
        zzgbf zzgbfVar = (zzgbf) this.zze.zzb();
        return new zzgdq(context, zzgclVar, executorService, zzgceVar, new Random(), zzgbfVar.zzd().zza(), zzgbfVar.zzd().zzc(), zzgbfVar.zzd().zzd(), zzgbfVar.zzd().zzb(), zzgbfVar.zzb(), zzgbfVar.zzE() - 1);
    }
}
