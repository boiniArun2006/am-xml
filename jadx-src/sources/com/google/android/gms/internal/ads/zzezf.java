package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzezf implements zzfax {
    private final zzgzy zza;
    private final zzdzc zzb;

    zzezf(zzgzy zzgzyVar, zzdzc zzdzcVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 62;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzezg zzc() {
        return new zzezg(this.zzb.zzb());
    }
}
