package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfcw implements zzfax {
    final zzgzy zza;
    final List zzb;

    public zzfcw(zzbgo zzbgoVar, zzgzy zzgzyVar, List list) {
        this.zza = zzgzyVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcx(this.zza.zzb);
            }
        });
    }
}
