package com.google.android.gms.measurement.internal;

import android.content.Intent;
import androidx.annotation.WorkerThread;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzox extends zzay {
    final /* synthetic */ zzpf zza;

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzaW().zzg();
        String str = (String) zzpfVar.zzax().pollFirst();
        if (str != null) {
            zzpfVar.zzay(zzpfVar.zzaZ().elapsedRealtime());
            zzpfVar.zzaV().zzk().zzb("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            zzpf.zzaP(zzpfVar.zzaY(), intent);
        }
        zzpfVar.zzau();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzox(zzpf zzpfVar, zzjf zzjfVar) {
        super(zzjfVar);
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
    }
}
