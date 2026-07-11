package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzabk implements zzabl {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdr zzb;

    zzabk(Executor executor, zzdr zzdrVar) {
        this.zza = executor;
        this.zzb = zzdrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
