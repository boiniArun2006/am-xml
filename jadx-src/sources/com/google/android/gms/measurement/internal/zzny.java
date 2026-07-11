package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzny extends zzay {
    final /* synthetic */ zznz zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        zznz zznzVar = this.zza;
        zzob zzobVar = zznzVar.zzc;
        zzobVar.zzg();
        zzib zzibVar = zzobVar.zzu;
        zznzVar.zzd(false, false, zzibVar.zzaZ().elapsedRealtime());
        zzobVar.zzu.zzw().zzc(zzibVar.zzaZ().elapsedRealtime());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzny(zznz zznzVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zznzVar);
        this.zza = zznzVar;
    }
}
