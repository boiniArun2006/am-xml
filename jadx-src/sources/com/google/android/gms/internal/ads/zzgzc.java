package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgzc extends zzgyq {
    private zzgzb zza;

    zzgzc(zzgub zzgubVar, boolean z2, Executor executor, Callable callable) {
        super(zzgubVar, z2, false);
        this.zza = new zzgza(this, callable, executor);
        zze();
    }

    final /* synthetic */ void zzD(zzgzb zzgzbVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzw(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzi() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzx() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzA(int i2) {
        super.zzA(i2);
        if (i2 == 1) {
            this.zza = null;
        }
    }
}
