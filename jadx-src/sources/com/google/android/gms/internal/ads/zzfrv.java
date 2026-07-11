package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfrv implements Runnable {
    final /* synthetic */ zzfsa zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zza;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzfrfVarZzI = zzfsaVar.zzI();
            Clock clockZzJ = zzfsaVar.zzJ();
            zzfrfVarZzI.zzj(clockZzJ.currentTimeMillis(), zzfsaVar.zzK(), zzfsaVar.zze.zzd, zzfsaVar.zzH());
        }
    }

    zzfrv(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }
}
